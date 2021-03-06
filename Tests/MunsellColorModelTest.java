import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MunsellColorModelTest
{

    @Test
    void test()
    {
        MunsellColorModel test = new MunsellColorModel( "R", 5.0, 5, 12 );
        MunsellColorModel test2 = new MunsellColorModel( "N", 0.0, 3, 0 );
        MunsellColorModel zeroChroma = new MunsellColorModel( "R", 5.0, 5.0, 0 );
        assertEquals( 5.0, zeroChroma.getHueDouble() );
        assertEquals( "R", zeroChroma.getHueString() );
        assertEquals( 5.0, zeroChroma.getValue() );
        assertEquals( "R", zeroChroma.getHueString() );
        assertEquals( "N 5.0/", zeroChroma.toString() );
        assertEquals( "5.0R 5.0/12.0", test.toString() );
        assertEquals( "N 3.0/", test2.toString() );
    }

}
