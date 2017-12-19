package br.com.indra.page;

import java.awt.AWTException;
import java.io.IOException;

import br.com.indra.core.DriverFactory;

public class FichadeCadastroPage extends DriverFactory {

	/***************************** Variaveis *****************************/
	/******************* Ambiente *******************/
	// Ambiente de MapfreCap
	private String _urlDev = "http://172.20.152.47/mapfrecap/Coreon.Acesso/frmLogin.aspx";
	private String _urlSus = "http://10.206.28.128/mapfrecap/";

	/************************************************/
	/**************** Pagina Inicial ****************/
	// Pagina de cadastro
	private String _telaCadastroDev = "http://172.20.152.47/mapfrecap//Coreon.Propostas/frmPropostas.aspx?endereco=../../../Coreon.Propostas/frmPropostas.aspx&usu=0001&titulo=Propostas&parametro=&prf=01&mnusel=1600&&";
	private String _telaCadastroSus = "http://10.206.28.128/mapfrecap//Coreon.Propostas/frmPropostas.aspx?endereco=../../../Coreon.Propostas/frmPropostas.aspx&usu=0001&titulo=Propostas&parametro=&prf=01&mnusel=1600&&";

	/************************************************/
	/************ Tela de Login/Cadastro ************/
	// Login
	private String _loginId = "txtLogin_I";
	private String _senhaId = "txtSenha_I";
	private String _botaoEntrarName = "btnEntrar";

	// Pagina principal
	private String _xpathPaginaPrincipal = "//*[@class='menup']text()='Menu Principal'";
	private String _textoMenuPrinciapl = "Menu Principal";

	/************************************************/
	/************** Ficha de Cadastro ***************/
	// Dados da Propsota
	private String _canalVendaName = "ddlCanalVenda";
	private String _campoProdutoName = "ddlProduto";

	// Subscritor
	private String _botaoSelecionarSubscritorName = "selecaoSubscritor$btnSelecionar";
	private String _campoSelecaoPesquisarPessoaId = "selecaoSubscritor_Pesquisa_txtSelecao";
	private String _botaoCansultarPesquisarPessoaName = "selecaoSubscritor$Pesquisa$btnConsultar";
	private String _campoNomeSubscritorName = "selecaoSubscritor$edtNome";
	private String _comboFormaPagamentoSubscritoName = "selecaoSubscritor$ddlFormaPagamento";

	// Titular
	private String _botaoNovoTitularesName = "btnHabilitaPnl";
	private String _botaoCopiarDoSubscritorTitularesId = "btnCopySubscritor";
	private String _campoNomeTitularName = "selecaoSubscritor$edtNome";
	private String _campoValorMensalidadeTitularId = "edtVal_msd_ttr";
	private String _campoQuantidadeTitulosTitularId = "txtqtd_tit_ttr";
	private String _botaoConfirmaTitularesName = "btnConfirmarTitular";

	// ANGARIADOR
	private String _botaoSelecionarAngariadorName = "selecaoAngariador$btnSelecionar";
	private String _campoSelecaoAngariadorId = "selecaoAngariador_Pesquisa_txtSelecao";
	private String _botaoConsultarAngariador = "selecaoAngariador_Pesquisa_btnConsultar";

	// CORRETOR
	private String _botaoSelecionarCorretorName = "selecaoCorretor$btnSelecionar";
	private String _botaoSelecaoCorretorName = "selecaoCorretor$Pesquisa$txtSelecao";
	private String _botaoConsultarPesquisarPessoaImobiliaria = "selecaoImobiliaria$Pesquisa$btnConsultar";

	// LOCADOR
	private String _botaoSelecionarLocador = "selecaoLocador$btnSelecionar";
	private String _campoSelecaoLocadorName = "selecaoLocador$Pesquisa$txtSelecao";
	private String _botaoConsultarLocador = "selecaoLocador$Pesquisa$btnConsultar";

	// Locatario
	private String _botaoNovoLocatarioName = "btnNovoLocatario";
	private String _botaoCopiardoTitularLocatarioId = "lnkCopiaSubscritor";
	private String _comboCopiarDoTitularLocatarioName = "ddlCopiaTitular";
	private String _botaoConfirmaLocatario = "btnConfirmarLocatario";
	private String _campoNomeLocatarioName = "selecaoLocatario$edtNome";

