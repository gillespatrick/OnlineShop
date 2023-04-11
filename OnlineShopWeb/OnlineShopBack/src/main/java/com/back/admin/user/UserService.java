/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.back.admin.user;

import com.onlineshopcommon.entity.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gilles
 */

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepo;
    
    public List<User> listAllUsers(){
    return (List<User>) userRepo.findAll();
    }
    
}
