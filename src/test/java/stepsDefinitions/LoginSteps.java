package stepsDefinitions;

import static utils.Utils.acessarSistema;
import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;


public class LoginSteps {

	
	@Dado("que eu acesse o sistema")
	public void queEuAcesseOSistema() {
	    acessarSistema();
	}

	@Quando("^eu informar no campo user \"([^\"]*)\"$")
	public void euInformarNoCampoUser(String nomeUsario) throws Throwable {
		LoginPage lp = new LoginPage(driver);
		lp.informarCampoUser(nomeUsario);
	}
	
	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String password) {
		LoginPage lp = new LoginPage(driver);
		lp.informarCampoPassword(password);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		LoginPage lp = new LoginPage(driver);
		lp.acionarBotaoLogin();
	}

	@Entao("o sistema apresenta o usuario logado")
	public void oSistemaApresentaOUsuarioLogado() {
	   
	}
	
	
}
