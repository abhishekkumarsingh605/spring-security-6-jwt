package com.springsecurity.springsecurity.service;

import com.springsecurity.springsecurity.model.UserPrinciple;
import com.springsecurity.springsecurity.model.Users;
import com.springsecurity.springsecurity.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user = userRepo.findByUsername(username);
        if (user == null){
            System.out.println("User Not Found");
            throw new UsernameNotFoundException("User not found");
        }
            return new UserPrinciple(user);
    }
}
