package lesson4.p0_temp.serialization;

public class Human {
    protected int intVar;

    public Human() {
        System.out.println("Invoke default Human constructor");
        intVar = 10;
    }

    public Human(int intVar) {
        this.intVar = intVar;
    }
}
