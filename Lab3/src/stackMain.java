
public class stackMain {

	public static void main(String[] args) {
		
	Stack number = new Stack();
	// push number 1 and display 3 zeros
	number.push(1);
	number.show();
	// push number 2 and display 1 2 and 2 zeros
	number.push(2);
	number.show();
	// push number 3 and display 1 2 3 and 1 zero
	number.push(3);
	number.show();
	// push number 4 and display 1 2 3 4
	number.push(4);
	number.show();
	
	
	System.out.println(number.pop()); //4th number
	System.out.println(number.pop()); //3rd number
	System.out.println(number.pop()); //2nd number
	System.out.println(number.peek());	//1st number
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
