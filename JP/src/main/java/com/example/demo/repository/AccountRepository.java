package com.example.demo.repository;

import com.example.demo.Entity.UserDB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<UserDB,Long> {
}
