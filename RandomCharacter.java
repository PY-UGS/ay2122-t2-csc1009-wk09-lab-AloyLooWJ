import java.util.Random;

public class RandomCharacter
{
    final static int noOfChar = 15;
    public static char[] lowerCaseArray = new char[noOfChar];
    public static char[] upperCaseArray = new char[noOfChar];
    public static char[] digitArray = new char[noOfChar];
    public static char[] array = new char[noOfChar];

    public static char generateRandomCharacter()
    {
        Random r = new Random();
        char letter = (char)(r.nextInt(26) + 'a');
        return letter;
    }
    
    public static char getRandomLowerCaseLetter()
    {
        char lowerCaseLetter = Character.toLowerCase(generateRandomCharacter());
        return lowerCaseLetter;
    }

    public static char getRandomUpperCaseLetter()
    {
        char upperCaseLetter = Character.toUpperCase(generateRandomCharacter());
        return upperCaseLetter;
    }

    public static char getRandomDigitCharacter()
    {
        Random r = new Random();
        int digit = r.nextInt(10);
        char chdigit = (char)(digit + '0');
        return chdigit;
    }

    public static char getCharacter()
    {
        Random r = new Random();
        char character = '0';
        int random = r.nextInt(3);
        character = getRandomDigitCharacter();
        switch(random)
        {
            case 0:
                character = getRandomLowerCaseLetter();
                break;
            case 1:
                character = getRandomUpperCaseLetter();
                break;
            case 2:
                character = getRandomDigitCharacter();
                break;
        }
        return character;
    }

    public static boolean isPrime(long n)
	{
		if (n <= 1)
        {
			return false;
        }

		else if (n == 2)
        {
			return true;
        }

		else if (n % 2 == 0)
        {
			return false;
        }

		for (int i = 3; i <= Math.sqrt(n); i += 2)
		{
			if (n % i == 0)
            {
				return false;
            }
		}
		return true;
	}

    public static void main(String[] args)
    {
        for (int i = 0; i < noOfChar; i++)
        {
            lowerCaseArray[i] = getRandomLowerCaseLetter();
            upperCaseArray[i] = getRandomUpperCaseLetter();
            digitArray[i] = getRandomDigitCharacter();
            array[i] = getCharacter();
        }
        
        for (int j = 0; j < noOfChar; j++)
        {
            System.out.print(lowerCaseArray[j]);
        }
        System.out.println();
        for (int j = 0; j < noOfChar; j++)
        {
            System.out.print(upperCaseArray[j]);
        }
        System.out.println();
        for (int j = 0; j < noOfChar; j++)
        {
            System.out.print(digitArray[j]);
        }
        System.out.println();
        for (int j = 0; j < noOfChar; j++)
        {
            System.out.print(array[j]);
        }
        System.out.println();
        long number = Long.parseLong(String.valueOf(RandomCharacter.digitArray));
        boolean primeCheck = isPrime(number);
        if (primeCheck)
        {
            System.out.println(number + " is prime");
        }
        else
        {
            System.out.println(number + " is not prime");
        }
    }
}
