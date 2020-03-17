package pageObjects;

import static org.junit.Assert.assertEquals;
import static utils.Utils.driver;

import java.awt.image.CropImageFilter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExamplePage {
	
	public ExamplePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Elementos
	
	@FindBy(linkText = "Sign in")
	public WebElement botaoLogin;
	
	@FindBy(id = "email_create")
	public WebElement campoEmail;
	
	@FindBy(id = "SubmitCreate")
	public WebElement botaoCriarConta;
	
	@FindBy(id = "email")
	public WebElement validar;
	
	@FindBy(id = "id_gender")
	public WebElement nomeSenhor;
	
	@FindBy(id = "customer_firstname")
	public WebElement campoNome;
	
	@FindBy(id = "customer_lastname")
	public WebElement campoSobrenome;
	
	@FindBy(id = "passwd")
	public WebElement campoSenha;
	
	@FindBy(id = "\"//input[id = 'days'][value=1]\"")
	public WebElement cliqueDia;
	
	@FindBy(id = "months")
	public WebElement cliqueMes;
	
	@FindBy(id = "years")
	public WebElement cliqueAno;
	
	@FindBy(id = "firstname")
	public WebElement campoEndereco;
	
	@FindBy(id = "lastname")
	public WebElement subEndereco;
	
	@FindBy(id = "company")
	public WebElement empresa;
	
	@FindBy(id = "address1")
	public WebElement cidade;
	
	@FindBy(id = "id_state")
	public WebElement estado;
	
	@FindBy(id = "postcode")
	public WebElement codigoPostal;
	
	@FindBy(id = "id_country")
	public WebElement pais;
	
	@FindBy(id = "phone_mobile")
	public WebElement celular;
	
	@FindBy(id = "alias")
	public WebElement endeFuturo;
	
	@FindBy(id = "submitAccount")
	public WebElement botaoSalvar;
	

	//Metodos
	
	public void clicarbotaoLogin() {
		botaoLogin.click();
	}
	
	public void campoEmail(String email) {
		campoEmail.sendKeys(email);
	}
	
	public void botaoConta() {
		botaoCriarConta.click();
	}
	
	public void clicarNoCampoSr() {
		nomeSenhor.click();
	}
	
	public void adicionarCampoNome(String nome) {
		campoNome.sendKeys(nome);
	}
	
	public void adicioanarSobrenome(String sobrenome) {
		campoSobrenome.sendKeys(sobrenome);
	}
	
	public void adicionarSenha(String senha) {
		campoSenha.sendKeys(senha);
	}
	
	public void adicionarDia() {
		cliqueDia.click();
	}
	
	public void adicionarMes() {
		cliqueMes.click();
	}
	
	public void adicionarAno() {
		cliqueAno.click();
	}
	
	public void adicionarEndereco(String endereco) {
		campoEndereco.sendKeys(endereco);
	}
	
	public void adicionarSubEndereco(String subEndereco1) {
		subEndereco.sendKeys(subEndereco1);
	}
	
	public void adicionarCidade(String cidade1) {
		cidade.sendKeys(cidade1);
	}
	
	public void adicionarCaixaPostal(String cidade1) {
		codigoPostal.sendKeys(cidade1);
	}
	
	public void selecionarEstado() {
		estado.click();
	}
	
	public void adicionarPais() {
		pais.click();
	}
	
	public void adicionarCelular(String celular1) {
		celular.sendKeys(celular1);
	}
	
	public void adicionarEndFuturo(String futuro1) {
		endeFuturo.sendKeys(futuro1);
	}
	
	public void botaoSalvar() {
		botaoSalvar.click();
	}
	
	
	public void validarCriação() {
	}
	
}
