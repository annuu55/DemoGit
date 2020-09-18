package DataDriven.DataDrivenNaveen;

import com.excel.lib.util.Xls_Reader;

public class ExcelTest {

	public static void main(String[] args) {

		Xls_Reader reader = new Xls_Reader("C:\\Practice\\Naveen\\DataDrivenNaveen\\Data\\SampleExcel.xlsx");
		String sheetName = "login";

		System.out.println(reader.getCellData(sheetName, "username", 3));
		String data = reader.getCellData(sheetName, "password", 3);
	
		System.out.println(data);

		int count = reader.getRowCount(sheetName);
		System.out.println("RowCount:" + count);

		System.out.println(reader.getCellRowNum(sheetName, "username", "tom1"));
		
		reader.setCellData(sheetName, "username", 7, "kunal");
		reader.setCellData(sheetName, "password", 7, "44");
		
		
		

	}

}
