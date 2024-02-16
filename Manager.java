/*
 * File: Manager.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: This class manages the selections of the user.  
 */
package media;

// Import statements
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


class Manager {

    static List<Media> list=new ArrayList<>();;

    Manager() {
        }

    public boolean LoadMedia(String path) {
        try {
            // Creation of a new file from directory
        File file = new File(path);
            try (Scanner myReader = new Scanner(file)) {
                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    String[] str = data.split(" ");
                    switch (str[0]) {
                        case "EBook":
                            list.add(new EBook(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                                    Integer.parseInt(str[4]), Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
                            break;
                        case "MusicCD":
                            list.add(new MusicCD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                                    Integer.parseInt(str[4]), Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
                            break;
                        default:
                            list.add(new MovieDVD(Integer.parseInt(str[1]), str[2], Integer.parseInt(str[3]),
                                    Integer.parseInt(str[4]), Integer.parseInt(str[4]), Boolean.parseBoolean(str[5])));
                            break;
                    }
                }
                System.out.println(list);
            }
                        return true ; 
                } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        return false;
                }
        }
        
        // Find media method
        public void findMedia(String title) {
            list.stream().filter(m -> (m.getTitle().equals(title))).forEachOrdered(m -> {
                System.out.print(m.toString());
        });
        }
        
        // rent media method
        public void rentMedia(int id) {
            list.stream().filter(m -> (m.getId()==id)).forEachOrdered(m -> {
                if(m.isAvailable())
                    System.out.println("media successfully rented out.  Rental fee $2.00 ");
                else
                    System.out.println("Media with id: "+ id+ " is already rented out. ");
        });
        }

}// End class