	// Imobiliaria
	private String _botaoSelecaoImobiliariaName = "selecaoImobiliaria$btnSelecionar";
	private String _campoSelecaoPesquisarPessoaImobiliariaId = "selecaoImobiliaria_Pesquisa_txtSelecao";

	// Gravar
	private String _clicarGravar = "btnGravar";
	private String _campoSituacao = "ddlSituacaoProposta";
	private String _pastaPrintcadastro = "Cadastro";

	// Efetivar
	private String _clicarEfetivar = "btnFinish";

	/*********************************************************************/
	/****************************** Getters ******************************/
	// Ambiente de MapfreCap
	public String get_telaCadastroDev() {
		return _telaCadastroDev;
	}

	public String get_telaCadastroSus() {
		return _telaCadastroSus;
	}

	// Tela de Login
	public String get_login() {
		return _loginId;
	}

	public String get_senha() {
		return _senhaId;
	}

	public String get_urlDev() {
		return _urlDev;
	}

	public String get_urlSus() {
		return _urlSus;
	}

	public String get_botaoEntrar() {
		return _botaoEntrarName;
	}

	// Pagina principal
	public String get_xpathPaginaPrincipal() {
		return _xpathPaginaPrincipal;
	}

	public String get_textoMenuPrinciapl() {
		return _textoMenuPrinciapl;
	}

	// Canal de Venda
	public String get_canalVenda() {
		return _canalVendaName;
	}

	public String get_campoProduto() {
		return _campoProdutoName;
	}

	// Subscritor
	public String get_botaoSelecionarSubscritorName() {
		return _botaoSelecionarSubscritorName;
	}

	public String get_campoSelecaoPesquisarPessoaId() {
		return _campoSelecaoPesquisarPessoaId;
	}

	public String get_clicarBotaoCansultarPesquisarPessoaName() {
		return _botaoCansultarPesquisarPessoaName;
	}

	public String get_campoNomeSubscritorName() {
		return _campoNomeSubscritorName;
	}

	public String get_comboFormaPagamentoSubscritoName() {
		return _comboFormaPagamentoSubscritoName;
	}

	// Titulares
	public String get_botaoNovoTitularesName() {
		return _botaoNovoTitularesName;
	}

	public String get_botaoCopiarDoSubscritorTitularesId() {
		return _botaoCopiarDoSubscritorTitularesId;
	}

	public String get_campoNomeTitularName() {
		return _campoNomeTitularName;
	}

	public String get_campoValorMensalidadeTitularId() {
		return _campoValorMensalidadeTitularId;
	}

	public String get_campoQuantidadeTitulosTitularId() {
		return _campoQuantidadeTitulosTitularId;
	}

	public String get_botaoConfirmaTitularesName() {
		return _botaoConfirmaTitularesName;
	}

	// ANGARIADOR
	public String get_botaoSelecionarAngariadorName() {
		return _botaoSelecionarAngariadorName;
	}

	public String get_campoSelecaoAngariadorId() {
		return _campoSelecaoAngariadorId;
	}

	public String get_botaoConsultarAngariador() {
		return _botaoConsultarAngariador;
	}

	public String get_botaoSelecionarCorretorName() {
		return _botaoSelecionarCorretorName;
	}

	// Corretor
	public String get__botaoSelecaoCorretorName() {
		return _botaoSelecaoCorretorName;
	}

	// Locador
	public String get_botaoSelecionarLocador() {
		return _botaoSelecionarLocador;
	}

	public String get_campoSelecaoLocadorName() {
		return _campoSelecaoLocadorName;
	}

	public String get_botaoConsultarLocador() {
		return _botaoConsultarLocador;
	}

	// Locatario
	public String get_botaoNovoLocatarioName() {
		return _botaoNovoLocatarioName;
	}

	public String get_botaoCopiardoTitularLocatarioId() {
		return _botaoCopiardoTitularLocatarioId;
	}

	public String get_comboCopiarDoTitularLocatarioName() {
		return _comboCopiarDoTitularLocatarioName;
	}

	public String get_botaoConfirmaLocatario() {
		return _botaoConfirmaLocatario;
	}

	public String get_campoNomeLocatarioName() {
		return _campoNomeLocatarioName;
	}

