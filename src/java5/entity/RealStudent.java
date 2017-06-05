package java5.entity;

/**
 * Created by Hillel6 on 05.06.2017.
 */
public class RealStudent extends Human implements Student {
    @Override
    public void attendLecture() {
        System.out.println("I usully attend lectures :(");
    }
    @Override
    public int educationMoney() {
        return 0;
    }
}
