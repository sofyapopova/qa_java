package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    @Mock
    private Feline feline;

    private final String sex;
    private final boolean expected;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    public LionParameterizedTest(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeReturnsCorrectValue() throws Exception {
        final Lion lion = new Lion(feline, sex);
        final boolean actual = lion.doesHaveMane();

        assertEquals("Неправильно устанавливается значение поля hasMane", expected, actual);
    }
}