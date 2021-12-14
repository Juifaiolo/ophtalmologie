package application;

public class GeneralistDoctor 
{
	private String name;
	private String firstName;
	
	//constructors
	public GeneralistDoctor(String name, String firstName) 
	{
		super();
		this.name = name;
		this.firstName = firstName;
	}
	
	//getters
	public String getName() 
	{
		return name;
	}
	public String getFirstName() 
	{
		return firstName;
	}
	
	//setters
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	
}
