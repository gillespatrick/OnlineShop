package com.back.admin.user;

import com.onlineshopcommon.entity.Role;
import com.onlineshopcommon.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author gilles
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // Users List
    @GetMapping("/users")
    public String listUserAll(Model model) {
        List<User> listUsers = userService.listAllUsers();
        model.addAttribute("listUsers", listUsers);
        return "users";
    }

    // New User
    @GetMapping("/users/new")
    public String newUser(Model model) {
        List<Role> listRoles = userService.listRoles();
        User user = new User();
        model.addAttribute("user", user);
        model.addAttribute("listRoles", listRoles);
        return "newUser";
    }

    // 
    @PostMapping("/users/save")
    public String saveUser(User user) {
        System.out.println(user);
        return "redirect:/users";
    }

}
