package javaworkout;

import java.util.Scanner;
import java.util.Arrays;

public class Class1 {

    public static void main(String[] args) {
        // write your code here
     /*   String introMessage ;
        String userName,inputString,beginningCount,endingCount;
        int results;

        //Assigning those vars

        Scanner input = new Scanner(System.in); // used for accepting user input
        //userName = input.nextLine();
        //inputString = input.nextLine();
        beginningCount = "Counting the number of word in your sentence, Please wait... ";
        endingCount = "Counting Complete";

        //  the Program
        System.out.print("Username : ");
        userName = input.nextLine();
        System.out.println(introMessage = "Hii " + userName + " Welcome to the \"Count-All-Words-In-My-Sentence\" Program ");
        System.out.print("Please type in your sentence(s) : ");
        inputString = input.nextLine();
        System.out.println("Your Sentence : " + inputString );

        //System.out.println("Using Strip() :" + (inputString.strip()).length());
        // first we trim down the string for excess trailing whitespaces
        String trimDown = inputString.trim();
        //then remove the spaces in between the strings
        String noSpace = trimDown.replaceAll("\\s",""); // "\\s" -> represent a single line of space
        int Results = noSpace.length();
        System.out.println("Results: " + noSpace);
        System.out.println("Number of characters is : " + Results);
        // the above is good for counting characters

        //now to count the words in a string

        String[] splitString = inputString.split("\\s");
        String splitedString = Arrays.toString(splitString);
        System.out.println("SplittedString : " + splitedString);
        //now let me try count
        System.out.println("Counted string : " + splitString.length); //it works q1 done now its time to restructure the code

*/
        int rows = 80, columns = 5;
        int[][] marks = new int[rows][columns];

        // initializing the array elements using for loop
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                marks[i][j] = i + j;
            }
        }

        // printing the first three rows of marks array
        System.out.println("First three rows are: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.printf(marks[i][j] + " ");
            }
            System.out.println();
        }

        // TODO Auto-generated method stub
        double[][] arr = new double[11][11];//= { { 1, 2 }, { 3, 4 } };
        int x = 0;
        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {
                //arr[i][j] = i;
                //arr[i][j] = i*j;
                //arr[i][j] =   (1.5)*(j*j)+(-0.5)*(j) ;
                //arr[i][j] = i+10;
                arr[i][j] = x + 1;
                x++;

                //System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
        for (int i = 1; i < 11; i++) {

            for (int j = 1; j < 11; j++) {
                //arr[i][j] = i;
                //arr[i][j] = i*j;
                //arr[i][j] =   (1.5)*(arr[i][j]*arr[i][j])+(-0.5)*(arr[i][j]) ;


                System.out.print((1.5) * (arr[i][j] * arr[i][j]) + (-0.5) * (arr[i][j]) + " ");
            }

            System.out.println();
        }


    }
}
