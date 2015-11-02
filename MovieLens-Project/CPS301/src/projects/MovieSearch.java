package projects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class MovieSearch {

	//movie - ID# key tree
	//movie - name key tree
	public static void main(String[]args) throws FileNotFoundException 
	{
		try {
			
			//Save Movie title tree pointing to array
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Caleb\\Desktop\\Movie_Lens\\movies.DAT"));
			String[] splitArray = new String[1000];
			
			BSTInterface<IdNode> idTree = new BinarySearchTree<IdNode>();
			
			BSTInterface<TitleNode> titleTree = new BinarySearchTree<TitleNode>();

			
			//parse int to stuff movie id into tree
			for (String oneLine = br.readLine(); oneLine != null; oneLine = br.readLine())
			{
				splitArray = oneLine.split("::");
			}
			
			br.close(); //close buffered reader
			
			} catch (IOException e) 
		{
			System.out.println("File wasn't found");
		}
	}
}
