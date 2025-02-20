public class Kaprekar {
    private int original;
    private int[] myArray = new int[4];

    private int firstNum;
    private int secondNum;
    private int answer;
    private int counter = 0;

    private boolean flag;

    public Kaprekar(int num){
        if (twoDiffDigits(num)){//// Correctly check if the number has at least two different digits
            KaprekarProcess(num);
        }
    }

    public boolean twoDiffDigits(int num) {
        String numStr = String.valueOf(num);

        // Check if number has at least 2 different digits
        if (numStr.chars().distinct().count() < 2) {
            System.out.println("Number does not have at least 2 different digits.");
            return false;
        }

        // Format number into a 4-digit number
        if (numStr.length() < 4) {
            int diff = 4 - numStr.length();
            for (int i = 0; i < diff; i++) {
                numStr += "0";
            }
        }
        this.original = Integer.parseInt(numStr);
        return true;
    }



    public void getMyArray(int num) {
        boolean isNegative = false;
        // Handles numbers of different lengths, padding with leading zeros.
        if (num < 0){
            num = Math.abs(num);
            isNegative = true;
        }

        String numStr = String.format("%04d", num); // Ensures 4 digits with leading zeros
        for (int i = 0; i < 4; i++) {
            myArray[i] = Integer.parseInt(String.valueOf(numStr.charAt(i)));
        }
    }

    public int ascending() {
        int temp;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < myArray[i]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        firstNum = 0;
        for (int i = 0; i < myArray.length; i++) {
            this.firstNum = firstNum * 10 + myArray[i];
        }
        return firstNum;
    }

    public int descending() {
        int temp;
        for (int i = 0; i < myArray.length - 1; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] > myArray[i]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        secondNum = 0;
        for (int i = 0; i < myArray.length; i++) {
            this.secondNum = secondNum * 10 + myArray[i];
        }
        return secondNum;
    }

    public int getCounter() {
        return counter;
    }

    public int getOriginal() {
        return original;
    }

    public int getAnswer() {
        return answer;
    }

    public int KaprekarProcess(int num){
        answer = num;
        while (answer != 6174 && counter < 8) { // limit to 8 iterations
            getMyArray(answer);
            ascending();
            descending();
            answer = Math.abs(this.firstNum - this.secondNum);
            counter++;
        }
        return counter;
    }

    //Take any four-digit number, using at least two different digits (leading zeros are allowed).
    //normal 4 digits --> check if there are at least 2 different digits
    //3 digits -->  check if there are at least 2 different digits
    //2 digits -->  check if there are at least 2 different digits
//Arrange the digits in descending and then in ascending order to get two four-digit numbers, adding leading zeros if necessary.
//Subtract the smaller number from the bigger number.
    //If the subtracted number is less than 1000, add an extra zero to that number until it reaches 4 digits
//Go back to step 2 and repeat until reach 6174, how many iterations
}
