
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
        int numberOfBots = 7;
        BallWorld ballWorld = new BallWorld(500,500);
        TGPoint tgPoint = new TGPoint(0,0);
        BallRunner br = new BallRunner(ballWorld, tgPoint, numberOfBots);

    }
    
    public BallRunner(BallWorld ballWorld1, TGPoint entrancePoint1, int ballBotArrayLength ){
        ballWorld = ballWorld1;
        entrancePoint = entrancePoint1;
        ballBotArray = new BallBot[ballBotArrayLength];
        loadBallBotArray();
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
    public void loadBallBotArray(){
        for(int i = 0; i < numberOfBots; i++ ){
            int randDirection = (int)(math.random()*360);
            ballBotArray[i] = new BallBot(ballWorld, tgPoint, randDirection, 20);
        }
    }
    
    public int findFreeBallBotIndex(){
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray = null){
                return  i;

            }
            else
            {
                return  ballBotArray.length;
            }
        }
    }
}