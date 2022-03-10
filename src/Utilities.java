import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Utilities class.
 * 
 * @author Mateo Price-Aguirre
 * @version 1 November, 2019: Created. 18 November, 2019: commented, checkstyled, etc.
 */
public class Utilities
{

    /**
     * @param m
     *            - Munsell color to convert to RGB
     * @param data
     *            derived from the MunselltoRGB csv file
     * @return an Array containing the R G B values
     */
    public static int[] MunsellToRGB( MunsellColorModel m, List< String[] > data )
    {

        // r,g,b, values, remain at -1 if the color is not found
        int r = -1;
        int g = -1;
        int b = -1;

        // represents whether the RGB color has been found
        boolean done = false;

        // searches the data for the munsell color
        // when it is found, sets the corresponding r g b values
        for ( String[] d : data )
        {
            if ( !done )
            {
                if ( d[ 2 ].equals( m.getHueString() )
                    && Double.parseDouble( d[ 3 ] ) == ( m.getHueDouble() )
                    && Integer.parseInt( d[ 4 ] ) == ( m.getValue() )
                    && Integer.parseInt( d[ 5 ] ) == ( m.getChroma() ) )
                {

                    r = Integer.parseInt( d[ 6 ] );
                    g = Integer.parseInt( d[ 7 ] );
                    b = Integer.parseInt( d[ 8 ] );

                    done = true;
                }
            }
        }

        int[] rgb = { r, g, b };
        return rgb;
    }

    /**
     * NOTE: only kind of works if the exact RBG values aren't in the csv file
     * 
     * @param r,g,b
     *            -- RGB values of the color
     * @param data
     *            derived from the MunselltoRGB csv file
     * @return the color in MunsellColor form
     */
    public static MunsellColorModel RGBToMunsell( int r, int g, int b, List< String[] > data )
    {

        String hueS = "X";
        Double hueD = -1.0;
        Double value = -1.0;
        Double chroma = -1.0;

        // represents whether the Munsell color has been found
        int distanceFromExact = Integer.MAX_VALUE;

        // searches the data for the RGB color
        // when it is found, sets the corresponding Munsell fields to the values found in the data
        for ( String[] d : data )
        {
            if ( distanceFromExact != 0 )
            {

                int rDistance = Math.abs( Integer.parseInt( d[ 0 ] ) - r );
                int gDistance = Math.abs( Integer.parseInt( d[ 0 ] ) - g );
                int bDistance = Math.abs( Integer.parseInt( d[ 0 ] ) - b );
                if ( rDistance + gDistance + bDistance < distanceFromExact )
                {

                    hueD = Double.parseDouble( d[ 3 ].substring( 0, 4 ) );
                    hueS = d[ 3 ].substring( 4 );
                    value = Double.parseDouble( d[ 4 ] );
                    chroma = Double.parseDouble( d[ 5 ] );
                    distanceFromExact = rDistance + gDistance + bDistance;
                }
            }
        }
        MunsellColorModel color = new MunsellColorModel( hueS, hueD, value, chroma );
        return color;
    }

    /**
     * opens a csv file and returns an arraylist containing the data
     * 
     * @param filePath
     *            the file path to search through.
     * @return the list of data.
     * @throws IOException
     *             in case it can't read the file.
     */
    public static List< String[] > openMunsell2RGB( String filePath ) throws IOException
    {
        List< String[] > allData = new ArrayList< String[] >();
        String line = "";
        BufferedReader csvReader = new BufferedReader( new FileReader( filePath ) );
        while ( ( line = csvReader.readLine() ) != null )
        {
            String[] data = line.split( "," );
            allData.add( data );
        }
        allData.remove( 0 );
        csvReader.close();
        return allData;
    }
}
