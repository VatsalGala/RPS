/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.rmi.Naming;
import java.util.*;
/**
 *
 * @author vatsalsmacbook
 */
public class RPSClient {
    public static void main(String[] args) {
        try{
            RPSIntf rps=(RPSIntf)Naming.lookup("rmi://localhost//RPSGame");
            Scanner sc=new Scanner(System.in);
            int id=sc.nextInt();
            char ch=sc.nextLine().charAt(0);
            System.out.println(rps.play(ch, id));
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
