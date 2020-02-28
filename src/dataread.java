import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class dataread {
public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
	FileInputStream fis = new FileInputStream("./Data/sel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("Sheet1");
	Row firstRow = sh.getRow(0);
	for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
		for (int j = 0; j < firstRow.getLastCellNum(); j++) {
			Cell cl = sh.getRow(i).getCell(j);
			System.out.print(cl + "      ");
		
		}
		System.out.println( );
	}
	
	
}
}
