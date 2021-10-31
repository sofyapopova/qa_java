package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void eatMeatReturnsMeatForFeline() throws Exception {

        final List<String> meatForFeline = List.of("Животные", "Птицы", "Рыба");

        final Feline feline = new Feline();

        final List<String> expectedFood = meatForFeline;
        final List<String> actualFood = feline.eatMeat();

        assertEquals("Метод eatMeat возвращает еду не для Feline", expectedFood, actualFood);
    }

    @Test
    public void getFamilyReturnsCorrectValue() {
        final Feline feline = new Feline();

        final String expectedFamily = "Кошачьи";
        final String actualFamily = feline.getFamily();

        assertEquals("Метод getFamily возвращает неверное значение", expectedFamily, actualFamily);
    }

    @Test
    public void getKittensReturnsOne() {
        final Feline feline = new Feline();

        final int expectedKittensCount = 1;
        final int actualKittensCount = feline.getKittens();

        assertEquals("Метод getKittens возвращает неправильное количество котят", expectedKittensCount, actualKittensCount);
    }
}