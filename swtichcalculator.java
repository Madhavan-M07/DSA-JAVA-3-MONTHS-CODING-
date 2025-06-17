public class swtichcalculator {
    public static void main(String[] args){
        int a = 10 ,  b = 5;
        char op = '*';
        switch(op){
            case '+':
                 System.out.println("Sum : " + (a + b));
                 break;
            case '-':
                  System.out.println("Subtract :" + (a - b));
                  break;
            case '*':
                  System.out.println("Product :" + (a*b));
                  break;
            case '/':
                  System.out.println("Divide :" + (a/b));
                  break;
             default:
                System.out.println("Invalid Operator");

        }
    }
}
