import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a line of words : ");
         String newwords = in.nextLine();
         String[] words = newwords.split(" ");
         System.out.println("number of words : " + words.length);
         for(String word:words){
              System.out.println(word);
         }
         in.close();
    }
    
}


// Array in Java 
// An Array is a fixed-size , indexed Collection of Similar data types stored in Contiguos memory Location .
// int[] arr = {10 , 20 , 30 , 40};
// When to Use Arrays ?

// Use Case                           Why Use Array ?

// Fixed-Size Collection                 You Know the number of Elements ahead
// Simple data storage (marks,ID,etc..)  Easy indexing and performance
// Fast Access by index                  Constant time retrieval (o(1))
// Homogeneous data                      All elements are of the same type

// String[] fruits = {"Apple" , "Banana" , "Cherry"};
// System.out.println(fruits[1]);

// Strings in java
// What is a string ?
//  A string is a sequence of characters treated as a single object in java.It is immutable ( cannot be changed once created).
// String name = "Madhavan"; 
