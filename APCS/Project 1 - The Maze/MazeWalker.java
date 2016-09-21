
/**
 * Write a description of class MazeWalker here.
 * 
 * @author (Iain M) 
 * @version (Lab 5)
 */
public class MazeWalker
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class MazeWalker
     */
    public MazeWalker()
    {
    }
        
    public void walkMaze(MazeBot mazeBot){
  
    while (mazeBot.didNotReachGoal()){
       while(mazeBot.canMoveForward()){
           mazeBot.moveForward();
        }
        
        /*if(mazeBot.didNotReachGoal()){
            mazeBot.turnLeft();
        }
        else{
            mazeBot.turnRight();   
        }*/
    }
   }
}


   
           
    
             
            
   
    
    
    
    
    
    
    
    
    
   