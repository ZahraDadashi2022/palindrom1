import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrom {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Palindrom polindrome = new Palindrom();
        ArrayList<String> myArray = new ArrayList<String>();
        System.out.println(" array : please enter 3 numbers ");
        myArray.add(sc.nextLine());
        myArray.add(sc.nextLine());
        myArray.add(sc.nextLine());

        System.out.println("  array : " + myArray);
        ArrayList<String> copyArray = new ArrayList<String>();
        //  Object copyArray = new ArrayList<String>();
        copyArray = (ArrayList<String>) myArray.clone();
        List<String> myReversedArray = new ArrayList<String>();
        myReversedArray = polindrome.reversedArray(myArray);
        System.out.println("copyArray: " + copyArray);
        System.out.println(" reversed array: " + myReversedArray);
        if (copyArray.equals(myReversedArray)) {
            System.out.println("this arrayList is a palindrome");
        } else System.out.println("no palindrome was found");


    }

    public ArrayList<String> reversedArray(ArrayList<String> array) {
        Integer index = array.size() - 1;
        String temp;
        int halfSize = array.size() / 2;
        if (array.isEmpty())
            System.out.println("array is empty");
        else {
            for (Integer i = 0; i < halfSize; i++) {
                temp = array.get(i);
                array.set(i, array.get(index - i));
                array.set(index - i, temp);
            }
        }
        return array;
    }
}

