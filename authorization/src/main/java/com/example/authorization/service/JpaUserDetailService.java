package com.example.authorization.service;

import com.example.authorization.entity.SecurityUser;
import com.example.authorization.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
         return userRepo.findByUserName(username)
                 .map(SecurityUser::new)
                 .orElseThrow(() -> new UsernameNotFoundException("Username not found "+ username));

    }
}
