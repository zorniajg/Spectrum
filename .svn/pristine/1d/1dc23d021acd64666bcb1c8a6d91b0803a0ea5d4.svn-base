import java.awt.geom.Point2D;

/**
 * This is the colorMix class. This class contains the method for mixing 2 colors.
 * 
 * @author Alex Tran
 *
 */
public class ColorMix
{
    /**
     * Mixes 2 colors.
     * 
     * @param color1
     *            the first color
     * @param color2
     *            the second color
     * @return The mixed color
     */
    public static MunsellColorModel twoColorMix( MunsellColorModel color1,
        MunsellColorModel color2 )
    {
        HarmoniousConversionUtilities.populateHue();
        HarmoniousConversionUtilities.populateNumbers();
        MunsellColorModel result = null;
        double resultHue = 0;
        double hueOfColor1 = HarmoniousConversionUtilities.munsellObjectToHueValue( color1 );
        double hueOfColor2 = HarmoniousConversionUtilities.munsellObjectToHueValue( color2 );
        double color1Degree = hueOfColor1;
        double color2Degree = hueOfColor2;
        if ( hueOfColor1 >= 80 )
        {
            color1Degree -= 80;
            color1Degree *= 3.6;
        } else
        {
            color1Degree += 20;
            color1Degree *= 3.6;
        }
        if ( hueOfColor2 >= 80 )
        {
            color2Degree -= 80;
            color2Degree *= 3.6;
        } else
        {
            color2Degree += 20;
            color2Degree *= 3.6;
        }
        double color1Radian = Math.toRadians( color1Degree );
        double color2Radian = Math.toRadians( color2Degree );
        Point2D.Double color1Point = new Point2D.Double(
            color1.getChroma() * Math.cos( color1Radian ),
            color1.getChroma() * Math.sin( color1Radian ) );
        Point2D.Double color2Point = new Point2D.Double(
            color2.getChroma() * Math.cos( color2Radian ),
            color2.getChroma() * Math.sin( color2Radian ) );
        double resultX = ( color1Point.x + color2Point.x ) / 2;
        double resultY = ( color1Point.y + color2Point.y ) / 2;
        double resultHueAngle = Math.atan( resultY / resultX );

        if ( resultX <= 0 && resultY < 0 )
        {
            resultHueAngle += Math.toRadians( 180 );
            resultHue = ( Math.toDegrees( resultHueAngle ) / 3.6 ) - 30;
            result = HarmoniousConversionUtilities.hueValueToMunsellObject( resultHue, color1 );
            result.setChroma( ( color1.getChroma() + color2.getChroma() ) / 2 );
            result.setValue( ( color1.getValue() + color2.getValue() ) / 2 );
            if ( result.getHueString() == "R" && result.getHueDouble() == 0 )
            {
                double specialChroma = ( ( color1.getChroma() + color2.getChroma() ) / 2 );
                double specialValue = ( ( color1.getValue() + color2.getValue() ) / 2 );
                double specialHue = ( ( color1.getHueDouble() + color2.getHueDouble() ) / 2 );
                if ( color1.getChroma() >= color2.getChroma() )
                {
                    result = new MunsellColorModel( color1.getHueString(), specialHue, specialValue,
                        specialChroma );
                } else if ( color2.getChroma() > color1.getChroma() )
                {
                    result = new MunsellColorModel( color2.getHueString(), specialHue, specialValue,
                        specialChroma );

                }
            }
            if ( result.getChroma() % 2 != 0 )
            {
                result.setChroma( result.getChroma() + 1 );
            }
            if ( result.getValue() % 1 != 0 )
            {
                result.setValue( result.getValue() - 0.5 );
            }
            if ( ( result.getHueDouble() * 10 ) % 5 != 0 )
            {
                result.setHueDouble( 5 );
            }
            return result;
        }
        if ( resultX < 0 )
        {
            resultHueAngle += Math.toRadians( 180 );
            resultHue = ( Math.toDegrees( resultHueAngle ) / 3.6 ) - 20;
            result = HarmoniousConversionUtilities.hueValueToMunsellObject( resultHue, color1 );
            result.setChroma( ( color1.getChroma() + color2.getChroma() ) / 2 );
            result.setValue( ( color1.getValue() + color2.getValue() ) / 2 );
            if ( result.getHueString() == "R" && result.getHueDouble() == 0 )
            {
                double specialChroma = ( ( color1.getChroma() + color2.getChroma() ) / 2 );
                double specialValue = ( ( color1.getValue() + color2.getValue() ) / 2 );
                double specialHue = ( ( color1.getHueDouble() + color2.getHueDouble() ) / 2 );
                if ( color1.getChroma() >= color2.getChroma() )
                {
                    result = new MunsellColorModel( color1.getHueString(), specialHue, specialValue,
                        specialChroma );
                } else if ( color2.getChroma() > color1.getChroma() )
                {
                    result = new MunsellColorModel( color2.getHueString(), specialHue, specialValue,
                        specialChroma );

                }
            }
            if ( result.getChroma() % 2 != 0 )
            {
                result.setChroma( result.getChroma() + 1 );
            }
            if ( result.getValue() % 1 != 0 )
            {
                result.setValue( result.getValue() - 0.5 );
            }
            if ( ( result.getHueDouble() * 10 ) % 5 != 0 )
            {
                result.setHueDouble( 5 );
            }
            return result;
        }

        if ( resultY > 0 && resultX >= 0 )
        {
            resultHue = ( Math.toDegrees( resultHueAngle ) / 3.6 ) + 80;
            result = HarmoniousConversionUtilities.hueValueToMunsellObject( resultHue, color1 );
            result.setChroma( ( color1.getChroma() + color2.getChroma() ) / 2 );
            result.setValue( ( color1.getValue() + color2.getValue() ) / 2 );
            if ( result.getHueString() == "R" && result.getHueDouble() == 0 )
            {
                double specialChroma = ( ( color1.getChroma() + color2.getChroma() ) / 2 );
                double specialValue = ( ( color1.getValue() + color2.getValue() ) / 2 );
                double specialHue = ( ( color1.getHueDouble() + color2.getHueDouble() ) / 2 );
                if ( color1.getChroma() >= color2.getChroma() )
                {
                    result = new MunsellColorModel( color1.getHueString(), specialHue, specialValue,
                        specialChroma );
                } else if ( color2.getChroma() > color1.getChroma() )
                {
                    result = new MunsellColorModel( color2.getHueString(), specialHue, specialValue,
                        specialChroma );

                }
            }
            if ( result.getChroma() % 2 != 0 )
            {
                result.setChroma( result.getChroma() + 1 );
            }
            if ( result.getValue() % 1 != 0 )
            {
                result.setValue( result.getValue() - 0.5 );
            }
            if ( ( result.getHueDouble() * 10 ) % 5 != 0 )
            {
                result.setHueDouble( 5 );
            }
            return result;
        }

        if ( resultX >= 0 && resultY < 0 )
        {

            resultHue = ( ( Math.toDegrees( resultHueAngle ) + 360 ) / 3.6 ) - 20;
            result = HarmoniousConversionUtilities.hueValueToMunsellObject( resultHue, color1 );

            result.setChroma( ( color1.getChroma() + color2.getChroma() ) / 2 );
            result.setValue( ( color1.getValue() + color2.getValue() ) / 2 );
            if ( result.getHueString() == "R" && result.getHueDouble() == 0 )
            {
                double specialChroma = ( ( color1.getChroma() + color2.getChroma() ) / 2 );
                double specialValue = ( ( color1.getValue() + color2.getValue() ) / 2 );
                double specialHue = ( ( color1.getHueDouble() + color2.getHueDouble() ) / 2 );
                if ( color1.getChroma() >= color2.getChroma() )
                {
                    result = new MunsellColorModel( color1.getHueString(), specialHue, specialValue,
                        specialChroma );
                } else if ( color2.getChroma() > color1.getChroma() )
                {
                    result = new MunsellColorModel( color2.getHueString(), specialHue, specialValue,
                        specialChroma );

                }
            }
            if ( result.getChroma() % 2 != 0 )
            {
                result.setChroma( result.getChroma() + 1 );
            }
            if ( result.getValue() % 1 != 0 )
            {
                result.setValue( result.getValue() - 0.5 );
            }
            if ( ( result.getHueDouble() * 10 ) % 5 != 0 )
            {
                result.setHueDouble( 5 );
            }
            return result;
        }

        return result;
    }
}
