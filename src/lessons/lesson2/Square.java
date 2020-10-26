package lessons.lesson2;

public class Square extends PerimeterAndSquareCalculation implements FigurePainting {

    private int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public int perimeter(){
        return  a * 4;
    }

    @Override
    public int square(){
        return a * a;
    }

    @Override
    public void pain() {
        System.out.println("I'm red square");
    }
}
