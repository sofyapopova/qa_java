package com.example;

import org.junit.Test;

public class AnimalExceptionTest {

    @Test(expected = Exception.class)
    public void getFoodWithIncorrectAnimalKindThrowsException() throws Exception {

        final String incorrectAnimalKind = "Печенькоед";

        final Animal animal = new Animal();
        animal.getFood(incorrectAnimalKind);
    }
}
