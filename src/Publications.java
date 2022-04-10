// Родительский абстректный класс
public abstract class Publications {
    public String id;
    private int weight;
    private int height;

    //метод 1 - не определен
    public abstract void number1();

    //метод 2
    public void number2() {
        weight = 200;
        height = 45;
        System.out.println("Weight our book or journal  = " + weight + "g" + "\n" + "Height our book or journal = " + height + "cm");
    }
    // getter, setter for weight
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    //getter, setter for weight
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
}