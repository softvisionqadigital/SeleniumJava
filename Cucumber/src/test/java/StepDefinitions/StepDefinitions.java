package StepDefinitions;




import java.util.List;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {	
		
		
		
	    @Given("^User is on Home Page$")
	    public void User_is_on_Home_Page() 
	    {
	    	
			System.out.println("Logged in succesfully");
			
	    }

	    @When("^User Navigate to LogIn Page$")
	    public void user_navigate_to_login_page() 
	    {
	    	
			System.out.println("login page");
			
			
	    }
	    @When("User enters UserName and Password as {string} and {string}")
	    public void user_enters_user_name_and_password_as_and(String string, String string2) {
	        
	    	System.out.println("user name and password"+string+string2);
	    }
	    @Then("^Message displayed Login Successfully$")
	    public void message_displayed_login_successfully() 
	    {
	    	System.out.println("logout");
	    }
	  
	    @Then("the cards are displayed {string}")
	    public void the_cards_are_displayed(String string) 
	    {
	    	
	    	if(string=="true")
	    		System.out.println("john logged in");
	    	else
	    	System.out.println("reky logged in");
	    }
	    @When("User Register to the website with the following data")
	    public void user_register_to_the_website_with_the_following_data(DataTable data) {
	        // Write code here that turns the phrase above into concrete actions
	        // For automatic transformation, change DataTable to one of
	        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	        // Double, Byte, Short, Long, BigInteger or BigDecimal.
	        //
	        // For other transformations you can register a DataTableType.
	    	
	    	List<String> Userdetails=data.asList();
	    
	    	System.out.println(Userdetails.get(0));
	    	System.out.println(Userdetails.get(1));
	    	System.out.println(Userdetails.get(2));
	    	System.out.println(Userdetails.get(3));


	       
	    }
	   
	        @When("User enters UserName as and Password as the {string} and {string}")
	        public void user_enters_user_name_as_and_password_as_the_and(String username, String password) {
	            
	        	System.out.println("username and Paswword: "+username+ "  " + password);
	        }

	        @Given("User is in the desktop")
	        public void user_is_in_the_desktop() {
	          System.out.println("desktop ");
	        }


	        @When("user opens the broswer")
	        public void user_opens_the_broswer() {
	        	System.out.println("Broswer");
	            
	        }
	        @Then("User is in the search screen")
	        public void user_is_in_the_search_screen() {
	            System.out.println("Search");
	        }

//    	System.out.println("username and Paswword: "+username+ "  " + password);
	}