	// Imobiliaria
	public String get_botaoSelecaoImobiliariaName() {
		return _botaoSelecaoImobiliariaName;
	}

	public String get_campoSelecaoPesquisarPessoaImobiliariaId() {
		return _campoSelecaoPesquisarPessoaImobiliariaId;
	}

	public String get_botaoConsultarPesquisarPessoaImobiliaria() {
		return _botaoConsultarPesquisarPessoaImobiliaria;
	}

	// Gravar
	public String get_clicarGravar() {
		return _clicarGravar;
	}

	public String get_campoSituacao() {
		return _campoSituacao;
	}

	public String get_pastaPrintcadastro() {
		return _pastaPrintcadastro;
	}

	// Efetivar
	public String get_clicarEfetivar() {
		return _clicarEfetivar;
	}

	/*********************************************************************/
	/********************** TELA DE LOGIN (@Given) *********************/

	// Pagina do Sistema MApfreCap
	public void telaCadastro(String url) {
		if (url.equalsIgnoreCase("DEVR2")) {
			getDSL().carregarPagina(get_urlDev());
		} else if (url.equalsIgnoreCase("SUS")) {
			getDSL().carregarPagina(get_urlSus());
		}
	}

	/*********************************************************************/
	/********************* PAGINA DE LOGIN (@Given) **********************/

	// preencher o campo Login
	public void LoginJsId(String login) {
		getDSL().escreverJsId(get_login(), login);
	}

	// Esperar o campo Login ser preenchido
	public void esperarLogin(String valor_esperado) {
		getDSL().esperarValorId(get_login(), valor_esperado);
	}

	// Preencher o campo Senha ser preenchido
	public void SenhaJsId(String senha) {
		getDSL().escreverJsId(get_senha(), senha);
	}

	// Esperar o campo Senha ser preenchido
	public void esperarSenha(String valor_esperado) {
		getDSL().escreverJsId(get_senha(), valor_esperado);
	}

	// Pressionar o botão Entrar
	public void clicarBotaoEntrar() {
		getDSL().clicarName(get_botaoEntrar());
	}

	/*********************************************************************/
	/********************** TELA CADASTRO (@Given) ***********************/
	// Carregar a pagina de cadastro
	public void paginaCadastro(String url) {
		if (url.equalsIgnoreCase("DEVR2")) {
			getDSL().carregarPagina(get_telaCadastroDev());
		} else if (url.equalsIgnoreCase("SUS")) {
			getDSL().carregarPagina(get_telaCadastroSus());
		}
	}

	/*********************************************************************/
	/******************** DADOS DA PROPOSTA (@When) **********************/

	// Selecionar o tipo de produto do Canal de Venda
	public void selecionarComboCanalVenda(String opcao_selecao) {
		getDSL().selecionarComboTextoName(get_canalVenda(), opcao_selecao);
	}

	// Esperar a opção do Canal de Venda ser escolhida
	public void esperarCanalVendaSerEscolhido(String texto_esperado) {
		getDSL().esperarTextoName(get_canalVenda(), texto_esperado);
	}

	// Selecionar o Produto do campo Produto
	public void selecionarComboProduto(String opcao_selecao) {
		getDSL().selecionarComboTextoName(get_campoProduto(), opcao_selecao);
	}

	/*********************************************************************/
	/********************* DADOS SUBSCRITOR (@Then) **********************/

	// Esperar o tipo do Produto ser escolhido
	public void esperarProdutoSerEscolhido(String texto_esperado) {
		getDSL().esperarTextoName(get_campoProduto(), texto_esperado);
	}

	// Clicar no botão SELECIONAR do campo SUBSCRITOR
	public void clicarBotaoSelecionarSubscritor() {
		getDSL().clicarName(get_botaoSelecionarSubscritorName());
	}

	// Espera FIXA
	public void tempoDeEspera(long tempo) throws InterruptedException {
		getDSL().tempoEsperaFixa(tempo);
	}

	// Escrever o nome do Cliente no campo SELEÇÃO
	public void escreverNomeClientePesquisarPessoa(String nome_preenchido) {
		getDSL().escreverJsId(get_campoSelecaoPesquisarPessoaId(), nome_preenchido);
	}

