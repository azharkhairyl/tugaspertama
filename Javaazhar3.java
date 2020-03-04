/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaazhar3;

import java.util.Scanner;

/**
 *
 * @author Legion Y520
 */
public class Javaazhar3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        
         System.out.print("Masukkan teks: ");
        Scanner input = new Scanner(System.in);
        String hasil = input.nextLine();

        switch (hasil){
            case "1":
                System.out.println("Hello World");
                break;
            case "2":
                System.out.println("Azhar Is Adorable");
                break;
            default:
                System.out.println("No Option!");
                break;
        }

         //Switch similar like If
        System.out.print("Masukkan kata: ");
        Scanner inputan = new Scanner(System.in);
        String words = inputan.nextLine();

        //case 1
        switch (words) {
            case "1":
                System.out.println("Hello World!");
                break;
            case "2":
                System.out.println("Azhar is Adorable");
                break;
            default:
                System.out.println("No Option!");
                break;
        }
        
// Simply Task

        System.out.print("Masukkan input: ");
        Scanner angka = new Scanner(System.in);
        int number = angka.nextInt();

        if(number < 10){
            System.out.println("Under 10!");
        }
        else if(number <= 31){
            System.out.println("Above 10 and Under 30");
        }
        else{
            System.out.println("Above 31!");
        }

//Looping

        //for
        int max = 100;
        for (int i = 0; i < max; i++){
            System.out.println(i);
        }

        //foreach
        int arr[] = {3, 1, 2, 5, 4};

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        String letters[] = {"Hello", "World", "Azhar", "Is", "Adorable"};

        for (String letter : letters) {
            System.out.println(letter);
        }

        //While Do
        int maxsimum = 10;
        int i = 0;
        while (i < maxsimum){
            System.out.println("Hello World!");
            i++;
        }

        //using Do While
        int maximum = 10;
        int x = 0;
        do{
            System.out.println("Hello World 2nd");
            x++;
        }while (x < max);

    }
    
}
