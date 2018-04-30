package gtm.formation.blog.domaine;

public class Article {


	private Integer id;
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
