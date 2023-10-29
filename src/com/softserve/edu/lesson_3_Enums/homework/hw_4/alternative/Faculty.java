package com.softserve.edu.lesson_3_Enums.homework.hw_4.alternative;

public class Faculty {

   private int num_students;
   private Season season;

    public Faculty() {
    }

    public Faculty(int num_students, Season season) {
        if(num_students >= 2) {
            this.num_students = num_students;
        }else {
            throw new IllegalArgumentException("Enterr correct num students");
        }
        this.season = season;
    }

    public int getNum_students() {
        return num_students;
    }

    public void setNum_students(int num_students) {
        this.num_students = num_students;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "num_students=" + num_students +
                ", season=" + season +
                '}';
    }
}
