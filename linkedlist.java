import java.util.*;  
class Book {  
int id;  
String name,author;  
int issueDate, returnDate;  

public int getid() {
    return id;
}

public void setid(int id){
     this.id = id;
}

public void setname(String name){
    this.name = name;
}

public void setauthor(String author){
    this.author = author;
}

public void setissueDate(int issueDate){
    this.issueDate = issueDate;
}

public void setreturnDate(int returnDate){
    this.returnDate = returnDate;
}

}

class listOfBooks{

    LinkedList<Book> list=new LinkedList<Book>();
    boolean idavailable;
    
	//declare 'list' as a linked list in the constructor using Java's built in API's
    
public void add(int id, String name, String author, int issueDate, int returnDate) {
	
	//Wrap all the details into an object of class Book and add it to the linked list
    Book book = new Book();
    book.id = id;
    book.name = name;
    book.author = author;
    book.issueDate = issueDate;
    book.returnDate = returnDate;
	list.add(book);
	
	// Print: 'Successfully added: book_id', where book_id is the id of the book added
	System.out.println("Successfully added: "+ id);
}
public void edit(int id, String name, String author, int issueDate, int returnDate) {
	//Check if the book ID exists
// If it doesn't print: 'No such Book ID exists'      
	//else update the item in the linked list having the given Book ID
	// Print: 'Successfully edited: book_id', where book_id is the id of the book edited

	idavailable = false;
	for(Iterator<Book> iter = list.iterator(); iter.hasNext();) {		
		Book data = iter.next();
	    if (data.getid() == id) {
	    	idavailable = true;
	    	data.setid(id);
	    	data.setname(name);
	    	data.setauthor(author);
	    	data.setissueDate(issueDate);
	    	data.setreturnDate(returnDate);
	    	System.out.println("Successfully edited: "+ id);
	    	
	    	
	    }
	}
	if(idavailable == false) {
		System.out.println("No such Book ID exists");
	}


}
public void delete(int id) {
	//Check if the book ID exists
// If it doesn't print: 'No such Book ID exists'      
	//else delete the item in the linked list having the given Book ID
	// Print: 'Successfully deleted: book_id', where book_id is the id of the book deleted
	idavailable = false;
	for(Iterator<Book> iter = list.iterator(); iter.hasNext();) {
		Book data = iter.next();
	    if (data.getid() == id) {
	    	idavailable = true;
	        iter.remove();
	        System.out.println("Successfully deleted: "+ id);
	    }
	}
	if(idavailable == false) {
		System.out.println("No such Book ID exists");
	}

	
}
public void printDatabase() {
	System.out.println("List of books:");
	   for (Book element : list)
		      System.out.println("ID: "+ element.id +", Name: " + element.name + ", Author: " + element.author + ", Date of Issue: " + element.issueDate + ", Date of Return: " + element.returnDate);
// Print the details of all the books in the list in the following format:
//ID: 2, Name: ABC, Author: DEF, Date of Issue: 2, Date of Return: 3
//Note that the above is just an example
}
}  



public class Source {

	public static void main(String[] args) {  
		listOfBooks database = new listOfBooks();
	    database.add(234,"Hamlet","W. Shakespeare",27,29); 
	    database.add(35,"Relativity","Albert Einstein",15,30);
	    database.add(2,"Data Sciences","Shan B",1,4); 
	    database.edit(2,"Data Sciences","Shan B",1,8);
	    database.delete(35);
	    database.printDatabase();
	    database.add(120,"Crooked House","Agatha Christie",15,28);
	    database.edit(235,"Hamlet","W. Shakespeare",28,29);
	    database.add(121,"The final problem","Arthur Doyle",13,20);
	    database.delete(234);
	    database.printDatabase();      
	}  
}
