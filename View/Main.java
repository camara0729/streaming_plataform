package View;

import java.util.Scanner;

import Model.Category;
import Model.Film;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        Film film = new Film ();
        Category cat = new Category ();
        int op;
        do {
            MenuUI();
            op = s.nextInt();
            switch (op) {
                case 1: //Register a new film
                        break;
                case 2: //Remove a film
                        break;
                case 3: //Edit film's information
                        break;
                case 4: //Display film's information
                        break;
                case 5: //Display all film's information
                        break;
                case 6: //Display all film's information by category
                        break;
                case 0: 
                        break;
                default: System.out.println("Invalid option");
            }            
        } while (op != 0);
    }
    
    public static void MenuUI() {
        System.out.println("Options");
        System.out.println("1 - Register a new film");
        System.out.println("2 - Remove a film");
        System.out.println("3 - Edit film's information");
        System.out.println("4 - Display film's information");
        System.out.println("5 - Display all film's information");
        System.out.println("6 - Display all film's information by category");
        System.out.println("0 - Exit");
        System.out.print("Report the option you want: ");
    }
}
