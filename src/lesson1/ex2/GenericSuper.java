package lesson1.ex2;

//Cat cat = new Cat();

public class GenericSuper<T> {
    private T ob;

    GenericSuper(T ob) {
        this.ob = ob;
    }

    T getOb() {
        return ob;
    }
}

class GenericSub<T> extends GenericSuper<T> {
    public GenericSub(T ob) {
        super(ob);
    }
}
class HierarchyDemo {
    public static void main(String args[]) {
        GenericSuper<Integer> iOb = new GenericSuper<>(88);
        GenericSub<Integer> iOb2 = new GenericSub<>(99);
        GenericSub<String> strOb2 = new GenericSub<>("Generics Test");

        if (iOb2 instanceof GenericSub<?>) {
            System.out.println("iOb2 is instance of GenericSub");
    }
        if (iOb2 instanceof GenericSuper<?>) {
            System.out.println("iOb2 is instance of GenericSuper");
        }
        System.out.println();

        if (strOb2 instanceof GenericSub<?>) {
            System.out.println("strOb is instance of GenericSub");
        }

        if (strOb2 instanceof GenericSuper<?>) {
            System.out.println("strOb is instance of GenericSuper");
        }
        System.out.println();

        if (iOb instanceof GenericSub<?>) {
            System.out.println("iOb is instance of GenericSub");
        }

        if (iOb instanceof GenericSuper<?>) {
            System.out.println("iOb is instance of GenericSuper");
        }

    }
}
