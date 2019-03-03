
public class Stack {
	int stack[] = new int[4];
	int top = 0;
	
	// Push Method
	public void push (int data)
	
	{//if top is equal to 4 display message Stack is Full
		if(top==4){
			
			System.out.println("Could not isert data, Stack is Full");
		}// if top is more than 0 and less than 4 increment;
		else {
			stack[top] = data;
			top++;
		}
		
	}
// Pop method
	public int pop() {
		int data = 0;
		
		if (isEmpty()) {
		System.out.println("Couldn not retrieve data, Stack is Empty");	
		}
		else 
		{
			top--;
			data = stack[top];
			stack[top] = 0;
		}
		return data;
	}		
	//peek method 
	public int peek()
	
	{
		int data;
		data = stack[top-1];
		return data;
	}
	
	// if top is less than 0 return method is Stack is empty
	public boolean isEmpty() {
		return top<=0;
	}
	//show method
	public void show() {
		for(int n : stack)
		{
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
