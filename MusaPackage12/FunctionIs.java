package MusaPackage12;

import java.util.Scanner;

public class FunctionIs {


    public void isSixtyFive(int num1, int sum){



        if(num1==65 && sum==65){
            System.out.println(true);
        } else{
            System.out.println(false);
        }

    }

    public static void main(String[] args) {
         FunctionIs f =new FunctionIs();

         Scanner input= new Scanner(System.in);
        System.out.println("Please enter num1");
        int num1=input.nextInt();
        System.out.println("enter sum");
        int sum=input.nextInt();
        f.isSixtyFive(num1,sum);


    }

}
