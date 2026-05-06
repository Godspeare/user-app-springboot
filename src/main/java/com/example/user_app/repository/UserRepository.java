package com.example.user_app.repository;

import com.example.user_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // This interface allows you to save and find users without writing SQL
}