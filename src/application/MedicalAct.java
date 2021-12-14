package application;

import java.util.Date;

public class MedicalAct 
{
	private int id;
	private Date start_date;
	private Date end_date;
	private TypeOfMedicalAct type;
	private Patient patient;
	private Surgeon surgeon;
	
	//constr
	public MedicalAct(int id, Date start_date, Date end_date, TypeOfMedicalAct type, Patient patient, Surgeon surgeon) 
	{
		this.id = id;
		this.start_date = start_date;
		this.end_date = end_date;
		this.type = type;
		this.patient = patient;
		this.surgeon = surgeon;
	}

	//getters
	public int getId()
	{
		return id;
	}

	public Date getStart_date() 
	{
		return start_date;
	}

	public Date getEnd_date()
	{
		return end_date;
	}

	public TypeOfMedicalAct getType() 
	{
		return type;
	}

	public Patient getPatient()
	{
		return patient;
	}

	public Surgeon getSurgeon() 
	{
		return surgeon;
	}

	//setters
	public void setId(int id) 
	{
		this.id = id;
	}

	public void setStart_date(Date start_date) 
	{
		this.start_date = start_date;
	}

	public void setEnd_date(Date end_date)
	{
		this.end_date = end_date;
	}

	public void setType(TypeOfMedicalAct type) 
	{
		this.type = type;
	}

	public void setPatient(Patient patient) 
	{
		this.patient = patient;
	}

	public void setSurgeon(Surgeon surgeon)
	{
		this.surgeon = surgeon;
	}

}
