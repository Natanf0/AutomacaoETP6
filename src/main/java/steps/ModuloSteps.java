package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import pages.ModuloPage;
import web.singleton.WebSteps;

public class ModuloSteps extends WebSteps<ModuloPage> {
    @Dado("que eu acesse a tela de login do sistema")
    public void queEuAcesseATelaDeLoginDoSistema() {
        setPage(ModuloPage.class);
        getPage().AbrePaginaLogin();
    }

    @Dado("que eu acesse o sistema com o perfil {string}")
    public void queEuAcesseOSistemaComOPerfilPerfil(String perfil) {
        getPage().AcessaSistemaComPerfil(perfil);
    }

    @E("que eu selecione a opcao Tipo de Módulo no menu Configuração")
    public void queEuSelecioneAOpcaoTipoDeMóduloNoMenuConfiguração() {
        getPage().ClicaNoSubmenuTipoModulo();
    }

    @E("que eu clique no botão Incluir Tipo de Módulo")
    public void queEuCliqueNoBotãoIncluirTipoDeMódulo() {
        getPage().ClicaBtnIncluirTipoModulo();
    }

    @E("que eu preencha o campo Tipo de Módulo com {string}")
    public void queEuPreenchaOCampoTipoDeMóduloComTipo_mod(String conteudo) {
        getPage().InsereTipoModulo(conteudo);
    }

    @Quando("eu clicar no botão Salvar")
    public void euClicarNoBotãoSalvar() {
        getPage().ClicaBtnsalvar();
    }


    @Então("o sistema retorna a página anterior e exibe a mensagem de sucessso {string}")
    public void oSistemaRetornaAPáginaAnteriorEExibeAMensagemDeSucesssoTipoDeMóduloSalvoComSucesso(String msg) {
        Assert.assertTrue(getPage().ValidaMsgSucesso(msg));
    }

    @Quando("eu clicar no botão Limpar")
    public void euClicarNoBotãoLimpar() {
        getPage().ClicaBtnLimpar();
    }

    @Então("o campo Tipo de Módulo será limpo")
    public void oCampoTipoDeMóduloSeráLimpo() {
        Assert.assertTrue(getPage().ValidaCampoTipoModuloLimpo());
    }

    @Quando("eu clicar no botão Voltar")
    public void euClicarNoBotãoVoltar() {
        getPage().ClicaBtnVoltar();
    }

    @Então("o sistema retorna para a página anterior")
    public void oSistemaRetornaParaAPáginaAnterior() {
        Assert.assertTrue(getPage().ValidaRetornoDaPaginaTipoModulo());

    }

    @E("que eu limpe o campo Tipo de Módulo")
    public void queEuLimpeOCampoTipoDeMódulo() {
        getPage().ClicaBtnLimpar();
    }

    @Então("o sistema exibe mensagem de crítica")
    public void oSistemaExibeMensagemDeCrítica() {
        Assert.assertTrue(getPage().ValidaMsgCriticaCampoObrigatorioTipoModulo());
    }

    @E("que eu realize a inclusao previa e pesquise pelo tipo de módulo recem incluido")
    public void queEuRealizeAInclusaoPreviaEPesquisePeloTipoDeMóduloRecemIncluido() {
        getPage().IncluiEPesquisaTipoDeModulo();
    }
    @E("que eu realize a inclusao previa do tipo de modulo {string} e pesquise pelo tipo de módulo recem incluido")
    public void queEuRealizeAInclusaoPreviaDoTipoDeModuloModuloXAEPesquisePeloTipoDeMóduloRecemIncluido(String tipo_modulo) {
        getPage().IncluiEPesquisaTipoDeModuloComValor(tipo_modulo);   }

    @Quando("eu clicar na acao {string}")
    public void euClicarNaAcaoConsultar(String acao) {
        getPage().ClicaNaAcao(acao);
    }


    @Então("o sistema exibe a tela de consulta do tipo de módulo {string}")
    public void oSistemaExibeATelaDeConsultaDoTipoDeMóduloModuloX(String valor) {
        Assert.assertTrue(getPage().ValidaConsultaTipoModulo(valor));
    }

    @E("que eu clique no botão Excluir")
    public void queEuCliqueNoBotãoExcluir() {
        getPage().ClicaBtnExcluir();
    }

    @E("que eu confirme a exclusao")
    public void queEuConfirmeAExclusao() {
        getPage().ConfirmaExclusao();
    }

    @Então("o sistema permanece na página e exibe a mensagem de crítica {string}")
    public void oSistemaPermaneceNaPáginaEExibeAMensagemDeCríticaNãoFoiPossívelSalvarAlteraçõesPorqueEsteTipoDeMóduloJáEstáCadastrado(String msg_critica) {
        Assert.assertTrue(getPage().ValidaMsgCriticaTipoModuloDuplicado(msg_critica));
    }

    @E("que eu clique em cancelar")
    public void queEuCliqueEmCancelar() {
        getPage().ClicaBtnCancelarExclusao();
    }

    @Então("o sistema fecha a modal e permanece na pagina")
    public void oSistemaFechaAModalEPermaneceNaPagina() {
        Assert.assertTrue(getPage().ValidaCancelaExclusaoTipoModulo());
    }

    @Quando("eu alterar o campo Tipo de Mdulo com {string}")
    public void euAlterarOCampoTipoDeMduloComModuloAlterado(String conteudo) {
        getPage().InsereTipoModulo(conteudo);
    }



    /*    SUBTIPO DE MÓDULO:      */
    @E("que eu selecione a opcao Subtipo de Módulo no menu Configuração")
    public void queEuSelecioneAOpcaoSubtipoDeMóduloNoMenuConfiguração() {
        getPage().ClicaSubmenuSubtipoModulo();
    }

    @E("que eu clique no botão Incluir Subtipo de Módulo")
    public void queEuCliqueNoBotãoIncluirSubtipoDeMódulo() {
        getPage().ClicaBtnIncluirSubtipoModulo();
    }

    @E("que eu selecione o campo Tipo de Módulo com {string}")
    public void queEuSelecioneOCampoTipoDeMóduloComManobra(String tipo_modulo) {
        getPage().SelecionaTipoModulo(tipo_modulo);
    }

    @E("que eu preencha o campo Sigla do Subtipo de Módulo com {string}")
    public void queEuPreenchaOCampoSiglaDoSubtipoDeMóduloComDDNA(String sigla) {
        getPage().InsereSiglaSubtipo(sigla);
    }

    @E("que eu preencha o campo Nome do Subtipo de Módulo com {string}")
    public void queEuPreenchaOCampoNomeDoSubtipoDeMóduloComNomeNovo(String nome) {
        getPage().InsereNomeSubtipo(nome);
    }

}
