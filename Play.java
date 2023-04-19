import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Image;
import javax.swing.ImageIcon;


public class Play extends JFrame{

    Play(){
        setTitle("Flappy Pingu");
        setSize(1080,800);
        setLayout(null);
        setLocationRelativeTo(null);

        JLabel Background;
        ImageIcon icon = new ImageIcon("Background.png");
        Background = new JLabel("",img,JLabel.CENTER);
        Background.setBounds(0,0,1080,800);
        add(Backgrounds);

    }
}
