/*
 * |----------------JMat (Java Master)-------------------------------------|
 * |Setiap Manusia Yang Menata Hidupnya adalah Programmer                  |
 * |Hak Cipta Hanya Milik Allah SWT, Hamba-Nya Hanya Memanfaatkan.         |
 * |Manusia Tidak Bisa Mewujudkan Apa-apa, Manusia Hanya Bisa Merencanakan.| 
 * |----------------JMat (Java Master)-------------------------------------| 
 */
package san.jmat.panel.render;

import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author joker
 */
public class PanelRoger extends JPanel{
    private Image image;
    
    public PanelRoger() {
        setOpaque(false);
        image=new ImageIcon(getClass().getResource("/san/jmat/gambar/roger.jpg")).getImage();
    }
     @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D create = (Graphics2D) g.create();
         create.setComposite(AlphaComposite.SrcOver.derive(0.7f));
        create.drawImage(image, 0, 0,getWidth(),getHeight(), null);
        create.dispose();
    }
    
}
