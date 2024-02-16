/*
 * File: MusicCD.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: MusicCD class of the media rental system.   
 */
package media;

class MusicCD extends Media {

       // Constructor 
        MusicCD(int id, String title, int year, int chapter,int size, boolean available) {
                super(id, title, year, chapter, size, available);
        }

        @Override
        public String toString() {
                return "MusicCD  [id: " + this.id + "  title: " + this.title + "  size: " + this.size + " MB" + "  year: " + this.year
                                + "  available: " + this.available + "]\n";
        }

}// End class