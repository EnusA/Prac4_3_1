package com.EnusA.Prac4_3_1;

import java.util.Random;

/**
 * Created by enusa on 2017/03/31.
 */
public class CRPGenerator {
    private String[] wordList = new String[10];
    private String word;
    public CRPGenerator(){}

    public String getWord(){return word;}

    public void populateList (){
        wordList[0] = "Monkey";
        wordList[1] = "Painting";
        wordList[2] = "Bottle";
        wordList[3] = "Car";
        wordList[4] = "Animal";
        wordList[5] = "Pool";
        wordList[6] = "Bag";
        wordList[7] = "Plug";
        wordList[8] = "Tire";
        wordList[9] = "Japan";
    }

    public void randomWord(){
        populateList();
        Random rand = new Random();
        int ind = rand.nextInt(9);
        word = wordList[ind];
    }
}
