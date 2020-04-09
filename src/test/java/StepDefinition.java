import io.cucumber.java.en.*;

import static org.junit.Assert.*;

import java.util.ArrayList;

import backend.container.Container;
import backend.container.Port;
import backend.database.DatabaseHandler;

import backend.objects.CompanyName;
import backend.objects.PersonName;
import backend.objects.SearchAbleObjects;
import backend.user.Client;
import backend.facade.*;

public class StepDefinition {
	
	LogisticCompanyFacade logisticCompany = new LogisticCompanyFacade();
	boolean bool;
	ArrayList<SearchAbleObjects> searchableobjectlist;
	String clientName1;
	String clientName2;
	Client client;
	ClientFacade clientFacade = new ClientFacade();
	@Given("a list of clients with attributes name: {string}, address: {string}, Contactperson name {string}, Contactperson email {string} and name: {string}, address: {string}, Contactperson name: {string}, Contactperson email: {string}")
	public void a_list_of_clients_with_attributes_name_address_Contactperson_name_Contactperson_email_and_name_address_Contactperson_name_Contactperson_email(String clientname1, String clientaddress1, String contactpersonname1, String contactpersonemail1, String clientname2, String clientaddress2, String contactpersonname2, String contactpersonemail2) {
		logisticCompany.RegisterClient(clientname1, clientaddress1, contactpersonname1, contactpersonemail1);
		logisticCompany.RegisterClient(clientname2, clientaddress2, contactpersonname2, contactpersonemail2);
	}

	@Then("Client is not registered")
	public void client_is_not_registered() {
	    assertFalse(bool);
	}
	
	@Then("Client is registered")
	public void client_is_registered() {
	    assertTrue(bool);
	}
	
	@When("registering a new client with name {string}, address {string}, contactperson with name {string}, email of contactperson {string}")
	public void registering_a_new_client_with_name_address_contactperson_with_name_email_of_contactperson(String clientname1, String clientaddress1, String contactpersonname1, String contactpersonemail1) {
		bool = logisticCompany.RegisterClient(clientname1, clientaddress1, contactpersonname1, contactpersonemail1);
	}
	
// ------------------ END RegisterClient --------------------
	

//	----------------- FindClient -----------------------
	
	boolean resultfound;
	

	@When("Finding clients that matches keyword")
	public void finding_clients_that_matches_keyword() {
		System.out.println("----------------- NEWSEARCH ------------");
//		System.out.println(DatabaseHandler.getClientlist().newQuery(searchableobjectlist));
		resultfound = DatabaseHandler.getClientList().anyMatch(searchableobjectlist);
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
		searchableobjectlist = new ArrayList<SearchAbleObjects>();
	    searchableobjectlist.add( new CompanyName(companyname));
		searchableobjectlist.add( new PersonName(personname));
	}


	
//	------------------ END FINDCLIENT -------------------
	
//	------------------ START CREATE CONTAINER-------------------

	Port myPort;
	Container myContainer;
	
	
	@Given("a list of valid ports containing {string} and {string}")
	public void a_list_of_valid_ports_containing_and(String portName, String portName2) {
		logisticCompany.CreatePort(portName);
		logisticCompany.CreatePort(portName2);
	}

	@Given("a list of existing containers containing a container in port {string} and in port {string}")
	public void a_list_of_existing_containers_containing_a_container_in_port_and_in_port(String portName, String portName2) {
		logisticCompany.CreateContainer(new Port(portName));
		logisticCompany.CreateContainer(new Port(portName2));
	}


	@Given("a port of origin {string}")
	public void a_port_of_origin(String port) {
		myPort = new Port(port);
			
	}


	@When("creating a new container")
	public void creating_a_new_container() {
		bool = logisticCompany.CreateContainer(myPort);
		
	}

	@Then("the container could not be created since the port was not a validport")
	public void the_container_could_not_be_created_since_the_port_was_not_a_validport() {
		assertFalse(bool);
		
	}
	
	@Then("a new container has been added to the existing containers")
	public void a_new_container_has_been_added_to_the_existing_containers() {
	    assertTrue(bool);
	   
	}
	
//	------------------ END CREATE CONTAINER-------------------

//	------------------ START UPDATE CLIENT INFORMATION -------
	
	@Given("a client with client name {string}, address {string} and reference person {string} and email {string}")
	public void a_client_with_client_name_address_and_reference_person_and_email(String clientName, String address, String referencePerson, String email) {
		client = new Client(clientName,address,referencePerson,email);
	}

	@Given("Client wants to update client name to {string}")
	public void client_wants_to_update_client_name_to(String clientName) {
		this.clientName1 = clientName;
	}

	@When("Change previous client information to the given information")
	public void change_previous_client_information_to_the_given_information() {
	    clientFacade.setClient(client);
	    bool = clientFacade.setClientName(clientName1);
	}

	@Then("Client has been updated")
	public void client_has_been_updated() {
	    assertTrue(bool);
	}
//	------------------ END UPDATE CLIENT INFORMATION -------

}