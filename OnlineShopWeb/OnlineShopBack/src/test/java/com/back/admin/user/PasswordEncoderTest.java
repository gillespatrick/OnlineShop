
package com.back.admin.user;

import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 *
 * @author gilles
 */
public class PasswordEncoderTest {
    @Test
    public void testEncoderPassword(){
    
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String rawPassword = "nam2020";
       String pass = passwordEncoder.encode(rawPassword);
        System.out.println(pass);
    }
    
}
