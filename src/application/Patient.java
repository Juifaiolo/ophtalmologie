package application;

import java.util.Date;

public class Patient 
{
	private int id;
	private String name;
	private String firstName;
	private Date dateOfBirth;
	private String gender;
	private String patID;
	private GeneralistDoctor doctor;
	
	//constructor
	public Patient(int id, String name, String firstName, Date dateOfBirth, String gender, String patID,
			GeneralistDoctor doctor) {
		super();
		this.id = id;
		this.name = name;
		this.firstName = firstName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.patID = patID;
		this.doctor = doctor;
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

	public Date getDateOfBirth() 
	{
		return dateOfBirth;
	}

	public String getGender() 
	{
		return gender;
	}

	public String getPatID() 
	{
		return patID;
	}

	public GeneralistDoctor getDoctor() 
	{
		return doctor;
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

	public void setDateOfBirth(Date dateOfBirth) 
	{
		this.dateOfBirth = dateOfBirth;
	}

	public void setGender(String gender) 
	{
		this.gender = gender;
	}

	public void setPatID(String patID)
	{
		this.patID = patID;
	}

	public void setDoctor(GeneralistDoctor doctor) 
	{
		this.doctor = doctor;
	}

}
