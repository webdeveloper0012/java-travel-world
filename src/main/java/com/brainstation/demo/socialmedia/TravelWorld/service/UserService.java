package com.brainstation.demo.socialmedia.TravelWorld.service;

import com.brainstation.demo.socialmedia.TravelWorld.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService extends UserDetailsService {

    List<User> findAllUser();

    User findByUserName(String userName);

}
