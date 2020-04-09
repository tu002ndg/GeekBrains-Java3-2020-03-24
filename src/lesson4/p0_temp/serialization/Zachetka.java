package lesson4.p0_temp.serialization;

import java.io.Serializable;

public class Zachetka implements Serializable {
    private int id;

    public int getId() {
        return id;
    }

    public Zachetka(int id) {
        this.id = id;
    }
}
