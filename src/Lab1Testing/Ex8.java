package Lab1Testing;

import java.util.Scanner;

public class Ex8 {
    public static void main(String []args){
        int []table=new int[6];
        int sum=0;
        Scanner s=new Scanner(System.in);
        for (int i=0;i<6;i++){
            System.out.println("Add "+i +" element");
            table[i]=s.nextInt();
            sum+=table[i];
        }
        System.out.println("Avr:" +(double)sum/6);
    }
}
