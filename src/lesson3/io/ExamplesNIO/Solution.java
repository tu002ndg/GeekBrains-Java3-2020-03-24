package lesson3.io.ExamplesNIO;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List list = new ArrayList(3);//1
        list.add(new Integer(100));
        list.add(new Integer(200));
        list.add(new Integer(300));
        list.add(null);
        list.add(new Integer(400));//2

        System.out.println(list.size());//3

        int[] ints = new int[10];
        System.out.println(ints[5]);
    }

}
