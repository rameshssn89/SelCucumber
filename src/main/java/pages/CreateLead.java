package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLead extends ProjectMethods{

	public CreateLead() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;

	public CreateLead eleFirstName(String data) {
		type(eleFirstName, data);
		return this;
	}


	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;


	public CreateLead eleLastName(String data) {
		type(eleLastName, data);
		return this;
	}

	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;


	public CreateLead eleCompanyName(String data) {
		type(eleCompanyName, data);
		return this;
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	
	private WebElement eleClickCreateLead;

	public ViewLead eleClickCreateLead() {
		click(eleClickCreateLead);
		return new ViewLead();		
	}
}
