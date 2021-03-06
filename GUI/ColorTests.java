import java.awt.CardLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Creates a short color blindness test to determine if somebody should go to an optamologist for
 * further testing.
 * 
 * @author Jacob Zorniak, Ben Girardi
 * 
 * @version 2 December, 2019: All basic functionality is there for 7 plates of testing with
 *          JTextField functionality.
 *
 */
public class ColorTests extends JPanel implements ActionListener
{
    private static final long serialVersionUID = -6917006837406592996L;
    private final int numberOfPlates = 9;
    private int correctAnswered;
    private int colorBlindAnswered;
    private String userGuess;

    private String[] correctAnswers = { "12", "8", "29", "5", "3", "15", "74" };

    JTextField colorGuess1 = new JTextField( 5 );
    JTextField colorGuess2 = new JTextField( 5 );
    JTextField colorGuess3 = new JTextField( 5 );
    JTextField colorGuess4 = new JTextField( 5 );
    JTextField colorGuess5 = new JTextField( 5 );
    JTextField colorGuess6 = new JTextField( 5 );
    JTextField colorGuess7 = new JTextField( 5 );
    ArrayList< JTextField > textFieldArray = new ArrayList< JTextField >( 7 );

    int answerCounter = 0;

    private String currPlate;
    private int plateCounter = 0;
    private BufferedImage plate;

    private GridBagConstraints c;
    private Font font;

    public JPanel introPanel;

    /**
     * Constructor method for ColorTests.
     */
    public ColorTests()
    {
        // Set layout and bounds.
        this.setLayout( new CardLayout() );
        this.setBounds( 0, 0, 900, 500 );

        // Create the introduction panel.
        introPanel = new JPanel();
        introPanel.setLayout( new GridBagLayout() );
        c = new GridBagConstraints();
        c.gridx = 5;
        c.gridy = 5;

        String instruct = "After clicking 'Begin Test', "
            + "enter the number you see within each plate. If you do not see any number click next.";
        JLabel instructions = new JLabel( instruct );
        font = new Font( "Verdana", Font.BOLD, 12 );
        instructions.setFont( font );
        introPanel.add( instructions, c );
        JButton beginButton = new JButton( "Begin Test" );
        beginButton.setSize( 100, 100 );
        beginButton.addActionListener( this );
        c.gridy = 6;
        introPanel.add( beginButton, c );
        this.add( introPanel, "Introduction" );

        // Create panels for plates and answers.
        JPanel[] plates = new JPanel[ 7 ];
        populateArrayList();

        for ( int i = 0; i < plates.length; i++ )
        {
            JPanel plate = new JPanel();
            plate.setLayout( new GridBagLayout() );
            c.gridx = 5;
            c.gridy = 5;
            String fileName = "Plate" + ( i + 1 ) + ".gif";
            createPlateCard( correctAnswers[ i ], fileName, plate, i );
            this.add( plate, "Plate " + ( i + 1 ) );
        }

        this.setVisible( true );
    }

    /**
     * Creates a plate panel by taking in the correct and incorrect answers as well as the imagine
     * file name and the panel to which all these elements will be added.
     * 
     * @param correct
     *            The correct answer
     * @param incorrect
     *            The incorrect answer
     * @param fileName
     *            The file name for the plate image
     * @param platePanel
     *            The panel to add the elements to
     */

    public void createPlateCard( String correct, String fileName, JPanel platePanel,
        int panelNumber )
    {

        try
        {
            // Read in plate picture
            plate = ImageIO.read( new File( fileName ) );
            ImageIcon icon = new ImageIcon( plate );
            JLabel showPlate = new JLabel();
            showPlate.setIcon( icon );
            platePanel.add( showPlate );

            // setting up JTextField and button for input

            JTextField temp = textFieldArray.get( panelNumber );
            temp.setColumns( 5 );
            platePanel.add( temp );
            JButton guessButton = new JButton( "Next!" );
            guessButton.setEnabled( false );
            temp.getDocument().addDocumentListener( new DocumentListener()
            {

                @Override
                public void insertUpdate( DocumentEvent e )
                {
                    userGuess = temp.getText();
                    guessButton.setEnabled( true );
                }

                @Override
                public void removeUpdate( DocumentEvent e )
                {
                    userGuess = temp.getText();
                    if ( temp.getText().length() == 0 )
                    {
                        guessButton.setEnabled( false );
                    }
                }

                @Override
                public void changedUpdate( DocumentEvent e )
                {
                    userGuess = temp.getText();
                }
            } );
            guessButton.addActionListener( this );
            platePanel.add( guessButton );

        } catch ( IOException e )
        {
            e.printStackTrace();
        }
    }

