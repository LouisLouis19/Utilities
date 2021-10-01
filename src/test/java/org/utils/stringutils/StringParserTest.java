package org.utils.stringutils;

import org.junit.jupiter.api.Test;
import org.utils.exceptions.InvalidStringInputException;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StringParserTest {

    //methodBeingTested_inputGiven_expectedOutcome
    //Input, One separator, 2 parts -- Happy Path
    @Test
    void splitString_oneSeparator_expectTwoParts() throws InvalidStringInputException {
        String inputString = "Hello|world";
        StringParser sp = new StringParser();
        String separator = "\\|";
        ArrayList<String> stringParts = sp.splitString(inputString, separator);

        //Do the test
        assertEquals(2, stringParts.size());
    }

    //test failure case
    //method being tested, NullInput, expect exception
    @Test
    void splitString_nullInput_expectException(){
        String inputString = null;
        StringParser sp = new StringParser();
        String separator = "\\|";
        //ArrayList<String> stringParts = sp.splitString(inputString, separator);
        assertThrows(InvalidStringInputException.class,
                () -> sp.splitString(inputString, separator));
        //assertEquals(0, stringParts.size());
    }
}