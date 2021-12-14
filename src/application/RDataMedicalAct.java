package application;

public class RDataMedicalAct 
{
	private float valueFloat;
	private String valueString;
	private MedicalAct medicalAct;
	private Data data;
	
	//constr
	public RDataMedicalAct(float valueFloat, String valueString, MedicalAct medicalAct, Data data) 
	{
		this.valueFloat = valueFloat;
		this.valueString = valueString;
		this.medicalAct = medicalAct;
		this.data = data;
	}

	//getters
	public float getValueFloat() 
	{
		return valueFloat;
	}

	public String getValueString() 
	{
		return valueString;
	}

	public MedicalAct getMedicalAct() 
	{
		return medicalAct;
	}

	public Data getData() 
	{
		return data;
	}

	//setters
	public void setValueFloat(float valueFloat) 
	{
		this.valueFloat = valueFloat;
	}

	public void setValueString(String valueString) 
	{
		this.valueString = valueString;
	}

	public void setMedicalAct(MedicalAct medicalAct) 
	{
		this.medicalAct = medicalAct;
	}

	public void setData(Data data) 
	{
		this.data = data;
	}
	
}
