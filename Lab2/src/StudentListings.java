import javax.swing.JOptionPane;

public class StudentListings {
    
    private String Name;
    private String Id;
    private String GPA;
    
    public StudentListings()
    {
        Name = "";
        Id = "";
        GPA = "";
    }
    // Constructor
    public StudentListings(String name, String Id, String GPA)
    {
        this.Name = name;
        this.Id = Id;
        this.GPA = GPA;
    }
    
    public String getName(){
        return this.Name;
    }
    
    //  string toString() method
    public String toString()
    {
        return("\nThe Student's name is: " + Name +
                "\nStudent's ID Number: " + Id + 
                "\nStudent's GPA: " + GPA);
    }
 // DeepCopy Method
    public StudentListings deepCopy()
    {
        StudentListings clone = new StudentListings(Name, Id, GPA);
        return clone;
    }
    
    public int compareTo(String targetKey)
    {
        return(this.Name.compareTo(targetKey));
    }
    
    // input method
    public void input()
    {
        Name = JOptionPane.showInputDialog("Enter Student's Name");
        Id = JOptionPane.showInputDialog("Enter Student's ID");
        GPA = JOptionPane.showInputDialog("Enter Student's GPA");
    }

}