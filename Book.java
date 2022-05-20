//Kevin George
//1001587385
package assignment5;

import java.util.*;


public class Book {
        private String author;
        private String title;
        private int year;
        private double price;
        public Book(String author, String title, int year, double price) {
                
                this.author = author;
                this.title = title;
                this.year = year;
                this.price = price;
        }
        public String getAuthor() {
                return author;
        }
        public void setAuthor(String author) {
                this.author = author;
        }
        public String getTitle() {
                return title;
        }
        public void setTitle(String title) {
                this.title = title;
        }
        public int getYear() {
                return year;
        }
        public void setYear(int year) {
                this.year = year;
        }
        public double getPrice() {
                return price;
        }
        public void setPrice(double price) {
                this.price = price;
        }
        
        public String toString() {
                return  title + "," + author + "," + year + "," + price;
        }
        
        
}



