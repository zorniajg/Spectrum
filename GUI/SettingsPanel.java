import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The panel for settings.
 * 
 * @author Kelly Ortega
 * @version 6 December, 2019:created.
 *
 */
public class SettingsPanel extends JPanel
{

    private static final long serialVersionUID = 1L;
    private JComboBox< String > colleges;
    private JButton confirmChange;
    private JLabel instructions;
    private Color defColor;

    public SettingsPanel()
    {
        initialize();

        this.setLayout( null );
        this.setBounds( 0, 0, 500, 500 );
        this.add( colleges );
        this.add( instructions );
        this.add( confirmChange );
        this.setVisible( true );
    }

    private void initialize()
    {
        confirmChange = new JButton( "Apply" );
        confirmChange.setBounds( 175, 300, 100, 25 );

        instructions = new JLabel( "Set Color Scheme" );
        instructions.setBounds( 175, 75, 300, 30 );

        String[] collegeNames = { "Default", "JMU", "VCU", "UVA", "VT", "CNU" };
        colleges = new JComboBox< String >( collegeNames );
        colleges.setBounds( 175, 125, 100, 50 );
        setListener();
        defColor = this.getBackground();
    }

    private void setListener()
    {
        confirmChange.addActionListener( new ActionListener()
        {
            public void actionPerformed( ActionEvent e )
            {
                if ( colleges.getSelectedItem().equals( "JMU" ) )
                {
                    GUI.setTheme( new Color( 109, 10, 171 ) );
                }
                if ( colleges.getSelectedItem().equals( "VCU" ) )
                {
                    GUI.setTheme( Color.DARK_GRAY );
                }
                if ( colleges.getSelectedItem().equals( "UVA" ) )
                {
                    GUI.setTheme( new Color( 255, 160, 18 ) );
                }
                if ( colleges.getSelectedItem().equals( "VT" ) )
                {
                    GUI.setTheme( new Color( 148, 38, 79 ) );
                }
                if ( colleges.getSelectedItem().equals( "CNU" ) )
                {
                    GUI.setTheme( new Color( 48, 38, 148 ) );
                }
                if ( colleges.getSelectedItem().equals( "Default" ) )
                {
                    GUI.setTheme( defColor );
                }
            }
        } );
    }

    public static void main( String[] args )
    {
        new SettingsPanel();
    }
}
