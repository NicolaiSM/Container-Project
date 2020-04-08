import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import java.util.ArrayList;


import backend.database.DatabaseHandler;

import backend.objects.CompanyName;
import backend.objects.PersonName;
import backend.objects.StringSearchAbleObjects;
import backend.user.Client;

public class StepDefinition {
	
	
//	---------------- RegisterClient -------------------
	
	
	Client newClient;
	ArrayList<StringSearchAbleObjects> searchableobjectlist;
	
	@Given("a new client name {string}, address {string}, contactperson with name {string}, email of contactperson {string}")
	public void a_new_client_name_address_contactperson_with_name_email_of_contactperson(String clientname, String clientaddress, String contactpersonname, String contactpersonemail) {
	    this.newClient = new Client(clientname, clientaddress, contactpersonname, contactpersonemail);
	}

	@Given("a list of clients with attributes name: {string}, address: {string}, Contactperson name {string}, Contactperson email {string} and name: {string}, address: {string}, Contactperson name: {string}, Contactperson email: {string}")
	public void a_list_of_clients_with_attributes_name_address_Contactperson_name_Contactperson_email_and_name_address_Contactperson_name_Contactperson_email(String name1, String address1, String contactpersonname1, String contactpersonemail1, String name2, String address2, String contactpersonname2, String contactpersonemail2) {
		Client newclient2 = new Client(name1, address1, contactpersonname1, contactpersonemail1);
		Client newclient3 = new Client(name2, address2, contactpersonname2, contactpersonemail2);
		
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newclient2.getCompanyName());
		searchableobjectlist.add(newclient3.getCompanyName());
		
		DatabaseHandler.getClientlist().AddUniqueElement(newclient2, searchableobjectlist);
		DatabaseHandler.getClientlist().AddUniqueElement(newclient3, searchableobjectlist);
	}

	@Given("new client name dosent exist")
	public void new_client_name_dosent_exist() {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newClient.getCompanyName());
		assertFalse(DatabaseHandler.getClientlist().anyMatch(searchableobjectlist));
	}

	@When("registering a new client")
	public void registering_a_new_client() {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newClient.getCompanyName());
		DatabaseHandler.getClientlist().AddUniqueElement(newClient, searchableobjectlist);
	}

	@Then("Client is registered")
	public void client_is_registered() {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newClient.get());
		assertTrue(DatabaseHandler.getClientlist().anyMatch(searchableobjectlist));
	}

	@Given("new client name do exist")
	public void new_client_name_do_exist() {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newClient.getCompanyName());
		assertTrue(DatabaseHandler.getClientlist().anyMatch(searchableobjectlist));
	}

	@Then("Client is not registered")
	public void client_is_not_registered() {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
		searchableobjectlist.add(newClient.get());
		assertFalse(DatabaseHandler.getClientlist().anyMatch(searchableobjectlist));
	}
	
	
// ------------------ END RegisterClient --------------------
	

//	----------------- FindClient -----------------------
	
	boolean resultfound;
	

	@When("Finding clients that matches keyword")
	public void finding_clients_that_matches_keyword() {
		System.out.println("----------------- NEWSEARCH ------------");
//		System.out.println(DatabaseHandler.getClientlist().newQuery(searchableobjectlist));
		resultfound = DatabaseHandler.getClientlist().anyMatch(searchableobjectlist);
	}

	@Then("Check if any client is found")
	public void check_if_any_client_is_found() {
//		System.out.println(resultfound);
	    assertTrue(resultfound);
	}


	@Then("Check that no result is found")
	public void check_that_no_result_is_found() {
//		System.out.println(resultfound);
	    assertFalse(resultfound);
	}

	@Given("a name for a client {string} and a contactperson name {string}")
	public void a_name_for_a_client_and_a_contactperson_name(String companyname, String personname) {
		searchableobjectlist = new ArrayList<StringSearchAbleObjects>();
	    searchableobjectlist.add(new CompanyName(companyname));
		searchableobjectlist.add(new PersonName(personname));
	}


	
//	------------------ END FINDCLIENT -------------------
	
	
}