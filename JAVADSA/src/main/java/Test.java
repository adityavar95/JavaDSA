import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

/**
 *
 * @author khaled
 */
public class Test {

	public static class column {

		private String name;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
		}

		public double getSecond() {
			return second;
		}

		public void setSecond(double second) {
			this.second = second;
		}

		private Date date;
		private double second;

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, InvalidFormatException {

		ArrayList<column> list = new ArrayList<column>();
		File file = new File("C:\\\\Users\\\\Adity\\\\Desktop\\\\Login Logout Report (2).xlsx");
		Workbook workbook = WorkbookFactory.create(new FileInputStream(file));
		Sheet sheet = workbook.getSheetAt(0);
		int column_index_1 = 2;
		int column_index_2 = 4;
		int column_index_3 = 7;
		Row row = sheet.getRow(0);
		for (Cell cell : row) {
			// Column header names.
			switch (cell.getStringCellValue()) {
			case "MyFirst Column":
				column_index_1 = cell.getColumnIndex();
				break;
			case "3rd Column":
				column_index_2 = cell.getColumnIndex();
				break;
			case "forth Column":
				column_index_3 = cell.getColumnIndex();
				break;
			}
		}

		for (Row r : sheet) {
			if (r.getRowNum() == 0)
				continue;// hearders
			Cell c_1 = r.getCell(column_index_1);
			Cell c_2 = r.getCell(column_index_2);
			Cell c_3 = r.getCell(column_index_3);
			if (c_1 != null && c_1.getCellType() != Cell.CELL_TYPE_BLANK && c_2 != null
					&& c_2.getCellType() != Cell.CELL_TYPE_BLANK && c_3 != null
					&& c_3.getCellType() != Cell.CELL_TYPE_BLANK) {

				if (c_1.getStringCellValue().equals("Aditya Vardhan")) {
//            System.out.print("  "+c_1 + "   " + c_2+"   "+c_3+"\n");

					double seconds = Double.parseDouble(c_3.toString());
//            list.add(c_1.getStringCellValue(),c_2.getDateCellValue(),seconds);

					column column = new column();
					column.setName(c_1.getStringCellValue());
					column.setDate(c_2.getDateCellValue());
					column.setSecond(seconds);
					list.add(column);
				}
			}
		}
		HashMap<String, Double> map = new HashMap<>();
		double total_seconds = 0.0;
		for (int i = 0; i < list.size(); i++) {

//			Date date = new Date();
//			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
//			String strDate = formatter.format(list.get(i).getDate());
			System.out.println(list.get(i).getName() + " "+list.get(i).getDate()+" "+list.get(i).getSecond());

			for (int j = 0; j < list.size(); j++) {

				if (list.get(i).getDate().equals(list.get(j).getDate())) {

					total_seconds += list.get(j).getSecond();

					System.out.println("i= " + i + " j= " + j + "   " + total_seconds);

//					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
//					String Date = formatter.format(list.get(i).getDate());
//					System.out.println(Date+" "+i+" "+j+"  "+total_seconds);
//					map.put(Date, total_seconds);
				}

			}

		}

		if (!map.isEmpty()) {
			Iterator it = map.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry obj = (Entry) it.next();
//	            System.out.println(obj.getKey()+"  "+obj.getValue());
			}
		}

//		System.out.println(Arrays.asList(map));
	}

}

//import java.io.File;
//import java.io.FileInputStream;
//
//import org.apache.tika.metadata.Metadata;
//import org.apache.tika.parser.ParseContext;
//import org.apache.tika.parser.microsoft.ooxml.OOXMLParser;
//import org.apache.tika.sax.BodyContentHandler;
//
//public class test {
//   public static void main(String args[]) throws Exception {
//
//      //detecting the file type
//	   BodyContentHandler handler = new BodyContentHandler(-1);
//      
//      Metadata metadata = new Metadata();
//      FileInputStream inputstream = new FileInputStream(new File(
//         "C:\\Users\\Adity\\Desktop\\Login Logout Report (2).xlsx"));
//      
//      ParseContext pcontext = new ParseContext();
//
//      //OOXml parser
//      OOXMLParser  msofficeparser = new OOXMLParser ();
//      
//      msofficeparser.parse(inputstream, handler, metadata,pcontext);
//      System.out.println("Contents of the document:" + handler.toString());
//      System.out.println("Metadata of the document:");
//      String[] metadataNames = metadata.names();
//
//      for(String name : metadataNames) {
//         System.out.println(name + ": " + metadata.get(name));
//      }
//   }
//}