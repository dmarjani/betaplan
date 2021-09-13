package main.java.al.group.brightideas.model;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "idea")
public class Idea {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String message;
	
	@ManyToOne
	private User user;
	
	public Idea() {}

	public Idea(Long id, String name, User user) {
		super();
		this.id = id;
		this.message = message;
		this.user=user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public String getMessage() {
			return message;
		}
	
		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public String toString() {
			return "Idea [id=" + id + ", message=" + message + ", user=" + user + "]";
		}
	

	
	

}
