public class Student extends  User {
    private String username;

    public Student(int id, String firstName, String lastName, String detail, String username){
        super(id, firstName, lastName, detail);
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
