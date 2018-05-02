package gtm.formation.blog.domaine;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="article")
public class Article {
	
	/**
	 * Les proprietés Java sont automatiquement detectées et liées à une colonne
	 * SQL sauf si le contraire est indiqué (mot-clé java 'transient').
	 *
	 */	
	@Id
	@Column(name= "idArticle")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	@Basic
	@Column
	private String title;
	
	private String description;
	
	
	// Constructeurs		
	public Article() {
		super();
	}


	public Article(Integer id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	

	public Article(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}


	// Getters/Setters
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
}
