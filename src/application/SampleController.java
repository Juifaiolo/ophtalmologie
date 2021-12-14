package application;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import org.apache.commons.compress.utils.FileNameUtils;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.FileChooser;

public class SampleController implements Initializable
{
	private List<List<String>> array ;
	public List<List<String>> getArray() 
	{
		return array;
	}

	public void setArray(List<List<String>> array) 
	{
		this.array = array;
	}
	private List<Integer> indexes = new ArrayList<Integer>();
	@FXML
	private Label labelNom;
	
	@FXML
	private Label labelPrenom;
	
	@FXML
	private Label labelDDN;
	
	@FXML
	private Label labelSexe;
	
	@FXML
	private Label labelMail;
	
	@FXML
	private Label labelTel;
	
	@FXML
	private Label labelMed;
	
	@FXML 
	private Button buttonOk;
	
	@FXML
	private TextField textRecherche;
	
	@FXML
	private ListView<String> listPat;
	@FXML
	private Button testChoose;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		// TODO Auto-generated method stub
		buttonOk.setDisable(true);
	}
	
	public void recherche()
	{
		
		listPat.getItems().clear();
		indexes.clear();
		
		String value = textRecherche.getText();
		
		for (int i = 2; i < array.size(); i++) // commence à 2 car 0 = PENTACAM et  1 = nom des colonnes
		{
			if(array.get(i).get(0).toUpperCase().contains(value.toUpperCase()) || array.get(i).get(1).toUpperCase().contains(value.toUpperCase()) )
			{
				listPat.getItems().add(array.get(i).get(0) + " "+array.get(i).get(1));
				indexes.add(i);
			}
		}
	}
	
	public void affichePatient()
	{
		try 
		{
			if(listPat.getSelectionModel().getSelectedIndex() >=0)
			{
				int selected = listPat.getSelectionModel().getSelectedIndex();
				int index = indexes.get(selected);
				labelNom.setText(array.get(index).get(0));
				labelPrenom.setText(array.get(index).get(1));
				labelDDN.setText(array.get(index).get(3));
			}
			
		} catch (IndexOutOfBoundsException e) 
		{
			e.printStackTrace();
		}
	}
	
	public void chooseFile()
	{
		try
		{
			FileChooser fc = new FileChooser();
			fc.setTitle("Veuillez sélectionner un fichier .xlxs.");
			//fc.setInitialDirectory(System.getProperty(null));
			File file = fc.showOpenDialog(null);
			
			if(file != null)
			{
				String extension= FileNameUtils.getExtension(file.getAbsolutePath());
				if(extension.equals("xlsx"))
				{
					setArray(Csv.getListFromExcel(file.getAbsolutePath()));
					buttonOk.setDisable(false);
					listPat.getItems().clear();
					textRecherche.clear();
					recherche();
				}
				else
				{
					Alert alert = new Alert(Alert.AlertType.ERROR);
					alert.setContentText("Veuillez sélectionner un fichier xslx");
					alert.show();
				}	
			}	
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public void enterPressed()
	{
		
	}
}
