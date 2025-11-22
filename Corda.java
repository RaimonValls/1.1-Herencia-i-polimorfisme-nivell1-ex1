package GrupMusica;

public class Corda extends Instrument{
    static{
        System.out.println("La classe corda està carregant");
    }
    public Corda(String name, int price) {
        super(name, price);
    }
    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de corda");

    }

}
