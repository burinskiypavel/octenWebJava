package lessons.lesson1;

public class User {

    static int x = 100;
    private  int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int id) {
        this.id = id;
    }

    public User(String name, int id) {
        this.id = id;
        this.name = name;
    }




    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

//    public static calcualte(int a, int b){
//        System.out.println(id);
//        return a + b;
//    }

    public int calcualte(int a, int b){
        System.out.println(x);
        return a + b;
    }
}
