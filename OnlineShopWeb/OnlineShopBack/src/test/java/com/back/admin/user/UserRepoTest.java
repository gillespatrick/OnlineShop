package com.back.admin.user;

import com.onlineshopcommon.entity.Role;
import com.onlineshopcommon.entity.User;
import java.util.ArrayList;
import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

/**
 *
 * @author gilles
 */
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepoTest {/*

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private TestEntityManager em;

    @Test
    public void testCreateUser() {
        Role roleAdmin = em.find(Role.class, 1);
        User user = new User("gilles@gmail.com", "gillespatr9ck", "Gilles Patrick", "Ngondo");
        user.addRole(roleAdmin);
        User saveUser = userRepo.save(user);
        assertThat(saveUser.getId()).isGreaterThan(0);
    }

    @Test
    public void testRestUser() {

        User user = new User("yvan@gmail", "dipanda", "Coolio", "Dipanda");
        Role roleEdit = new Role(2);
        Role roleAssist = new Role(5);

        user.addRole(roleEdit);
        user.addRole(roleAssist);
        User savedUser = userRepo.save(user);
        assertThat(savedUser.getId()).isGreaterThan(0);
    }
    
 
 
    @Test
    public void testLisstAllUsers(){
    
            Iterable<User> listUsers = userRepo.findAll(); 
            listUsers.forEach(user -> System.err.println(user));
           
    }
    
    
    @Test
    public void testGetUserById(){
    
     User userId = userRepo.findById(2).get();
        System.out.println(userId);
        assertThat(userId).isNotNull();
    }
    
    
       @Test
    public void testUpdateUserById(){
    
     User userId = userRepo.findById(2).get();
     userId.setEnabled(true);
     userId.setEmail("Dipanda2021@yahoo.fr");
     userRepo.save(userId);
        System.out.println(userId);
        assertThat(userId).isNotNull();
    }
    
    @Test
    public void testUpdateUserRole(){
        User userId = userRepo.findById(3).get();
        Role roleship = new Role(4);
        Role rolesale = new Role(5);
        userId.getRoles().remove(roleship);
        userId.getRoles().remove(rolesale);
        
        userRepo.save(userId);
        
    
    }
    
    
    
    @Test
    public void testDeleteUserById(){
        
            Integer userId = 3;
            userRepo.deleteById(userId);
    }
    
    
    */
    
}
