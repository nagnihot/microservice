package com.dyscode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dyscode.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
