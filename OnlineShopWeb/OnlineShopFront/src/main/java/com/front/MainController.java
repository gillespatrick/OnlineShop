
package com.front;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author gilles
 */

@Controller
public class MainController {
    
    @GetMapping
    public String homePage(){
        return "index";
    }
    
}
