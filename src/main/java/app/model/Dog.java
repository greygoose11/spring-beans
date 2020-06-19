package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("someDog")
public class Dog extends Animal {
    @Autowired
    private Dog animal;

//    public Dog(Dog animal) {
//        this.animal = animal;
//    }
    public Dog () {}

}
