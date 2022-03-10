import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class converts harmonious colors.
 * 
 * @author Alex Tran
 * @version 18 November, 2019: Created.
 */
public class HarmoniousConversionUtilities
{

    private static HashMap< String, Integer > numbers = new HashMap< String, Integer >();
    private static HashMap< Double, String > hue = new HashMap< Double, String >();

    /**
     * Returns numbers map.
     * 
     * @return numbers the hashmap of numbers.
     */
    public static HashMap< String, Integer > getNumbers()
    {
        return numbers;
    }

    /**
     * Return hue map.
     * 
     * @return hue the hashmap of hues.
     */
    public static HashMap< Double, String > getHue()
    {
        return hue;
    }

    /**
     * This class converts complementary colors.
     * 
     * @param color
     *            object
     * @return complementary color
     */
    public static MunsellColorModel complementaryConversion( MunsellColorModel color )
    {
        populateNumbers();
        populateHue();
        double hueValue = munsellObjectToHueValue( color );
        return hueValueToMunsellObject( ( ( hueValue + 50 ) % 100 ), color );
    }

    /**
     * This method converts analogous colors.
     * 
     * @param color
     *            the color to search for analogous colors for.
     * @return the analogous colors of the color entered.
     */
    public static ArrayList< MunsellColorModel > analogousColors( MunsellColorModel color )
    {
        populateNumbers(); // first, set up the hues and numbers.
        populateHue();
        ArrayList< MunsellColorModel > result = new ArrayList< MunsellColorModel >();
        MunsellColorModel model = new MunsellColorModel( color );
        double hueValue = munsellObjectToHueValue( model );
        double hue1 = hueValue - 10; // then, set up the analogous colors via math.
        double hue2 = hueValue + 10;
        if ( hue1 < 0 )
            hue1 += 100;
        if ( hue2 > 100 )
            hue2 -= 100;
        MunsellColorModel firstAnalogous = hueValueToMunsellObject( hue1, model );
        MunsellColorModel secondAnalogous = hueValueToMunsellObject( hue2, model );
        result.add( firstAnalogous ); // finally, return them.
        result.add( secondAnalogous );
        return result;
    }

    /**
     * This method converts triad colors.
     * 
     * @param color
     *            the color to search for triad colors for.
     * @return the triad colors of the color entered.
     */
    public static ArrayList< MunsellColorModel > triadColors( MunsellColorModel color )
    {
        populateNumbers(); // first, set up the hues and numbers.
        populateHue();
        ArrayList< MunsellColorModel > result = new ArrayList< MunsellColorModel >();
        MunsellColorModel model = new MunsellColorModel( color.getHueString(), color.getHueDouble(),
            color.getValue(), color.getChroma() );

        double curHue = munsellObjectToHueValue( color );
        double newHue1 = ( curHue + 30 ) % 100; // then, set up the triad colors via math.
        double newHue2 = ( curHue + 60 ) % 100;

        MunsellColorModel triad1 = hueValueToMunsellObject( newHue1, model );
        MunsellColorModel triad2 = hueValueToMunsellObject( newHue2, model );

        result.add( triad1 ); // finally, return them.
        result.add( triad2 );
        return result;
    }

    /**
     * This method converts square colors.
     * 
     * @param color
     *            the color to search for square colors for.
     * @return the square colors of the color entered.
     */
    public static ArrayList< MunsellColorModel > squareColors( MunsellColorModel color )
    {
        populateNumbers(); // first, set up the hues and numbers.
        populateHue();
        ArrayList< MunsellColorModel > result = new ArrayList< MunsellColorModel >();
        MunsellColorModel model = new MunsellColorModel( color.getHueString(), color.getHueDouble(),
            color.getValue(), color.getChroma() );
        // n the square are (h+25) % 100, (h+50) % 100, and (h+75) % 100.
        double curHue = munsellObjectToHueValue( color );
        double newHue1 = ( curHue + 25 ) % 100; // then, set up the square colors via math.
        double newHue2 = ( curHue + 50 ) % 100;
        double newHue3 = ( curHue + 75 ) % 100;

        MunsellColorModel square1 = hueValueToMunsellObject( newHue1, model );
        MunsellColorModel square2 = hueValueToMunsellObject( newHue2, model );
        MunsellColorModel square3 = hueValueToMunsellObject( newHue3, model );

        result.add( square1 ); // finally, return them.
        result.add( square2 );
        result.add( square3 );

        return result;
    }

