import static org.junit.Assert.*;
import org.junit.Test;

public class RandomCharacterTest
{
    @Test
    public void testGetRandomLowerCaseLetter()
    {
        int i = 0;
        while (i<15)
        {
            char testLowerCase = RandomCharacter.getRandomLowerCaseLetter();
            assertTrue(Character.isLetter(testLowerCase));
            assertTrue(Character.isLowerCase(testLowerCase));
            assertFalse(Character.isUpperCase(testLowerCase));
            i++;
        }
    }

    @Test
    public void testGetRandomUpperCaseLetter()
    {
        int i = 0;
        while (i<15)
        {
            char testUpperCase = RandomCharacter.getRandomUpperCaseLetter();
            assertTrue(Character.isLetter(testUpperCase));
            assertTrue(Character.isUpperCase(testUpperCase));
            assertFalse(Character.isLowerCase(testUpperCase));
            i++;
        }
    }

    @Test
    public void testGetRandomDigitCharacter()
    {
        int i = 0;
        while (i<15)
        {
            int testDigit = Character.getNumericValue(RandomCharacter.getRandomDigitCharacter());
            assertTrue(testDigit<10);
            assertTrue(testDigit>=0);
            i++;
        }
    }
    
    @Test
    public void testPrimeNumber()
    {
        long primenumber = 7;
        assertTrue(RandomCharacter.isPrime(primenumber));
        long notprimenumber = 8;
        assertFalse(RandomCharacter.isPrime(notprimenumber));
    }
}