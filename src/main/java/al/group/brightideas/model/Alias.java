package main.java.al.group.brightideas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

public class Alias {
	
	@Entity
	@Table(name = "like")
	public class Like {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@ManyToOne
		private User user ;
		
		@ManyToOne
		private Idea idea;
		
		public Like() {}

		public Like(Long id, User user, Idea idea) {
				super();
				this.id = id;
				this.user = user;
				this.idea = idea;
			}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Idea getIdea() {
			return idea;
		}

		public void setIdea(Idea idea) {
			this.idea = idea;
		}

		@Override
		public String toString() {
			return "Like [id=" + id + ", user=" + user + ", idea=" + idea + "]";
		}
		
	}
}
