
public class Student {
    
    private StudentListings[] student;
    
    public Student(StudentListings firstStudent)
    {
        this.student = new StudentListings[1];
        this.student[0] = firstStudent;
    }
    //Insert array
    public boolean insert(StudentListings student, int position)
    {
        if(this.student.length == 0 && position == 0)
        {
            this.student = new StudentListings[1];
            this.student[0] = student.deepCopy();
            	return true;
        }
        
        if(position < 0 || position > this.student.length)
        {
            System.out.println("Try Again!");
            	return false;
        }
        
        StudentListings[] newStudentList = new StudentListings[this.student.length + 1];
        
        for(int i = 0; i < this.student.length + 1; i++)
        {
            if(i < position)
            {
                newStudentList[i] = this.student[i];
            }
            else if( i > position)
            {
                newStudentList[i] = this.student[i - 1];
            }
            else
            {
                newStudentList[i] = student;
            }
        }
        this.student = newStudentList;
        	return true;
    }
    // Delete array
    public boolean delete(String targetKey)
    {
        int i = 0;
        int length = student.length;
        while(i < length && !(student[i].compareTo(targetKey) == 0))
        {
            i++;
        }  
        
        if(i == length)        
        	return false;
        
        student[i] = student[length - 1];
        student[length - 1] = null;
        length = length - 1;
        	return true;
            
    }
    
    //Fetch Array
    public StudentListings fetch(String targetKey)
    {
        StudentListings newStudent;
        StudentListings temp;
        
        int i = 0;
        int length = student.length;
        while(i < length && !(student[i].compareTo(targetKey) == 0))
        {
            i++;
        }
        
        if(i == length)
        	return null;
        
        newStudent = student[i].deepCopy();
        
        if(i != 0)
        {
            temp = student[i - 1];
            student[i - 1] = student[i];
            student[i] = temp;
        }
        return newStudent;
    }
    
    //Update array
    public boolean update(String targetKey, StudentListings newStudent, int position)
    {
        if(delete(targetKey) == false)
            return false;
        else if(insert(newStudent, position) == false)
            return false;
        else
            return true;
    }
    
    public void showAll()
    {
                for(int i = 0; i < student.length; i++)
                {
                   if(student[i] == null)
                   {
                       System.out.println("Cleared");
                   }
                   else
                   {
                    System.out.println(student[i].toString());
                   }
                }                
    }   
}