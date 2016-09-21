
/**
 * Write a description of class ArrayReverse here.
 * 
 * @author (Iain McDowall) 
 * @version (Lab 8)
 */
public class ArrayReverse
{
    // instance variables - replace the example below with your own
    int[] reverse;

    public ArrayReverse()
    {

    }

    public int[] arrayReverse(int[] reverse)
    {
        // put your code here
        int temp = reverse[0];
        for (int i = reverse.length - 1; i < 0; i--){ 
            reverse[i] = reverse[reverse.length - 1];

        }
        reverse[reverse.length - 1] = temp;
        return reverse;

    }

    public void printReverse(int[] reverse){
        System.out.print (reverse);
    }
}