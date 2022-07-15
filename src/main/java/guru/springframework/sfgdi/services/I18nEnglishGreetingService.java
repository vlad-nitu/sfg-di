package guru.springframework.sfgdi.services;

import guru.springframework.sfgdi.repositories.EnglishGreetingRepository;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by jt on 12/27/19.
 */
public class I18nEnglishGreetingService implements GreetingService {
    private final EnglishGreetingRepository englishGreetinRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetinRepository) {
        this.englishGreetinRepository = englishGreetinRepository;
    }

    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
