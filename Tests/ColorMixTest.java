import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Test class for mixing colors.
 * 
 * @author Alex Tran
 *
 */
class ColorMixTest
{

    @Test
    void test1()
    {
        MunsellColorModel blue = new MunsellColorModel( "Y", 2.5, 2, 2 );
        MunsellColorModel green = new MunsellColorModel( "BG", 5, 1, 2 );
        assertEquals( "5.0Y 1.0/2.0", ColorMix.twoColorMix( blue, green ).toString() );

    }

    @Test
    void test2()
    {
        MunsellColorModel red = new MunsellColorModel( "R", 2.5, 2, 2 );
        MunsellColorModel purple = new MunsellColorModel( "P", 5, 1, 2 );
        assertEquals( "5.0R 1.0/2.0", ColorMix.twoColorMix( red, purple ).toString() );
    }

    @Test
    void test3()
    {
        MunsellColorModel yellow = new MunsellColorModel( "Y", 5, 1, 2 );
        MunsellColorModel red = new MunsellColorModel( "R", 5, 1, 10 );
        assertEquals( "5.0R 1.0/6.0", ColorMix.twoColorMix( yellow, red ).toString() );
    }

    @Test
    void test4()
    {
        MunsellColorModel purple = new MunsellColorModel( "P", 5, 1, 4 );
        MunsellColorModel blue = new MunsellColorModel( "B", 5, 1, 4 );
        assertEquals( "5.0PB 1.0/4.0", ColorMix.twoColorMix( purple, blue ).toString() );
    }

    @Test
    void test5()
    {
        MunsellColorModel red = new MunsellColorModel( "R", 5, 1, 2 );
        MunsellColorModel bluegreen = new MunsellColorModel( "BG", 5, 1, 2 );
        assertEquals( "10.0GY 1.0/2.0", ColorMix.twoColorMix( red, bluegreen ).toString() );
    }

    @Test
    void test6()
    {
        MunsellColorModel yellow = new MunsellColorModel( "Y", 2.5, 1, 4 );
        MunsellColorModel bluegreen = new MunsellColorModel( "BG", 7.5, 1, 2 );
        assertEquals( "5.0Y 1.0/4.0", ColorMix.twoColorMix( yellow, bluegreen ).toString() );
    }

    @Test
    void test7()
    {
        MunsellColorModel yellow = new MunsellColorModel( "Y", 2.5, 2, 10 );
        MunsellColorModel bluegreen = new MunsellColorModel( "BG", 5, 1, 4 );
        assertEquals( "5.0Y 1.0/8.0", ColorMix.twoColorMix( yellow, bluegreen ).toString() );
    }

    @Test
    void test8()
    {
        MunsellColorModel purpleblue = new MunsellColorModel( "PB", 5, 1, 10 );
        MunsellColorModel bluegreen = new MunsellColorModel( "BG", 5, 1, 4 );
        assertEquals( "5.0PB 1.0/8.0", ColorMix.twoColorMix( purpleblue, bluegreen ).toString() );
    }

    @Test
    void test9()
    {
        MunsellColorModel red = new MunsellColorModel( "R", 5, 1, 10 );
        MunsellColorModel purple = new MunsellColorModel( "P", 5, 1, 4 );
        assertEquals( "5.0R 1.0/8.0", ColorMix.twoColorMix( red, purple ).toString() );
    }

    @Test
    void test10()
    {
        MunsellColorModel purpleblue = new MunsellColorModel( "PB", 5, 2, 10 );
        MunsellColorModel bluegreen = new MunsellColorModel( "BG", 2.5, 1, 4 );
        assertEquals( "5.0PB 1.0/8.0", ColorMix.twoColorMix( purpleblue, bluegreen ).toString() );
    }

}
