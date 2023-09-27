import model.iPhone;

public class  App{
    public static void main(String[] args) throws Exception {
        iPhone meuIphone = new iPhone("123-456-7890");

        meuIphone.tocarMusica("Música 1");
        meuIphone.fazerLigacao("987-654-3210");
        meuIphone.navegarInternet("https://www.example.com");
        meuIphone.pararMusica();
        meuIphone.receberLigacao();
    }
}
