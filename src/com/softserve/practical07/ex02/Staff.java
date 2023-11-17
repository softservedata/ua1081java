package com.softserve.practical07.ex02;

public abstract class Staff extends Person {

    protected Staff(String name) {
        super(name);
    }

    abstract void salary();
}
