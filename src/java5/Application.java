package java5;

import java5.entity.MaleStudent;
import java5.entity.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hillel6 on 05.06.2017.
 */
public class Application implements Runnable {
    private String name;
    public Application(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        List<Student> students = new ArrayList<>();
        for (int i=0; i<10; i++)
            students.add(new MaleStudent());
        for (int i=0; i<2; i++)

    }
}
