/*
 * File: Media.java
 * IDE: Apache NetBeans
 * Author: ~Roy Phelps~
 * Date: 3/8/21
 * Pourpose: The creation of a media rental system to add media objects, find
 * media objects and stores them in a file.  
 */
package media;




class Media {

        int id;
        String title;
        int year;
        int chapter;
        boolean available;
        int size;

        Media() {
        }

        public Media(int id, String title, int year, int chapter, int size, boolean available) {
                this.id = id;
                this.title = title;
                this.year = year;
                this.chapter = chapter;
                this.available = available;
                this.size = size;
                
        }

        public void setId(int id) {
                this.id = id;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public void setYear(int year) {
                this.year = year;
        }
        public void setChapter(int chapter) {
                this.chapter = chapter;
        }
        public void setSize(int size){
            
        }
        public void setAvailable(boolean available) {
                this.available = available;
        }
        
        
        public int getId() {
                return id;
        }
        public String getTitle() {
                return title;
        }
        public int getYear() {
                return year;
        }
        public int getChapter() {
                return chapter;
        }
        public int getSize(){
                return size;
        }
        public boolean isAvailable() {
                return available;
        }

}