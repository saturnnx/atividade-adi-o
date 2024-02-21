package atividade2caroni;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import javax.swing.ImageIcon;

class LabelFrame extends JFrame{
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    
    public LabelFrame(){
        super("Testing JLabel");
        setLayout(new FlowLayout());
        
        label1 = new JLabel("INSTITUTO FEDERAL"); //Label with text
        label1.setToolTipText("INSTITUTO FEDERAL");
        add(label1);
        
        Icon bug = new ImageIcon(getClass().getResource("bug.png"));
        label2 = new JLabel(" DE EDUCAÇÃO, ",bug,SwingConstants.LEFT);//Label with text and icon
        label2.setToolTipText(" DE EDUCAÇÃO, ");
        add(label2);
        
        label3 = new JLabel();
        label3.setText("CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setToolTipText("CIÊNCIA E TECNOLOGIA DE MATO GROSSO");
        add(label3);
    }
}


