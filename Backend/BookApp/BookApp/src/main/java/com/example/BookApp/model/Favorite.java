package com.example.BookApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "FAVORITE_TABLE")
public class Favorite {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "FAV_ID")
	private int id;
	
	private String bookName;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID", nullable = false)
	User user;
	
	public Favorite(String bookName, User user) {
		this.bookName = bookName;
		this.user = user;
	}
}
