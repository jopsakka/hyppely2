package hyppely.pelitilat;

import hyppely.pelitilat.PeliTila;
import hyppely.pelitilat.Menu;
import java.awt.Graphics;
import java.util.Stack;


public class PeliTilaHallinta {
    
    public Stack<PeliTila> tilat;
    
    public PeliTilaHallinta() {
        tilat = new Stack<PeliTila>();
        tilat.push(new Menu(this));
    }
    public void tick() {
        tilat.peek().tick();
    }
    public void draw(Graphics g) {
        tilat.peek().draw(g);
    }
    
    public void keyPressed(int k) {
        tilat.peek().keyPressed(k);
    }
    
    public void KeyReleased(int k) {
        tilat.peek().keyReleased(k);
    }
}
