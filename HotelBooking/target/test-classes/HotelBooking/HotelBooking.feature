#Author: Soumya Maruvada

@HotelBookingPage
Feature: Hotel Booking

Background:
	Given user in on hotel booking page

Scenario: check the heading of the booking page
Then check the headings of the HotelBookingPage

Scenario: Successful booking with valid data
Description: To confirm booking user need to enter valid details
When user enters valid details
Then display success message

Scenario: Prompt user to enter valid data in the first name field
When user enters invalid data in the first name field
   | anjali |
   | AnJali |
   | 96anju |
   | k*anj$ |
   | An |
   |  |
Then display appropriate message

Scenario: Prompt user to enter valid data in the last name field
When user enters invalid data in the last name field
   | maruvada |
   | MaruVada |
   | 83maruvada |
   | M@ruv@d@ |
   | Ma |
   |  |
Then display appropriate message

Scenario: Prompt user to enter valid data in the emailId field
When user enters invalid data in the emailId field
	|123254|
	|dfhdg.dfbv.hf|
	|%$@HTRH.gfg|
	|  |
Then display appropriate message

Scenario: Prompt user to enter valid data in the mobile number field
When user enters invalid data in the mobile number field
  | 789654123  |
  | 5789641023 |
  | abcd |
  | k*fu$ |
  |  |
Then display appropriate message


Scenario: Prompt user to select option when he leaves the City field empty
When user doesn't select City 
Then display appropriate message

Scenario: Prompt user to select option when he leaves the state field empty
When user doesn't select state
Then display appropriate message

Scenario: Prompt user to select option when he leaves the guest field empty
When user doesn't select number of guest
Then display appropriate message


Scenario Outline: Assign rooms for guest
  When user select <number> guest
  Then for <number> guest book <room> rooms 

  Examples:
    | number | room |
    |    1   |   1  |
		|    2   |   1  |
		|    3   |   1  |
		|    4   |   2  |
		|    5   |   2  |
		|    6   |   2  |
		|    7   |   3  |
		|    8   |   3  |
		|    9   |   3  |
		
Scenario: Prompt user to enter valid data in the card holder name field
When user enters invalid data in the card holder name field
   | anjali |
   | AnJali |
   | 96anju |
   | k*anj$ |
   | An |
   |  |
Then display appropriate message


		
 
    
