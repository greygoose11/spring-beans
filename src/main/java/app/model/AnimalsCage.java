package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animal;
    @Autowired
    private Timer timer;


//    public Timer getTimer() {
//        return Timer timer;
//    }

    @Autowired
    public AnimalsCage (@Qualifier("someDog") Animal animal, /*@Qualifier("timer")*/ Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }
    public Timer getTimer() {
        return  timer;
    }



    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(new Timer().getTime());
        System.out.println("________________________");
    }
//    Timer timeBean = applicationContext.getBean("timer", Timer.class);


}
