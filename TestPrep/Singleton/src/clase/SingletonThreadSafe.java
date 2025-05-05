package clase;

import java.util.ArrayList;
import java.util.List;

public class SingletonThreadSafe {
    private static volatile SingletonThreadSafe instance;
    private int id;
    private List<Integer> note;

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public List<Integer> getNote() {
        return note;
    }

    private void addNote(int note) {
        this.note.add(note);
    }

    private SingletonThreadSafe(int id) throws InterruptedException {
        System.out.println("SingletonThreadSafe constructor");
        Thread.sleep(1000);
        this.id = id;
        note = new ArrayList<Integer>();
    }

    public static synchronized SingletonThreadSafe getInstance() throws InterruptedException {
        if (instance == null) {
            instance = new SingletonThreadSafe(1);
        }

        return instance;
    }

    @Override
    public String toString() {
        return "SingletonThreadSafe{" +
                "id=" + id +
                ", note=" + note +
                '}';
    }
}
