package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyHomePage extends ProjectMethods{
		
		public MyHomePage() {		
			PageFactory.initElements(driver,this);
		}	
	//Verify on clicking CRMSFA link navigated to MyHome Page
		
		@FindBy(how=How.LINK_TEXT,using="My Home")
		private WebElement eleMyHomeNavigationConfimration;
		
		public MyHomePage verifyeleCRMSFA(String data) {
			verifyPartialText(eleMyHomeNavigationConfimration, data);
				return this;	
		}
	
	//Click on My Leads page 
		@FindBy(how=How.LINK_TEXT,using="Leads")
		private WebElement eleLeads;
		
		public MyLeads clickLeads() {
			
			click(eleLeads);
			return new MyLeads();
		}
		
		

	}


