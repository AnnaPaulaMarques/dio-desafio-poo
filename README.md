# iSoul - Assistente Virtual Integrado ao iPhone 2007 (Desafio POO DIO)

## Descrição

Projeto desenvolvido para o desafio de Programação Orientada a Objetos da plataforma DIO, que consiste na modelagem e implementação em Java das funcionalidades básicas do iPhone: Reprodutor Musical, Aparelho Telefônico e Navegador de Internet. 

O diferencial deste projeto é a integração dessas funcionalidades por meio de um assistente virtual que simula um ambiente de múltiplos portais, facilitando a interação do usuário via console.

## Funcionalidades

- **Reprodutor Musical**  
  - `tocar()`, `pausar()`, `selecionarMusica(String musica)`

- **Aparelho Telefônico**  
  - `ligar(String numero)`, `atender()`, `iniciarCorreioVoz()`

- **Navegador de Internet**  
  - `exibirPagina(String url)`, `adicionarNovaAba()`, `atualizarPagina()`

- **Assistente Virtual iSoul**  
  - Interface textual para navegar entre portais  
  - Tratamento de comandos robusto e modular  
  - Validação e feedback amigável ao usuário  

## Arquitetura do Projeto

iSoul/
├── src/
│ ├── main/
│ │ ├── assistant/ # Lógica do assistente e interpretação de comandos
│ │ ├── model/ # Definição das interfaces
│ │ ├── service/ # Implementações concretas das funcionalidades
│ │ └── util/ # Constantes e utilitários
│ └── Main.java # Ponto de entrada da aplicação
└── README.md # Documentação

## Tecnologias Utilizadas

- Java 17+  
- Estrutura modular orientada a interfaces e implementações  
- Entrada e saída via console para interação com o usuário


Melhorias e Considerações Finais
Implementação modular com foco em extensibilidade e manutenção

Tratamento de exceções e validações aprimorados para maior robustez

Design claro e coerente com princípios de POO e Clean Architecture

Possibilidade de expansão para interface gráfica ou integração com APIs de áudio e voz

Autor: Anna Paula Marques
Desafio: DIO - Trilha Java Básico - POO


## Referências
- Vídeo lançamento iPhone 2007: [YouTube - Steve Jobs](https://www.youtube.com/watch?v=9hUIxyE2Ns8)
- Repositório DIO: https://github.com/glysns/trilha-java-basico