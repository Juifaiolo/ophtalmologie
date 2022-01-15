package application;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

public class DatabaseTest 
{
	private Connection connection;

	public Connection getConnection() 
	{
		return connection;
	}

	public void connectToDb()
	{
		this.connection = null;
		String url = "jdbc:mariadb://192.168.1.24:3306/ophtalmologie";
		String user ="adminer";
		String mdp = "Test*1234";
		try {
			this.connection = DriverManager.getConnection(url, user, mdp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeConnection()
	{
		try {
			this.connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertPatient(String name, String firstName, Date dateOfBirth , char gender, String phone, String mail, int idGeneralist)
	{
		connectToDb();
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateOfBirth);
		String trueYear = String.valueOf(cal.get(Calendar.YEAR));
		String year = String.valueOf(cal.get(Calendar.YEAR)).substring(2);
		
		String month = "";
		if(cal.get(Calendar.MONTH) < 10)
		{
			month = "0"+String.valueOf(cal.get(Calendar.MONTH));
		}
		else
		{
			month = String.valueOf(cal.get(Calendar.MONTH));
		}
		String day="";
		if(cal.get(Calendar.DAY_OF_MONTH) < 10)
		{
			day = "0"+String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		}
		else
		{
			day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
		}


		String patId = year+month+day+ name.substring(0,2).toUpperCase()+ firstName.substring(0,2).toUpperCase()+ firstName.substring(firstName.length()-1).toUpperCase();
		connectToDb();
		try {
			CallableStatement cs = this.connection.prepareCall("call insertPatient('"+name +"','"+ firstName+"','"+trueYear+"-"+month+"-"+day+"','"+gender+"','"+patId+"','"+phone+"','"+mail+"',"+idGeneralist+")");
			cs.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		closeConnection();
	}
}
