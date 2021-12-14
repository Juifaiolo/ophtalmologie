package application;

public class Surgeon 
{
	private int id;
	private String name;
	private String firstName;
	private String inamiNumber;
	
	//constructors
	public Surgeon(int id, String name, String firstName, String inamiNumber) 
	{
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.inamiNumber = inamiNumber;
	}
	
	//getters
	public int getId() 
	{
		return id;
	}
	public String getName() 
	{
		return name;
	}

	public String getFirstName() 
	{
		return firstName;
	}

	public String getInamiNumber() 
	{
		return inamiNumber;
	}

	//setters
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}

	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}

	public void setInamiNumber(String inamiNumber) 
	{
		this.inamiNumber = inamiNumber;
	}
}
