package GrupMusica;

public class Percussio extends Instrument{
    static{
        System.out.println("la classe percussió està carregant");
    }
    public Percussio(String name, int price) {
        super(name, price);
    }
    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de percussió");
    }

}

