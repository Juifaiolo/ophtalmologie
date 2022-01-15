package application;

import java.io.File;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Csv 
{
	public static List<List<String>> getListFromExcel(String _fileName)
	{
		
		List<List<String>> array = new ArrayList<List<String>>();
		List<String> values = new ArrayList<String>();
		String value = "";
        try
        {
            FileInputStream file = new FileInputStream(new File(_fileName));
 
            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);
 
            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
 
            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) 
            {
            	values.clear();
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) 
                {
                	
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    switch (cell.getCellType()) 
                    {
                        case NUMERIC:
                        	 if (DateUtil.isCellDateFormatted(cell)) 
                        	 {
                                 SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
                                 value = dateFormat.format(cell.getDateCellValue());
                                 //System.out.print(dateFormat.format(cell.getDateCellValue()) + "\t");
                             } else 
                             {
                                value = BigDecimal.valueOf(cell.getNumericCellValue()).toPlainString();
                             }
                            break;
                        case STRING:
                            value = cell.getStringCellValue();
                            break;
                        case BOOLEAN:
                        	value = String.valueOf(cell.getBooleanCellValue());
                            break;
                        case FORMULA:
                        	 value = cell.getCellFormula();
                             break;
                        case BLANK:
                        	value =" ";
                        	break;
                        case _NONE:
                        	value =" ";
                        	break;
                        case ERROR:
                        	value =" ";
                        	break;
                        	
                        default:
                        	break;
                    }      
                    values.add(value); 
                }
                array.add(List.copyOf(values));
            }
            file.close();
            workbook.close();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        
        return array;
		
	}
}
