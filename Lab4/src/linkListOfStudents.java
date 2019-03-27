import java.util.LinkedList;
import java.util.ListIterator;

public class linkListOfStudents {
	
	
	public static void main(String[] args) {
		
		//created the link list named StudentList
		LinkedList<String> StudentList = new LinkedList<String>();
		//Adding students to the linked list
		StudentList.add("Jane Doe, GPA= 4.0, StudentID = 1");
		StudentList.add("John Doe, GPA= 3.9, StudentID = 2");
		StudentList.add("Jane Boe, GPA= 3.8, StudentID = 3");
		StudentList.add("John Boe, GPA= 3.7, StudentID = 4");
		StudentList.add("Janet Ray, GPA= 3.6, StudentID = 5");
		StudentList.add("Roy Ray, GPA= 3.5, StudentID = 6");
		
		
		//Delete Roy Ray 6th Student in 5th postion since it starts with 0
		StudentList.remove(5);
		System.out.println("Deleted Student in the 6th(last)position, now student 5 is considered the last position");
		//Show the Last Student in the list
		System.out.println(StudentList.getLast());
		//Show the new updated List with Student removed 6th position
		System.out.println("\nShow the updated list without 6th position");
		System.out.println(StudentList);
		
		
		
		//String Iterator Pointer starts before the Student number 1
		ListIterator<String> Iterator = StudentList.listIterator();
		
		//adding the Deleted student to the front of the list using iterator
		System.out.println("\nAdding the Deleted student to the front of the list using iterator");
		Iterator.add("Roy Ray, GPA= 3.5, StudentID = 6");
		System.out.println(StudentList);
		
		//Adding New Student to 4th position using iterator, From first position go up two which puts it in 4th place 6 1 2 New 4th positon
		if(Iterator.hasNext()) {
			Iterator.next();
			Iterator.next();
			Iterator.add("John DoeDoeDoe, GPA= 4.0, StudentID = 444");
		}
		
		//deletes the student on the fifth position which was Jane Boe with Student ID =3 
		Iterator.next();
		Iterator.remove();
		
		System.out.println("\nShow the updated list with the new 4th position for John DoeDoeDoe and new updated 5th position");
		for (String listOfStudents: StudentList) {
		System.out.println(listOfStudents + "");
		
		
		}
		
	}
	

}
