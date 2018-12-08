package HotelBooking;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinationHotelBooking {
	
	static WebDriver driver = null;
	static HotelBookingPageFactory hotelPageFact = null;
	
	@Given("^user in on hotel booking page$")
	public void user_in_on_hotel_booking_page() {
		System.setProperty("webdriver.chrome.driver", "D:\\BDD\\SpringToolSuite\\jar-files/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/BDD/App/hotelbooking.html");
		hotelPageFact = new HotelBookingPageFactory(driver);
	}

	@Then("^check the headings of the HotelBookingPage$")
	public void check_the_headings_of_the_HotelBookingPage() {
		String actualheading = driver.findElement(By.xpath("/html/body/div/h2")).getText();
		String expectedheading = "Hotel Booking Form";
		if (actualheading.equals(expectedheading)) {
			System.out.println("Heading Matched");
		} else {
			System.out.println("Heading Not Matched");
		}
	}

	@When("^user enters valid details$")
	public void user_enters_valid_details() throws InterruptedException{
	    hotelPageFact.setFirstName("Anjali");
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Maharashtra");
	    Thread.sleep(2000);
	    hotelPageFact.setGuest(5);
	    Thread.sleep(2000);
	    hotelPageFact.setCardHolderName("Anjali");
	    hotelPageFact.setCardNumber("1236548902576351");
	    hotelPageFact.setCvv("123");
	    Thread.sleep(2000);
	    hotelPageFact.setExpeMonth("7");
	    hotelPageFact.setExpeYesr("2023");
	    Thread.sleep(2000);
	    hotelPageFact.setButton();
	}

	@Then("^display success message$")
	public void display_success_message(){
	    System.out.println("Booking Confirmed");
	}

	@When("^user enters invalid data in the first name field$")
	public void user_enters_invalid_data_in_the_first_name_field(DataTable fname) throws InterruptedException {
		List<String> objList = fname.asList(String.class);
		String data = null;
		for (String dataTemp : objList) {
			data = dataTemp;
		    hotelPageFact.getFirstName().clear();
		    hotelPageFact.setFirstName(dataTemp);
		    hotelPageFact.setButton();
			if (Pattern.matches("[A-Z][a-z]{30}", data)) {
				System.out.println("Matching ");
			} else {
				String alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println("not matched " + alertMessage);
				Thread.sleep(2000);
			}
		}
	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws Throwable {
	    System.out.println("enter valid data");
	}

	@When("^user enters invalid data in the last name field$")
	public void user_enters_invalid_data_in_the_last_name_field(DataTable lname) throws InterruptedException{
		hotelPageFact.setFirstName("Anjlai");
		List<String> objList = lname.asList(String.class);
		String data = null;
		for (String dataTemp : objList) {
			data = dataTemp;
		    hotelPageFact.getLastName().clear();
		    hotelPageFact.setLastName(dataTemp);
		    hotelPageFact.setButton();
			if (Pattern.matches("[A-Z][a-z]{30}", data)) {
				System.out.println("Matching ");
			} else {
				String alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println("not matched " + alertMessage);
				Thread.sleep(2000);
			}
		}
	}

	@When("^user enters invalid data in the emailId field$")
	public void user_enters_invalid_data_in_the_emailId_field(DataTable mail) throws InterruptedException {
		 hotelPageFact.setFirstName("Anjlai");
		    hotelPageFact.setLastName("Maruvada");
		    Thread.sleep(2000);
		    
		    List<String> objList = mail.asList(String.class);
			String data = null;
			for (String dataTemp : objList) {
				data = dataTemp;
			    hotelPageFact.getEmail().clear();
			    hotelPageFact.setEmail(dataTemp);
			    hotelPageFact.setButton();
				if (Pattern.matches("[a-zA-Z][a-zA-z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z)]+)+", data)) {
					System.out.println("Matching ");
				} else {
					String alertMessage = driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					System.out.println("not matched " + alertMessage);
					Thread.sleep(2000);
				}
			}
	}

	@When("^user enters invalid data in the mobile number field$")
	public void user_enters_invalid_data_in_the_mobile_number_field(DataTable mob) throws InterruptedException {
		hotelPageFact.setFirstName("Anjlai");
		hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    
	    List<String> objList = mob.asList(String.class);
		String data = null;
		for (String dataTemp : objList) {
			data = dataTemp;
		    hotelPageFact.getMobileNo().clear();
		    hotelPageFact.setMobileNo(dataTemp);
		    hotelPageFact.setButton();
			if (Pattern.matches("^[7-9]{1}[0-9]{9}$", data)) {
				System.out.println("Matching ");
			} else {
				String alertMessage = driver.switchTo().alert().getText();
				driver.switchTo().alert().accept();
				System.out.println("not matched " + alertMessage);
				Thread.sleep(2000);
			}
		}
	}
	
	@When("^user doesn't select City$")
	public void user_doesn_t_select_City() throws InterruptedException {
		hotelPageFact.setFirstName("Anjlai");
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Select City");
	    hotelPageFact.setButton();
	}

	@When("^user doesn't select state$")
	public void user_doesn_t_select_state() throws InterruptedException {
		hotelPageFact.setFirstName("Anjlai");
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Select State");
	    hotelPageFact.setButton();
	}
	
	@When("^user doesn't select number of guest$")
	public void user_doesn_t_select_number_of_guest() throws Throwable {
		hotelPageFact.setFirstName("Anjlai");
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Maharashtra");
	    hotelPageFact.setGuest(0);
	    hotelPageFact.setButton();
	}

	
	
	@When("^user select (\\d+) guest$")
	public void user_select_guest(int guest) throws InterruptedException {
		hotelPageFact.setFirstName("Anjlai");
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Maharashtra");
	    hotelPageFact.setGuest(guest);
	    //hotelPageFact.setButton();
	}

	@Then("^for (\\d+) guest book (\\d+) rooms$")
	public void for_guest_book_rooms(int guest, int rooms)  {
		if (guest <= 3) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(1, rooms);
			//hotelPageFact.setRooms("1");
		} else if (guest <= 6) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(2, rooms);
			//hotelPageFact.setRooms("2");
		} else if (1 <= 9) {
			System.out.println("no of Rooms:" + rooms);
			assertEquals(3, rooms);
			//hotelPageFact.setRooms("3");
		}
	
	}

	@When("^user enters invalid data in the card holder name field$")
	public void user_enters_invalid_data_in_the_card_holder_name_field(DataTable cname) throws InterruptedException{
		 hotelPageFact.setFirstName("Anjlai");
		    hotelPageFact.setLastName("Maruvada");
		    Thread.sleep(2000);
		    hotelPageFact.setEmail("anjali@gmail.com");
		    hotelPageFact.setMobileNo("8484950224");
		    Thread.sleep(2000);
		    hotelPageFact.setAddress("Sarkanda");
		    hotelPageFact.setCity("Pune");
		    hotelPageFact.setState("Maharashtra");
		    Thread.sleep(2000);
		    hotelPageFact.setGuest(5);
		    
		    
		    List<String> objList = cname.asList(String.class);
			String data = null;
			for (String dataTemp : objList) {
				data = dataTemp;
			    hotelPageFact.getCardHolderName().clear();
			    hotelPageFact.setCardHolderName(dataTemp);
			    hotelPageFact.setButton();
				if (Pattern.matches("[A-Z][a-z]{30}", data)) {
					System.out.println("Matching ");
				} else {
					String alertMessage = driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					System.out.println("not matched " + alertMessage);
					Thread.sleep(2000);
				}
			}
	}
	
	@When("^user enters invalid data in the debit card number field$")
	public void user_enters_invalid_data_in_the_debit_card_number_field(DataTable card) throws Throwable {
		hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Maharashtra");
	    Thread.sleep(2000);
	    hotelPageFact.setGuest(5);
	    hotelPageFact.setCardHolderName("Anjali");
		  List<String> objList = card.asList(String.class);
			String data = null;
			for (String dataTemp : objList) {
				data = dataTemp;
			    hotelPageFact.getCardNumber().clear();
			    hotelPageFact.setCardNumber(dataTemp);
			    hotelPageFact.setButton();
				if (Pattern.matches("[0-9]{16}$", data)) {
					System.out.println("Matching ");
				} else {
					String alertMessage = driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					System.out.println("not matched " + alertMessage);
					Thread.sleep(2000);
				}
			}
	}
	
	@When("^user enters invalid data in the cvv field$")
	public void user_enters_invalid_data_in_the_cvv_field(DataTable cvv) throws Throwable {
	    hotelPageFact.setLastName("Maruvada");
	    Thread.sleep(2000);
	    hotelPageFact.setEmail("anjali@gmail.com");
	    hotelPageFact.setMobileNo("8484950224");
	    Thread.sleep(2000);
	    hotelPageFact.setAddress("Sarkanda");
	    hotelPageFact.setCity("Pune");
	    hotelPageFact.setState("Maharashtra");
	    Thread.sleep(2000);
	    hotelPageFact.setGuest(5);
	    hotelPageFact.setCardHolderName("Anjali");
	    hotelPageFact.setCardNumber("5236987415632014");
		  List<String> objList = cvv.asList(String.class);
			String data = null;
			for (String dataTemp : objList) {
				data = dataTemp;
			    hotelPageFact.getCvv().clear();
			    hotelPageFact.setCvv(dataTemp);
			    hotelPageFact.setButton();
				if (Pattern.matches("[0-9]{3}$", data)) {
					System.out.println("Matching ");
				} else {
					String alertMessage = driver.switchTo().alert().getText();
					driver.switchTo().alert().accept();
					System.out.println("not matched " + alertMessage);
					Thread.sleep(2000);
				}
			}
	}
	/*
	@When("^user enters invalid data in the expiration month field$")
	public void user_enters_invalid_data_in_the_expiration_month_field(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}

	@When("^user enters invalid data in the expiration year field$")
	public void user_enters_invalid_data_in_the_expiration_year_field(DataTable arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    throw new PendingException();
	}
*/

}
