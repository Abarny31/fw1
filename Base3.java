package org.myself;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Base3 {
   public static WebDriver driver;
   public static WebDriver getDriver(String url) {
	   System.setProperty("webdriver.chrome.driver", "D:\\Users\\driver\\chromedriver_win32\\chromedriver1.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get(url);
	      return driver;
}
   public static void sendvalue(WebElement element,String ip) {
	   element.sendKeys(ip);
   }
   public static void click(WebElement ele) {
	    ele.click();
   }
   public static void select(WebElement ele,String i) { 
		  new Select(ele).selectByVisibleText(i);
  }
   public static String getData(int rowNum, String colname) throws IOException {
	   List<LinkedHashMap<String, String>> mapdataList=new ArrayList<LinkedHashMap<String,String>>();
	   File f2= new File("C:\\Users\\admin\\eclipse-workspaceo\\project1\\excel\\a5.xlsx");
	   FileInputStream f= new FileInputStream(f2);
	   Workbook w=new XSSFWorkbook(f);
	   Sheet S=w.getSheet("one");
	   Row hr=S.getRow(0);
	   for (int i=0; i<S.getPhysicalNumberOfRows();i++) {
			Row cr=S.getRow(i);
			LinkedHashMap<String, String> mapdata =new LinkedHashMap<String,String>();
			for (int j=0; j<cr.getPhysicalNumberOfCells();j++) {
				Cell c = cr.getCell(j);
				int type = c.getCellType();
				if(type == 1) {
					String Col =hr.getCell(j).getStringCellValue();
					mapdata.put(Col,c.getStringCellValue());
				}
				else if (type == 0) {
					double d = c.getNumericCellValue();
					long l =(long)d;
					mapdata.put(hr.getCell(j).getStringCellValue(),String.valueOf(l));
				}
          }
			mapdataList.add(mapdata);
       }
	return  mapdataList.get(rowNum).get(colname);
	}
    public static void setdata(String s1) throws IOException {
    	 File f3= new File("C:\\Users\\admin\\eclipse-workspaceo\\project1\\excel\\a5.xlsx");
  	   FileInputStream f= new FileInputStream(f3);
  	   Workbook w=new XSSFWorkbook(f);
  	   Sheet S=w.getSheet("one");
  	   Row hr=S.getRow(0);
  	   hr.createCell(hr.getPhysicalNumberOfCells()).setCellValue("Order No");// to create column 
  	   for (int i=1; i< S.getPhysicalNumberOfRows();i++) {
  			Row cr=S.getRow(i);
  	    for (int j=0; j<=cr.getPhysicalNumberOfCells();j++) {
  			 if(j == cr.getPhysicalNumberOfCells()) {
  				cr.createCell(cr.getPhysicalNumberOfCells()).setCellValue(s1); // to enter order id
  				break;
  			}	
  	    }
    }
  	 File f1= new File("C:\\Users\\admin\\eclipse-workspaceo\\project1\\excel\\a5.xlsx");
		FileOutputStream out = new FileOutputStream(f1);
		w.write(out);
       out.close();
       System.out.println("ghdhgdhgjdy");
}}
