package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */
public class TestUserProfile {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to UserProfile creation!");            
            System.out.print("Enter your name: ");
            
            System.out.println("Choose the genre you want:");
            System.out.println("1. Romance");
            System.out.println("2. Thriller");
            System.out.println("3. Action");
            System.out.println("4. Fiction");
            System.out.println("5. Horror");
            System.out.print("Enter the number of your favorite genre: ");
            
           
            
            System.out.println("Your userProfile was created!");
}
    }