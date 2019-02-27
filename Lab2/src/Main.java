public class Main {

    public static void main(String[] args) {

    	
    	// List of students that User inputs (4 students)
    	System.out.println("\nUser Input List");
    	StudentListings student1 = new StudentListings();
        StudentListings student2 = new StudentListings();
        StudentListings student3 = new StudentListings();
        StudentListings student4 = new StudentListings();
        student1.input();
        student2.input();
        student3.input();
        student4.input();
        System.out.println("\nFirst Student:  " + student1.toString());
        System.out.println("\nSecond Student: " + student2.toString());
        System.out.println("\nThird Student: "  + student3.toString());
        System.out.println("\nForth Student: " + student4.toString());

        
        //Custom Insert list
        System.out.println("\nInsert Operation");
        Student newList = new Student(new StudentListings("Steve","1","4.0"));
        newList.insert(new StudentListings("Max","2","4.0"),1);
        newList.insert(new StudentListings("Robert","3","3.5"),2);
        newList.insert(new StudentListings("Ashley","4","3.67"),3);
        newList.insert(new StudentListings("Jacob","5","3.24"),4);
        newList.showAll();
       
        //Fetch
        System.out.println("\nFetch Operation");
        System.out.println(newList.fetch("Robert"));
        System.out.println("\n");
        StudentListings newAddition = new StudentListings("Lebron James", "2", "4.0"); 
        
        // Delete 
        System.out.println("\nDelete Operation");
        System.out.println("\n");
        System.out.println(newList.delete("Jacob"));
        System.out.println("\n");
        newList.showAll();
        System.out.println("Jacob Got Deleted");
        
        //Update
       System.out.println("\nUpdate Operation");
       System.out.println("\n");
       // add Lebron Instead of Max
       System.out.println(newList.update("Max", newAddition, 1));
       newList.showAll();
       
    }
}