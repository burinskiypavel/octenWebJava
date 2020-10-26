package lessons.lesson1;

public class SuperUser extends User {
    private String login;

    public SuperUser() {
        super();
    }

    public SuperUser(int id, String name, String login) {
        super(id, name);
        this.login = login;
    }
}
