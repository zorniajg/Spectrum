import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 * Provides a given part of the Munsell color space. A quick google search shows that all colors go
 * from 0-10 to account for black to white so that seems like a good starting point. This should be
 * adaptable for all colors implemented in the future.
 * 
 * @author Kelly Ortega
 * 
 * @version 28 October, 2019: Implemented black-to-white column, as well as 11 expandable rows.
 * @version 4 November, 2019: did some FAT refactoring and fixed the last button filling the panel
 * @version 18 November, 2019: cleaned up formatting, code coverage, checkstyle, commented a lot,
 *          etc
 *
 */
public class ColorPanel extends JPanel
{

    private static final long serialVersionUID = 1L;
    private ArrayList< ArrayList< MunsellColorModel > > colorList;
    private JLabel currColorInfo;
    private MunsellColorModel currColor, previousColor;
    private ColorBuilder builder;
    public JPanel center;
    public JPanel north;

    /**
     * Default constructor: initialized to 5.0R.
     * 
     * @throws IOException
     *             in case it can't read a file
     */
    public ColorPanel() throws IOException
    {
        colorList = new ArrayList< ArrayList< MunsellColorModel > >();
        builder = new ColorBuilder( colorList, "R", 5 ); // default color panel
        builder.equals( builder ); // for clearing the "builder not used" warning

        createPanel();
    }

    /**
     * For specifying a color space.
     * 
     * @param hueString
     *            the String value of the hue.
     * @param hueValue
     *            the double value of the hue.
     * @throws IOException
     *             in case it can't read a file.
     */
    public ColorPanel( String hueString, double hueValue ) throws IOException
    {
        colorList = new ArrayList< ArrayList< MunsellColorModel > >();
        builder = new ColorBuilder( colorList, hueString, hueValue ); // default color panel

        createPanel();
    }

    /**
     * Sets up the color selector panel.
     * 
     * @throws IOException
     *             in case it can't read a file.
     */
    public void createPanel() throws IOException
    {
        // First, create the panel. Null so things don't resize themselves.
        center = new JPanel();
        center.setLayout( null );
        this.setLayout( new BorderLayout() );
        this.setBounds( 0, 0, 1000, 1000 );

        // Then, traverse the arraylist of arraylists built by the color builder, and use
        // their contents to create and color buttons that represent the specified color space.
        for ( int i = 0; i < colorList.size(); i++ )
        { // i = vertical, traverses value
            for ( int j = 0; j < colorList.get( i ).size(); j++ )
            { // j = horizontal, traverses chroma
                JButton colorSquare = new JButton(); // it's a button for selecting purposes
                colorSquare.setBounds( 55 * j, 55 * i, 55, 55 ); // x pos, y pos, width, height
                int[] rgb = Utilities.MunsellToRGB( colorList.get( i ).get( j ),
                    Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
                Color color = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] ); // make the color
                colorSquare.setBackground( color ); // set the color
                colorSquare.setOpaque( true );
                colorSquare.setBorderPainted( colorSquare.hasFocus() );
                colorOptions( colorSquare, colorList.get( i ).get( j ) );

                north = new JPanel(); // panel for color info

                currColorInfo = new JLabel( "Color: " );
                north.add( currColorInfo ); // sets up the color label
                center.add( colorSquare );
                this.add( north, BorderLayout.NORTH );// finally, put them in
                this.add( center, BorderLayout.CENTER );
            }
        }
        this.setVisible( true );
    }

    /**
     * sets up listeners to each button in the color space so that when selected, the Munsell color
     * is displayed at the top. Also sets color values for the mixer.
     * 
     * @param button
     *            the button selected
     * @param color
     *            the Munsell color of the button.
     */
    private void colorOptions( JButton button, MunsellColorModel color )
    {
        button.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                button.setBorder(
                    new LineBorder( Math.random() < 0.5 ? Color.BLACK : Color.BLUE, 3 ) );
                previousColor = currColor;
                currColor = color;
                currColorInfo.setText( "Color: " + currColor.toString() );
            }
        } );

        button.addMouseListener( new MouseListener()
        {
            @Override
            public void mouseClicked( MouseEvent e )
            {

                if ( e.getButton() == 1 )
                { // left click
                    GUI.colorOne = color;
                }
                if ( e.getButton() == 3 )
                { // right click
                    GUI.colorTwo = color;
                }
            }

            public void mousePressed( MouseEvent e )
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
        } );
    }

    /**
     * Returns the color of the button currently selected.
     * 
     * @return the color of the button currently selected.
     */
    public MunsellColorModel getCurrentColor()
    {
        return currColor;
    }

    public MunsellColorModel getPreviousColor()
    {
        return previousColor;
    }
}
