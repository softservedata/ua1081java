package com.softserve.homework04.homework.dog;

public enum Breed {
    BEAGLE("Beagle"), BULLDOG("Bulldog"), AKITA("Akita"), DALMATIAN("Dalmatian"), DACHSHUND("Dachshund");

    private final String breedName;

    Breed(String breedName) {
        this.breedName = breedName;
    }

    public String getBreedName() {
        return breedName;
    }
}
