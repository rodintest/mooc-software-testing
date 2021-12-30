package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tudelft.mySolutions.RomanNumbers;

public class RomanNumberTest {

    RomanNumbers roman;

    @BeforeEach
    public void initialize(){
        this.roman = new RomanNumbers();
    }

    @Test
    public void singleNumber() {
        int result = roman.convertRomanNumber("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void numberWithManyDigits() {
        int result = roman.convertRomanNumber("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void numberWithSubtractiveNotation() {
        int result = roman.convertRomanNumber("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        int result = roman.convertRomanNumber("XLIV");
        Assertions.assertEquals(44, result);
    }
}
