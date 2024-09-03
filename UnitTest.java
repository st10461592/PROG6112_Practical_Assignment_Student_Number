import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static java.lang.System.in;
import java.util.ArrayList;
import static org.junit.Assert.*;
import java.util.Scanner;

public class UnitTest {
    private Student studentManager;
    
    @Before
    public void setUp(){
        studentManager = new Student();
    }
    
    @Test
    public void testSaveStudent()
    {
        //Simulate user input for saving a student
        String simulatedInput = "ST10461592\nTemogo Masuku\n18\ntemogomasuku31@gmail.com\nComputer Science";
        System.setIn(in);
        
        //Call the saveStudent method
        studentManager.saveStudent(new Scanner(System.in));
        
        
        //This was adapted from Javatpoint
        //https://www.javatpoint.com/java-arraylist
        //Check if the student was added
        ArrayList<Student.StudentDetails> students = studentManager.getStudents();
        assertEquals(1, students.size());
        assertEquals("ST10461592", students.get(0).getId());
        assertEquals("Temogo Masuku",students.get(0).getName());
        assertEquals(18, students.get(0).getAge());
        assertEquals("temogomasuku31@gmail.com", student.get(0).getEmail());
        assertEquals("Computer Science", student.get(0).getCourse());
    }
    
    @Test
    public void testSearchStudent(){
        //First, save a student
        studentManager.saveStudent(new Scanner(new ByteArrayInputStream
        ("ST10461592\nTemogo Masuku\n18\ntemogomasuku31@gmail.com\nComputer Science\n".getBytes())));
        
        //Now search for the student
        Student.StudentDetails foundStudent = studentManager.searchStudent("ST10461592");
        assertNotNull(foundStudent);
        assertEquals("Temogo Masuku", foundStudent.getName());
        assertEquals("ST10461592", foundStudent.getID());
    }
    
    @Test
    public void testSearchStudent_StudentNotFound(){
        //Searching for a student that does not exist
        Student.StudentDetails foundStudent = studentManager.searchStudent("ST10254367");
        assertNull(foundStudent);
    }
    
    @Test
    public void testDeleteStudent(){
        //First, save a student
        studentManager.saveStudent(new Scanner(new ByteArrayInputStream("ST10461592\nTemogo Masuku"+ 
                "\n18\ntemogomasuku31@gmail.com\nComputer Science\n".getBytes())));
        
        //Now delete the student
        boolean deleted = studentManager.deleteStudent("ST10461592");
        assertTrue(deleted);
        assertEquals(0, studentManager.getStudents().size());
    }
    
    @Test
    public void testDeleteStudent_StudentNotFound(){
        //Attempt to delete a student that does not exist
        boolean deleted = studentManager.deletedStudent("ST10254367");
        assertFalse(deleted);
    }
    
    @Test
    public void testStudentAge_StudentAgeValid(){
        //Set a Valid age
        int age = 18;
        assertTrue(studentManager.isValidAge(age));
    }
    
    
    @Test
    public void testStudentAge_StudentAgeInvalid(){
        //Set an Invalid age
        int age = 15;
        assertFalse(studentManager.isValidAge(age));
    }
    
    @Test
    public void testStudentAge_StudentAgeInvalidCharacter(){
        //Handle invalid character input
        String invalidAgeInput = "abc";
        assertThrows(NumberFormatException.class,() ->{
            int age = Integer.parseInt(invalidAgeInput);
            //Simulate parsing an invalid age
            studentManager.isValidAge(age);
        });
        }
    }
    
    
    
    
    
    
    
    
    

        
        

