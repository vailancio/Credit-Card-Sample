package com.vailancio;

import java.util.Random;

public class CardUtility {
    public static String getNewNumber(){
        String t = null;

        for(int i =0; i <= 3; i++){
            Random r = new Random();
            int Low = 1000;
            int High = 9999;
            int Result = r.nextInt(High-Low) + Low;

            if(t == null){
                t = Integer.toString(Result);
            }else{
                t = t + Integer.toString(Result);
            }
        }
        return t;
    }
}
