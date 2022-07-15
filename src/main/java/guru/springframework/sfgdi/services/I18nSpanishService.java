package guru.springframework.sfgdi.services;

/**
 * Created by jt on 12/27/19.
 */
public class I18nSpanishService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
