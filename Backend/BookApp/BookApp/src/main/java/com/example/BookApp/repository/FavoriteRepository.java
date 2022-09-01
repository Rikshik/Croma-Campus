package com.example.BookApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BookApp.model.Favorite;

public interface FavoriteRepository extends JpaRepository<Favorite, Integer>{

	List<Favorite> findByUserId(int id);

}
