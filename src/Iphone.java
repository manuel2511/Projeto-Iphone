public class Iphone {
    public static void main(String[] args) throws Exception {
        MobilePhone phone = new MobilePhone();
        phone.ligar("123456789");
        phone.atender();
        phone.correioDeVoz();

        System.out.println("");
        PlayerMusic player = new PlayerMusic();
        player.tocar();
        player.pausar();
        player.selecionarMusica();

        System.out.println("");
        InternetCommunicat browser = new InternetCommunicat();
        browser.exibirUrl("url");
        browser.adicionarUrl("url");
        browser.carregarUrl("url");
    }
}  
