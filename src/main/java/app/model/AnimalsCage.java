package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component  // говрит спрингу, что это бин
public class AnimalsCage {

    @Autowired   //говорит спрингу, что сюда надо инжектнуть бин типа энимал
    @Qualifier("dog")    //определяет , что этот внедряемый энимал долж быть дог (иначе будет конфликт)
    private Animal animal;

    @Autowired
    private Timer timer;

    public Timer getTimer(){
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
