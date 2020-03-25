package lesson1.ex2;

public class Matrix<T> {
    private T[] array;

    public Matrix(T[] array) {
        this.array = array.clone();
    }

    public static void main(String[] args) {
        Matrix<Double> doubleMatrix = new Matrix<>(new Double[2]);
        Matrix<Integer> integerMatrix = new Matrix<>(new Integer[4]); // Integer является аргументом типа.
        Matrix<Byte> byteMatrix = new Matrix<>(new Byte[7]);

    }
}
