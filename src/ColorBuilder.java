import java.util.ArrayList;

/**
 * The methods that populate the arraylists of Munsell
 * Colors to display.
 * 
 * 
 * 
 * im sorry
 * 
 * @author Kelly Ortega
 * @version 4 November, 2019: created because ColorPanel was getting too long
 */

/**
 * default constructor.
 */
public class ColorBuilder
{
    private ArrayList< ArrayList< MunsellColorModel > > list;

    public ColorBuilder( ArrayList< ArrayList< MunsellColorModel > > list, String hueString,
        double hueValue )
    {
        this.list = list;
        initializeColorSpace();

        switch ( hueString )
        {
            case "R":
                buildReds( hueValue );
                break;

            case "YR":
                buildYellowReds( hueValue );
                break;

            case "Y":
                buildYellows( hueValue );
                break;

            case "GY":
                buildGreenYellows( hueValue );
                break;

            case "G":
                buildGreens( hueValue );
                break;

            case "BG":
                buildBlueGreens( hueValue );
                break;

            case "B":
                buildBlues( hueValue );
                break;

            case "PB":
                buildBluePurples( hueValue );
                break;

            case "P":
                buildPurples( hueValue );
                break;

            case "RP":
                buildRedPurples( hueValue );
                break;
        }
    }

