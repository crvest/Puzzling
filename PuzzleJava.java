import java.util.Random;

public class PuzzleJava {
    Random random = new Random();

    // generate an array of 10 random numbers
    public int[] getTenRolls() {
        int[] randArray = new int[10];
        for (int i = 0; i < randArray.length; i++) {
            randArray[i] = random.nextInt(19)+1;
        }
        return randArray;
    }

    // generate a random letter
    public char getRandomLetter() {
        // initialize an array of all the letters of the alphabet
        char[] alphabetArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        // return the value of the array at a random index
        return alphabetArray[random.nextInt(25)];
    }

    // generate a random 8 digit password
    public String generatePassword() {
        String password = "";
        for(int i = 0; i < 8; i++) {
            password += getRandomLetter();
        }
        return password;
    }

    // generate randomly sized array of random 8 letter words
    public String[] getNewPasswordSet(int length) {
        String[] passwordArray = new String[length];
        for(int i = 0; i < length; i++) {
            passwordArray[i] = generatePassword();
        }
        return passwordArray;
    }
}