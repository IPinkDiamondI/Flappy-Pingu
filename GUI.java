import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    JButton Play;

    GUI() {
        setTitle("FlappyPingu");
        setSize(400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        Play = new JButton("Play");
        Play.setBounds(150, 100, 80, 40);

        add(Play);

        Play.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                new Play().setVisible(true);
            }
        });


    }

}
