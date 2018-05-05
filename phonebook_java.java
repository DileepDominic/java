package Phone;

import java.util.*;

class Record {    
String name;  
long number; 

public String getname() {
    return name;
}

public void setname(String name){
     this.name = name;
}

public long getnumber() {
    return number;
}

public void setnumber(long number){
     this.number = number;
}

}

class AddressBook{
	//List<Record> list;
	LinkedList<Record> list=new LinkedList<Record>();
    boolean numberavailable;

	//declare 'list' as a linked list in the constructor using Java's built in API's 
	
public void add(String name, long number) {
	//Wrap all the details into an object of class Record and add it to the linked list
	// Print: 'Successfully added: contact_name', where contact_name is the name of the contact added
	Record record = new Record();
	record.name = name;
	record.number = number;
	list.add(record);
	System.out.println("Successfully added: " + name); 
	
}
public void findByNumber(long number) {	
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else Print: 'Name: contact_name', where contact_name is the name of the contact having that number	    
	numberavailable = false;
	for(Iterator<Record> iter = list.iterator(); iter.hasNext();) {
		Record data = iter.next();
	    if (data.getnumber() == number) {
	    	numberavailable = true;
	        System.out.println("Name: "+ data.getname());
	    }
	}
	if(numberavailable == false) {
		System.out.println("No such Number exists");
	}

}

public void delete(long number) {
	//Check if the number exists
	// If it doesn't, print: 'No such Number exists'      
	//else delete the item in the linked list having the given number
	// Print: 'Successfully deleted: contact_number', where contact_number is the number to be deleted
	numberavailable = false;
	for(Iterator<Record> iter = list.iterator(); iter.hasNext();) {
		Record data = iter.next();
	    if (data.getnumber() == number) {
	    	numberavailable = true;
	        iter.remove();
	        System.out.println("Successfully deleted: "+ number);
	    }
	}
	if(numberavailable == false) {
		System.out.println("No such Number exists");
	}
	
}
public void printAddressBook() {
	System.out.println("List of contacts:"); 
	// Print the details of all the contacts in the list in the following format:
	//Name: ABC Number: 123456789
	//Note that the above is just an example	
	for (Record record : list)
		      System.out.println("Name: "+ record.name + " Number: " + record.number);

}
}  
public class Source {  
public static void main(String[] args) {  
	AddressBook myContacts = new AddressBook();
    myContacts.add("John", 9876123450l);
    myContacts.add("Mellisa", 8360789114l);
    myContacts.add("Daman",9494149900l);
    myContacts.findByNumber(9998760333l);
    myContacts.printAddressBook();
    myContacts.delete(9876123450l);
    myContacts.add("Gregory",7289880988l);
    myContacts.printAddressBook();
    myContacts.findByNumber(8360789114l);
    myContacts.add("Mary",7205678901l);
    myContacts.delete(9876123450l);
    myContacts.findByNumber(7205678901l);
    myContacts.printAddressBook();      
}  
}
