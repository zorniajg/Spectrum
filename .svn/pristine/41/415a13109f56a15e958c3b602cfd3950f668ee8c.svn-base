import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * The main program GUI. (attempted to) Rename for clarity. (but it didn't like it when i tried to
 * commit with the new name).
 * 
 * @author Kelly Ortega, Alex Tran, Ben Girardi, Jacob Zorniak, Mateo Price-Aguirre
 * 
 * @version 28 October, 2019: created to display the Spectrum features.
 *
 */
public class GUI extends JFrame
{

    private static final long serialVersionUID = 1L;

    private static ColorPanel p1;
    private static JPanel p2;
    private static ColorTests p3;
    private static ColorMixerPanel p4;
    private static SettingsPanel p5;
    public static MunsellColorModel colorOne;
    public static MunsellColorModel colorTwo;
    private static JPanel mixerPanel;
    private static JPanel nullPanel;
    public static Color colorTestTheme;

    /**
     * initializes the program.
     * 
     * @param args
     *            commandline args.
     * @throws IOException
     *             in case it can't read a file.
     * @throws MalformedURLException
     *             in case it can't read the URL.
     */
    public static void main( String args[] ) throws MalformedURLException, IOException
    {
        JFrame frame = new JFrame( "Spectrum" );
        frame.setLayout( new BorderLayout() );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        JTabbedPane tabbedPane = new JTabbedPane();

        p1 = new ColorPanel();
        colorTestTheme = p1.getBackground();

        p2 = new JPanel();
        p2.setLayout( new GridBagLayout() );
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 5;
        c.gridy = 5;
        JButton pixelSelect = new JButton( "Open Pixel Select" );
        pixelSelect.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                try
                {
                    new PixelSelect();
                } catch ( IOException e1 )
                {
                    e1.printStackTrace();
                }
            }
        } );
        p2.add( pixelSelect, c );

        p3 = new ColorTests();
        mixerPanel = new JPanel( null );
        p4 = new ColorMixerPanel( new MunsellColorModel( "R", 5, 5, 4 ),
            new MunsellColorModel( "B", 5, 5, 4 ) ); // initialization
        mixerPanel.add( p4 );
        nullPanel = new JPanel();
        p5 = new SettingsPanel();
        nullPanel.setLayout( null );
        nullPanel.add( p1 );

        JPanel south = new JPanel();
        JPanel east = new JPanel();

        east.setLayout( new GridBagLayout() );

        String[] hueValues = { "2.5", "5.0", "7.5", "10.0" };
        JComboBox< String > hueValue = new JComboBox< String >( hueValues );
        hueValue.setSelectedIndex( 1 );
        c.gridx = 0;
        c.gridy = 0;
        east.add( hueValue, c );
        String[] hueStrings = { "R", "YR", "Y", "GY", "G", "BG", "B", "PB", "P", "RP" };
        JComboBox< String > hueString = new JComboBox< String >( hueStrings );
        c.gridx = 1;
        c.gridy = 0;
        east.add( hueString, c );
        JButton go = new JButton( "Go" );
        c.gridx = 2;
        c.gridy = 0;
        east.add( go, c );

        go.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                String hueText = ( String ) hueString.getSelectedItem();
                double hueDouble = Double.parseDouble( ( String ) hueValue.getSelectedItem() );

                try
                {
                    nullPanel.remove( p1 );
                    p1 = new ColorPanel( hueText, hueDouble );
                    nullPanel.add( p1 );
                    nullPanel.revalidate();
                    nullPanel.repaint();
                } catch ( NumberFormatException e1 )
                {
                    e1.printStackTrace();
                } catch ( IOException e1 )
                {
                    e1.printStackTrace();
                }
            }
        } );

        JButton complementary = new JButton( "Complementary Colors" );
        complementary.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                JFrame showComplementary = new JFrame( "Complementary Color" );
                showComplementary.setBounds( 0, 0, 300, 300 );
                JPanel compPanel = new JPanel();
                int[] rgb;
                try
                {
                    rgb = Utilities.MunsellToRGB(
                        HarmoniousConversionUtilities
                            .complementaryConversion( p1.getCurrentColor() ),
                        Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );

                    if ( rgb[ 0 ] > 255 )
                    {
                        rgb[ 0 ] = 255;
                    }

                    if ( rgb[ 1 ] > 255 )
                    {
                        rgb[ 1 ] = 255;
                    }

                    if ( rgb[ 2 ] > 255 )
                    {
                        rgb[ 2 ] = 255;
                    }

                    if ( rgb[ 0 ] < 0 )
                    {
                        rgb[ 0 ] = 0;
                    }

                    if ( rgb[ 1 ] < 0 )
                    {
                        rgb[ 1 ] = 0;
                    }

                    if ( rgb[ 2 ] < 0 )
                    {
                        rgb[ 2 ] = 0;
                    }
                    Color compColor = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] );
                    compPanel.setBackground( compColor );
                    JLabel compColorInfo = new JLabel( HarmoniousConversionUtilities
                        .complementaryConversion( p1.getCurrentColor() ).toString() );
                    compPanel.add( compColorInfo );
                    showComplementary.add( compPanel );
                    showComplementary.setVisible( true );
                } catch ( IOException e1 )
                {
                    e1.printStackTrace();
                }
            }
        } );

        JButton analogous = new JButton( "Analogous Colors" );
        analogous.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                JFrame showAnalogous = new JFrame( "Analogous Colors" );
                showAnalogous.setLayout( new GridBagLayout() );
                showAnalogous.setBounds( 0, 0, 400, 300 );
                int[] rgb;
                for ( MunsellColorModel color : HarmoniousConversionUtilities
                    .analogousColors( p1.getCurrentColor() ) )
                {
                    try
                    {
                        HarmoniousConversionUtilities.roundToNearest( color );
                        rgb = Utilities.MunsellToRGB( color,
                            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );

                        if ( rgb[ 0 ] > 255 )
                        {
                            rgb[ 0 ] = 255;
                        }

                        if ( rgb[ 1 ] > 255 )
                        {
                            rgb[ 1 ] = 255;
                        }

                        if ( rgb[ 2 ] > 255 )
                        {
                            rgb[ 2 ] = 255;
                        }

                        if ( rgb[ 0 ] < 0 )
                        {
                            rgb[ 0 ] = 0;
                        }

                        if ( rgb[ 1 ] < 0 )
                        {
                            rgb[ 1 ] = 0;
                        }

                        if ( rgb[ 2 ] < 0 )
                        {
                            rgb[ 2 ] = 0;
                        }

                        Color analogousColor = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] );
                        JPanel analogousPanel = new JPanel();
                        analogousPanel.setBackground( analogousColor );
                        JLabel compColorInfo = new JLabel( color.toString() );
                        analogousPanel.add( compColorInfo );
                        showAnalogous.add( analogousPanel );
                    } catch ( IOException e1 )
                    {
                        e1.printStackTrace();
                    }
                }
                showAnalogous.setVisible( true );
            }
        } );

        JButton triad = new JButton( "Triad Colors" );
        triad.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                JFrame showTriad = new JFrame( "Triad Colors" );
                showTriad.setLayout( new GridBagLayout() );
                showTriad.setBounds( 0, 0, 500, 300 );
                int[] rgb;
                for ( MunsellColorModel color : HarmoniousConversionUtilities
                    .triadColors( p1.getCurrentColor() ) )
                {
                    try
                    {
                        HarmoniousConversionUtilities.roundToNearest( color );
                        rgb = Utilities.MunsellToRGB( color,
                            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );

                        if ( rgb[ 0 ] > 255 )
                        {
                            rgb[ 0 ] = 255;
                        }

                        if ( rgb[ 1 ] > 255 )
                        {
                            rgb[ 1 ] = 255;
                        }

                        if ( rgb[ 2 ] > 255 )
                        {
                            rgb[ 2 ] = 255;
                        }

                        if ( rgb[ 0 ] < 0 )
                        {
                            rgb[ 0 ] = 0;
                        }

                        if ( rgb[ 1 ] < 0 )
                        {
                            rgb[ 1 ] = 0;
                        }

                        if ( rgb[ 2 ] < 0 )
                        {
                            rgb[ 2 ] = 0;
                        }
                        Color triadColor = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] );
                        JPanel triadPanel = new JPanel();

                        JLabel triadColorInfo = new JLabel( HarmoniousConversionUtilities
                            .triadColors( p1.getCurrentColor() ).toString() );

                        triadPanel.setBackground( triadColor );
                        triadPanel.add( triadColorInfo );
                        showTriad.add( triadPanel );
                    } catch ( IOException e1 )
                    {
                        e1.printStackTrace();
                    }
                }
                showTriad.setVisible( true );
            }
        } );

        JButton square = new JButton( "Square Colors" );
        square.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                JFrame showSquare = new JFrame( "Square Colors" );
                showSquare.setLayout( new GridBagLayout() );
                showSquare.setBounds( 0, 0, 700, 300 );
                int[] rgb;
                for ( MunsellColorModel color : HarmoniousConversionUtilities
                    .squareColors( p1.getCurrentColor() ) )
                {
                    try
                    {
                        HarmoniousConversionUtilities.roundToNearest( color );
                        rgb = Utilities.MunsellToRGB( color,
                            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );

                        if ( rgb[ 0 ] > 255 )
                        {
                            rgb[ 0 ] = 255;
                        }

                        if ( rgb[ 1 ] > 255 )
                        {
                            rgb[ 1 ] = 255;
                        }

                        if ( rgb[ 2 ] > 255 )
                        {
                            rgb[ 2 ] = 255;
                        }

                        if ( rgb[ 0 ] < 0 )
                        {
                            rgb[ 0 ] = 0;
                        }

                        if ( rgb[ 1 ] < 0 )
                        {
                            rgb[ 1 ] = 0;
                        }

                        if ( rgb[ 2 ] < 0 )
                        {
                            rgb[ 2 ] = 0;
                        }
                        Color squareColor = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] );
                        JPanel squarePanel = new JPanel();

                        JLabel triadColorInfo = new JLabel( HarmoniousConversionUtilities
                            .triadColors( p1.getCurrentColor() ).toString() );

                        squarePanel.setBackground( squareColor );
                        squarePanel.add( triadColorInfo );
                        showSquare.add( squarePanel );
                    } catch ( IOException e1 )
                    {
                        e1.printStackTrace();
                    }
                }
                showSquare.setVisible( true );
            }
        } );

        JButton tetrad = new JButton( "Tetrad Colors" );
        tetrad.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                JFrame showSquare = new JFrame( "Tetrad Colors" );
                showSquare.setLayout( new GridBagLayout() );
                showSquare.setBounds( 0, 0, 850, 300 );
                int[] rgb;
                for ( MunsellColorModel color : HarmoniousConversionUtilities
                    .tetradColors( p1.getCurrentColor() ) )
                {
                    try
                    {
                        HarmoniousConversionUtilities.roundToNearest( color );
                        rgb = Utilities.MunsellToRGB( color,
                            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );

                        if ( rgb[ 0 ] > 255 )
                        {
                            rgb[ 0 ] = 255;
                        }

                        if ( rgb[ 1 ] > 255 )
                        {
                            rgb[ 1 ] = 255;
                        }

                        if ( rgb[ 2 ] > 255 )
                        {
                            rgb[ 2 ] = 255;
                        }

                        if ( rgb[ 0 ] < 0 )
                        {
                            rgb[ 0 ] = 0;
                        }

                        if ( rgb[ 1 ] < 0 )
                        {
                            rgb[ 1 ] = 0;
                        }

                        if ( rgb[ 2 ] < 0 )
                        {
                            rgb[ 2 ] = 0;
                        }

                        Color tetradColor = new Color( rgb[ 0 ], rgb[ 1 ], rgb[ 2 ] );
                        JPanel tetradPanel = new JPanel();

                        JLabel triadColorInfo = new JLabel( HarmoniousConversionUtilities
                            .triadColors( p1.getCurrentColor() ).toString() );

                        tetradPanel.setBackground( tetradColor );
                        tetradPanel.add( triadColorInfo );
                        showSquare.add( tetradPanel );
                    } catch ( IOException e1 )
                    {
                        e1.printStackTrace();
                    }
                }

                showSquare.setVisible( true );
            }
        } );

        JButton mixer = new JButton( "Mix" );
        mixer.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                if ( colorOne != null && colorTwo != null )
                {
                    try
                    {
                        mixerPanel.remove( p4 );
                        p4 = new ColorMixerPanel( colorOne, colorTwo );
                        mixerPanel.add( p4 );
                        mixerPanel.revalidate();
                        mixerPanel.repaint();
                    } catch ( NumberFormatException e1 )
                    {
                        e1.printStackTrace();
                    } catch ( IOException e1 )
                    {
                        e1.printStackTrace();
                    }
                }
            }
        } );

        // Tabbed Pane Listener

        tabbedPane.addChangeListener( new ChangeListener()
        {
            @Override
            public void stateChanged( ChangeEvent e )
            {
                JTabbedPane pane = ( JTabbedPane ) e.getSource();
                if ( pane.getSelectedIndex() != 0 )
                {
                    hueValue.setVisible( false );
                    hueString.setVisible( false );
                    go.setVisible( false );
                    south.setVisible( false );
                } else
                {
                    hueValue.setVisible( true );
                    hueString.setVisible( true );
                    go.setVisible( true );
                    south.setVisible( true );
                }
            }
        } );

        // JButton

        south.add( complementary );
        south.add( analogous );
        south.add( triad );
        south.add( square );
        south.add( tetrad );
        south.add( mixer );

        frame.add( south, BorderLayout.SOUTH );
        frame.add( east, BorderLayout.EAST );
        frame.add( tabbedPane );
        tabbedPane.addTab( "Color Panel", nullPanel );
        tabbedPane.addTab( "Pixel Selector", p2 );
        tabbedPane.addTab( "Color Test", p3 );
        tabbedPane.addTab( "Color Mixer", mixerPanel );
        tabbedPane.addTab( "Settings", p5 );
        frame.setSize( 1280, 800 );
        frame.setVisible( true );

    }

    public static void setTheme( Color theme )
    {
        p1.setBackground( theme );
        p2.setBackground( theme );
        p3.setBackground( theme );
        p4.setBackground( theme );
        p5.setBackground( theme );
        mixerPanel.setBackground( theme );
        nullPanel.setBackground( theme );
        p1.center.setBackground( theme );
        p1.north.setBackground( theme );
        p3.introPanel.setBackground( theme );
        colorTestTheme = theme;
    }
}
