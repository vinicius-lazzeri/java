public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.mudarCanal(22);
        System.out.println("Canal: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status → TV Ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status → TV Ligada? " + smartTv.ligada);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();

        System.out.println("Canal atual: " + smartTv.canal);
    }
}
