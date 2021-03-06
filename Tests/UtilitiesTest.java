import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UtilitiesTest
{
    MunsellColorModel color1 = new MunsellColorModel( "R", 2.5, 1, 2 );
    MunsellColorModel neutral1 = new MunsellColorModel( "RP", 10.0, 0, 0 );
    MunsellColorModel neutral2 = new MunsellColorModel( "RP", 10.0, 1, 0 );

    /**
     * Test known munsell to rgb.
     * 
     * @throws IOException
     */
    @Test
    void testKnownCSVColorMunsellToRGB() throws IOException
    {
        int[] rgb = Utilities.MunsellToRGB( color1,
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        int[] expected = { 45, 21, 31 };
        Assert.assertArrayEquals( expected, rgb );

    }

    /**
     * Test neutral munsell to rgb.
     * 
     * @throws IOException
     */
    @Test
    void testKnownNeutralCSVColorMunsellToRGB() throws IOException
    {
        int[] rgb = Utilities.MunsellToRGB( neutral1,
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        int[] expected = { 0, 0, 0 };
        Assert.assertArrayEquals( expected, rgb );
    }

    /**
     * Test neutral munsell to rgb.
     * 
     * @throws IOException
     */
    @Test
    void testKnownNeutralCSVColorMunsellToRGB2() throws IOException
    {
        int[] rgb = Utilities.MunsellToRGB( neutral2,
            Utilities.openMunsell2RGB( "Munsell2RGB.csv" ) );
        int[] expected = { 30, 28, 30 };
        Assert.assertArrayEquals( expected, rgb );
    }

}
