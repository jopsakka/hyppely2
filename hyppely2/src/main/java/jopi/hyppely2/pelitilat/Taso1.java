package hyppely.pelitilat;

import java.awt.Graphics;
import hyppely.jutskat.Este;
import hyppely.jutskat.Maailma;
import hyppely.jutskat.Pelaaja;
import hyppely.jutskat.Tormays;


public class Taso1 extends PeliTila{
    
    private Pelaaja pelaaja;
    private Maailma maailma;
    

    public Taso1(PeliTilaHallinta pth) {
        super(pth);
    }

    
    public void init() {
        pelaaja = new Pelaaja(30, 80);
        maailma = new Maailma(400);
    }

    
    public void tick() {
        pelaaja.tick();
        maailma.tick();
    }

    
    public void draw(Graphics g) {
        pelaaja.draw(g);
        maailma.draw(g);
    }

    
    public void keyPressed(int k) {
        pelaaja.keyPressed(k);
    }

    
    public void keyReleased(int k) {
        pelaaja.keyReleased(k);
    }
    
}