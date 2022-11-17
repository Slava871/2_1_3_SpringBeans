package app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration /*это новый способ настройки
                Spring с использованием аннотаций вместо XML-файлов (это называется конфигурацией Java)*/
@ComponentScan(basePackages = "app") // сообщаем спрингу, что в пакете "app"
                                    // есть аннотированные классы, которые должны управляться Spring-ом

public class AppConfig {
}
