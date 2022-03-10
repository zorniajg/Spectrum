import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Robot;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * Panel for users to upload a picture, then select a color on the picture to get its Munsell color
 * equivalent.
 * 
 * @author Mateo Price-Aguirre
 * @version 18 November, 2019: Created.
 */
public class PixelSelect extends JFrame
{

    private static final long serialVersionUID = 1L;
    private int mouseX, mouseY; // mouse position when clicked
    private Color color; // current color clicked
    private JLabel colorInfo; // info on current color
    private JFrame showCurrent; // window showing current color
    private MunsellColorModel mColor; // current color (Munsell)
    private JFileChooser fileChooser;
    private ImageIcon icon; // current icon
    private JLabel jlbl;

    /**
     * Sets up the pixelselect panel.
     * 
     * @throws IOException
     *             in case it can't read a file.
     */
    public PixelSelect() throws IOException
    {

        // setup
        this.setLayout( new BorderLayout() );
        this.setBounds( 0, 0, 1000, 1000 );

        jlbl = new JLabel();
        ImageIcon icon = new ImageIcon( "blueTestPixelSelect.jpg" );
        setIcon( icon );
        jlbl.setHorizontalAlignment( JLabel.CENTER );
        jlbl.setVerticalAlignment( JLabel.CENTER );
        this.add( jlbl );

        // button for selecting the picture.
        JButton openFile = new JButton( "Open File" );
        this.add( openFile, BorderLayout.SOUTH );
        openFile.setPreferredSize( new Dimension( 40, 40 ) );

        this.setVisible( true );
        this.addMouseListener( new ColorSelectionListener() );

        colorInfo = new JLabel( "Color: " );
        this.add( colorInfo, JLabel.NORTH ); // sets up the color label
        colorInfo.setVerticalAlignment( JLabel.NORTH );
        colorInfo.setHorizontalAlignment( JLabel.CENTER );

        showCurrent = new JFrame( "Current Color" );
        showCurrent.setBounds( 0, 0, 300, 300 );
        showCurrent.setVisible( false );

        fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory( new File( System.getProperty( "user.home" ) ) );
        openFile.addActionListener( new FileOpenerListener() );
        FileNameExtensionFilter filter = new FileNameExtensionFilter( "Images", "jpg", "jpeg",
            "png" );
        fileChooser.setFileFilter( filter );
    }

    /**
     * sets the icon.
     * 
     * @param i
     *            the icon to set.
     */
    public void setIcon( ImageIcon i )
    {
        // resizes
        while ( i.getIconHeight() > 600 || i.getIconWidth() > 600 )
        {
            Image image = i.getImage();
            Image newImage = image.getScaledInstance( i.getIconHeight() / 2, i.getIconWidth() / 2,
                java.awt.Image.SCALE_SMOOTH );
            i = new ImageIcon( newImage );
        }
        icon = i;
        jlbl.setIcon( i );

    }

    /**
     * lets user open the file chooser by clicking on the button. (Renamed it for clarity- Kelly)
     * 
     * @throws IOException
     *             in case it can't read a file.
     */
    public void openFileSelector() throws IOException
    {
        if ( fileChooser.showOpenDialog( this ) == JFileChooser.APPROVE_OPTION )
        {
            File selectedFile = fileChooser.getSelectedFile();
            icon = new ImageIcon( ImageIO.read( selectedFile ) );
            setIcon( icon );
        }
    }

    /**
     * Opens new window containing current color.
     */
    public void openNewWindow()
    {

        JPanel panel = new JPanel();
        panel.setBackground( color );
        showCurrent.add( panel );
        showCurrent.setVisible( true );
    }

    /**
     * sets the color info.
     */
    public void setColorInfo()
    {
        colorInfo.setText( "Color: " + mColor.toString() );
        this.setBackground( color );
        openNewWindow();
    }

    /**
     * sets the Munsell color.
     * 
     * @param m
     *            the Munsell Color to set.
     */
    public void setMColor( MunsellColorModel m )
    {
        mColor = m;
    }

    /**
     * sets the mouse's X position.
     * 
     * @param x
     *            the X-value
     */
    public void setMouseX( int x )
    {
        mouseX = x;
    }

    /**
     * sets the mouse's Y-Position.
     * 
     * @param y
     *            the y-value
     */
    public void setMouseY( int y )
    {
        mouseY = y;
    }

    /**
     * gets the mouse's X-Position.
     * 
     * @return the mouse's x-value
     */
    public int getMouseX()
    {
        return mouseX;
    }

    /**
     * gets the mouse's Y-Position.
     * 
     * @return the mouse's Y-value.
     */
    public int getMouseY()
    {
        return mouseY;
    }

    /**
     * gets the color of the last clicked pixel
     * 
     * @param x
     *            the x-value
     * @param y
     *            the y-value
     * @throws AWTException
     *             in case the position can't be read.
     */
    public void getPixelColorRGB( int x, int y ) throws AWTException
    {
        Robot rb = new Robot();
        setColor( rb.getPixelColor( x, y ) );
    }

    /**
     * sets the color.
     * 
     * @param pixelColor
     *            the color to set.
     */
    public void setColor( Color pixelColor )
    {
        color = pixelColor;
    }

    /**
     * gets the munsell color equivalent of the last clicked pixel color
     * 
     * @throws IOException
     *             in case a file can't be read.
     */
    public void getMunsellFromPixel() throws IOException
    {
        setMColor( new MunsellColorModel( Utilities.RGBToMunsell( color.getRed(), color.getGreen(),
            color.getBlue(), Utilities.openMunsell2RGB( "RGB2Munsell.csv" ) ) ) );
    }

    /**
     * main for testing purposes
     * 
     * @param args
     *            commandline args
     * @throws IOException
     *             in case a file cant be read
     */
    public static void main( String[] args ) throws IOException
    {
        new PixelSelect();
    }

    /**
     * The listener for the file opener button.
     * 
     * @author Mateo Price-Aguirre
     * @version 18 November, 2019: Created Kelly Ortega: Renamed for clarity
     */
    private class FileOpenerListener implements ActionListener
    {

        @Override
        public void actionPerformed( ActionEvent e )
        {
            try
            {
                openFileSelector();
            } catch ( IOException e1 )
            {
                e1.printStackTrace();
            }
        }
    }

    /**
     * The listener for the mouse, and for color selection.
     * 
     * @author Mateo Price-Aguirre
     * @version 18 November, 2019: Created Kelly Ortega: Renamed for clarity
     */
    private class ColorSelectionListener implements MouseListener
    {

        /**
         * when a user clicks, gets the color they clicked, and converts it to a Munsell color.
         */
        @Override
        public void mousePressed( MouseEvent e )
        {
            setMouseX( e.getX() );
            setMouseY( e.getY() );
            try
            {
                getPixelColorRGB( e.getX(), e.getY() );
            } catch ( AWTException e1 )
            {
                e1.printStackTrace();
            }
            try
            {
                getMunsellFromPixel();
            } catch ( IOException e1 )
            {
                e1.printStackTrace();
            }
            if ( mColor != null )
            {
                setColorInfo();
            }
        }

        // Unused Inherited Methods
        public void mouseClicked( MouseEvent e )
        {
        }

        public void mouseReleased( MouseEvent e )
        {
        }

        public void mouseEntered( MouseEvent e )
        {
        }

        public void mouseExited( MouseEvent e )
        {
        }
    }
}
