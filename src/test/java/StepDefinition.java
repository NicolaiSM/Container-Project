import io.cucumber.java.en.*;
import user.StringSearchAbleObjects;

import static org.junit.Assert.*;

import java.util.ArrayList;

import backend.database.ClientDatabase;
import backend.database.DatabaseObjectsFactory;
import backend.database.Match;
import backend.database.QueryDatabase;
import backend.objects.CompanyName;
import backend.objects.PersonName;
import backend.objects.SearchAbleObjects;
import backend.user.Client;
import backend.user.User;

public class StepDefinition {
	
	
//	---------------- RegisterClient -------------------
	
	
	Client newClient;
	
	@Given("a new client name {string}, address {string}, contactperson with name {string}, email of contactperson {string}")
	public void a_new_client_name_address_contactperson_with_name_email_of_contactperson(String clientname, String clientaddress, String contactpersonname, String contactpersonemail) {
	    this.newClient = new Client(clientname, clientaddress, contactpersonname, contactpersonemail);
	}

	@Given("a list of clients with attributes name: {string}, address: {string}, Contactperson name {string}, Contactperson email {string} and name: {string}, address: {string}, Contactperson name: {string}, Contactperson email: {string}")
	public void a_list_of_clients_with_attributes_name_address_Contactperson_name_Contactperson_email_and_name_address_Contactperson_name_Contactperson_email(String name1, String address1, String Contactpersonname1, String Contactpersonemail1, String name2, String address2, String Contactpersonname2, String Contactpersonemail2) {
	    System.out.println());
	}

	@Given("new client name dosent exist")
	public void new_client_name_dosent_exist() {
		assertFalse(QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).anyMatch());
	}

	@When("registering a new client")
	public void registering_a_new_client() {
	    DatabaseObjectsFactory.AddToDatabase(newClient);
	}

	@Then("Client is registered")
	public void client_is_registered() {
		assertTrue(QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient).anyMatch());
	}

	@Given("new client name do exist")
	public void new_client_name_do_exist() {
		System.out.println(QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).getResult());
		assertTrue(QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).anyMatch());
	}

	@Then("Client is not registered")
	public void client_is_not_registered() {
		assertTrue(QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient).oneMatch());
	}
	
	
// ------------------ END RegisterClient --------------------
	

//	----------------- FindClient -----------------------
	
	
	PersonName searchpersonname;
	CompanyName searchcompanyname;
	Match searchresult;
	ArrayList<StringSearchAbleObjects> searchkriterialist = new ArrayList<StringSearchAbleObjects>();
	
	@Given("a given a name for a client {string}")
	public void a_given_a_name_for_a_client(String companyname) {
	    this.searchcompanyname = new CompanyName(companyname);
	    searchkriterialist.add(searchcompanyname);
	    
	}

	@When("Finding clients that matches keyword")
	public void finding_clients_that_matches_keyword() {
//		System.out.println(searchkriterialist);
		searchresult = QueryDatabase.newSearch().Search(ClientDatabase.getInstance(), searchkriterialist);
	}

	@Then("Check if any result is found")
	public void check_if_any_result_is_found() {
//		System.out.println(searchresult.getResult());
	    assertTrue(searchresult.anyMatch());
	}


	@Then("Check that no result is found")
	public void check_that_no_result_is_found() {
	    assertTrue(searchresult.noMatch());
	}

	@Given("a name for a client {string} and a contactperson name {string}")
	public void a_name_for_a_client_and_a_contactperson_name(String personname, String companyname) {
		this.searchpersonname = new PersonName(personname);
		this.searchcompanyname = new CompanyName(companyname);
		searchkriterialist.add(searchpersonname);
		searchkriterialist.add(searchcompanyname);
	}


	
//	------------------ END FINDCLIENT -------------------
	
	
}