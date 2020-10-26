package lessons.lesson3;

public class Main {
    public static void main(String[] args) {
//        CarTypes[] values = CarTypes.values();
//        for(CarTypes value : values){
//            System.out.println(value.ordinal());
//        }

        Engin engin = new Engin(1.4, 150);

        Car bmw = new Car("BMW", CarTypes.SEDAN, new Engin(1.8, 200));
        Car mers = new Car("Mersedes", CarTypes.MINIVAN, new Engin(2.1, 400));

//        System.out.println(engin);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//        engin.setHorsePower(engin.getHorsePower() * 2);
//        System.out.println(engin);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//        bmw.getEngin().setHorsePower(bmw.getEngin().getHorsePower() * 2);
//
//        System.out.println(engin);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//        bmw.setEngin(mers.getEngin());
//        System.out.println(engin);
//        System.out.println(bmw);
//        System.out.println(mers);
//
//        mers.getEngin().setHorsePower(mers.getEngin().getHorsePower() * 2);

        bmw.startCar();

        User u = new User("String id");
        User u1 = new User(10);

        u.print(5);
    }
    }
