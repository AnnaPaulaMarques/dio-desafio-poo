package service;

import model.AparelhoTelefonico;
import model.AssistenteVirtual;
import model.NavegadorInternet;
import model.ReprodutorMusical;

public class AssistenteVirtualImpl implements AssistenteVirtual {

    private final ReprodutorMusical musicaService;
    private final AparelhoTelefonico telefoneService;
    private final NavegadorInternet navegadorService;

    public AssistenteVirtualImpl(ReprodutorMusical musica, AparelhoTelefonico telefone, NavegadorInternet navegador) {
        this.musicaService = musica;
        this.telefoneService = telefone;
        this.navegadorService = navegador;
    }

    @Override
    public void executarComando(String comando) {
        comando = comando.toLowerCase();

        if (comando.contains("tocar musica")) {
            musicaService.tocar();
        } else if (comando.contains("selecionar musica")) {
            String musica = comando.replace("selecionar musica", "").trim();
            musicaService.selecionarMusica(musica);
        } else if (comando.contains("pausar musica")) {
            musicaService.pausar();
        } else if (comando.contains("ligar")) {
            String numero = extrairNumero(comando);
            telefoneService.ligar(numero);
        } else if (comando.contains("atender")) {
            telefoneService.atender();
        } else if (comando.contains("correio de voz")) {
            telefoneService.iniciarCorreioVoz();
        } else if (comando.contains("exibir pagina")) {
            String url = comando.replace("exibir pagina", "").trim();
            navegadorService.exibirPagina(url);
        } else if (comando.contains("nova aba")) {
            navegadorService.adicionarNovaAba();
        } else if (comando.contains("atualizar pagina")) {
            navegadorService.atualizarPagina();
        } else {
            System.out.println("Comando não reconhecido.");
        }
    }

    @Override
    public void abrirPortal(String portal) {
        switch(portal.toLowerCase()) {
            case "musica":
                System.out.println("Abrindo portal musical...");
                break;
            case "telefone":
                System.out.println("Abrindo portal telefônico...");
                break;
            case "navegador":
                System.out.println("Abrindo portal navegador...");
                break;
            default:
                System.out.println("Portal desconhecido.");
                break;
        }
    }

    private String extrairNumero(String comando) {
        return comando.replaceAll("\\D+", "");
    }
}