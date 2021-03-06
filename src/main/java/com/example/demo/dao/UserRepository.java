package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by liumin5 on 2017/10/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {

    public List<User> findByName(String name);

//    public User findByPassword(String password);

    public List<User> findByNameAndPassword(String name, String password);

    @Query("select u from User u where u.name=:name")
    public List<User> findUser(@Param("name") String name);
}
