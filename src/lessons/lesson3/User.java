package lessons.lesson3;

public class User<I> {

    I id;

    public User(I id){
        this.id = id;
    }

    public <T extends Number> void print(T s){
        System.out.println(s);
    }

}
