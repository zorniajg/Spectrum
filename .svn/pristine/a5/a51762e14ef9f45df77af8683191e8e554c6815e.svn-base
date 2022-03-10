import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The visual layout of the Neutral Munsell colors.
 * 
 * @author Kelly Ortega, Alex Tran
 * 
 * @version 28 October, 2019: created to display the neutral Munsell colors. Tweaked image to look
 *          nicer. Moved to GUI since it's a panel.
 * 
 *          **Notice: Depreceated as of Sprint 2.**
 *
 */
public class NNotation extends JPanel
{

    private static final long serialVersionUID = 1L;

    /**
     * creates the N notation panel.
     * 
     * @throws MalformedURLException
     *             in case the URL breaks.
     * @throws IOException
     *             in case it can't read the file.
     */
    public NNotation() throws MalformedURLException, IOException
    {
        BufferedImage img = ImageIO.read( new URL( "https://i.imgur.com/1lFNSUM.png" ) );
        ImageIcon icon = new ImageIcon( img );
        this.setLayout( new FlowLayout() );
        this.setSize( 1000, 500 );
        JLabel lbl = new JLabel();
        lbl.setIcon( icon );
        this.add( lbl );
        this.setVisible( true );
    }

    // public static void main(String args[]) throws MalformedURLException, IOException
    // {
    // new NNotation();
    // }
}
