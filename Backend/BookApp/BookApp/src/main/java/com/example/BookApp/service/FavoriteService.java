package com.example.BookApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.BookApp.model.Favorite;
import com.example.BookApp.repository.FavoriteRepository;

@Service
public class FavoriteService {
	
	@Autowired
	private FavoriteRepository favoriteRepository;
	
	public Favorite addFavorite(Favorite favorite) {
		Favorite favorite1 = favoriteRepository.save(favorite);
		return favorite1;
	}
	
	public ResponseEntity<String> deleteFavorite(int id){
		Optional<Favorite> favorite1 = favoriteRepository.findById(id);
		if(favorite1.isPresent()) {
			favoriteRepository.deleteById(id);
		}
		return new ResponseEntity<>("Your favorite item has been deleted", HttpStatus.OK);
	}
	
	public ResponseEntity<List<Favorite>> getFavoriteByUser(int id) {
        List<Favorite> favorites = favoriteRepository.findByUserId(id);
        return new ResponseEntity<List<Favorite>>(favorites, HttpStatus.OK);
    }
}
