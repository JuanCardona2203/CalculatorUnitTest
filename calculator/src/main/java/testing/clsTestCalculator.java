package testing;

import calculator.clsCalculator;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class clsTestCalculator {
    @Test
    public void testAddNumber(){
        //objectTest
        clsCalculator objCalculator = new clsCalculator();

        //Arrange
        int expectedResult = 100;

        //Act
        int actualResult = objCalculator.addNumber(50,50);

        //Assert
        assertEquals(expectedResult,actualResult);
    }
}
