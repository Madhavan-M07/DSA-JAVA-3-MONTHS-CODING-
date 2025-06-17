import java.util.Scanner;

public class nestedifelse {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Marks:");
        int marks = in.nextInt();
        if(marks>50){
            if(marks>=90){
                System.out.println("Grade: A+");
            }else if(marks >=75){
                System.out.println("Grade : A");
            }
            else if(marks >=60){
                System.out.println("Grade: B");
            }
            else{
                System.out.println("Grade: C");
            }
        }
        else{

            System.out.print("Fail Better Luck Next Time");
        }
            in.close();
    }


    
}
