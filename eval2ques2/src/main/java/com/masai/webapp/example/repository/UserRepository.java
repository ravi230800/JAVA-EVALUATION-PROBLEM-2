package com.masai.webapp.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.webapp.example.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	public List<User> findById(int id);
}
