//Kevin George
//1001587385
package assignment5;

import java.util.*;
import assignment5.Book;

public class List {
		
    public static void main(String[] args) {
	    ArrayList<Book> book1=new ArrayList<>(Arrays.asList(
	                    new Book("Deitel","Java Programming",2016,68.75),
	                    new Book("Gaddis","Python Programming",2018,78.56),
	                    new Book("Norman","Data Analytics",2017,89.56),
	                    new Book("Wilson","Block Chain Developement",2019,87.45),
	                    new Book("Brown","Web Development",2018,98.98)
	                    ));
	    Comparator compareTitle= new Comparator<Book>() {	            
	            public int compare(Book blist1, Book blist2) {
	            	int title = blist1.getTitle().compareTo(blist2.getTitle());
	                    return title;
	            }
	            
	    };
	    Comparator compareYear=new Comparator<Book>() {		            
	            public int compare(Book blist1, Book blist2) {
	                    if(blist1.getYear()<=blist2.getYear())
	                            return -1;
	                    else 
	                            return 1;	                    
	            } 
	            
	    };
	    Collections.sort(book1,compareTitle);
	    System.out.println("Sorting by Title\n");
	    for(Book b:book1)
	            System.out.println(b);
	    Collections.sort(book1,compareYear);
	    System.out.println("\nSorting by year\n");
	    for(Book b:book1)
	    System.out.println(b);
	    }

	
}


