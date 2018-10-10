package com.derrick.yang.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author derrick.yang
 * @Date 10/10/18 21:50
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(ModelMap map) {
        return "index";
    }
}
