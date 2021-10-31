package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void getFamilyReturnsCorrectValue() {

        final Animal animal = new Animal();

        final String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        final String actualFamily = animal.getFamily();

        assertEquals("Метод getFamily возвращает неправильное значение", expectedFamily, actualFamily);
    }
}