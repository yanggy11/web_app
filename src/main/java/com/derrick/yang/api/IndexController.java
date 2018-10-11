package com.derrick.yang.api;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/**
 * @author derrick.yang
 * @Date 10/10/18 21:50
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        map.put("title","thymeleaf learning");
        map.put("name","中国");
        return "index";
    }

    @Bean
    public LocaleResolver localeResolver() {
        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return sessionLocaleResolver;
    }
}
