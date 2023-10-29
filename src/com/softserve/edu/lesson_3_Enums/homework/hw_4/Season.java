package com.softserve.edu.lesson_3_Enums.homework.hw_4;

public enum Season {

    WINTER("winter"), SPRING("spring"), SUMMER("summer"), AUTUMN("autumn");


    public final String en;

    Season(String en) {
        this.en = en;
    }

    public String getEn() {
        return en;
    }
}
