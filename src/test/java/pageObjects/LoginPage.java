package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//ELEMENTOS
	@FindBy(id = "txtUsername")
	private WebElement campoUser;
	
	@FindBy(id = "txtPassword")
	private WebElement campoPassword;
	
	@FindBy(id = "btnLogin")
	private WebElement botaoLogin;
	
	//METODOS
	public void informarCampoUser(String nomeUsuario) {
		campoUser.sendKeys(nomeUsuario);
	}
	
	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}
	
	public void acionarBotaoLogin() {
		botaoLogin.click();
	}

}
