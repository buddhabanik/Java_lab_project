/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rapidtyper;

import java.util.Random;

/**
 *
 * @author Buddha
 */
public final class Game {

    public static final String[] validArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
        "O", "p", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "e", "f", "g", "h", "i", "j", "k",
        "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", ",", "1", "2", "3", "4", "5", "6",
        "7", "8", "9", ".", ",", ";", ":", "<", ">", "?", "*", "(", ")", "+", "[", "]", "{", "}","%","#"};

    public static final String[] totalArray = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "p", "Q",
        "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "a", "b", "c", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
        "t", "u", "v", "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", ",", ";", ":", "<", ">", "?", "/", "'", "\","
        + "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "[", "]", "{", "}","|" };

    String ch;
    int xpos, ypos;

    public Game() {
        xpos = generateRandomNumber_xposition();
        ypos = 0;
        ch = validArray[generateRandomNumber()];
    }

    public int generateRandomNumber_xposition() {
        Random rand = new Random();
        int x = rand.nextInt(NewGame.WIDTH - 30);
        x += 20;
        if (x >= 650) {
            x -= 30;
        }
        return (x);
    }

    public int generateRandomNumber() {
        Random rand = new Random();
        int x = rand.nextInt(validArray.length);
        return (x);
    }

    public static boolean isValid(String ch) {
        for (int i = 0; i < totalArray.length; ++i) {
            if (totalArray[i].equals(ch)) {
                return true;
            }
        }
        return false;
    }
}
