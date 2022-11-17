package app;

import app.config.AppConfig;
import app.model.AnimalsCage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        //здесь мы создаем контекст
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);// а в этой части "AppConfig.class" мы использ аннотации @Configuration и @ComponentScan
        for (int i = 0; i < 5; i++) {
            AnimalsCage bean =
                    applicationContext.getBean(AnimalsCage.class);
            bean.whatAnimalSay();
        }
    }

}
