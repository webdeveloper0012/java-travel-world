package com.brainstation.demo.socialmedia.TravelWorld.service;

import com.brainstation.demo.socialmedia.TravelWorld.model.User;
import com.brainstation.demo.socialmedia.TravelWorld.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final User user = userRepository.findByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("User name: " + userName + " not found.");
        }
        final String roleName = user.getRole().name();
        GrantedAuthority authority = new SimpleGrantedAuthority(roleName);
        UserDetails userDetails = new org.springframework.security.core.userdetails.User(user.getUserName(),
                user.getPassword(), Arrays.asList(authority));
        return userDetails;
    }
}