	// Clicar no botão Consultar - Área Pesquisa Cliente
	public void clicarBotaoConsultarPesquisarPessoa() {
		getDSL().clicarName(get_clicarBotaoCansultarPesquisarPessoaName());
	}

	// Clicar no link com o nome do Cliente - área PESQUISAR PESSOA
	public void clicarLinkNomeCliente(String nome) {
		getDSL().clicarlink(nome);
	}

	// Esperar o campo NOME ser preenchido com os dados do cliente
	public void esperarCampoNomeSerSelecionado(String nome_esperado) {
		getDSL().esperarValorName(get_campoNomeSubscritorName(), nome_esperado);
	}

	// Escolher a forma de pagamento - área Subscritor
	public void selecionarComboFormaDePamentoSubscritor(String nome_esperado) {
		getDSL().selecionarComboTextoName(get_comboFormaPagamentoSubscritoName(), nome_esperado);

	}

	/*********************************************************************/
	/********************** DADOS Titular (@And_1) ***********************/
	// Clicar no botão NOVO - Área Titulares
	public void clicarBotaoNovoTitulares() {
		getDSL().clicarName(get_botaoNovoTitularesName());
	}

	// Clicar no botão Copiar do Subscritor - Área Titulares
	public void clicarBotaoCopiarDoSubscrito() {
		getDSL().clicarId(get_botaoCopiarDoSubscritorTitularesId());
	}

	// Espera o campo NOME ser Preenchido com os dados do Subscritor
	public void esperaCampoNomeTitularSerPreenchido(String nome_esperado) {
		getDSL().esperarValorName(get_campoNomeTitularName(), nome_esperado);
	}

	// Informar o valor da mensalidade
	public void escreverValorMensalidadeTitulares(String valor_mensalidade) {
		getDSL().escreverJsId(get_campoValorMensalidadeTitularId(), valor_mensalidade);
	}

	// Espera o campo Valor Mensalidade ser Preenchido
	public void esperaCampoValorMensalidadeSerPreenchido(String nome_esperado) {
		getDSL().esperarValorName(get_campoValorMensalidadeTitularId(), nome_esperado);
	}

	// Informar a quantidade de titulos
	public void escreverQuantidadeTitulosTitulares(String quantidade_titulos) {
		getDSL().escreverJsId(get_campoQuantidadeTitulosTitularId(), quantidade_titulos);
	}

	// Espera o campo Quantidade de Titulos ser Preenchido
	public void esperaCampoQuantidadeTitulosSerPreenchido(String nome_esperado) {
		getDSL().esperarValorName(get_campoQuantidadeTitulosTitularId(), nome_esperado);
	}

	// Clicar no botão Confirma
	public void clicarBotaoConfirmaTitulares() {
		getDSL().clicarName(get_botaoConfirmaTitularesName());
	}

	/*********************************************************************/
	/********************* DADOS ANGARIADOR (@AND) ***********************/

	// Clicar no botão Selecionar no Angariador
	public void clicarBotaoSelecionarAngariador() {
		getDSL().clicarName(get_botaoSelecionarAngariadorName());
	}

	// Escrever o nome do Cliente no campo SELEÇÃO
	public void escreverNomeClienteAngariadorPesquisarPessoa(String nome) {
		getDSL().escreverJsId(get_campoSelecaoAngariadorId(), nome);
	}

	// Clicar em Consultar no Pesquisar Pessoa - Angariador
	public void clicarBotaoConsultarAngariador() {
		getDSL().clicarId(get_botaoConsultarAngariador());
	}

	// Clicar no link com o nome do Cliente - Angariador
	public void clicarLinkNomeClienteAngariador(String nome) {
		getDSL().clicarlink(nome);
	}

	/********************************************************************/
	/********************** DADOS CORRETOR (@AND) ***********************/
	// Clicar no botão Selecionar no Angariador
	public void clicarBotaoSelecionarCorretor() {
		getDSL().clicarName(get_botaoSelecionarCorretorName());
	}

	// Escrever o nome do Cliente no campo SELEÇÃO
	public void escreverNomeClienteCorretorPesquisarPessoa(String nome) {
		getDSL().escreverJsId(get__botaoSelecaoCorretorName(), nome);
	}

	// Clicar em Consultar no Pesquisar Pessoa - Corretor
	public void clicarBotaoConsultarCorretor() {
		getDSL().clicarName("selecaoCorretor$Pesquisa$btnConsultar");
	}

