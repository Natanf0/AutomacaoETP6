package pages;

import Commom.CommomMethods;
import web.WebPage;
import web.components.WebElementAtf;

public class TipoModuloPage extends WebPage {
    CommomMethods commomMethods = new CommomMethods();
    @Override
    public void disposePage() {}
    private final String url_project = "http://fabteste/SIPLAN/login";

    public void AbrePaginaLogin(){
        atf.openPage(url_project);
    }

    public void AcessaSistemaComPerfil(String perfil){
        atf.sleep(4000);
        atf.setText("Login.Campo.Matricula", CommomMethods.EscolhePerfil(perfil)[0]);
        atf.setText("Login.Campo.Senha", CommomMethods.EscolhePerfil(perfil)[1]);
        atf.click("Btn.Login");


    }

    public void ClicarNoSubmenu(){
        atf.sleep(2000);
        atf.openPage("http://fabteste/SIPLAN/tipoModulo"); //atf.click("Menu.Config.TipoModulo");

    }

    // Exclusivo
    public void CLicaBtnIncluir(){
        atf.sleep(4000);
        atf.click("Btn.Incluir");
    }

    // Exclusivo
    public void InsereTipoModulo(String conteudo){
        atf.sleep(3500);
        atf.setText("Campo.TipoModulo", conteudo);
    }

    public void ClicaBtnsalvar(){
        atf.click("Btn.Salvar");
    }



    public boolean ValidaInclusao(String msg){
        /* Mudar nome */
        atf.sleep(4000);
        String msg_ = atf.getText("Msg.Sucesso");
        return msg.equals(msg_);

    }

    public void ClicaBtnLimpar() {
        atf.sleep(4000);
        atf.click("Btn.Limpar");
    }

    // Exclusivo
    public boolean ValidaCampoLimpo() {
        atf.clearText("Campo.TipoModulo");
        return (atf.getText("Campo.TipoModulo")).equals("");
    }

    public void ClicaBtnVoltar() {
        atf.sleep(1000);
        atf.click("Btn.Voltar");
    }
    // Exclusivo
    public boolean ValidaMsgCriticaCampoObrigatorio(){
        String msg = atf.getText("Msg.Critica.CampoObrig");
        return msg.equals("O campo Tipo de Módulo deve ser preenchido");
    }

    // Exclusivo

    public boolean ValidaRetornoDaPagina(){
        atf.sleep(6000);
        String titulo_pagina = atf.getText("Titulo.Pagina.Listagem");

        return titulo_pagina.equals("Listagem de Tipos de Módulo");
    }

    // Exclusivo
    public void PesquisarTipoDeModulo(String valor) {
        atf.sleep(4000);
        atf.setText("Campo.Pesquisar", valor);
        atf.click("Btn.Pesquisar");
    }

    public void ClicarAcao(String acao) {
        atf.sleep(4000);
        switch (acao.toLowerCase()) {
            case "consultar" :
                atf.click("Acao.Consultar");
                break;

            case "alterar":
                atf.click("Acao.Alterar");
                break;

            case "excluir":
                atf.click("Acao.Excluir");
                break;
        }

    }

    // Exclusivo
    public boolean ValidaConsulta(String valor_campo) {
        atf.sleep(4000);
        WebElementAtf webElementAtf = atf.getElement("Campo.TipoDeModulo.Consulta");
        String conteudo = webElementAtf.getAttribute("value");
        return (valor_campo.toLowerCase()).equals(conteudo.toLowerCase());

        // Devido ao camel case do sistema, tive que fazer isso
        // mas o adequado é uma função que transforme o texto em camel case.
    }

    public void ClicaBtnExcluir() {
        atf.sleep(4000);
        atf.click("Btn.Excluir");
    }

    public void ConfirmaExclusao() {
        atf.sleep(3000);
        atf.click("Btn.Confirma.Exclusao");

    }

    public boolean ValidaMensagemCritica(String msg_critica) {
        atf.sleep(2000);
        return (atf.getText("Msg.Critica")).equals(msg_critica);

    }

    public void ClicaBtnCancelar() {
        atf.sleep(3000);
        atf.click("Btn.Cancelar.Exclusao");
    }

    // Exclusivo
    public boolean ValidaPermanecePagina() {
        atf.sleep(2000);
        return (atf.getText("Titulo.Pagina.Exclusao")).equals("Remover Tipo de Módulo");
    }

    // Exclusivo
    public void IncluiEPesquisaTipoDeModulo() {
        final String tipo_modulo = CommomMethods.GeraTexto();
        CLicaBtnIncluir();
        InsereTipoModulo(tipo_modulo);
        ClicaBtnsalvar();
        PesquisarTipoDeModulo(tipo_modulo);
    }

    // Exclusivo

    public void IncluiEPesquisaTipoDeModuloComValorPredefinido(String tipo_modulo) {
        CLicaBtnIncluir();
        InsereTipoModulo(tipo_modulo);
        ClicaBtnsalvar();
        PesquisarTipoDeModulo(tipo_modulo);
    }

    public void ClicaBtnIncluirSUbtipo() {
        atf.sleep(2000);
        atf.click("Btn.Incluir.Subtipo");
    }

    public void SelecionaTipoModulo(String tipo_modulo) {
        atf.sleep(2000);
        atf.setComboText("Combobox.TipoModulo", tipo_modulo);
    }

    public void InsereSiglaSubtipo(String sigla){
        atf.sleep(1000);
        atf.setText("", sigla);
    }

    public void InsereNomeSubtipo(String nome){
        atf.sleep(1000);
        atf.setText("Campo.Nome.SubtipoModulo", nome);
    }


}










