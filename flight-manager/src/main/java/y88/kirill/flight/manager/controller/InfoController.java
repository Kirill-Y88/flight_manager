package y88.kirill.flight.manager.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.RegexPatternTypeFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

@RestController
@RequestMapping("/api/v1/info")
public class InfoController {

    private Set<BeanDefinition> entities;
    private final ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(false);

    @GetMapping
    public Map<String, String> test(@RequestParam String className) {

        Class<?> clazz = null;

        for (BeanDefinition entity : entities) {
            if (entity.getBeanClassName().contains(className)) {
                try {
                    clazz = Class.forName(entity.getBeanClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }

        Map<String, String> parametrs = new HashMap<>();

        for (Field field : clazz.getDeclaredFields()) {
            parametrs.put(field.getType().getCanonicalName(), field.getName());
        }

        return parametrs;
    }


    @PostConstruct
    private void init() {
        provider.addIncludeFilter(new RegexPatternTypeFilter(Pattern.compile(".*")));
        entities = provider.findCandidateComponents("y88.kirill.flight.manager.entity");
    }

}
