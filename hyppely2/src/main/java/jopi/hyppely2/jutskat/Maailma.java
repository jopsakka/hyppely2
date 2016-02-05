
package hyppely.jutskat;

import hyppely.main.PeliPaneeli;
import java.awt.Graphics;


public class Maailma {
    private int maaLinjaY;
    
    public Maailma(int maaLinjaY) {
        this.maaLinjaY = maaLinjaY;
    }
    public void tick() {
        
    }
    public void draw(Graphics g) {
        g.drawLine(0, maaLinjaY, PeliPaneeli.WIDTH, maaLinjaY);
    }
}
