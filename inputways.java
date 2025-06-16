import java.util.Scanner;

public class inputways {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Integer:");
        int number = in.nextInt();
        System.out.print("Enter a Floating point Values:");
        double decimal = in.nextDouble();
        in.nextLine();
        System.out.print("Enter a text or single text:");
        String word = in.next();
        in.nextLine();
        System.out.print("Enter a Full Line:");
        String Lines = in.nextLine();
        System.out.print("Enter a Boolean ( T /F)");
        boolean flag = in.nextBoolean();

        System.out.println("\n---Your --- Output ---");
        System.out.println("Integer:" + number);
        System.out.println("Floating Point Number:" + decimal);
        System.out.println("Words" + word);
        System.out.println("sentence" + Lines);
        System.out.println("Boolean" + flag);

        in.close();

    }    
    
}
