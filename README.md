## Documentação do Projeto iPhone

### Descrição
Este projeto implementa um modelo simplificado de um iPhone com três funcionalidades principais: Reprodutor Musical, Aparelho Telefônico e Navegador na Internet. As funcionalidades são representadas por interfaces que são implementadas na classe iPhone. O projeto demonstra conceitos de programação orientada a objetos em Java.

### Estrutura do Projeto
O projeto é composto pelas seguintes partes:

### Interfaces

- ReprodutorMusical: Define os métodos para tocar e parar músicas.
- AparelhoTelefonico: Define os métodos para fazer e receber ligações.
- NavegadorInternet: Define o método para navegar na internet.
### Classe iPhone

- Implementa as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet.
- Possui atributos para armazenar o número de telefone e a música atualmente reproduzida.

### Funcionalidades

- tocarMusica(String musica): Inicia a reprodução de uma música especificada.
- pararMusica(): Para a reprodução da música em andamento, se houver.

pararMusica(): Para a reprodução da música em andamento, se houver.
### Aparelho Telefônico
- fazerLigacao(String numero): Inicia uma ligação para o número especificado.
- receberLigacao(): Simula o recebimento de uma ligação.

### Navegador na Internet
- navegarInternet(String url): Abre o navegador na internet e acessa a URL especificada.

### Exemplo de Uso
``` java 
public class Main {
    public static void main(String[] args) {
        iPhone meuiPhone = new iPhone("123-456-7890");

        meuiPhone.tocarMusica("Música 1");
        meuiPhone.fazerLigacao("987-654-3210");
        meuiPhone.navegarInternet("https://www.example.com");
        meuiPhone.pararMusica();
        meuiPhone.receberLigacao();
    }
}
```
### Considerações Finais
Este projeto demonstra a implementação de um iPhone simplificado com funcionalidades básicas. Ele ilustra os princípios da programação orientada a objetos, incluindo interfaces, classes e herança. É um exemplo educacional e pode ser expandido com mais funcionalidades e recursos em projetos futuros.




