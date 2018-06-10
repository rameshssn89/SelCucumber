package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{

	public MyLeads() {		
		PageFactory.initElements(driver,this);
	}
	//Verify on clicking Leads link navigated to MyLeads Page

	@FindBy(how=How.LINK_TEXT,using="My Leads")
	private WebElement eleLeadsNavigationConfimration;


	public MyLeads verifyeleLeadsNavigationConfimration(String data) {
		verifyPartialText(eleLeadsNavigationConfimration, data);
		return this;	

	}
		//Click on Create Lead page 
		@FindBy(how=How.LINK_TEXT,using="Create Lead")
		private WebElement eleClickCreateLead;

		public CreateLead clickCreateLead() {

			click(eleClickCreateLead);
			return new CreateLead();
		}

	}






