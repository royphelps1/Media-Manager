/*
 * File: MovieDVD.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: MovieDVD class of the media rental system.   
 */
package media;

class MovieDVD extends Media {

        // Constructor
        MovieDVD(int id, String title, int year, int chapter, int size, boolean available) {
                super(id, title, year, chapter, size, available);
        }

        @Override
        public String toString() {
                return "MovieDVD  [id: " + this.id + "  title: " + this.title + "  size: " + this.size + " GB" +  "  year: " + this.year
                                + "  available: " + this.available + "]\n";
        }

}// End class