package com.softserve.edu.lesson_3_Enums.homework.hw_4.alternative;

public enum Season {

    WINTER("Winter, period of winter exams"),
    SPRING("Spring, second semester"),
    SUMMER("Summer, vacation period"),
    AUTUMN("Autumn, first semester");

    private String name_en;

    Season(String name_en) {
        this.name_en = name_en;
    }

    public String getName_en() {
        return name_en;
    }
}
