package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.mapping.List;

import annotation.ColumnNameInView;


@Entity
public class League {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnNameInView(index = 0, text = "id")
	private long LeagueId;
	
	private int timeRemains;
	
	private int capacity;
	
	private List players;
	
	
}
