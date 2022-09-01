package com.example.BookApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.BookApp.model.Favorite;
import com.example.BookApp.service.FavoriteService;

@RestController
public class FavoriteController {
	
	@Autowired 
	private FavoriteService favoriteService;
	
	@PostMapping("/addFavorite")
	public Favorite addFavorite(@RequestBody Favorite favorite) {
		Favorite favorite1 = favoriteService.addFavorite(favorite);
		return favorite1;
	}

    @DeleteMapping("/deleteFavorite/{id}")
    public ResponseEntity<String> deleteFavorite(@PathVariable int id) {
        return favoriteService.deleteFavorite(id);
    }

    @GetMapping("/favoriteByUser/{id}")
    public ResponseEntity<List<Favorite>> getFavoriteByUser(@PathVariable int id) {
        return favoriteService.getFavoriteByUser(id);
    }
}
