package com.softserve.edu.Project;

import javax.swing.*;

import com.softserve.edu.Project.Task.Priority;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskManagerGUI extends JFrame{

    private static final String TASKS_DIRECTORY = "C:\\Study_Java_Fundamentals\\SoftServe_course\\ua1081java\\src\\com\\softserve\\edu\\Project\\tasks\\";

    private List<Task> tasks;
    private DefaultListModel<String> taskListModel;
    private JList<String> taskList;

    public TaskManagerGUI() {
        tasks = new ArrayList<>();
        taskListModel = new DefaultListModel<>();
        taskList = new JList<>(taskListModel);

        initializeUI();
        loadExistingTasks();
    }

    private void initializeUI() {
        setTitle("Task Manager");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);

        JTextField titleField = new JTextField(20);
        JTextField descriptionField = new JTextField(20);
        JTextField dueDateField = new JTextField(20);
        JTextField isCompleteField = new JTextField(20);
        JTextField priorityField = new JTextField(20);

        JButton addButton = new JButton("Add Task");
        JButton editButton = new JButton("Edit Task");
        JButton deleteButton = new JButton("Delete Task");

        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        inputPanel.add(new JLabel("Title:"));
        inputPanel.add(titleField);
        inputPanel.add(new JLabel("Description:"));
        inputPanel.add(descriptionField);
        inputPanel.add(new JLabel("DueDate:"));
        inputPanel.add(dueDateField);
        inputPanel.add(new JLabel("IsComplete:"));
        inputPanel.add(isCompleteField);
        inputPanel.add(new JLabel("Priority:"));
        inputPanel.add(priorityField);

        JPanel inputPanel2 = new JPanel(new GridLayout(1, 3));
        
        inputPanel2.add(addButton);
        inputPanel2.add(editButton);
        inputPanel2.add(deleteButton);

        inputPanel.setBackground(Color.PINK);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task newTask = addTask(titleField.getText(), descriptionField.getText(), null, isCompleteField.getText(), null);
                updateTaskList();
                createTaskFile(newTask);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteSelectedTask();
                updateTaskList();
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override  
            public void actionPerformed(ActionEvent e) {
                editSelectedTask();
            }
        });

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(inputPanel2, BorderLayout.CENTER);
        add(new JScrollPane(taskList), BorderLayout.PAGE_END);

        setVisible(true);
    }

    private Task addTask(String title, String description, LocalDate dueDate, String string, Priority priority) {
        Task newTask = new Task(title, description, dueDate, rootPaneCheckingEnabled, priority);
        tasks.add(newTask);
        return newTask;
    }

    private void editSelectedTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            Task selectedTask = tasks.get(selectedIndex);
            editTaskFile(selectedTask);
        }
    }

    private void deleteSelectedTask() {
        int selectedIndex = taskList.getSelectedIndex();
        if (selectedIndex != -1) {
            Task deletedTask = tasks.remove(selectedIndex);
            deleteTaskFile(deletedTask);
        }
    }

    private void updateTaskList() {
        taskListModel.clear();
        for (Task task : tasks) {
            taskListModel.addElement(task.getTitle());
        }
    }

    private void createTaskFile(Task task) {
        String fileName = TASKS_DIRECTORY + task.getTitle() + ".txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Title: " + task.getTitle() + "\n");
            writer.write("Description: " + task.getDescription() + "\n");
            writer.write("DueDate: " + task.getDueDate() + "\n");
            writer.write("IsComplete: " + task.getComplite() + "\n");
            writer.write("Priority: " + task.getPriority() + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editTaskFile(Task task) {
        String fileName = TASKS_DIRECTORY + task.getTitle() + ".txt";
        try {
            Desktop.getDesktop().edit(new File(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteTaskFile(Task task) {
        String fileName = TASKS_DIRECTORY + task.getTitle() + ".txt";
        try {
            Files.deleteIfExists(Path.of(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadExistingTasks() {
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(TASKS_DIRECTORY), "*.txt")) {
            for (Path filePath : directoryStream) {
                String fileName = filePath.getFileName().toString();
                String taskTitle = fileName.substring(0, fileName.lastIndexOf('.'));
                Task existingTask = new Task(taskTitle, "", null, rootPaneCheckingEnabled, null); 
                tasks.add(existingTask);
            }
            updateTaskList();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
