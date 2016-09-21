
 mazeBot. turnLeft( );
    while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
    mazeBot. turnRight( );
    while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
    mazeBot. turnRight( );
   while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
    mazeBot. turnLeft( );
   while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
    mazeBot. turnLeft( );
    while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
    mazeBot. turnRight( );
    while(mazeBot.canMoveForward()){
    mazeBot.moveForward();
    }
     if (mazeBot.didReachGoal()){
        mazeBot.signalSuccess();
    }
        else{
            mazeBot.signalError();
        }
     }
   
    }
    
    
     


