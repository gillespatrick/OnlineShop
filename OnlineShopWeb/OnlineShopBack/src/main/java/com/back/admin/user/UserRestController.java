package com.back.admin.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gilles
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService service;

    @PostMapping("/users/checkEmail")
    public String checkDuplicateEmail(@Param("email") String email) {
        
        return service.isUniqueEmail(email) ? "OK" : "Duplicated";
    }
}
