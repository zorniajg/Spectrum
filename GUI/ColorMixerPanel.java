import java.awt.Color;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * the GUI interface for ColorMixer.
 * 
 * @author Kelly Ortega
 * @version 4 December, 2019: Created as the GUI counterpart for color mixer.
 */
public class ColorMixerPanel extends JPanel
{

    private static final long serialVersionUID = 1L;

    private JPanel colorOne;
    private JPanel colorTwo;
    private JPanel mixedColor;
    private JLabel labelOne;
    private JLabel labelTwo;
    private JLabel labelMixed;

    private JTextArea instructions;

    public ColorMixerPanel( MunsellColorModel mixingColorOne, MunsellColorModel mixingColorTwo )
        throws IOException
    {
        int[] colors;
        initialize();

        this.setLayout( null );
        this.setBounds( 0, 0, 450, 450 );

        colors = Utilities.MunsellToRGB( mixingColorOne,
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        colorOne.setBackground( new Color( colors[ 0 ], colors[ 1 ], colors[ 2 ] ) );
        colorOne.setBounds( 50, 200, 50, 50 );
        labelOne.setBounds( 40, 250, 100, 50 );
        labelOne.setText( mixingColorOne.toString() );

        colors = Utilities.MunsellToRGB( mixingColorTwo,
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        colorTwo.setBackground( new Color( colors[ 0 ], colors[ 1 ], colors[ 2 ] ) );
        colorTwo.setBounds( 335, 200, 50, 50 );
        labelTwo.setBounds( 325, 250, 100, 50 );
        labelTwo.setText( mixingColorTwo.toString() );

        colors = Utilities.MunsellToRGB( ColorMix.twoColorMix( mixingColorOne, mixingColorTwo ),
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        mixedColor.setBackground( new Color( colors[ 0 ], colors[ 1 ], colors[ 2 ] ) );
        mixedColor.setBounds( 190, 350, 50, 50 );
        labelMixed.setBounds( 175, 400, 100, 50 );
        labelMixed.setText( ColorMix.twoColorMix( mixingColorOne, mixingColorTwo ).toString() );

        instructions.setText( "Left-click on a color on the main" + "\n" + "Color Panel to select "
            + "one color," + "\n" + "right-click to select a second, and " + "\n"
            + "select \"Mix\" to send them to this panel." );
        instructions.setBounds( 100, 25, 250, 150 );

        this.add( colorOne );
        this.add( labelOne );
        this.add( colorTwo );
        this.add( labelTwo );
        this.add( mixedColor );
        this.add( labelMixed );
        this.add( instructions );

        this.setVisible( true );
    }

    private void initialize()
    {
        colorOne = new JPanel();
        colorTwo = new JPanel();
        mixedColor = new JPanel();

        labelOne = new JLabel();
        labelTwo = new JLabel();
        labelMixed = new JLabel();

        instructions = new JTextArea();
    }
}
