
/**
 * Write a description of class BallRunner here.
 * 
 * @author (Iain McDowall) 
 * @version (Lab 1)
 */
public class BallRunner
{
    protected BallWorld ballWorld;
    public TGPoint entrancePoint;
    public int ballBotArrayLength;
    private BallBot[] ballBotArray;
   
 

    public void run(){
        ballWorld = new BallWorld(500,500);
        entrancePoint= new TGPoint(0,0);
        ballBotArrayLength =10;

        while (true)
        {
            int ballBotIndex;
            ballBotIndex = findFreeBallBotIndex();
            if (ballBotIndex < ballBotArray.length)
            {
                ballBotArray[ballBotIndex] = new BallBot(ballWorld, entrancePoint,(Math.random()*360), 50);
            }
            for (int index = 0; index <= ballBotArray.length - 1; index++)
            {
                if (ballBotArray[index] != null){
                    ballBotArray[index].moveForward();
                }
                else
                {
                    ballBotArray[index].setHeading(Math.random()*360);

                }

            }

        }

    }

    public BallRunner(BallWorld ballWorld, TGPoint entrancePoint, int ballBotArrayLength ){
        ballWorld = ballWorld;
        entrancePoint = entrancePoint;

        ballBotArray = new BallBot[ballBotArrayLength];
    }

    public int findFreeBallBotIndex()
    {
        int return_value = ballBotArray.length;
        for (int i = 0; i <= ballBotArray.length-1; i++)
        {
            if (ballBotArray[i] == null)
            {
                return i;
            }

        }
        return return_value;
    }

}
