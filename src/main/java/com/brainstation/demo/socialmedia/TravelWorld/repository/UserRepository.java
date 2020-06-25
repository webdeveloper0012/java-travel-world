package com.brainstation.demo.socialmedia.TravelWorld.repository;

import com.brainstation.demo.socialmedia.TravelWorld.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);
}
