package lessons.lesson2;

import lessons.lesson1.User;

public class Main extends User {
    public static void main(String[] args) {
        //User user = new User();
        //user.id = 1;
//        TestStatic testStatic = new TestStatic();
//        testStatic.a = 4;
//        TestStatic.staticMethod();
//        TestStatic testStatic1 = new TestStatic();
//        TestStatic testStatic2 = new TestStatic();
//        testStatic1.staticA =10;
//        testStatic2.staticA =20;
//        System.out.println(testStatic1.staticA);
//        System.out.println(testStatic2.staticA);

        PerimeterAndSquareCalculation[] figures = new PerimeterAndSquareCalculation[25];
        Square square1 = new Square(5);
        figures[0] = square1;
        Triangle triangle1 = new Triangle(10, 10, 10);
        figures[1] = triangle1;
        for(PerimeterAndSquareCalculation figure : figures){
            System.out.println(figure.square());
            figure.pain();
        }
    }
}
