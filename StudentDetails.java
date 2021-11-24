public class StudentDetails {

    private String studentName;
    private int studentRollNumber;
    private int studentAge;

    public String getName() {
        return this.studentName;
    }

    public int getRollNumber() {
        return this.studentRollNumber;
    }

    public int getAge() {
        return this.studentAge;
    }

    public StudentDetails(String studentName, int studentRollNumber, int studentAge) {
        this.studentName = studentName;
        this.studentRollNumber = studentRollNumber;
        this.studentAge = studentAge;
    }

}
