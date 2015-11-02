package projects;

public class IdNode implements Comparable<IdNode>
{
	private int movieId;
	private MovieNode movieNode;
	
	//constructor
	public IdNode(int movieId, MovieNode movieNode)
	{
		this.movieId = movieId;
		this.movieNode = movieNode;	
	}
	
	public boolean equals(IdNode idNode){
	    if (this.movieNode == idNode.movieNode)
	      return true;
	    else
	      return false;
	  }
	
	public int compareTo(IdNode idNode){
	    if (this.movieId < idNode.movieId)
	      return -1;
	    else
	      if (this.movieId == idNode.movieId)
	        return 0;
	      else
	        return 1;
	  }

}
