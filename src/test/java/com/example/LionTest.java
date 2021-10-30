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

        final List<String> expected = foodForLion;

        final Lion lion = new Lion(feline, "Самец");
        final List<String> actual = lion.getFood();

        assertEquals("Метод getFood не возвращает еду для льва", expected, actual);
    }

    @Test
    public void getKittensReturnsOne() throws Exception {

        final int lionKittensCount = 1;
        Mockito.when(feline.getKittens()).thenReturn(lionKittensCount);

        final int expected = lionKittensCount;

        final Lion lion = new Lion(feline, "Самец");
        final int actual = lion.getKittens();

        assertEquals("Метод getKittens возвращает неправильное количество котят", expected, actual);
    }
}
