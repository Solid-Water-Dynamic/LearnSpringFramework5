package net.azurewebsites.solidwater.springpetclinic.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"CN", "default"})
@Service("i18nService")
public class I18nChineseGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "您好";
    }
}
