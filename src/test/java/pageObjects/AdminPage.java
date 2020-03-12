package pageObjects;

import static utils.Utils.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {

	public AdminPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement menuAdmin;
	
	@FindBy(id ="searchSystemUser_userName")
	public WebElement userName;

	// Metodos
	public void acessarMenuAdmin() {
		menuAdmin.click();
	}
	
	public void preencherUserName(String userName) {
		this.userName.sendKeys(userName);
	}

}
