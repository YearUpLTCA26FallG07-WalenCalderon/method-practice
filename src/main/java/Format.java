import java.util.Scanner;

public class Format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting input
        System.out.println("Enter your number: ");
        int num1 = sc.nextInt();
        //is even?
        if(isEven(num1)){
            System.out.println("You are even");
        }else{
            System.out.println("You are not even");
        }

        //is positive?
        if(isPositive(num1)){
            System.out.println("You are positive");
        } else {
            System.out.println("You are not positive");
        }

    }

    public  static boolean isEven(int num1) {

        return num1 % 2 == 0;
    }

    public static boolean isPositive(double num1){
        return num1 > 0;
    }

}
