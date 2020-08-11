package app.model;

import app.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component ("timer")


public class Timer {
//    @Autowired
//    public ApplicationContext applicationContext;
//    AnimalsCage bean =
//            applicationContext.getBean(AnimalsCage.class);
//    bean.getBean("animalsCage",AnimalsCage.class).whatAnimalSay();
    private Long nanoTime = System.nanoTime();

    public  Long getTime() {
        return nanoTime;
    }
}





