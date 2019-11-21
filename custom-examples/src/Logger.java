package pl.wiktor;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private Class klass;

    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public Logger(Class klass){
        this.klass = klass;
    }

    void info(String text){
        String formated = String.format("[INFO] - %s - %s: %s",LocalDateTime.now().format(formatter), this.klass.getCanonicalName(), text);
        System.out.println(formated);
    }

}