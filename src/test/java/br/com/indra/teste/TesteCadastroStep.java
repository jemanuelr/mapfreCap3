package br.com.indra.teste;

import java.awt.AWTException;
import java.io.IOException;

import br.com.indra.core.DriverFactory;
import br.com.indra.page.FichadeCadastroPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TesteCadastroStep extends DriverFactory {

	/***************************** Variaveis *****************************/
	// Ambiente
	private FichadeCadastroPage page = new FichadeCadastroPage();;
	private String _ambiente = "devr2";

	// Canal de Venda
	private String _nomeCanalVendaTexto = "TRADICIONAL - III";
	private String _nomeProdutoTexto = "GARANTIA FIADOR";

	// Subscritor
	private String _nomeClienteSubscritor = "MARIA DA GLORIA";
	private String _formaPagamentoTexto = "Boleto Bancario";

	// Titulares
	private String _valorMensalidade = "10.000,00";
	private String _valorQuantidadeTitulos = "2";

	// Angariador/Corretor
	private String _nomeCliente = "saldec";
	private String _nClienteAngariador = "80031568";
	private String _nClienteCorretor = "80031567";

	// Locador
	private String _nomeClienteLocador = "LUIZ CARLOS ZANNI GAIA";

	// Imobiliaria
	private String _nomeClienteImobiliaria = "LIBORIO IMÓVEIS LTDA";

	// Situação
	private String _campoSituacao = "PE";

	/*********************************************************************/
	/****************************** Getters ******************************/
	// Ambiente
	public String get_Ambiente() {
		return _ambiente;
	}

	// Canal de Venda
	public String get_nomeCanalVendaTexto() {
		return _nomeCanalVendaTexto;

	}

	public String get_nomeProdutoTexto() {
		return _nomeProdutoTexto;
	}

	// Subscritor
	public String get_nomeClienteSubscritor() {
		return _nomeClienteSubscritor;
	}

	public String get_formaPagamentoTexto() {
		return _formaPagamentoTexto;
	}

	// Titular
	public String get_valorMensalidade() {
		return _valorMensalidade;
	}

	public String get_valorQuantidadeTitulos() {
		return _valorQuantidadeTitulos;
	}

	// Angariador
	public String get_nomeSelecao() {
		return _nomeCliente;
	}

	public String get_nClienteAngariador() {
		return _nClienteAngariador;
	}

	// Corretor
	public String get_nClienteCorretor() {
		return _nClienteCorretor;
	}

	// Locador
	public String get_nomeClienteLocador() {
		return _nomeClienteLocador;
	}

	// Imobiliaria
	public String get_nomeClienteImobiliaria() {
		return _nomeClienteImobiliaria;
	}

	// Gravar
	public String get_campoSituacao() {
		return _campoSituacao;
	}

	/*********************************************************************/
	/********************** Metodo de Inicialização **********************/
	// Inicializar os testes
	@Before("@Cadastro")
	public void setUp() {

		// Abre o Ambiente MapfreCAp
		page.telaCadastro(get_Ambiente());

		// Retorna o titulo da Pagina
		System.out.println(getDriver().getTitle());

		// Confirma se o teste foi executado
		System.out.println("BEFORE ABRIR AMBIENTE ok");
	}

	// Finalizar os testes
	@After
	public void after() throws InterruptedException {
		// JOptionPane.showMessageDialog(null, "Teste Concluido!");
		page.tempoDeEspera(5000);
		killDriver();
		System.out.println("AFTER MATAR INSTANCIA OK");
	}

	/*********************************************************************/
	// Efetuar o Login e abrir a pagina de Cadastro
	@Given("^Que o login esta sendo efetuado e a pagina de cadastro esta aberta$")
	public void acessoLogin() throws InterruptedException {

		/********* Variavel *********/
		String loginAmbiente = "adm";
		String senhaAmbiente = "mcap007";

		/****************************/
		/************ Login *********/
		// Escreve o Login
		page.LoginJsId(loginAmbiente);

		// Espera o campo Login ser preenchido
		page.esperarLogin(loginAmbiente);

		// Escreve a Senha
		page.SenhaJsId(senhaAmbiente);

		// Espera o campo Senha estar preenchido
		page.esperarSenha(senhaAmbiente);

		// clica no botão Entrar
		page.clicarBotaoEntrar();

		// Espera o pagina principal ser exibida
		// page.esperarPaginaPrincipal();

		// Abre a pagina do ambiente
		page.paginaCadastro(get_Ambiente());

		/****************************/

		System.out.println("GIVEN LOGIN OK");
	}

	/*********************************************************************/
	// Informar o tipo de Produto
	@When("^O cadastro inicia-se informando o tipo do produto$")
	public void dadosProposta() {

		/***** Dados da Proposta *****/
		// selecionar a opção campo Canal de Venda
		page.selecionarComboCanalVenda(get_nomeCanalVendaTexto());

		// Esperar o tipo a opção do Canal de Venda ser escolhido
		page.esperarCanalVendaSerEscolhido(get_nomeCanalVendaTexto());

		// Selecioar a opção campo Produto
		page.selecionarComboProduto(get_nomeProdutoTexto());

		System.out.println("WHEN PROPOSTA OK");

		/*****************************/
	}

	/*********************************************************************/
	// Preencher os dados do subscritor
	@Then("^Informamos os dados do Subscritor$")
	public void dadosSubscritor() throws InterruptedException {

		/****** Área Subscritor *******/
		// Esperar a opção do Produto ser escolhido
		page.esperarProdutoSerEscolhido(get_nomeProdutoTexto());

		// Clicar no botão SELECIONAR na área SUBSCRITOR
		page.clicarBotaoSelecionarSubscritor();

		// Espera FIXA
		page.tempoDeEspera(200);
		// Escrever o nome do cliente no campo SELEÇÃO - Área Pesquisar Pessoa
		page.escreverNomeClientePesquisarPessoa(get_nomeClienteSubscritor());

		// Clicar no botão Consultar - Área Pesquisa Cliente
		page.clicarBotaoConsultarPesquisarPessoa();

		// Selecionar o cliente pesquisado
		page.clicarLinkNomeCliente(get_nomeClienteSubscritor());

		// Esperar o campo NOME (Pesquisar Pessoa) ser preenchido com os dados
		// do cliente
		page.esperarCampoNomeSerSelecionado(get_nomeClienteSubscritor());

		// Escolher a forma de Pagemento - Área Subscritor
		page.selecionarComboFormaDePamentoSubscritor(get_formaPagamentoTexto());

		System.out.println("THEN SUBSCRITOR OK");

	}

	/*********************************************************************/
	// Informa os dados do Titular
	@And("Os dados do titular$")
	public void dadosTitular() {

		// Clicar no botão NOVO - Área Titulares
		page.clicarBotaoNovoTitulares();

		// Clicar no botão Copiar do Subscritor - Área Titulares
		page.clicarBotaoCopiarDoSubscrito();

		// Espera o campo NOME ser Preenchido com os dados do Subscritor
		page.esperaCampoNomeTitularSerPreenchido(get_nomeClienteSubscritor());

		// Informar o valor da mensalidade
		page.escreverValorMensalidadeTitulares(get_valorMensalidade());

		// Espera o campo Valor Mensalidade ser Preenchido
		page.esperaCampoValorMensalidadeSerPreenchido(get_valorMensalidade());

		// Informar a quantidade de titulos
		page.escreverQuantidadeTitulosTitulares(get_valorQuantidadeTitulos());

		// Espera o campo Quantidade de Titulos ser Preenchido
		page.esperaCampoQuantidadeTitulosSerPreenchido(get_valorQuantidadeTitulos());

		// Clicar no botão Confirma
		page.clicarBotaoConfirmaTitulares();

		System.out.println("AND  TITULAR OK");
	}

	/*********************************************************************/
	// Informa os dados do Angariador
	@And("^Os dados do angariador$")
	public void dadosAngariador() {

		// Clica no botão Selecionar no Angariador
		page.clicarBotaoSelecionarAngariador();

		// Escreve o nome do Cliente no campo SELEÇÃO
		page.escreverNomeClienteAngariadorPesquisarPessoa(get_nomeSelecao());

		// Clica em Consultar no Pesquisar Pessoa - Angariador
		page.clicarBotaoConsultarAngariador();

		// Clica no link com o nome do Cliente - Angariador
		page.clicarLinkNomeClienteAngariador(get_nClienteAngariador());

		System.out.println("AND ANGARIADOR OK");
	}

	/*********************************************************************/
	// Informa os dados do Corretor
	@And("^Os dados do corretor$")
	public void dadosCorretor() {

		// Clica no botão Selecionar no Corretor
		page.clicarBotaoSelecionarCorretor();

		// Escreve o nome do Cliente no campo SELEÇÃO
		page.escreverNomeClienteCorretorPesquisarPessoa(get_nomeSelecao());

		// Clica em Consultar - Corretor
		page.clicarBotaoConsultarCorretor();

		// Clica no link com o nome do Cliente - Corretor
		page.clicarLinkNomeClienteCorretor(get_nClienteCorretor());

		System.out.println("AND CORRETOR OK");
	}

	/*********************************************************************/
	// Informa os dados do Locador
	@And("^Os dados do locador$")
	public void dadosLocador() {

		// Clicar no botão Selecionar - Locador
		page.clicarBotaoSelecionarLocador();

		// Escreve o nome do Cliente no campo Seleção - Locador
		page.escreverNomeClienteLocadorPesquisarPessoa(get_nomeClienteLocador());

		// Clicar no botão Consultar
		page.clicarBotaoConsultarLocador();

		// Clicar no link com o nome do Cliente - Locador
		page.clicarLinkNomeClienteLocador(get_nomeClienteLocador());

		// Seleciono o texto do combo
		page.clicarImovel();

		System.out.println("AND LOCADOR OK");
	}

	/*********************************************************************/
	// Informa os dados do Locatario
	@And("^Os dados do locatario$")
	public void dadosLocatario() {

		// Clicar no botão Novo - Área Locatário
		page.clicarBotaoNovoLocatario();

		// Clicar no botão copiar do titular - Área Locatario
		page.clicarBotaoCopiarDoTitular();

		// Selecionar combo Copiar do Titular
		page.selecionarComboCopiaDoTitularLocatario(get_nomeClienteSubscritor());

		// Esperar campo nome ser preenchido com os dados do titular
		page.esperarCampoNameLocatarioSerPreenchido(get_nomeClienteSubscritor());

		// Clicar botão confirma
		page.clicarBotaoConfirmaLocatario();

		System.out.println("AND LACATARIO OK");
	}

	/*********************************************************************/
	// Informa os dados da Imobiliaria
	@And("^Os dados da imobiliaria$")
	public void dadosImobiliaria() {

		// Clicar no botao Selecioanar - Área Imobiliaria
		page.clicarBotaoSelecionarImobiliaria();

		// Escrever o nome da Imobiliaria
		page.escreverNomeImobiliariaPesquisarPessoa(get_nomeClienteImobiliaria());

		// Clicar no botao Consultar
		page.clicarBotaoConsultarImobiliaria();

		// Selecionar o nome da imobiliaria procurada
		page.clicarLinkNomeClienteImobiliaria(get_nomeClienteImobiliaria());

		System.out.println("AND IMOBILIARIA OK");
	}

	/*********************************************************************/
	// Grava o cadastro e guarda evidencia
	@When("Gravamos o cadastro e guardamos a evidencia$")
	public void gravar() {

		// Rola a pagina até o inicio
		page.rolarPaginaGravar(-300);

		// Clica no botão Gravar
		page.clicarGrava();

		System.out.println("WHEN GRAVAR OK");
	}

	// Efetiva o cadastro
	@Then("^Finalizamos o cadastro$")
	public void efetivar() throws IOException, AWTException, InterruptedException {

		page.tempoDeEspera(300);
		// Printar tela
		page.printScreen("Gravar");

		// Clicar em Efetivar
		page.clicarEfetivarVenda();

		// Esperar o campo Situação mudar para Pendente
		page.esperarCampoSituacao(get_campoSituacao());

		// Printar tela
		page.printScreen("Efetivar");

		System.out.println("THEN FINALIZAR OK");
	}

	/*********************************************************************/
}