    /**
     * Build the red color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, red
     */
    private void buildReds( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "R", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "R", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "R", hue, 8, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "R", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "R", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "R", hue, 7, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "R", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "R", hue, 6, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 2 ) );
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "R", hue, 9, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "R", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "R", hue, 8, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "R", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "R", hue, 4, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "R", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "R", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "R", hue, 5, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 2 ) );
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "R", hue, 9, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "R", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "R", hue, 8, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "R", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "R", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "R", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "R", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "R", hue, 5, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 2 ) );
                list.get( 9 ).add( new MunsellColorModel( "R", hue, 1, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "R", hue, 9, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "R", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "R", hue, 8, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "R", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "R", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "R", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "R", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "R", hue, 6, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the yellow-red color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, yellow-red
     */
    private void buildYellowReds( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "YR", hue, 9, 2 * i ) );
                    list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "YR", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "YR", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "YR", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "YR", hue, 8, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "YR", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "YR", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "YR", hue, 6, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "YR", hue, 1, 2 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "YR", hue, 9, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "YR", hue, 3, 2 * i ) );
                    list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "YR", hue, 4, 2 * i ) );

                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "YR", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "YR", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "YR", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "YR", hue, 8, 2 * i ) );
                }

                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "YR", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "YR", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "YR", hue, 9, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "YR", hue, 5, 2 * i ) );
                    list.get( 6 ).add( new MunsellColorModel( "YR", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "YR", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "YR", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "YR", hue, 7, 2 * i ) );

                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "YR", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "YR", hue, 2, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "YR", hue, 4, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "YR", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "YR", hue, 9, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "YR", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "YR", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "YR", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "YR", hue, 8, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the yellow color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, yellow
     */
    private void buildYellows( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "Y", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "Y", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "Y", hue, 5, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "Y", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "Y", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "Y", hue, 8, 2 * i ) );
                    list.get( 1 ).add( new MunsellColorModel( "Y", hue, 9, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "Y", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "Y", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "Y", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {

                    list.get( 4 ).add( new MunsellColorModel( "Y", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "Y", hue, 7, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "Y", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "Y", hue, 9, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "Y", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "Y", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "Y", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "Y", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "Y", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "Y", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "Y", hue, 9, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "Y", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "Y", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "Y", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "Y", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "Y", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "Y", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "Y", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "Y", hue, 8, 2 * i ) );
                    list.get( 1 ).add( new MunsellColorModel( "Y", hue, 9, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Builds the green-yellow color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, green-yellow
     */
    private void buildGreenYellows( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "GY", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "GY", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "GY", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "GY", hue, 5, 2 * i ) );
                    list.get( 6 ).add( new MunsellColorModel( "GY", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "GY", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "GY", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "GY", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "GY", hue, 9, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "GY", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "GY", hue, 3, 2 * i ) );
                    list.get( 6 ).add( new MunsellColorModel( "GY", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "GY", hue, 5, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "GY", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "GY", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "GY", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "GY", hue, 9, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "GY", hue, 1, 2 ) );
                list.get( 9 ).add( new MunsellColorModel( "GY", hue, 1, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "GY", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "GY", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "GY", hue, 5, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "GY", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "GY", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "GY", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "GY", hue, 9, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "GY", hue, 1, 2 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "GY", hue, 2, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "GY", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "GY", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "GY", hue, 5, 2 * i ) );

                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "GY", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "GY", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "GY", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "GY", hue, 9, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the green color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, green
     */
    private void buildGreens( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "G", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 2 * i ) );
                    list.get( 6 ).add( new MunsellColorModel( "G", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "G", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "G", hue, 6, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "G", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "G", hue, 8, 2 * i ) );
                    list.get( 1 ).add( new MunsellColorModel( "G", hue, 9, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "G", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "G", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "G", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "G", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "G", hue, 9, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "G", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "G", hue, 7, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "G", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "G", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "G", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "G", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "G", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "G", hue, 9, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "G", hue, 8, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "G", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "G", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "G", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "G", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "G", hue, 4, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "G", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "G", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "G", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "G", hue, 9, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "G", hue, 8, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the blue-green color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, blue-green
     */
    private void buildBlueGreens( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "BG", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "BG", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "BG", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "BG", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "BG", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "BG", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "BG", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "BG", hue, 9, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "BG", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "BG", hue, 2, 2 ) );

                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "BG", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "BG", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "BG", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "BG", hue, 7, 2 * i ) );
                    list.get( 1 ).add( new MunsellColorModel( "BG", hue, 9, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "BG", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "BG", hue, 2, 2 ) );

                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "BG", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "BG", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "BG", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "BG", hue, 7, 2 * i ) );
                    list.get( 1 ).add( new MunsellColorModel( "BG", hue, 9, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "BG", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "BG", hue, 2, 2 ) );

                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "BG", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "BG", hue, 4, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "BG", hue, 9, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "BG", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "BG", hue, 5, 2 * i ) );
                }
                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "BG", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "BG", hue, 7, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the blue color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, blue
     */
    private void buildBlues( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "B", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 2 ) );

                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "B", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "B", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "B", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "B", hue, 7, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "B", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 2 ) );

                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 4 ) );

                list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 2 ) );
                list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "B", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "B", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "B", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "B", hue, 7, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 9 ).add( new MunsellColorModel( "B", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "B", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "B", hue, 8, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "B", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "B", hue, 6, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 9 ).add( new MunsellColorModel( "B", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "B", hue, 2, 4 ) );

                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 2 ) );
                list.get( 7 ).add( new MunsellColorModel( "B", hue, 3, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "B", hue, 9, 4 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "B", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "B", hue, 8, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "B", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "B", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "B", hue, 7, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the blue-purple (pink?) color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, blue-purple (pink?)
     */
    private void buildBluePurples( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 9 ).add( new MunsellColorModel( "PB", hue, 1, 2 ) );

                list.get( 8 ).add( new MunsellColorModel( "PB", hue, 2, 2 ) );
                list.get( 8 ).add( new MunsellColorModel( "PB", hue, 2, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "PB", hue, 9, 2 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "PB", hue, 3, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "PB", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "PB", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "PB", hue, 7, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "PB", hue, 6, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "PB", hue, 5, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 9 ).add( new MunsellColorModel( "PB", hue, 1, 2 ) );
                list.get( 9 ).add( new MunsellColorModel( "PB", hue, 1, 4 ) );

                list.get( 1 ).add( new MunsellColorModel( "PB", hue, 9, 2 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "PB", hue, 2, 2 * i ) );
                    list.get( 2 ).add( new MunsellColorModel( "PB", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "PB", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "PB", hue, 4, 2 * i ) );
                    list.get( 3 ).add( new MunsellColorModel( "PB", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "PB", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "PB", hue, 6, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                list.get( 1 ).add( new MunsellColorModel( "PB", hue, 9, 2 ) );

                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "PB", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "PB", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 9 ).add( new MunsellColorModel( "PB", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "PB", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "PB", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "PB", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 12; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "PB", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 13; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "PB", hue, 4, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                list.get( 1 ).add( new MunsellColorModel( "PB", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "PB", hue, 9, 4 ) );

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "PB", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 9 ).add( new MunsellColorModel( "PB", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "PB", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "PB", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "PB", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "PB", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "PB", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 13; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "PB", hue, 4, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the purple color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, purple
     */
    private void buildPurples( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 4 ) );

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "P", hue, 8, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "P", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "P", hue, 7, 2 * i ) );
                    list.get( 8 ).add( new MunsellColorModel( "P", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "P", hue, 3, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "P", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "P", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 13; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "P", hue, 5, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 2 ) );
                list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 4 ) );

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 9 ).add( new MunsellColorModel( "P", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "P", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "P", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "P", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "P", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "P", hue, 4, 2 * i ) );
                    list.get( 4 ).add( new MunsellColorModel( "P", hue, 6, 2 * i ) );
                }

                for ( int i = 1; i <= 13; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "P", hue, 5, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "P", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "P", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "P", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "P", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "P", hue, 7, 2 * i ) );
                    list.get( 6 ).add( new MunsellColorModel( "P", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "P", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 12; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "P", hue, 6, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "P", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "P", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "P", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "P", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "P", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "P", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "P", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "P", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 12; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "P", hue, 6, 2 * i ) );
                }
                break;
        }
    }

    /**
     * Build the red-purple (pink?) color space.
     * 
     * @param hue
     *            the number of the color space
     * @param hueString
     *            the string, in this case, red-purple (pink?)
     */
    private void buildRedPurples( double hue )
    {
        initializeColorSpace();
        switch ( Double.toString( hue ) )
        {
            case ( "2.5" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "RP", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "RP", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "RP", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "RP", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "RP", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "RP", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "RP", hue, 7, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "RP", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "RP", hue, 6, 2 * i ) );
                }
                break;
            case ( "5.0" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "RP", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "RP", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "RP", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "RP", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "RP", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "RP", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "RP", hue, 7, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "RP", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 11; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "RP", hue, 6, 2 * i ) );
                }
                break;
            case ( "7.5" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "RP", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "RP", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "RP", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 7 ).add( new MunsellColorModel( "RP", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 6; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "RP", hue, 8, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "RP", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "RP", hue, 7, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 5 ).add( new MunsellColorModel( "RP", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 10; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "RP", hue, 6, 2 * i ) );
                }
                break;
            case ( "10.0" ):
                for ( int i = 1; i <= 3; i++ )
                {
                    list.get( 1 ).add( new MunsellColorModel( "RP", hue, 9, 2 * i ) );
                    list.get( 9 ).add( new MunsellColorModel( "RP", hue, 1, 2 * i ) );
                }

                for ( int i = 1; i <= 4; i++ )
                {
                    list.get( 8 ).add( new MunsellColorModel( "RP", hue, 2, 2 * i ) );
                }

                for ( int i = 1; i <= 5; i++ )
                {
                    list.get( 2 ).add( new MunsellColorModel( "RP", hue, 8, 2 * i ) );
                    list.get( 7 ).add( new MunsellColorModel( "RP", hue, 3, 2 * i ) );
                }

                for ( int i = 1; i <= 7; i++ )
                {
                    list.get( 6 ).add( new MunsellColorModel( "RP", hue, 4, 2 * i ) );
                }

                for ( int i = 1; i <= 8; i++ )
                {
                    list.get( 3 ).add( new MunsellColorModel( "RP", hue, 7, 2 * i ) );
                    list.get( 5 ).add( new MunsellColorModel( "RP", hue, 5, 2 * i ) );
                }

                for ( int i = 1; i <= 9; i++ )
                {
                    list.get( 4 ).add( new MunsellColorModel( "RP", hue, 6, 2 * i ) );
                }
                break;
        }
    }

    /**
     * sets up all the array lists, and adds in all the neutrals
     */
    private ArrayList< ArrayList< MunsellColorModel > > initializeColorSpace()
    {
        list.clear();

        for ( int i = 0; i < 11; i++ )
        {
            list.add( new ArrayList< MunsellColorModel >() );
            list.get( i ).add( new MunsellColorModel( "RP", 10.0, 10 - i, 0 ) );
        }
        return list;
    }
}
