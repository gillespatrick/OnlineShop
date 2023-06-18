
package com.back.admin.user;

import com.onlineshopcommon.entity.Role;
import com.onlineshopcommon.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author gilles
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    @Autowired
    private RoleRepository roleRepo;
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    public List<User> listAllUsers() {
        return (List<User>) userRepo.findAll();
    }
    
    public List<Role> listRoles() {
        return (List<Role>) roleRepo.findAll();
    }
    
    void save(User user) {
        encodePassword(user);
        userRepo.save(user);
    }
    
    private void encodePassword(User user) {
        String encodePassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodePassword);
    }
    
    
    public boolean isUniqueEmail(String email){
    
        User userByEmail = userRepo.getUserByEmail(email);
        return userByEmail == null;
    }
    
}
