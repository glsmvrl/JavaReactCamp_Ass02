public class User {

    private int id;
    private String firstName;
    private String lastName;
    private String detail;

    public User(int id, String firstName, String lastName, String detail){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.detail=detail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
