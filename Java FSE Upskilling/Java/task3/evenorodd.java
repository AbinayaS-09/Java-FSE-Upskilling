// Java program to print Hello World
import java.util.Scanner;  

public class evenorodd {
    public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=input.nextInt();
    if(num%2==0){
        System.out.println("Even no");
    }
    else{
        System.out.println("Odd no");
    }

    }
 
}
