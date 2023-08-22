public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada :" + smartTv.ligada);
        System.out.println("canal atual :" + smartTv.canal);
        System.out.println("volume atual :" + smartTv.volume);

        smartTv.mudarCanal(13);
        System.out.println("canal atual :" + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("volume atual :" + smartTv.volume);

        smartTv.ligar();

        System.out.println("Novo status: Tv ligada :" + smartTv.ligada);

        smartTv.desligar();

        System.out.println("Novo status: Tv ligada :" + smartTv.ligada);
    }
}
