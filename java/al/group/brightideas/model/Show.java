package java.al.group.brightideas.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "\"show\"")
public class Show {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String title;
	
	@ManyToOne
	private Network network;
	
	public Show() {}

	public Show(Long id, String title, Network network) {
		super();
		this.id = id;
		this.title = title;
		this.network = network;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Network getNetwork() {
		return network;
	}

	public void setNetwork(Network network) {
		this.network = network;
	}

	@Override
	public String toString() {
		return "Show [id=" + id + ", title=" + title + ", network=" + network + "]";
	}
	
}
