package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getFoodReturnsFoodForLion() throws Exception {

        final List<String> foodForLion = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodForLion);

        final Lion lion = new Lion(feline, "Самец");

        final List<String> expectedFood = foodForLion;
        final List<String> actualFood = lion.getFood();

        assertEquals("Метод getFood возвращает еду не для льва", expectedFood, actualFood);
    }

    @Test
    public void getKittensReturnsOne() throws Exception {

        final int lionKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(lionKittensCount);

        final Lion lion = new Lion(feline, "Самец");

        final int expectedKittensCount = lionKittensCount;
        final int actualKittensCount = lion.getKittens();

        assertEquals("Метод getKittens возвращает неправильное количество котят", expectedKittensCount, actualKittensCount);
    }
}
