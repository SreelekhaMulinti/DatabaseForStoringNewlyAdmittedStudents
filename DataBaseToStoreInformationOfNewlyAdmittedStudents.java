
class DataBaseToStoreInformationOfNewlyAdmittedStudents {

    public static void main(String[] args) {

        SchoolAdmin admin = new SchoolAdmin();

        admin.addStudentDetails();
        admin.removeStudent(1);
        admin.updateStudentName(1, new StudentDetails("ram", 116, 7));
        admin.displayDetails();

    }
}
