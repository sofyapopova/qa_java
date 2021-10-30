package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class AlexTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnsCorrectValue() throws Exception {

        final int alexKittensCount = 5;
        Mockito.when(feline.getKittens(0)).thenReturn(alexKittensCount);

        final Alex alex = new Alex(feline);

        final int expectedKittensCount = alexKittensCount;
        final int actualKittensCount = alex.getKittens();

        assertEquals("Метод getKittens возвращает неправильное количество котят", expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFriends() throws Exception {

        final Alex alex = new Alex(feline);

        final List<String> expectedFriends = List.of("Марти", "Глория", "Мелман");
        final List<String> actualFriends = alex.getFriends();

        assertEquals("Метод getFriends возвращает неправильный список друзей", expectedFriends, actualFriends);
    }

    @Test
    public void getPlaceOfLivingReturnsCorrectValue() throws Exception {

        final Alex alex = new Alex(feline);

        final String expectedPlaceOfLiving = "Нью-Йоркский Зоопарк";
        final String actualPlaceOfLiving = alex.getPlaceOfLiving();

        assertEquals("Метод getPlaceOfLiving возвращает неправильное значение", expectedPlaceOfLiving, actualPlaceOfLiving);
    }
}