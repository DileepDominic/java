package calc;
class Item{
	public int number1;
	public int number2;
	public int result;
	public char operation;
	
	public void setnumber1(int number1){
	     this.number1 = number1;
	}
	
	public void setnumber2(int number2){
	     this.number2 = number2;
	}
	
	public void setresult(int result){
	     this.result = result;
	}
	
	public void setoperation(char operation){
	     this.operation = operation;
	}
}

class Stack {
   private int maxSize;
   private Item[] stackArray;
   private int top;
 
   public Stack(int s) {
      //Assign s to the maxSize, declare the stack of array elements, initialize top
	   maxSize = s;
	   stackArray = new Item[maxSize];
	   top = -1;
   }
   public void push(Item j) {
      //Push the whole operation item at the top of the stack
	   stackArray[++top] = j;
   }
   public void displayOperationTop5() {
	   int j = top;
	   for(int i = 0;i<5;i++) {
		   if(j!=-1) {
		  // System.out.println();
		   System.out.println(stackArray[j].number1 + " " + stackArray[j].operation+ " " +stackArray[j].number2 + " = " + stackArray[j].result);
		   j--;
		   }
	   }
	   
	//Print the last 5 (or  all elements if the size of stack is less than or equal to 5) operations in the following format:
    //'number1' 'operation' 'number2' = 'result'
   }
   public int peek() {
	//return the result of last operation. 
    //Hint: Top of the stack holds information for the last operation
	  
	   
	   return stackArray[top].result;
   }
   public void add(int number1, int number2) {
	   //Print the result (e.g. If number1 is 2 and number2 is 3 then print 'Result: 5') and push the item into the stack

	   Item i = new Item();
	   i.setnumber1(number1);
	   i.setnumber2(number2);
	   i.setoperation('+');
	   int res;
	   res = number2+number1;
	   i.setresult(res);
	   System.out.println("Result: "+res);
	   push(i);
   }
   public void subtract(int number1, int number2) {
	   //Print the result (e.g. If number1 is 3 and number2 is 2 then print 'Result: 1') and push the item into the stack
	   Item i = new Item();
	   i.setnumber1(number1);
	   i.setnumber2(number2);
	   i.setoperation('-');
	   int res;
	   res = number1-number2;
	   i.setresult(res);
	   System.out.println("Result: "+res);
	   push(i);
   }
   public void multiply(int number1, int number2) {
	   //Print the result (e.g.  If number1 is 3 and number2 is 2 then print 'Result: 6') and push the item into the stack
	   Item i = new Item();
	   i.setnumber1(number1);
	   i.setnumber2(number2);
	   i.setoperation('*');
	   int res;
	   res = number2*number1;
	   i.setresult(res);
	   System.out.println("Result: "+res); 
	   push(i);
	   
   }
   public void divide(int number1, int number2) {
	   //Print the result (e.g. If number1 is 6 and number2 is 3 then print 'Result: 2') and push the item into the stack
	   Item i = new Item();
	   i.setnumber1(number1);
	   i.setnumber2(number2);
	   i.setoperation('/');
	   int res;
	   res = number1/number2;
	   i.setresult(res);
	   System.out.println("Result: "+res);
	   push(i);
   }
}

public class Source{
	public static void main(String[] args) {
	      Stack newStack = new Stack(10); 
	      newStack.add(2,3);
	      newStack.multiply(8,9);
	      newStack.displayOperationTop5();
	      newStack.divide(6,3);
	      newStack.subtract(45,44);
	      newStack.add(18,0);
	      newStack.multiply(6,newStack.peek());
	      newStack.displayOperationTop5();
	      newStack.divide(2,3);
	      newStack.subtract(3,newStack.peek());

	   }
}
