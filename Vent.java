package GrupMusica;

public class Vent extends Instrument{
    static{
        System.out.println("La classe vent està carregant");
    }

    public Vent(String name, int price) {
        super(name, price);
    }
    @Override
    public void tocar(){
        System.out.println("Està sonant un instrument de vent");


    }


}
