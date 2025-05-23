
import java.util.Scanner;


public class multipilcation {
     public static void main(String[] args){
      Scanner sc=new  Scanner(System.in);
     System.out.println("Enter a Number: ");
     int num=sc.nextInt();
    System.out.println("***Multiplication Table***");
     for(int i=1;i<=10;i++){
        int result=num*i;
        System.out.println(i+"*"+num+"="+result);
     }
     }
}
