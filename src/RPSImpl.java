
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vatsalsmacbook
 */

public class RPSImpl extends java.rmi.server.UnicastRemoteObject implements RPSIntf{

    static char playerHand[] = new char[2];
    public RPSImpl() throws RemoteException {
        super();
    }
    @Override
    public String play(char handPlayed, int id) throws RemoteException {
        playerHand[id] = handPlayed;
        while(playerHand[0]== 0 || playerHand[1] == 0 );
        int win=calculate();
        String result="" + playerHand[0] + " " + playerHand[1] + (win==0?(" "+playerHand[0]):(win==1?(" "+playerHand[1]):" tie"));
        return result;
    }

    public static int calculate() {
        if(playerHand[0] == '-' || playerHand[1] == '-')  return -2;
        if(playerHand[0] == 'r'){
            if (playerHand[1] == 'p') return 1;
            if (playerHand[1] == 's') return 0;
            else return -1;
        }
        if(playerHand[0] == 'p'){
            if (playerHand[1] == 's') return 1;
            if (playerHand[1] == 'r') return 0;
            else return -1;
        }
        if(playerHand[0] == 's'){
            if (playerHand[1] == 'r') return 1;
            if (playerHand[1] == 'p') return 0;
            else return -1;
        }
        return -2;
    }
    
}
