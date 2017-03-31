package com.EnusA.Prac4_3_1;

/**
 * Created by enusa on 2017/03/31.
 */
public class CRPCompare {
    CRPGenerator generate = new CRPGenerator();

    private String guess;
    private int counter;
    private boolean correct = false;
    public void setGuess(String g){guess = g;}

    public void comparison(String g){
        if (generate.getWord() == null)
            generate.randomWord();

        setGuess(g);
        int letterCount = generate.getWord().length();
        char hint = generate.getWord().charAt(0);
        if (g.equals(generate.getWord())){
            System.out.println("Correct!!\nRestarting game");
            generate.randomWord();
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
                generate.randomWord();
                counter = 0;
            }
            correct = false;
            counter++;
        }
    }
}
