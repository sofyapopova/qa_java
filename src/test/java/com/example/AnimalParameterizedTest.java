package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalParameterizedTest {

    private final String animalKind;
    private final List<String> expected;

    public AnimalParameterizedTest(String animalKind, List<String> expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getAnimalKindData() {
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnsCorrectValue() throws Exception {

        final Animal animal = new Animal();

        final List<String> actual = animal.getFood(animalKind);

        assertEquals("Метод getFood возвращает неправильный список еды для вида " + animalKind, expected, actual);
    }
}
