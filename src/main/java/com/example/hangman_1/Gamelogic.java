package com.example.hangman_1;

import java.util.Arrays;
import java.util.Random;

public class Gamelogic {
    //words
    public static final String[] WORDS = {
            "APFEL", "BANANE", "KIRSCHEN", "DATTEL", "ERDBEERE", "FEIGE", "GURKE", "HIMBEERE", "INGWER", "JOHANNISBERE",
            "KAROTTE", "LAUCH", "MANDARINE", "NEKTARINE", "ORANGE", "PFIRSICH", "QUITTE", "RADIESCHEN", "SELLERIE", "TOMATE",
            "UMLAUT", "VANILLE", "WASSERMELONE", "XENON", "YOGHURT", "ZITRONE", "ANANAS", "BIRNE", "CHILI", "DILL",
            "ENDIVIE", "FENCHEL", "GRÜNKOHL", "HONIG", "INGWER", "JASMIN", "KÄSE", "LINSEN", "MANDEL", "NUSS",
            "OREGANO", "PAPRIKA", "QUARK", "REIS", "SALAMI", "THYMIAN", "UMBRA", "VANILLEEIS", "WEIN", "XYLOPHON",
            "YOGA", "ZWIEBEL", "ADLER", "BÄR", "CHAMÄLEON", "DACHS", "EICHHÖRNCHEN", "FUCHS", "GIRAFFE", "HASE", "IGEL",
            "JAGUAR", "KROKODIL", "LÖWE", "MAUS", "NASHORN", "OTTER", "PANDA", "QUALLE", "REH", "SCHLANGE",
            "TIGER", "UHU", "VOGEL", "WAL", "XENOPUS", "YAK", "ZEBRA", "ANKER", "BALL", "COUCH", "DOSE",
            "EIMER", "FASS", "GLAS", "HUT", "INSTRUMENT", "JACKE", "KOFFER", "LAMPE", "MASCHINE", "NAGEL",
            "OFEN", "PINSEL", "QUITTUNG", "RAD", "SATTEL", "TISCH", "UHR", "VORHANG", "WAND", "XYLOPHON",
            "YACHT", "ZANGE", "AUTO", "BAHN", "BUS", "DAMPFER", "E-BIKE", "FLUGZEUG", "GONDEL", "HELIKOPTER", "INSEL",
            "JACHT", "KATAMARAN", "LOKOMOTIVE", "MOTORBOOT", "NUTZFAHRZEUG", "OMNIBUS", "POSTWAGEN", "QUAD", "RUDERBOOT", "SEGELBOOT",
            "TRACTOR", "UNTERSEEBOOT", "VAN", "WOHNWAGEN", "XYLOS", "YACHT", "ZUG", "ARM", "BEIN", "CELLE", "DARM",
            "ELLBOGEN", "FERSE", "GELENK", "HAND", "IRIS", "JOCHBEIN", "KNEE", "LEBER", "MILZ", "NIERE",
            "OHR", "PANKREAS", "QUECKE", "RIPPE", "SCHÄDEL", "TUMOR", "ULNA", "VENE", "WIRBEL", "XIPHOID",
            "ZWERSCHELF", "AMPEL", "BIRKE", "CHRYZANTHEME", "DAHLIE", "ESCHE", "FICHTE", "GERANIE", "HOLUNDER", "ILEX",
            "JASMIN", "KIEFER", "LÄRCHE", "MAGNOLIE", "NELKE", "ORCHIDEE", "PAPPEL", "QUENDEL", "ROSE", "SONNENBLUME",
            "TANNE", "ULME", "VEILCHEN", "WINDE", "XANADU", "YUCCA", "ZYPRESSE"
    };


    //create a char-array without length for our secret word
    private static char[] Secret_word;

    public static char[] getSecret_word(){
        return Secret_word;
    }

    private static char[] Guessed_chars;

    public static char[] getGuessed_chars()
    {return Guessed_chars;}

    public static char[] Create_Word(){
        //create a random integer between 1 and 199
        Random rand = new Random();
        int number = rand.nextInt(100);

        //set the length of Secret_word to the length of the randomword
        Secret_word = new char[WORDS[number].length()];
        Guessed_chars = new char[WORDS[number].length()];

        //fill the array Secret_word with chars

        for(int i =0;i<WORDS[number].length();i++){
            Secret_word[i] = WORDS[number].charAt(i);
        }//end of for
        return Secret_word;
    }//end of Create_Word

    public static char[] Guessed_Word(){
        char[] Output = new char[Secret_word.length];

        for(int k =0; k< Output.length;k++){
            Output[k] = '_';
        }

        for(int i =0;i<Secret_word.length;i++) {
            for (int j = 0; j < Guessed_chars.length; j++) {
                if (Secret_word[i] == Guessed_chars[j]) {
                    Output[i] = Guessed_chars[j];
                }
            }
        }

        return Output;
    }//end of Guessed_word

    private static int counter = 0; // Counter to track guesses index


    public static int getCounter()
    {return counter;}

    public static void setCounter(int x)
    {counter = x;}

    public static boolean add_char(char c) {
        for (int i = 0; i < Secret_word.length; i++) {
            if (Secret_word[i] == c) {
                for (int j = 0; j < Guessed_chars.length; j++) {
                    if (c == Guessed_chars[j]) {
                        return false;
                    }
                }
                Guessed_chars[counter] = c;
                counter++;
                return true;
            }
        }
        Start_Controller.update();
        return true;
    }//end of add_char

    //logic to give a single letter Hint
    public static  void Hint() {

        for(char i : Secret_word) {
            for(char j : Guessed_chars) {
                if(i == j) {break;}
                if(j== Guessed_chars[Guessed_chars.length-1]){
                    add_char(i);
                    return;
                }
            }
        }
    }//end of Hint


}//end of class
