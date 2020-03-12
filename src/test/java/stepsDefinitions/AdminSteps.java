package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import pageObjects.AdminPage;

public class AdminSteps {
	AdminPage adminPage = new AdminPage();
	
	@Dado("que eu acesse o menu Admin")
	public void queEuAcesseOMenuAdmin() {
	    adminPage.acessarMenuAdmin();
	}
}
