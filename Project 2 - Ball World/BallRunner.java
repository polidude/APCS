
/**
 * Write a description of class BallRunner here.
 * 
 * @author (Iain McDowall) 
 * @version (Lab 1)
 */
public class BallRunner
{
    private BallWorld ballWorld;
    private TGPoint entrancePoint;
    private BallBot[] ballBotArray;

    public static void run(){
        BallWorld ballWorld = new BallWorld(500,500);
        //TGPoint tgPoint = new TGPoint(0,0);
        //public BallBot(BallWorld ballWorld, TGPoint startPoint, double startHeading, int radius)
        //BallBot ballBot = new BallBot(ballWorld, tgPoint, 180.0, 30);

        while (true){
            if (ballBot.canMoveForward(ballWorld)){
                ballBot.moveForward();
            }
            else
            {
                ballBot.setHeading(ballBot.getHeading() + 90);
                ballBot.moveForward();

            }

        }
    }

    public BallRunner(BallWorld ballWorld1,TGPoint entrancePoint1,int ballBotArrayLength ){
        ballWorld = ballWorld1;
        entrancePoint = entrancePoint1;
        ballBotArray = new BallBot[ballBotArrayLength];

    }

    public int findFreeBallBotIndex(){
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray = null){
                return int i;

            }
            else
            {
                return int ballBotArray.length;
            }
        }
    }
}