/*
 * File: MediaRentalSystem.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: Main class for the media rental system.   
 */
package media;

// Import statements
import java.util.Scanner;



public class MediaRentalSystem {

public static void main(String[] args) {
    
    
    // New scanner
    Scanner scan = new Scanner(System.in);
    
    
    // Loop to read the menu option selected. 
        while (Menu()) {
            int choice;
            System.out.println("Enter choice");
            choice = scan.nextInt();
            Manager m = new Manager();
            switch (choice) {
            case 1:
                
            //C:\Users\Public\media.txt
            System.out.println("Enter path (directory) where to load from: ");
            System.out.println("Example: C:\\Users\\Public\\media.txt");
            String path=scan.next();
            m.LoadMedia(path);
            break;

            case 2:
            System.out.println("Enter media title: ");
            String title=scan.next();
            m.findMedia(title);
             break;

            case 3:
            System.out.println("Enter media id: ");
            int id =scan.nextInt();
            m.rentMedia(id);
            break;

            case 9:
            System.out.println("***THANK YOU FOR USING THE PROGRAM.  GOODBYE***");
            System.exit(0);
            break;

            default:
            System.out.println("Enter valid choice: ");
            break;
}
}
            scan.close();
            
}// End main
// Menu for the user
private static boolean Menu() {
    System.out.println("****WELCOME TO THE MEDIA RENTAL SYSTEM***");
    System.out.println("1: Load Media objects ");
    System.out.println("2: Find Media objects ");
    System.out.println("3: Rent Media objects ");
    System.out.println("9: exit ");
    return true;
        }

} // End class
