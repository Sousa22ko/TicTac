package model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import annotation.ColumnNameInView;


@Entity
public class FriendsList {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ColumnNameInView(index = 0, text = "id")
	private long friendLId;
	

}
