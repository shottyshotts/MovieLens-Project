package projects;

public class UserType {
	private int userID;
	private char gender;
	private int ageCategory;
	private int jobCategory;
	private int zipCode;
	
	
	//constructor
	public userType(int userID, char gender, int ageCategory , int jobCategory , zipCode  )
	{
		this.userID = userID;
		this.gender = gender;
		this.ageCategory = ageCategory;
		this.jobCategory = jobCategory;
		this.zipCode = zipCode;
		
		
	}
	
	public String toString()
	{
		return "UserID: " + userID + " Gender: " + gender + " Age Category: "
				+ ageCategory + " Job Category: " + jobCategory + " Zip Code: " + zipCode; 
	}
	

}
