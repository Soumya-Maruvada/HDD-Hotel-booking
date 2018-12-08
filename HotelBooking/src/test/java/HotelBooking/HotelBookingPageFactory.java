package HotelBooking;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBookingPageFactory {
	WebDriver wd;
	
	public HotelBookingPageFactory(WebDriver webdriver) {
		this.wd = webdriver;
		PageFactory.initElements(wd, this);
	}

	public HotelBookingPageFactory() {
		
	}

		@FindBy(id = "txtFirstName")
		@CacheLookup
		WebElement firstName;
		
		@FindBy(id = "txtLastName")
		@CacheLookup
		WebElement lastName;
		
		@FindBy(id = "txtEmail")
		@CacheLookup
		WebElement email;
		
		@FindBy(id = "txtPhone")
		@CacheLookup
		WebElement mobileNo;
		
		@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")
		@CacheLookup
		WebElement address;
		
		@FindBy(name = "city")
		@CacheLookup
		WebElement city;
		
		@FindBy(name = "state")
		@CacheLookup
		WebElement state;
		
		@FindBy(name = "persons")
		@CacheLookup
		int guest;
		
		@FindBy(id = "rooms")
		@CacheLookup
		WebElement rooms;
		
		@FindBy(id = "txtCardholderName")
		@CacheLookup
		WebElement cardHolderName;
		
		@FindBy(id = "txtDebit")
		@CacheLookup
		WebElement cardNumber;
		
		@FindBy(id = "txtCvv")
		@CacheLookup
		WebElement cvv;
		
		@FindBy(id = "txtMonth") 
		@CacheLookup
		WebElement expeMonth;
		
		@FindBy(id = "txtYear")
		@CacheLookup
		WebElement expeYear;
		
		@FindBy(how = How.ID, using = "btnPayment")
		@CacheLookup
		WebElement button;
		
		//setters getters
		
		public WebElement getFirstName() {
			return firstName;
		}

		public void setFirstName(String fName) {
			firstName.sendKeys(fName);
		}

		public WebElement getLastName() {
			return lastName;
		}

		public void setLastName(String lName) {
			lastName.sendKeys(lName);
		}

		public WebElement getEmail() {
			return email;
		}

		public void setEmail(String mail) {
			email.sendKeys(mail);
		}

		public WebElement getMobileNo() {
			return mobileNo;
		}

		public void setMobileNo(String mob) {
			mobileNo.sendKeys(mob);
		}

		public WebElement getAddress() {
			return address;
		}

		public void setAddress(String add) {
			address.sendKeys(add);
		}

		public WebElement getCity() {
			return city;
		}

		public void setCity(String citytemp) {
			Select select = new Select(city);
			select.selectByVisibleText(citytemp);
		}

		public WebElement getState() {
			return state;
		}

		public void setState(String statetemp) {
			Select select = new Select(state);
			select.selectByVisibleText(statetemp);
		}

		public int getGuest() {
			return guest;
		}

		public void setGuest(int guesttemp) {
			
			guest=guesttemp;
		}
		
		public WebElement getRooms() {
			return rooms;
		}

		public void setRooms(String room) {
			rooms.sendKeys(room);
		}

		public WebElement getCardHolderName() {
			return cardHolderName;
		}

		public void setCardHolderName(String cHName) {
			cardHolderName.sendKeys(cHName);
		}

		public WebElement getCardNumber() {
			return cardNumber;
		}

		public void setCardNumber(String cNumber) {
			cardNumber.sendKeys(cNumber);
		}

		public WebElement getCvv() {
			return cvv;
		}

		public void setCvv(String cvvtemp) {
			cvv.sendKeys(cvvtemp);
		}

		public WebElement getExpeMonth() {
			return expeMonth;
		}

		public void setExpeMonth(String exMonth) {
			expeMonth.sendKeys(exMonth);
		}

		public WebElement getExpeYesr() {
			return expeYear;
		}

		public void setExpeYesr(String exYear) {
			expeYear.sendKeys(exYear);
		}

		public WebElement getButton() {
			return button;
		}

		public void setButton() {
			button.click();
		}
		
		
	}
