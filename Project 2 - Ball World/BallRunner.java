
/**
 * Write a description of class BallRunner here.
 * 
 * @author (Iain McDowall) 
 * @version (a version number or a date)
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(200,200);
        TGPoint tgPoint = new TGPoint(0,0);
        //public BallBot(BallWorld ballWorld, TGPoint startPoint, double startHeading, int radius)
        BallBot ballBot = new BallBot(ballWorld, tgPoint, 90.0, 30);
        while (ballBot.canMoveForward()){
        }

    }
}
