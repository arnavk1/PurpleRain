import java.awt.Color;
import java.util.Random;

public class Drop {
    private int xpos;
    private int ypos;
    private int xSpeed;
    private int ySpeed;
    private int thick;
    private int length;
    private int width_of_rain;
    private int height_of_rain;
    
    public Drop(int width_of_rain, int height_of_rain){
        this.width_of_rain = width_of_rain;
        this.height_of_rain = height_of_rain;
        Random rand = new Random();
        this.xpos = rand.nextInt(this.width_of_rain);
        this.ypos = rand.nextInt(450) - 500;
        this.ySpeed = rand.nextInt(4) + 2;
        this.xSpeed = 0;
        this.thick = rand.nextInt(4) + 1;
        this.length = rand.nextInt(9) + 5;
    }
    public void fall(java.awt.Graphics g){
        this.ySpeed += 0.05;
        this.ypos += this.ySpeed;
        this.xpos += this.xSpeed;
        if(this.ypos > this.height_of_rain){
            Random rand = new Random();
            this.xpos = rand.nextInt(this.width_of_rain);
            this.ypos = rand.nextInt(450) - 500;
            this.ySpeed = rand.nextInt(4) + 2;
            this.xSpeed = 0;
            this.thick = rand.nextInt(4) + 1;
            this.length = rand.nextInt(9) + 5;
        }
        g.setColor(new java.awt.Color(138, 43, 255));
        g.fillRect(this.xpos, this.ypos, this.thick, this.length);
    }
}