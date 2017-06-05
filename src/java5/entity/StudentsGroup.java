package java5.entity;

import java.util.List;

/**
 * Created by Hillel6 on 05.06.2017.
 */
public class StudentsGroup {
    private String name;
    private List<Student> students;
    public StudentsGroup(String name, List<Student> students) {
        this.name=name;
        this.students=students;
    }

}
