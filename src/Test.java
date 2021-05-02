public class Test {
    public static void main(String[] args){

        Instructor instructor = new Instructor(1,"Engin","Demiroğ","Software Engineer","Java & React Course");

        Student student = new Student(2,"Gülsüm","Vural","Software developer student","glsmvrl");

        InstructorManager instructorManager = new InstructorManager(instructor);
        instructorManager.add(instructor);

        StudentManager studentManager = new StudentManager(student);
        studentManager.add(student);

        System.out.println("Instructor: " + instructor.getId() + " " + instructor.getFirstName() + "," + instructor.getLastName() + "," + instructor.getDetail()
                + "," +instructor.getLesson());
        System.out.println("Student: " +  student.getId() + " " + student.getFirstName() + "," + student.getLastName() + "," + student.getDetail()
                + "," + student.getUsername());





    }
}
