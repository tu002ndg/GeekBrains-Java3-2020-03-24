package lesson4.p0_temp.serialization;

import java.io.*;

public class SerMain {
    public static void main(String[] args) {
        Student s1out = new Student("Bob", "RTB12", 80, new Zachetka(1));
        Student s2out = new Student("Bob2", "RTB22", 75, new Zachetka(2));
        s1out.info();
        s2out.info();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stud.ser"));
            oos.writeObject(s1out);
            oos.writeObject(s2out);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("stud.ser"));
            Human s1in = (Human) ois.readObject();
            Human s2in = (Human) ois.readObject();
//            s1in.info();
//            s2in.info();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
