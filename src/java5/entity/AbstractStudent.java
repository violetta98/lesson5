package java5.entity;

import java.util.Random;

/**
 * Created by Hillel6 on 05.06.2017.
 */
public abstract class AbstractStudent extends Human implements Student {
    private final Random rand=new Random();
    @Override
    public void eat() {
        System.out.println("I'm not eating!");
    }
    public void drink() {
        System.out.println("I usually drink Martini! :)");
    }
    @Override
    public void attendLecture() {
        if (rand.nextBoolean())
            System.out.println("I'm attending lecture now!");
        else {
            System.out.println("I'm not attending lecture now! :)");
            drink();
        }
    }
}
