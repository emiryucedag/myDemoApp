package com.mycompany.app;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static int addAndMultiply(ArrayList<Integer> arrayList, int[] array, String str1, String str2) {
        System.out.println("inside of method");
        if (arrayList == null) return 0;
        if (array == null) return 0;

        int sumOfArrayList = 0;
        int sumOfArray = 0;

        // ArrayList<Integer> ve int[] parametrelerinin toplamını bul
        for (Integer num : arrayList) {
            sumOfArrayList += num;
        }

        for (Integer num : array) {
            sumOfArray += num;
        }

        int firstNumber,secondNumber;

        if (str1!=null)
            firstNumber= str1.length()*sumOfArrayList;
        else
            firstNumber= 0;

        if (str2!=null)
            secondNumber=str2.length()*sumOfArray;
        else
            secondNumber= 0;



        int answer= firstNumber+secondNumber;
        System.out.println("the answer is: "+answer);
        return answer;
    }
}

