package com.softserve.homework04.ex5;

public enum Breed {
    POODLE("poodle"),
    BULLDOG("bulldog"),
    HUSKY("husky"),
    SHEPHERD("shepherd");

    private final String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}
