import io.cucumber.java.en.*;
import user.Client;

import static org.junit.Assert.*;

import database.ClientDatabase;
import database.DatabaseHandler;
import database.SearchDatabase;

public class StepDefinition {
	
	Client newClient;
	
	@Given("a new client name {string}, address {string}, contactperson with name {string}, email of contactperson {string}")
	public void a_new_client_name_address_contactperson_with_name_email_of_contactperson(String clientname, String clientaddress, String contactpersonname, String contactpersonemail) {
	    this.newClient = new Client(clientname, clientaddress, contactpersonname, contactpersonemail);
	}

	@Given("a list of clients with attributes name: {string}, address: {string}, Contactperson name {string}, Contactperson email {string} and name: {string}, address: {string}, Contactperson name: {string}, Contactperson email: {string}")
	public void a_list_of_clients_with_attributes_name_address_Contactperson_name_Contactperson_email_and_name_address_Contactperson_name_Contactperson_email(String name1, String address1, String Contactpersonname1, String Contactpersonemail1, String name2, String address2, String Contactpersonname2, String Contactpersonemail2) {
	    DatabaseHandler.AddToDatabase(new Client(name1, address1, Contactpersonname1, Contactpersonemail1));
	    DatabaseHandler.AddToDatabase(new Client(name2, address2, Contactpersonname2, Contactpersonemail2));
	}

	@Given("new client name dosent exist")
	public void new_client_name_dosent_exist() {
		assertFalse(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).anyMatch());
	}

	@When("registering a new client")
	public void registering_a_new_client() {
	    DatabaseHandler.AddToDatabase(newClient);
	}

	@Then("Client is registered")
	public void client_is_registered() {
		assertTrue(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient).anyMatch());
	}

	@Given("new client name do exist")
	public void new_client_name_do_exist() {
		assertFalse(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient.getCompanyName()).anyMatch());
	}

	@Then("Client is not registered")
	public void client_is_not_registered() {
		assertTrue(SearchDatabase.newSearch().Search(ClientDatabase.getInstance(), newClient).oneMatch());
	}
	
}