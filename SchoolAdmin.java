import java.util.ArrayList;

public class SchoolAdmin {

    ArrayList<StudentDetails> database = new ArrayList<>();

    public void addStudentDetails() {
        database.add(new StudentDetails("sree", 111, 4));
        database.add(new StudentDetails("lekha", 112, 6));
        database.add(new StudentDetails("latha", 114, 5));
        database.add(new StudentDetails("lally", 119, 8));
    }

    public void removeStudent(int index) {
        database.remove(index);
    }

    public void updateStudentName(int index, StudentDetails updatedStudent) {
        database.set(index, updatedStudent);
    }

    public void displayDetails() {
        for (StudentDetails student : database) {
            System.out.println(getDetails(student));
        }
    }

    public String getDetails(StudentDetails student) {
        return "Student details : " + student.getName() + " " + student.getRollNumber() + " " + student.getName();
    }
}
