package assistant;

import model.AparelhoTelefonico;
import model.NavegadorInternet;
import model.ReprodutorMusical;
import service.AparelhoTelefonicoImpl;
import service.NavegadorInternetImpl;
import service.ReprodutorMusicalImpl;

import java.util.Scanner;

public class ISoulAssistant {

    private final ReprodutorMusical reprodutor;
    private final AparelhoTelefonico telefone;
    private final NavegadorInternet navegador;

    public ISoulAssistant() {
        this.reprodutor = new ReprodutorMusicalImpl();
        this.telefone = new AparelhoTelefonicoImpl();
        this.navegador = new NavegadorInternetImpl();
    }

    public void iniciar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, iSoul aqui! Qual hub você deseja abrir?");
        System.out.println("Digite: musica | ligacao | navegador | sair");

        String comando = scanner.nextLine().toLowerCase();

        while (!comando.equals("sair")) {
            switch (comando) {
                case "musica" -> abrirPortalMusical(scanner);
                case "ligacao" -> abrirPortalTelefonico(scanner);
                case "navegador" -> abrirPortalNavegador(scanner);
                default -> System.out.println("Comando não reconhecido. Tente novamente.");
            }

            System.out.println("\nDeseja abrir outro hub? (musica | ligacao | navegador | sair)");
            comando = scanner.nextLine().toLowerCase();
        }

        System.out.println("👋 Finalizando iSoul. Até logo!");
    }

    private void abrirPortalMusical(Scanner scanner) {
        System.out.println("🎧 Bem-vindo ao hub musical.");
        System.out.print("Digite o nome da música: ");
        String musica = scanner.nextLine();
        reprodutor.selecionarMusica(musica);
        reprodutor.tocar();
        System.out.print("Deseja pausar a música? (sim/não): ");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            reprodutor.pausar();
        }
    }

    private void abrirPortalTelefonico(Scanner scanner) {
        System.out.println("📱 hub telefônico aberto.");
        System.out.print("Digite o número para ligar: ");
        String numero = scanner.nextLine();
        telefone.ligar(numero);
        System.out.print("Atender chamada? (sim/não): ");
        if (scanner.nextLine().equalsIgnoreCase("sim")) {
            telefone.atender();
        }
    }

    private void abrirPortalNavegador(Scanner scanner) {
        System.out.println("🌍 hub navegador ativo.");
        System.out.print("Digite a URL: ");
        String url = scanner.nextLine();
        navegador.exibirPagina(url);
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}