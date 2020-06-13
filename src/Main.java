import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // ask a user how many integer numbers s/he would like to enter
        System.out.println("How many integers would you like to enter? \r");
        int count = scan.nextInt();

        // create a variable that holds the value of the returned array
        // in the readIntegers(int count) method
        int[] integersEntered = readIntegers(count);
        System.out.println("You've entered: " + Arrays.toString(integersEntered));

        // create a variable that holds the minimum value returned
        // from the method findMin(int[] arr)
        int minValue = findMin(integersEntered);
        System.out.println("The minimum value = " + minValue);

    }

    // read the user input and return an array of entered numbers
    public static int[] readIntegers(int count){
        int[] enteredArr = new int[count];
        System.out.println("Please enter " + count + " INTEGER numbers below: \r");

        for(int i = 0; i < enteredArr.length; i++){
            enteredArr[i] = scan.nextInt();
        }

        return enteredArr;
    }

    // find the min value in the entered array
    // and return this
    public static int findMin(int[] arr){
        // initialize the variable minValue to the min value of an integer
        // so that no errors would occur
        int minValue = Integer.MAX_VALUE;

        // iterate through the whole array starting with 1
        // and compare whether the current value arr[i] is less than minValue
        for(int i = 0; i < arr.length-1; i++){

            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }

        return minValue;
    }
}
