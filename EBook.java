/*
 * File: EBook.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: EBook class for the media rental system.   
 */
package media;

class EBook extends Media {

        // Constructor
        EBook(int id, String title, int year, int chapter, int size, boolean available) {
                super(id, title, year, chapter, size, available);
        }

        @Override
        public String toString() {
                return "EBook  [id: " + this.id + "  title: " + this.title + "  chapters: " + this.chapter + "  year: " + this.year
                                + "  available: " + this.available + "]\n";
        }

}// End class