    /**
     * Creates the conclusion panel using the statistics gathered through the answers selected.
     */
    public void createConclusionPanel()
    {
        JPanel conclusionPanel = new JPanel();
        conclusionPanel.setBackground( GUI.colorTestTheme );
        conclusionPanel.setLayout( new GridBagLayout() );
        c.gridx = 5;
        c.gridy = 5;
        JLabel conclusionTitle = new JLabel( "Conclusion:" );
        font = new Font( "Verdana", Font.BOLD, 24 );
        conclusionTitle.setFont( font );
        conclusionPanel.add( conclusionTitle, c );
        c.gridy = 6;
        JLabel conclusionCorrect = new JLabel( "Correct: " + correctAnswered );
        font = new Font( "Verdana", Font.PLAIN, 12 );
        conclusionCorrect.setFont( font );
        conclusionPanel.add( conclusionCorrect, c );
        c.gridy = 7;
        JLabel conclusionIncorrect = new JLabel( "Incorrect: " + colorBlindAnswered );
        font = new Font( "Verdana", Font.PLAIN, 12 );
        conclusionIncorrect.setFont( font );
        conclusionPanel.add( conclusionIncorrect, c );
        c.gridy = 8;
        String conclusion;
        if ( colorBlindAnswered > 0 )
            conclusion = "You have answered at least 1 plate incorrectly: you should see a specialist for further testing";
        else
            conclusion = "You have answered all plates correctly: You are not colorblind";
        JLabel verdict = new JLabel( conclusion );
        font = new Font( "Verdana", Font.PLAIN, 12 );
        verdict.setFont( font );
        conclusionPanel.add( verdict, c );
        this.add( conclusionPanel, "Conclusion" );
    }

    /**
     * Checks for when the next button is pressed. Also checks for incorrect/correct answers and
     * handles the cases accordingly.
     * 
     * @param ActionEvent
     *            e - press on a button
     */
    @Override
    public void actionPerformed( ActionEvent e )
    {
        String buttonPressed = e.getActionCommand();
        CardLayout cards = ( CardLayout ) this.getLayout();
        currPlate = "Plate " + plateCounter;

        if ( buttonPressed.equalsIgnoreCase( "Begin Test" ) )
        {
            plateCounter = 1;
            currPlate = "Plate " + plateCounter;
            cards.show( this, currPlate );
            plateCounter++;
        }

        // checks if the answer entered is correct
        else if ( buttonPressed.equalsIgnoreCase( "next!" )
            && userGuess.equals( correctAnswers[ answerCounter ] ) )
        {

            // Increments
            answerCounter++;
            correctAnswered++;
            plateCounter++;

            cards.show( this, currPlate );

        }

        // checks if the answer entered is incorrect
        else
        {

            answerCounter++;
            colorBlindAnswered++;
            plateCounter++;

            cards.show( this, currPlate );

        }

        // If all plates have been answered, create and show conclusion
        if ( plateCounter >= numberOfPlates )
        {
            createConclusionPanel();
            cards.show( this, "Conclusion" );
        }
    }

    public void populateArrayList()
    {
        textFieldArray.add( colorGuess1 );
        textFieldArray.add( colorGuess2 );
        textFieldArray.add( colorGuess3 );
        textFieldArray.add( colorGuess4 );
        textFieldArray.add( colorGuess5 );
        textFieldArray.add( colorGuess6 );
        textFieldArray.add( colorGuess7 );
    }
}
