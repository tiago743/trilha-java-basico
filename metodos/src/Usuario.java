public class Usuario {
    public static void main(String[] args) throws Exception {

    SmartTV smartTv = new SmartTV();

    System.out.println("tv ligada? " + smartTv.ligada);
    System.out.println("canal: " + smartTv.canal);
    System.out.println("volume: " + smartTv.volume);            

    smartTv.ligar();
    smartTv.diminuirVolume();
    System.out.println("tv ligada? " + smartTv.ligada);
    System.out.println("volume " + smartTv.volume);

    smartTv.mudarCanal(13);

    }
}
