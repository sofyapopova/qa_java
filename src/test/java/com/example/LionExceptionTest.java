package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void lionConstructorWithIncorrectSexValueThrowsException() throws Exception {

        final String incorrectSexValue = "Альфа-самец";
        final Lion lion = new Lion(feline, incorrectSexValue);
    }
}
