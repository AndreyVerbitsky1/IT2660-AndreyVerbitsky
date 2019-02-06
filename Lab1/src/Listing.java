//Lab1 
import java.util.Scanner;

//Question 41
//create public class listing 
public class Listing {
	
	// main program default
	public static void main(String[] args) {
		
		// Question 42 
		//array of three Listings input
        Listing[] threeListings = new Listing[3];
        for(int j = 0; j < threeListings.length; j++) {
        	 threeListings[j] = new Listing();
        	 threeListings[j].input();
        	 }
        
        //output in reverse order 3, 2, 1
        for(int j = threeListings.length-1;j >= 0; j--) {
            System.out.println( threeListings[j]);
        }		
   
       
	}		

	
	// -two private strings name and age
    private String name;
    private int age;
    
    // public method Listing set name to " " and age to 0
    public Listing() {
        name = " ";
        age = 0;
    }
    
    //Listing Method with string name and Integer age

    public Listing(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // String to string 
    public String toString() {
        return "Name: " + name  + "; Age: " + age +";";
    }
    
    // void user input Name input()
    public void input() {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        name = Scanner.nextLine();
 
    // Age input
        System.out.print("Enter your Age: ");
        age = Scanner.nextInt();
        
    }
    
    
// void setName from user input (String) without return
    
    public void setName(String name) {
        this.name = name;
    }
    
//void setAge from user input (Integer) without return
    public void setAge(int age) {
        this.age = age;
    }
    
//String getName to return name
    
    public String getName() {
        return name;
    }

//Integer getAge to return age
    public int getAge() {
        return age;
    }

    
}



