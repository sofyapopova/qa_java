package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    @Test
    public void getSoundReturnsCorrectSound() {
        final Cat cat = new Cat(feline);

        final String expectedSound = "Мяу";
        final String actualSound = cat.getSound();

        assertEquals("Метод getSound возвращает неправильное значение", expectedSound, actualSound);
    }

    @Test
    public void getFoodReturnsFoodForCat() throws Exception {

        final List<String> foodForCat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(foodForCat);

        final Cat cat = new Cat(feline);

        final List<String> expectedFood = foodForCat;
        final List<String> actualFood = cat.getFood();

        assertEquals("Метод getFood возвращает еду не для кота", expectedFood, actualFood);
    }
}