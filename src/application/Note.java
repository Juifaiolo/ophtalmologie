package application;

public class Note 
{
	private int id;
	private String content;
	private MedicalAct medicalAct;
	private Surgeon surgeon;
	
	//constr
	public Note(int id, String content, MedicalAct medicalAct, Surgeon surgeon) 
	{
		this.id = id;
		this.content = content;
		this.medicalAct = medicalAct;
		this.surgeon = surgeon;
	}

	//getters
	public int getId() 
	{
		return id;
	}

	public String getContent() 
	{
		return content;
	}

	public MedicalAct getMedicalAct() 
	{
		return medicalAct;
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

	public void setContent(String content) 
	{
		this.content = content;
	}

	public void setMedicalAct(MedicalAct medicalAct)
	{
		this.medicalAct = medicalAct;
	}

	public void setSurgeon(Surgeon surgeon)
	{
		this.surgeon = surgeon;
	}
	
}
