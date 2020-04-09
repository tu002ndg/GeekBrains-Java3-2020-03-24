package lesson4.p0_temp.serialization;

import java.io.Serializable;
import java.net.Socket;

public class Student extends Human implements Serializable {
    private String name;
    private String group;
    private int score;
    private Zachetka z;
    public transient Socket s;

    public void setName(String name) {
        this.name = name;
    }

    public Zachetka getZ() {
        return z;
    }

    public Student(String name, String group, int score, Zachetka z) {
        super(0);
        System.out.println("Invoke Student constructor");
        this.name = name;
        this.group = group;
        this.score = score;
        this.z = z;
    }

    public void info() {
        System.out.println(name + " " + group + " " + score + " " + z.getId() + " " + z.toString());
    }
}
