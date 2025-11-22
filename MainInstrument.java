package GrupMusica;

public class MainInstrument {
    public static void main(String[] args) {
        Corda c1 = new Corda("guitarra", 56);
        c1.tocar();
        Percussio p1 = new Percussio("tambor", 32);
        p1.tocar();
        Vent v1 = new Vent("trompeta", 63);
        v1.tocar();
       System.out.println(c1);
       System.out.println(p1);
       System.out.println(v1);
        }


    }
