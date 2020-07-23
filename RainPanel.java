import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics;
import java.awt.event.*;

public class RainPanel extends JPanel implements ActionListener{
    Timer tm = new Timer(10, this);
    Drop[] d = null;
    int drop_num = 200;

    public RainPanel(){
        d = new Drop[this.drop_num];
        for(int i = 0; i < d.length; i++){
            d[i] = new Drop(2000,800);
        }
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for(int i = 0; i < d.length; i++){
            d[i].fall(g);
        }
        tm.start();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        this.repaint();
    }
    public static void main(String[] args) {
        RainPanel r = new RainPanel();
        JFrame jf = new JFrame();
        jf.setSize(2000,800);
        jf.add(r);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }   

}