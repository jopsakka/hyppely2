


package hyppely.jutskat;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import hyppely.main.PeliPaneeli;


public class Pelaaja{
    private static final long serialVersionUID = 1L;
    
    private boolean oikea = false, vasen = false, ylos = false, alas = false, space = false;
    
    private int width, height;
    
    private float x, y;
    private float xSpeed, ySpeed, maxSpeed, maxAcceleration;
    
    private int alotusY;
    
    private float acceleration;
    private float kitka;
    
    public Pelaaja(int width, int height) {
        x = PeliPaneeli.WIDTH / 2;
        y = 400 - height - 1;
        xSpeed = 0;
        ySpeed = 0;
        maxSpeed = 30;
        alotusY = 400 - height - 1;
        kitka = (float) 0.1;
        acceleration = (float) 1.5;
        this.width = width;
        this.height = height;
    }
    
    public void tick() {
        System.out.println(xSpeed);
        if (vasen) {
            liikuVasemmalle();
        } else if (oikea) {
            liikuOikealle();
        }
        if (space) {
            hyppaa();
        }
        painoVoima();
        laitaKitka();
        paivitaX();
        paivitaY();
        poisMaanSisalta();
    }
    public void hyppaa() {
        if (y < (400 - height - 20)) {
            
        } else {
            ySpeed -= acceleration * 2;
        }
    }
    
    public void liikuVasemmalle() {
        xSpeed -= acceleration;
    }
    
    public void liikuOikealle() {
        xSpeed += acceleration;
    }
    
    public void painoVoima() {
        ySpeed += 0.5;
    }
    
    public void poisMaanSisalta() {
        if (y > alotusY) {
            y = alotusY;
            ySpeed = (ySpeed * (-1))/2;
        }
    }
    
    public void paivitaX() {
        x += xSpeed;
    }
    
    public void paivitaY() {
        y += ySpeed;
    }
    
    public void laitaKitka() {
        if (Math.abs(xSpeed) < 0.01) {
                xSpeed = 0;
        } else {
            xSpeed = xSpeed - (xSpeed * kitka);   
        }   
    }
    
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(Math.round(x), Math.round(y), width, height);
        //g.fillRect(Math.round(x), Math.round(y), width, height);
    }
    
    public void keyPressed(int k) {
        if (k == KeyEvent.VK_LEFT) {
            vasen = true;
        }
        if (k == KeyEvent.VK_RIGHT) {
            oikea = true;
        }
        if (k == KeyEvent.VK_UP) {
            ylos = true;
        }   
        if (k == KeyEvent.VK_DOWN) {
            alas = true;
        }
        if (k == KeyEvent.VK_SPACE) {
            space = true;
        }
    }
    
    public void keyReleased(int k) {
        if (k == KeyEvent.VK_LEFT) {
            vasen = false;
        }
        if (k == KeyEvent.VK_RIGHT) {
            oikea = false;
        }
        if (k == KeyEvent.VK_UP) {
            ylos = false;
        }   
        if (k == KeyEvent.VK_DOWN) {
            alas = false;
        }
        if (k == KeyEvent.VK_SPACE) {
            space = false;
        }
    }
    public int getX() {
        return Math.round(x);
    }
    public int getY() {
        return Math.round(y);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    
   
}