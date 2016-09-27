
/**
 * Write a description of class Statlab2D here.
 * 
 * @author (Iain McDowall) 
 * @version (a version number or a date)
 */
public class Statlab2D
{
    // instance variables - replace the example below with your own
    int [][] dray;

    /**
     * Constructor for objects of class Statlab2D
     */
    public Statlab2D()
    {
        // initialise instance variables
        new int [][];
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int loadArray2D()
    {
        // put your code here
        for (int i = 0; i < dray.length; i++)
        {
            for (int j = 0; j < dray[i].length; j++)
            {
                dray[i][j] = (int)(Math.random()*10 + 1);
            }
        }
    }
}