	// Clicar no link com o nome do Cliente - Corretor
	public void clicarLinkNomeClienteCorretor(String nome) {
		getDSL().clicarlink(nome);
	}

	/******************************************************************/
	/********************* DADOS LOCADOR (@When) **********************/
	// Clica no botão Selecionar - Locador
	public void clicarBotaoSelecionarLocador() {
		getDSL().clicarName(get_botaoSelecionarLocador());
	}

	// Escrever o nome do Cliente no campo SELEÇÃO
	public void escreverNomeClienteLocadorPesquisarPessoa(String nome) {
		getDSL().escreverJsId(get_campoSelecaoLocadorName(), nome);
	}

	// Clicar em Consultar no Pesquisar Pessoa - Locador

	public void clicarBotaoConsultarLocador() {
		getDSL().clicarName(get_botaoConsultarLocador());

	}

	// Clicar no link com o nome do Cliente - Locador
	public void clicarLinkNomeClienteLocador(String nome) {
		getDSL().clicarlink(nome);
	}

	// Seleciono o texto do combo
	public void clicarImovel() {
		getDSL().selecionarComboTextoName("ddlImovel", "BARAO DE TEFE, 250 APTO 112");
	}

	/******************************************************************/
	/******************** DADOS LOCATARIO (@AND) **********************/
	// Clicar no botão Novo - Área Locatário
	public void clicarBotaoNovoLocatario() {
		getDSL().clicarName(get_botaoNovoLocatarioName());
	}

	// Clicar no botão copiar do titular - Área Locatario
	public void clicarBotaoCopiarDoTitular() {
		getDSL().clicarId(get_botaoCopiardoTitularLocatarioId());
	}

	// Selecionar combo Copia do Titular
	public void selecionarComboCopiaDoTitularLocatario(String texto_selecao) {
		getDSL().selecionarComboTextoName(get_comboCopiarDoTitularLocatarioName(), texto_selecao);
	}

	// Esperar campo nome ser preenchido com os dados do titular
	public void esperarCampoNameLocatarioSerPreenchido(String texto_esperado) {
		getDSL().esperarValorName(get_campoNomeLocatarioName(), texto_esperado);
	}

	// Clicar botão confirma
	public void clicarBotaoConfirmaLocatario() {
		getDSL().clicarName(get_botaoConfirmaLocatario());
	}

	/******************************************************************/
	/******************* DADOS IMOBILIARIA (@AND) *********************/

	// Clicar no botao Selecioanar - Área Imobiliaria
	public void clicarBotaoSelecionarImobiliaria() {
		getDSL().clicarName(get_botaoSelecaoImobiliariaName());
	}

	// Escrever o nome da Imobiliaria
	public void escreverNomeImobiliariaPesquisarPessoa(String nome_preenchido) {
		getDSL().escreverJsId(get_campoSelecaoPesquisarPessoaImobiliariaId(), nome_preenchido);
	}

	// Clicar no botao Consultar
	public void clicarBotaoConsultarImobiliaria() {
		getDSL().clicarName(get_botaoConsultarPesquisarPessoaImobiliaria());
	}

	// Selecionar o nome da imobiliaria procurada
	public void clicarLinkNomeClienteImobiliaria(String texto) {
		getDSL().clicarlink(texto);
	}

	/******************************************************************/
	/************************ GRAVAR (@WHEN) **************************/
	// Rolar pagina
	public void rolarPaginaGravar(float coordenadaY) {
		getDSL().rolarPagina(coordenadaY);
	}

	// Clica no botão Gravar
	public void clicarGrava() {
		getDSL().clicarName(get_clicarGravar());
	}

	/******************************************************************/
	/*********************** EFETIVAR (@WHEN) *************************/

	// Clicar em Efetivar
	public void clicarEfetivarVenda() {
		getDSL().clicarName(get_clicarEfetivar());
	}
	
	// Guarda evidencia apos a situação mudar para pendente
	public void esperarCampoSituacao(String texto_esperado) {
		getDSL().esperarValorName(get_campoSituacao(), texto_esperado);
	}


	/******************************************************************/

	public void printScreen(String nome_print) throws IOException, AWTException {
		getDSL().printarTela(get_pastaPrintcadastro(), nome_print);
	}
}
