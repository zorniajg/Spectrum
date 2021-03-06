import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HarmoniousConversionUtilitiesTest
{
    /**
     * Test complementary colors.
     */
    @Test
    public void testComplementary()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 5.0, 5.0, 12.0 );
        String result = "5.0BG 5.0/12.0";
        assertEquals( result,
            HarmoniousConversionUtilities.complementaryConversion( color ).toString() );
    }

    /**
     * Test analogous colors.
     */
    @Test
    public void testAna()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 10.0, 6.0, 10.0 );
        MunsellColorModel color1 = new MunsellColorModel( "R", 0, 6.0, 10.0 );
        MunsellColorModel color2 = new MunsellColorModel( "RP", 5, 6.0, 10.0 );
        String result = "10.0R 6.0/10.0";
        String result1 = "5.0RP 6.0/10.0";
        String result2 = "5.0P 6.0/10.0";
        assertEquals( result,
            HarmoniousConversionUtilities.analogousColors( color ).get( 0 ).toString() );
        assertEquals( result1,
            HarmoniousConversionUtilities.analogousColors( color1 ).get( 0 ).toString() );
        assertEquals( result2,
            HarmoniousConversionUtilities.analogousColors( color2 ).get( 0 ).toString() );

    }

    /**
     * Test triad colors.
     */
    @Test
    public void testTriad()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 5.0, 6.0, 10.0 );
        String result = "5.0GY 6.0/10.0";
        assertEquals( result,
            HarmoniousConversionUtilities.triadColors( color ).get( 0 ).toString() );
        assertEquals( result,
            HarmoniousConversionUtilities.triadColors( color ).get( 0 ).toString() );
    }

    /**
     * Test square colors.
     */
    @Test
    public void testSquare()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 5.0, 6.0, 10.0 );
        String result = "10.0GY 6.0/10.0";
        assertEquals( result,
            HarmoniousConversionUtilities.squareColors( color ).get( 0 ).toString() );
    }

    /**
     * Test tetrad colors.
     */
    @Test
    public void testTetrad()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 5.0, 6.0, 10.0 );
        String result = "5.0R 6.0/10.0";
        assertEquals( result,
            HarmoniousConversionUtilities.tetradColors( color ).get( 0 ).toString() );
    }

    /**
     * Test munsell to hue
     */
    @Test
    public void m2h()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 2.5, 5, 5 );
        double hue = HarmoniousConversionUtilities.munsellObjectToHueValue( color );
        assertEquals( 2.5, hue );
        MunsellColorModel color1 = new MunsellColorModel( "R", 7.5, 5, 5 );
        double hue1 = HarmoniousConversionUtilities.munsellObjectToHueValue( color1 );
        assertEquals( 7.5, hue1 );
    }

    /**
     * Test hue to munsell.
     */
    @Test
    public void h2m()
    {
        String expected = "2.5BG 5.0/5.0";
        MunsellColorModel color = new MunsellColorModel( "R", 2.5, 5, 5 );
        MunsellColorModel result = HarmoniousConversionUtilities.hueValueToMunsellObject( 52.5,
            color );
        assertEquals( expected, result.toString() );
        String expected1 = "7.5BG 5.0/5.0";
        MunsellColorModel color1 = new MunsellColorModel( "R", 2.5, 5, 5 );
        MunsellColorModel result1 = HarmoniousConversionUtilities.hueValueToMunsellObject( 57.5,
            color1 );
        assertEquals( expected1, result1.toString() );

    }

    /**
     * Test rounding.
     */
    @Test
    public void round()
    {
        MunsellColorModel color = new MunsellColorModel( "R", 5.0, 9.0, 10.0 );
        MunsellColorModel color1 = new MunsellColorModel( "R", 5.0, 9.0, 9.0 );
        MunsellColorModel color2 = new MunsellColorModel( "R", 5.0, 8.0, 10.0 );
        HarmoniousConversionUtilities.roundToNearest( color );
        HarmoniousConversionUtilities.roundToNearest( color1 );
        HarmoniousConversionUtilities.roundToNearest( color2 );
        assertEquals( 8, color.getChroma() );
        assertEquals( 9, color1.getChroma() );
        assertEquals( 10, color2.getChroma() );

        MunsellColorModel color3 = new MunsellColorModel( "R", 5.0, 6.0, 16.0 );
        MunsellColorModel color4 = new MunsellColorModel( "R", 5.0, 6.0, 6.0 );
        MunsellColorModel color5 = new MunsellColorModel( "R", 5.0, 1.0, 16.0 );
        HarmoniousConversionUtilities.roundToNearest( color3 );
        HarmoniousConversionUtilities.roundToNearest( color4 );
        HarmoniousConversionUtilities.roundToNearest( color5 );
        assertEquals( 14, color3.getChroma() );
        assertEquals( 6, color4.getChroma() );
        assertEquals( 16, color5.getChroma() );

        MunsellColorModel color6 = new MunsellColorModel( "R", 5.0, 5.0, 14.0 );
        MunsellColorModel color7 = new MunsellColorModel( "R", 5.0, 5.0, 5.0 );
        MunsellColorModel color8 = new MunsellColorModel( "R", 5.0, 1.0, 14.0 );
        HarmoniousConversionUtilities.roundToNearest( color6 );
        HarmoniousConversionUtilities.roundToNearest( color7 );
        HarmoniousConversionUtilities.roundToNearest( color8 );
        assertEquals( 12, color6.getChroma() );
        assertEquals( 5, color7.getChroma() );
        assertEquals( 14, color8.getChroma() );

        MunsellColorModel color9 = new MunsellColorModel( "R", 5.0, 4.0, 12.0 );
        MunsellColorModel color10 = new MunsellColorModel( "R", 5.0, 4.0, 4.0 );
        MunsellColorModel color11 = new MunsellColorModel( "R", 5.0, 1.0, 12.0 );
        HarmoniousConversionUtilities.roundToNearest( color9 );
        HarmoniousConversionUtilities.roundToNearest( color10 );
        HarmoniousConversionUtilities.roundToNearest( color11 );
        assertEquals( 10, color9.getChroma() );
        assertEquals( 4, color10.getChroma() );
        assertEquals( 12, color11.getChroma() );

        MunsellColorModel color12 = new MunsellColorModel( "R", 5.0, 3.0, 10.0 );
        MunsellColorModel color13 = new MunsellColorModel( "R", 5.0, 3.0, 3.0 );
        MunsellColorModel color14 = new MunsellColorModel( "R", 5.0, 1.0, 10.0 );
        HarmoniousConversionUtilities.roundToNearest( color12 );
        HarmoniousConversionUtilities.roundToNearest( color13 );
        HarmoniousConversionUtilities.roundToNearest( color14 );
        assertEquals( 8, color12.getChroma() );
        assertEquals( 3, color13.getChroma() );
        assertEquals( 10, color14.getChroma() );

        MunsellColorModel color15 = new MunsellColorModel( "R", 5.0, 2.0, 8.0 );
        MunsellColorModel color16 = new MunsellColorModel( "R", 5.0, 2.0, 2.0 );
        MunsellColorModel color17 = new MunsellColorModel( "R", 5.0, 1.0, 8.0 );
        HarmoniousConversionUtilities.roundToNearest( color15 );
        HarmoniousConversionUtilities.roundToNearest( color16 );
        HarmoniousConversionUtilities.roundToNearest( color17 );
        assertEquals( 4, color15.getChroma() );
        assertEquals( 2, color16.getChroma() );
        assertEquals( 8, color17.getChroma() );

        MunsellColorModel color18 = new MunsellColorModel( "R", 5.0, 8.0, 8.0 );
        MunsellColorModel color19 = new MunsellColorModel( "R", 5.0, 8.0, 3.0 );
        MunsellColorModel color20 = new MunsellColorModel( "R", 5.0, 1.0, 8.0 );
        HarmoniousConversionUtilities.roundToNearest( color18 );
        HarmoniousConversionUtilities.roundToNearest( color19 );
        HarmoniousConversionUtilities.roundToNearest( color20 );
        assertEquals( 6, color18.getChroma() );
        assertEquals( 3, color19.getChroma() );
        assertEquals( 8, color20.getChroma() );
    }

    /**
     * Test class as an object (static global variables).
     */
    @Test
    public void testClassAsObject()
    {
        HarmoniousConversionUtilities obj = new HarmoniousConversionUtilities();
        assertEquals( obj, obj );

    }

}
