package com.EnusA.Prac4_3_1;

import org.apache.commons.lang.StringUtils;

/**
 * Created by enusa on 2017/03/31.
 */
public class Compare extends Generator {
    private String guess;
    private int counter;
    private boolean correct = false;
    public void setGuess(String g){guess = g;}

    public void comparison(String g){
        if (word == null)
            randomWord();

        setGuess(g);
        int letterCount = word.length();
        char hint = word.charAt(0);
        if (g.equals(word)){
            System.out.println("Correct!!\nRestarting game");
            randomWord();
            correct = true;
            counter = 0;
        }
        else{
            if(counter == 0) {
                System.out.println("Incorrect!! Have a hint\nThe first letter is: " + hint);
            }else if(counter == 1){
                System.out.println("Incorrect!! Have a hint\nThere are "+ letterCount +" letters in this word");
            }else if(counter == 2){
                System.out.println("Incorrect!! That was your last chance. Sorry, you lose! " +
                        "\nRestarting game");
                randomWord();
                counter = 0;
        }
            correct = false;
            counter++;
        }
    }
}
