package lessons.lesson3;

public class Engin {
    private double volume;
    private int horsePower;

    public Engin(double volume, int horsePower) {
        this.volume = volume;
        this.horsePower = horsePower;
    }

    public double getVolume() {
        return volume;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "volume=" + volume +
                ", horsePower=" + horsePower +
                '}';
    }

    public void startEngine(){
        System.out.println("Start engine");
    }
}
