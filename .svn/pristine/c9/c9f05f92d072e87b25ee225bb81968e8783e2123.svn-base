/**
 * An encapsulation of a Munsell Color.
 * 
 * @author Jacob Zorniak
 * @version 23 October, 2019: Created. Kelly Ortega: Added a toString() method.
 * @version 18 November, 2019: Removed depreceated methods, commented, checkstyled, etc.
 *
 */

public class MunsellColorModel
{

    private String hueString; // **String portion of the hue
    private double hueDouble; // **Number portion of the hue
    private double value; // **Value: lightness/darkness of the color
    private double chroma; // **Chroma: purity of the color

    /**
     * Default constructor.
     * 
     * @param hueString
     *            the String value of the hue
     * @param hueDouble
     *            the double value of the hue
     * @param value
     *            the value of the Munsell color.
     * @param chroma
     *            the Chroma value of the Munsell color.
     */
    public MunsellColorModel( String hueString, double hueDouble, double value, double chroma )
    {
        setHueString( hueString );
        setHueDouble( hueDouble );
        setValue( value );
        setChroma( chroma );
    }

    /**
     * Copy constructor.
     * 
     * @param other
     *            the other MunsellColorModel to copy.
     */
    public MunsellColorModel( MunsellColorModel other )
    {
        setHueString( other.hueString );
        setHueDouble( other.hueDouble );
        setValue( other.value );
        setChroma( other.chroma );
    }

    /**
     * returns the hue string.
     * 
     * @return the hueString
     */
    public String getHueString()
    {
        return hueString;
    }

    /**
     * sets the hue string
     * 
     * @param hueString
     *            the hueString to set
     */
    public void setHueString( String hueString )
    {
        this.hueString = hueString;
    }

    /**
     * returns the hue double.
     * 
     * @return the hueDouble
     */
    public double getHueDouble()
    {
        return hueDouble;
    }

    /**
     * sets the hue double.
     * 
     * @param hueDouble
     *            the hueDouble to set
     */
    public void setHueDouble( double hueDouble )
    {
        this.hueDouble = hueDouble;
    }

    /**
     * returns the munsell value.
     * 
     * @return the value
     */
    public double getValue()
    {
        return value;
    }

    /**
     * sets the Munsell value.
     * 
     * @param value2
     *            the value to set
     */
    public void setValue( double value2 )
    {
        this.value = value2;
    }

    /**
     * returns the chroma.
     * 
     * @return the chroma
     */
    public double getChroma()
    {
        return chroma;
    }

    /**
     * sets the chroma.
     * 
     * @param chroma2
     *            the chroma to set
     */
    public void setChroma( double chroma2 )
    {
        this.chroma = chroma2;
    }

    /**
     * Prints out the Munsell color in the standard format.
     * 
     * for non-neutral colors: hue, then letter representation, then value over chroma EX. 5.0R 5/12
     * 
     * for neutral colors: letter representation, then value followed by a slash. EX. N 3/
     */
    @Override
    public String toString()
    {
        if ( this.getChroma() != 0 )
        {
            return hueDouble + hueString + " " + value + "/" + chroma;
        }
        return "N " + value + "/";
    }
}
