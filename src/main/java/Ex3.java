
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author abhis
 *///Prime number
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        int a,i;
        int c =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        a= sc.nextInt();
        for( i = 1;i<=a/2;i++){
            if(a%i ==0){
                c++;
            }
        }
        if(c==1){
                    System.out.println("Prime");

        }
        else{
                    System.out.println("Not a Prime");

        }
    }
}
