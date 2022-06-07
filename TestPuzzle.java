public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava appTest = new PuzzleJava();
        
        // test cases
        // get ten rolls
        System.out.println("-----Get Ten Rolls Test-----");
        int[] randArray = appTest.getTenRolls();
        for (int i = 0; i < randArray.length; i++) {
            System.out.println(randArray[i]);
        }

        // get random letter test
        System.out.println("-----Get Random Letter Test-----");
        System.out.println(appTest.getRandomLetter());

        // generate password test
        System.out.println("-----Generate Password Test-----");
        System.out.println(appTest.generatePassword());

        // get new password set test
        System.out.println("-----Get New Password Set Test-----");
        int length = 4;
        String[] passwordArray = appTest.getNewPasswordSet(length);
        for (int i = 0; i < length; i++) {
            System.out.println(passwordArray[i]);
        }

    }
    
}
