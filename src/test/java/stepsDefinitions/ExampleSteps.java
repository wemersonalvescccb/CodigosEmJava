package stepsDefinitions;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.it.Quando;
import io.cucumber.java.pt.Entao;
import pageObjects.ExamplePage;
import static utils.Utils.acessarSistema;

public class ExampleSteps {
	
	ExamplePage cd = new ExamplePage();

	@Dado("que acesse o sistema")

	public void queAcesseOSistema() {
		acessarSistema();
	}

	@Quando("clicar no botao Login")
	public void clicarNoBotaoLogin() {
		cd.clicarbotaoLogin();
	}

	@Quando("informar no campo email {string}")
	public void informarNoCampoEmail(String string) {
		cd.campoEmail(string);
	}

	@Quando("clicar no botao criar conta")
	public void clicarNoBotaoCriarConta() {
		cd.botaoConta();
	}

	@Entao("^o sistema apresenta usuario logado$")
	public void oSistemaApresentaUsuarioLogado() throws Throwable {
		cd.validarCriação();
	}
	
	@Quando("clicar no botao senhor")
	public void clicarNoBotaoSenhor() {
		cd.clicarNoCampoSr();
	}

	@Quando("informar no campo nome {string}")
	public void informarNoCampoNome(String string) {
	    cd.adicionarCampoNome(string);
	}

	@Quando("informar no campo sobrenome {string}")
	public void informarNoCampoSobrenome(String string) {
	    cd.adicioanarSobrenome(string);
	}

	@Quando("informar no campo senha {string}")
	public void informarNoCampoSenha(String string) {
	    cd.adicionarSenha(string);
	}

	@Quando("clicar no campo data dia")
	public void clicarNoCampoDataDia() {
	    cd.adicionarDia();
	}

	@Quando("selecionar um dia")
	public void selecionarUmDia() {
	    cd.adicionarMes();
	}

	@Quando("clicar no campo data Mes")
	public void clicarNoCampoDataMes() {
	    cd.adicionarAno();
	}

	@Quando("selecionar um mes")
	public void selecionarUmMes() {
	    
	}

	@Quando("clicar no campo data ano")
	public void clicarNoCampoDataAno() {
	    
	}

	@Quando("selecionar o ano")
	public void selecionarOAno() {
	    
	}
	
	@Quando("informar no campo endereco {string}")
	public void informarNoCampoEndereco(String string) {
	    cd.adicionarEndereco(string);
	}

	@Quando("informar no campo segundo endereco {string}")
	public void informarNoCampoSegundoEndereco(String string) {
	    cd.adicionarSubEndereco(string);
	}

	@Quando("informar no campo conpanhia {string}")
	public void informarNoCampoConpanhia(String string) {
	    
	}

	@Quando("informar no campo endereco de email {string}")
	public void informarNoCampoEnderecoDeEmail(String string) {
	    cd.campoEmail(string);
	}

	@Quando("informar no campo cidade {string}")
	public void informarNoCampoCidade(String string) {
	    cd.adicionarCidade(string);
	}

	@Quando("clicar no campo estado")
	public void clicarNoCampoEstado() {
	    cd.selecionarEstado();
	}

	@Quando("informar o estado desejado")
	public void informarOEstadoDesejado() {
	    cd.selecionarEstado();
	}

	@Quando("informar no campo telefone {string}")
	public void informarNoCampoTelefone(String string) {
	    cd.adicionarCelular(string);
	}


	@Quando("clicar no botao registrar")
	public void clicarNoBotaoRegistrar() {
	    cd.botaoSalvar();
	}

	@E("^informar no campo endereço altenativo \"([^\"]*)\"$")
	public void informarNoCampoEndereçoAltenativo(String arg1) throws Throwable {
		cd.adicionarEndFuturo(arg1);
	}

	
}
