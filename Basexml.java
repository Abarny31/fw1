package org.myself;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class Basexml  {
public static void main(String a[]) throws JAXBException{
  JAXBContext context=JAXBContext.newInstance(Data.class);
  Unmarshaller um = context.createUnmarshaller();
  Data d=(Data)um.unmarshal(new File("C:\\Users\\admin\\eclipse-workspaceo\\org.myself\\excel\\data.xml"));
  System.out.println(d.getFname());
  System.out.println(d.getLname());
  System.out.println(d.getAddress());
  System.out.println(d.getEmail());
  System.out.println(d.getGender());
  
}
}
//package selenium.org.myself;
import org.myself.Base3;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class adactinpom extends Base3 {
	public adactinpom(WebDriver driver){
	    //WebDriver driver = getDriver("http://demo.automationtesting.in/Register.html");
		 PageFactory.initElements(driver, this);
	   }
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomtype ;
	@FindBy(id="room_nos")
	private WebElement roomno;
	@FindBy(id="adult_room")
	private WebElement adultroom;
	@FindBy(id="child_room")
	private WebElement childoom;
	@FindBy(id="first_name")
	private WebElement fn;
	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement cardno;
	@FindBy(id="cc_type")
	private WebElement ctype;
	@FindBy(id="cc_exp_month")
	private WebElement cexp;
	@FindBy(id="cc_exp_year")
	private WebElement cyear;
	@FindBy(id="cc_cvv")
	private WebElement ccvv;
	@FindBy(id="order_no")
	private WebElement ccv ;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getRoomno() {
		return roomno;
	}
	public WebElement getAdultroom() {
		return adultroom;
	}
	public WebElement getChildoom() {
		return childoom;
	}
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCtype() {
		return ctype;
	}
	public WebElement getCexp() {
		return cexp;
	}
	public WebElement getCyear() {
		return cyear;
	}
	public WebElement getCcvv() {
		return ccvv;
	}
	public WebElement getCcv() {
		return ccv;
	}
	
	
}