    /**
     * Converts tetrad colors.
     * 
     * @param c
     *            the color to search for tetrad colors for.
     * @return the tetrad colors of the color entered.
     */
    public static ArrayList< MunsellColorModel > tetradColors( MunsellColorModel c )
    {
        populateNumbers(); // first, set up the hues and numbers.
        populateHue();
        ArrayList< MunsellColorModel > result = new ArrayList< MunsellColorModel >();
        MunsellColorModel model = new MunsellColorModel( c.getHueString(), c.getHueDouble(),
            c.getValue(), c.getChroma() );

        double curHue = munsellObjectToHueValue( c );
        double newHue1 = ( curHue + 25 ) % 100; // then, set up the tetrad colors via math.
        MunsellColorModel tetrad1 = hueValueToMunsellObject( newHue1, model );

        result.add( c ); // finally, return them.
        result.add( tetrad1 );
        result.add( complementaryConversion( c ) );
        result.add( complementaryConversion( tetrad1 ) );

        return result;
    }

    /**
     * Populate numbers.
     */
    public static void populateNumbers()
    {
        getNumbers().put( "R", 5 );
        getNumbers().put( "YR", 15 );
        getNumbers().put( "Y", 25 );
        getNumbers().put( "GY", 35 );
        getNumbers().put( "G", 45 );
        getNumbers().put( "BG", 55 );
        getNumbers().put( "B", 65 );
        getNumbers().put( "PB", 75 );
        getNumbers().put( "P", 85 );
        getNumbers().put( "RP", 95 );

    }

    /**
     * Populate hue.
     */
    public static void populateHue()
    {
        getHue().put( 5.0, "R" );
        getHue().put( 15.0, "YR" );
        getHue().put( 25.0, "Y" );
        getHue().put( 35.0, "GY" );
        getHue().put( 45.0, "G" );
        getHue().put( 55.0, "BG" );
        getHue().put( 65.0, "B" );
        getHue().put( 75.0, "PB" );
        getHue().put( 85.0, "P" );
        getHue().put( 95.0, "RP" );

    }

    /**
     * Rounds super bright colors to near values.
     * 
     * @param color
     *            the color to round.
     */
    public static void roundToNearest( MunsellColorModel color )
    {
        if ( color.getChroma() >= 10 && color.getValue() == 9 )
        {
            color.setChroma( 8 );
        }
        if ( color.getChroma() >= 16 && color.getValue() == 6 )
        {
            color.setChroma( 14 );
        } else if ( color.getChroma() >= 14 && color.getValue() == 5 )
        {
            color.setChroma( 12 );
        } else if ( color.getChroma() >= 12 && color.getValue() == 4 )
        {
            color.setChroma( 10 );
        } else if ( color.getChroma() >= 10 && color.getValue() == 3 )
        {
            color.setChroma( 8 );
        } else if ( color.getChroma() >= 8 && color.getValue() == 2 )
        {
            color.setChroma( 4 );
        } else if ( color.getChroma() == 8 && color.getValue() == 8 )
        {
            color.setChroma( 6 );
        }
    }

    /**
     * Converts munsell object to hue.
     * 
     * @param color
     *            the color object to convert
     * @return the converted value
     */
    public static double munsellObjectToHueValue( MunsellColorModel color )
    {

        double result = numbers.get( color.getHueString() );

        if ( color.getHueDouble() == 2.5 )
        {
            result -= 2.5;
        }

        if ( color.getHueDouble() == 7.5 )
        {
            result += 2.5;
        }

        if ( color.getHueDouble() == 10 )
        {
            result += 5;
        }

        return result;
    }

    /**
     * Converts from hue to munsell object.
     * 
     * @param hueValue
     *            the hue value
     * @param c
     *            the color object. Used to preserve chroma and value
     * @return the converted color.
     */
    public static MunsellColorModel hueValueToMunsellObject( double hueValue, MunsellColorModel c )
    {
        MunsellColorModel result = new MunsellColorModel( "R", 0, c.getValue(), c.getChroma() );
        if ( hueValue % 10 == 5 )
        {
            result.setHueString( hue.get( hueValue ) );
            result.setHueDouble( 5 );
        }
        if ( hueValue % 10 == 0 )
        {
            result.setHueString( hue.get( hueValue + 5 ) );
            result.setHueDouble( 10 );
        }
        if ( hueValue % 10 == 2.5 )
        {
            result.setHueString( hue.get( hueValue + 2.5 ) );
            result.setHueDouble( 2.5 );
        }
        if ( hueValue % 10 == 7.5 )
        {
            result.setHueString( hue.get( hueValue - 2.5 ) );
            result.setHueDouble( 7.5 );
        }
        return result;
    }
}
