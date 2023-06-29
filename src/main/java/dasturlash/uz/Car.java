package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String name = "Lacetti";
    @Autowired
    @Qualifier("superEngine")
    private Engine engine;

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", name='" + name + '\'' +
                '}';
    }
}
