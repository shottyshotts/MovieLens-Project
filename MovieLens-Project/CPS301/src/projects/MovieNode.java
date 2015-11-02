package projects;

public class MovieNode {
	private int id;
	private String title;
	private String review;
	
	
	//constructor
	public MovieNode(int id, String title, String review  )
	{
		this.id = id;
		this.title = title;
		this.review = review;
		
	}
	public String toString()
	{
		return "ID: " + id + " Title: " + title + " Review: " + review; 
	}
	

}
