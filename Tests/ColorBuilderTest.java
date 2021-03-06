import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for ColorBuilder. Checks the lengths of each color space to determine if it's the
 * right shape or not.
 * 
 * @author Kelly Ortega
 * @version 18 November, 2019: Created.
 */
class ColorBuilderTest
{

    private ArrayList< ArrayList< MunsellColorModel > > list;
    private ColorBuilder builder;

    @BeforeEach
    void setUp() throws Exception
    {
        list = new ArrayList< ArrayList< MunsellColorModel > >();
    }

    @Test
    void testTwoPointFiveReds()
    {
        builder = new ColorBuilder( list, "R", 2.5 );
        builder.equals( builder ); // for clearing the "builder not used" warning

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 9, list.get( 3 ).size() );
        assertEquals( 10, list.get( 4 ).size() );
        assertEquals( 9, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );

    }

    @Test
    void testFiveReds()
    {
        builder = new ColorBuilder( list, "R", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 8, list.get( 3 ).size() );
        assertEquals( 10, list.get( 4 ).size() );
        assertEquals( 10, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 3, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointSevenPointFiveReds()
    {
        builder = new ColorBuilder( list, "R", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 9, list.get( 3 ).size() );
        assertEquals( 10, list.get( 4 ).size() );
        assertEquals( 10, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 3, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenFiveReds()
    {
        builder = new ColorBuilder( list, "R", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 9, list.get( 3 ).size() );
        assertEquals( 9, list.get( 4 ).size() );
        assertEquals( 8, list.get( 5 ).size() );
        assertEquals( 7, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 3, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveYellowReds()
    {
        builder = new ColorBuilder( list, "YR", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 8, list.get( 3 ).size() );
        assertEquals( 8, list.get( 4 ).size() );
        assertEquals( 7, list.get( 5 ).size() );
        assertEquals( 6, list.get( 6 ).size() );
        assertEquals( 5, list.get( 7 ).size() );
        assertEquals( 4, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveYellowReds()
    {
        builder = new ColorBuilder( list, "YR", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 8, list.get( 2 ).size() );
        assertEquals( 7, list.get( 3 ).size() );
        assertEquals( 7, list.get( 4 ).size() );
        assertEquals( 6, list.get( 5 ).size() );
        assertEquals( 5, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 4, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveYellowReds()
    {
        builder = new ColorBuilder( list, "YR", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 5, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 7, list.get( 3 ).size() );
        assertEquals( 6, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 5, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenYellowReds()
    {
        builder = new ColorBuilder( list, "YR", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 5, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 6, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveYellows()
    {
        builder = new ColorBuilder( list, "Y", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveYellows()
    {
        builder = new ColorBuilder( list, "Y", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveYellows()
    {
        builder = new ColorBuilder( list, "Y", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenYellows()
    {
        builder = new ColorBuilder( list, "Y", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 6, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveGreenYellows()
    {
        builder = new ColorBuilder( list, "GY", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveGreenYellows()
    {
        builder = new ColorBuilder( list, "GY", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveGreenYellows()
    {
        builder = new ColorBuilder( list, "GY", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 8, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 7, list.get( 3 ).size() );
        assertEquals( 6, list.get( 4 ).size() );
        assertEquals( 6, list.get( 5 ).size() );
        assertEquals( 5, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 4, list.get( 8 ).size() );
        assertEquals( 3, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenGreenYellows()
    {
        builder = new ColorBuilder( list, "GY", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 10, list.get( 1 ).size() );
        assertEquals( 9, list.get( 2 ).size() );
        assertEquals( 8, list.get( 3 ).size() );
        assertEquals( 7, list.get( 4 ).size() );
        assertEquals( 6, list.get( 5 ).size() );
        assertEquals( 5, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 4, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveGreens()
    {
        builder = new ColorBuilder( list, "G", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 7, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 6, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveGreens()
    {
        builder = new ColorBuilder( list, "G", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 6, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveGreens()
    {
        builder = new ColorBuilder( list, "G", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 6, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenGreens()
    {
        builder = new ColorBuilder( list, "G", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 6, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveBlueGreens()
    {
        builder = new ColorBuilder( list, "BG", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 6, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveBlueGreens()
    {
        builder = new ColorBuilder( list, "BG", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 5, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 2, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveBlueGreens()
    {
        builder = new ColorBuilder( list, "BG", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 5, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 2, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenBlueGreens()
    {
        builder = new ColorBuilder( list, "BG", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 2, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveBlues()
    {
        builder = new ColorBuilder( list, "B", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 2, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveBlues()
    {
        builder = new ColorBuilder( list, "B", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 4, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 3, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 2, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveBlues()
    {
        builder = new ColorBuilder( list, "B", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 5, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 4, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenBlues()
    {
        builder = new ColorBuilder( list, "B", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 5, list.get( 4 ).size() );
        assertEquals( 5, list.get( 5 ).size() );
        assertEquals( 4, list.get( 6 ).size() );
        assertEquals( 3, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFivePurpleBlues()
    {
        builder = new ColorBuilder( list, "PB", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 2, list.get( 1 ).size() );
        assertEquals( 4, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 6, list.get( 4 ).size() );
        assertEquals( 6, list.get( 5 ).size() );
        assertEquals( 5, list.get( 6 ).size() );
        assertEquals( 4, list.get( 7 ).size() );
        assertEquals( 3, list.get( 8 ).size() );
        assertEquals( 2, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFivePurpleBlues()
    {
        builder = new ColorBuilder( list, "PB", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 2, list.get( 1 ).size() );
        assertEquals( 4, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 8, list.get( 4 ).size() );
        assertEquals( 7, list.get( 5 ).size() );
        assertEquals( 6, list.get( 6 ).size() );
        assertEquals( 5, list.get( 7 ).size() );
        assertEquals( 4, list.get( 8 ).size() );
        assertEquals( 3, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFivePurpleBlues()
    {
        builder = new ColorBuilder( list, "PB", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 2, list.get( 1 ).size() );
        assertEquals( 4, list.get( 2 ).size() );
        assertEquals( 6, list.get( 3 ).size() );
        assertEquals( 8, list.get( 4 ).size() );
        assertEquals( 11, list.get( 5 ).size() );
        assertEquals( 14, list.get( 6 ).size() );
        assertEquals( 13, list.get( 7 ).size() );
        assertEquals( 10, list.get( 8 ).size() );
        assertEquals( 7, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenPurpleBlues()
    {
        builder = new ColorBuilder( list, "PB", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 7, list.get( 3 ).size() );
        assertEquals( 9, list.get( 4 ).size() );
        assertEquals( 12, list.get( 5 ).size() );
        assertEquals( 14, list.get( 6 ).size() );
        assertEquals( 11, list.get( 7 ).size() );
        assertEquals( 8, list.get( 8 ).size() );
        assertEquals( 6, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFivePurples()
    {
        builder = new ColorBuilder( list, "P", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 5, list.get( 2 ).size() );
        assertEquals( 7, list.get( 3 ).size() );
        assertEquals( 10, list.get( 4 ).size() );
        assertEquals( 14, list.get( 5 ).size() );
        assertEquals( 12, list.get( 6 ).size() );
        assertEquals( 10, list.get( 7 ).size() );
        assertEquals( 7, list.get( 8 ).size() );
        assertEquals( 5, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFivePurples()
    {
        builder = new ColorBuilder( list, "P", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 3, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 8, list.get( 3 ).size() );
        assertEquals( 11, list.get( 4 ).size() );
        assertEquals( 14, list.get( 5 ).size() );
        assertEquals( 11, list.get( 6 ).size() );
        assertEquals( 9, list.get( 7 ).size() );
        assertEquals( 7, list.get( 8 ).size() );
        assertEquals( 5, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFivePurples()
    {
        builder = new ColorBuilder( list, "P", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 10, list.get( 3 ).size() );
        assertEquals( 13, list.get( 4 ).size() );
        assertEquals( 12, list.get( 5 ).size() );
        assertEquals( 10, list.get( 6 ).size() );
        assertEquals( 8, list.get( 7 ).size() );
        assertEquals( 6, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenPurples()
    {
        builder = new ColorBuilder( list, "P", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 8, list.get( 2 ).size() );
        assertEquals( 12, list.get( 3 ).size() );
        assertEquals( 13, list.get( 4 ).size() );
        assertEquals( 11, list.get( 5 ).size() );
        assertEquals( 9, list.get( 6 ).size() );
        assertEquals( 7, list.get( 7 ).size() );
        assertEquals( 6, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTwoPointFiveRedPurples()
    {
        builder = new ColorBuilder( list, "RP", 2.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 8, list.get( 2 ).size() );
        assertEquals( 11, list.get( 3 ).size() );
        assertEquals( 12, list.get( 4 ).size() );
        assertEquals( 11, list.get( 5 ).size() );
        assertEquals( 9, list.get( 6 ).size() );
        assertEquals( 7, list.get( 7 ).size() );
        assertEquals( 6, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testFiveRedPurples()
    {
        builder = new ColorBuilder( list, "RP", 5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 10, list.get( 3 ).size() );
        assertEquals( 12, list.get( 4 ).size() );
        assertEquals( 10, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testSevenPointFiveRedPurples()
    {
        builder = new ColorBuilder( list, "RP", 7.5 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 7, list.get( 2 ).size() );
        assertEquals( 9, list.get( 3 ).size() );
        assertEquals( 11, list.get( 4 ).size() );
        assertEquals( 10, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }

    @Test
    void testTenRedPurples()
    {
        builder = new ColorBuilder( list, "RP", 10 );

        assertEquals( 1, list.get( 0 ).size() );
        assertEquals( 4, list.get( 1 ).size() );
        assertEquals( 6, list.get( 2 ).size() );
        assertEquals( 9, list.get( 3 ).size() );
        assertEquals( 10, list.get( 4 ).size() );
        assertEquals( 9, list.get( 5 ).size() );
        assertEquals( 8, list.get( 6 ).size() );
        assertEquals( 6, list.get( 7 ).size() );
        assertEquals( 5, list.get( 8 ).size() );
        assertEquals( 4, list.get( 9 ).size() );
        assertEquals( 1, list.get( 10 ).size() );
    }
}
