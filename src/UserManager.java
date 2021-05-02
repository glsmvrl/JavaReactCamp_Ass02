public class UserManager {
    public void add (User user) {
        System.out.println(user.getFirstName()+ " "+user.getLastName()+" kursa eklendi.");
    }

    public void update (User user) {
        System.out.println(user.getFirstName()+ " "+user.getLastName()+" kursta güncellendi.");
    }

    public void delete (User user) {
        System.out.println(user.getFirstName()+ " "+user.getLastName()+" kurstan silindi.");
    }


}
