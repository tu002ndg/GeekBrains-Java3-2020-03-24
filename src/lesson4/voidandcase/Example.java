package lesson4.voidandcase;

public class Example {
    private int i;

    public Example(int i) {
        this.i = i;
    }

    public synchronized int synchronazedMethodGet(){
        System.out.println(i);
        i ++;
        return i;

        //
    }

    public  int synchronazedBlockGet(){
        System.out.println(i);
        return getSomething();
        // ....
    }

    public  int getSomething(){
        synchronized(this) {
            i++;
            return i;
        }
    }

    public static void main(String[] args) {
        Example example = new Example(1);
        example.synchronazedBlockGet();
        example.synchronazedMethodGet();
    }
}
