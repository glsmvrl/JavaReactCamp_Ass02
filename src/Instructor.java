public class Instructor extends User{

    private String lesson;

    public Instructor(int id, String firstName, String lastName, String detail, String lesson){
        super(id, firstName, lastName, detail);
        this.lesson=lesson;
    }


    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
