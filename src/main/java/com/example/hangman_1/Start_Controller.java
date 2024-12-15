package com.example.hangman_1;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;




import java.net.URL;
import java.util.ResourceBundle;

public class Start_Controller implements Initializable {

    //create a array to store all the buttons
    private Button[] Buttonlist = new Button[29];

    //create a array to store all the Stages for the Hangman visuals
    private ImageView[] Stagelist = new ImageView[6];


    //----------------------------------
    @FXML
    private Button Play_Button;
    @FXML
    private Button Credits_Button;
    @FXML
    private ImageView Start_Image;
    //-------------------------------


    //------------------------------------
    @FXML
    private Button A_Button;
    @FXML
    private Button B_Button;
    @FXML
    private Button C_Button;
    @FXML
    private Button D_Button;
    @FXML
    private Button E_Button;
    @FXML
    private Button F_Button;
    @FXML
    private Button G_Button;
    @FXML
    private Button H_Button;
    @FXML
    private Button I_Button;
    @FXML
    private Button J_Button;
    @FXML
    private Button K_Button;
    @FXML
    private Button L_Button;
    @FXML
    private Button M_Button;
    @FXML
    private Button N_Button;
    @FXML
    private Button O_Button;
    @FXML
    private Button P_Button;
    @FXML
    private Button Q_Button;
    @FXML
    private Button R_Button;
    @FXML
    private Button S_Button;
    @FXML
    private Button T_Button;
    @FXML
    private Button U_Button;
    @FXML
    private Button V_Button;
    @FXML
    private Button W_Button;
    @FXML
    private Button X_Button;
    @FXML
    private Button Y_Button;
    @FXML
    private Button Z_Button;
    @FXML
    private Button Ä_Button;
    @FXML
    private Button Ö_Button;
    @FXML
    private Button Ü_Button;

    //-----------------------

    //-------------------------------
    @FXML
    private ImageView Stage_1;
    @FXML
    private ImageView Stage_2;
    @FXML
    private ImageView Stage_3;
    @FXML
    private ImageView Stage_4;
    @FXML
    private ImageView Stage_5;
    @FXML
    private ImageView Stage_6;
    //-----------------------------

    @FXML
    private ImageView Table_image;
    @FXML
    private Label Secret_Label;
    @FXML
    private Label Loose_Label;
    @FXML
    private Label Win_label;
    @FXML
    private Button Restart_button;
    @FXML
    private Button Back_button;
    @FXML
    private Button Hint_button;


    //------------------------------------

    @FXML
    protected void handlePlayButtonClick() {


        //if the user presses the playbutton, the whole Startscreen disapears and the Playscreen apears
        Start_Image.setVisible(false);
        Play_Button.setVisible(false);
        Credits_Button.setVisible(false);



        //set all the Buttons we stored in Buttonlist visible
        for(Button i : Buttonlist ){ i.setVisible(true); }

        Table_image.setVisible(true);
        Secret_Label.setVisible(true);
        Hint_button.setVisible(true);


        //generate the word
        char[] S_word = Gamelogic.Create_Word();

        char[] G_word = Gamelogic.Guessed_Word();


        Secret_Label.setText(String.valueOf(G_word));

        restart();
    }

    @FXML
    protected void A_button_onclick() {
        if(Gamelogic.add_char('A')){
            A_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of A_button_onclick

    @FXML
    protected void B_button_onclick() {
        if(Gamelogic.add_char('B')){
            B_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of B_button_onclick

    @FXML
    protected void C_button_onclick() {
        if(Gamelogic.add_char('C')){
            C_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of C_button_onclick

    @FXML
    protected void D_button_onclick() {
        if(Gamelogic.add_char('D')){
            D_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of D_button_onclick

    @FXML
    protected void E_button_onclick() {
        if(Gamelogic.add_char('E')){
            E_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of E_button_onclick

    @FXML
    protected void F_button_onclick() {
        if(Gamelogic.add_char('F')){
            F_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of F_button_onclick

    @FXML
    protected void G_button_onclick() {
        if(Gamelogic.add_char('G')){
            G_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of G_button_onclick

    @FXML
    protected void H_button_onclick() {
        if(Gamelogic.add_char('H')){
            H_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of H_button_onclick

    @FXML
    protected void I_button_onclick() {
        if(Gamelogic.add_char('I')){
            I_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of I_button_onclick

    @FXML
    protected void J_button_onclick() {
        if(Gamelogic.add_char('J')){
            J_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of J_button_onclick

    @FXML
    protected void K_button_onclick() {
        if(Gamelogic.add_char('K')){
            K_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of K_button_onclick

    @FXML
    protected void L_button_onclick() {
        if(Gamelogic.add_char('L')){
            L_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of L_button_onclick

    @FXML
    protected void M_button_onclick() {
        if(Gamelogic.add_char('M')){
            M_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of M_button_onclick

    @FXML
    protected void N_button_onclick() {
        if(Gamelogic.add_char('N')){
            N_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of N_button_onclick

    @FXML
    protected void O_button_onclick() {
        if(Gamelogic.add_char('O')){
            O_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of O_button_onclick

    @FXML
    protected void P_button_onclick() {
        if(Gamelogic.add_char('P')){
            P_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of P_button_onclick

    @FXML
    protected void Q_button_onclick() {
        if(Gamelogic.add_char('Q')){
            Q_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of Q_button_onclick

    @FXML
    protected void R_button_onclick() {
        if(Gamelogic.add_char('R')){
            R_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of R_button_onclick

    @FXML
    protected void S_button_onclick() {
        if(Gamelogic.add_char('S')){
            S_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of S_button_onclick

    @FXML
    protected void T_button_onclick() {
        if(Gamelogic.add_char('T')){
            T_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of T_button_onclick

    @FXML
    protected void U_button_onclick() {
        if(Gamelogic.add_char('U')){
            U_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of U_button_onclick

    @FXML
    protected void V_button_onclick() {
        if(Gamelogic.add_char('V')){
            V_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of V_button_onclick

    @FXML
    protected void W_button_onclick() {
        if(Gamelogic.add_char('W')){
            W_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of W_button_onclick

    @FXML
    protected void X_button_onclick() {
        if(Gamelogic.add_char('X')){
            X_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of X_button_onclick

    @FXML
    protected void Y_button_onclick() {
        if(Gamelogic.add_char('Y')){
            Y_Button.setDisable(true);
        }
        update_Secret_label();
    }//end of Y_button_onclick

    @FXML
    protected void Z_button_onclick() {
        if(Gamelogic.add_char('Z')){
            Z_Button.setDisable(true);
        }
        update_Secret_label();

    }//end of Z_button_onclick

    @FXML
    protected void Ä_button_onclick() {
        if(Gamelogic.add_char('Ä')){
            Ä_Button.setDisable(true);
        }
        update_Secret_label();

    }//end of Z_button_onclick

    @FXML
    protected void Ö_button_onclick() {
        if(Gamelogic.add_char('Ö')){
            Ö_Button.setDisable(true);
        }
        update_Secret_label();

    }//end of Z_button_onclick

    @FXML
    protected void Ü_button_onclick() {
        if(Gamelogic.add_char('Ü')){
            Ü_Button.setDisable(true);
        }
        update_Secret_label();

    }//end of Z_button_onclick

    @FXML
    protected void update_Secret_label() {
        Secret_Label.setText(String.valueOf(Gamelogic.Guessed_Word()));
        draw_stages();
    }

    @FXML
    private void on_Back_button_click(){
        Play_Button.setVisible(true);
        Credits_Button.setVisible(true);
        Start_Image.setVisible(true);

        Secret_Label.setVisible(false);
        for(ImageView i : Stagelist){ i.setVisible(false); }
        Table_image.setVisible(false);
        Loose_Label.setVisible(false);
        Win_label.setVisible(false);
        Restart_button.setVisible(false);
        Back_button.setVisible(false);
        Hint_button.setVisible(false);



    }//end of on_Back_button_click

    @FXML
    private void on_Hint_Button_click(){
        System.out.println(1);
        Gamelogic.Hint();
        update_Secret_label();
    }//end of on_Hint_Button_click


    //logic to keep track of the mistakes and adjust the Hangman to the current state of Counter!
    static int Counter =0;

    public static void update(){
        Counter++;


    }

    //logic to draw the stages,and to detect either win or loose
    public void draw_stages(){
        switch(Counter){
            case 1:
                Stage_1.setVisible(true);
                break;
            case 2:
                Stage_2.setVisible(true);
                break;
            case 3:
                Stage_3.setVisible(true);
                break;
            case 4:
                Stage_4.setVisible(true);
                Stage_3.setVisible(false);
                break;
            case 5:
                Stage_5.setVisible(true);
                break;
            case 6:
                Stage_6.setVisible(true);
                Show_loose();
                break;

        }//end of switch case

        //logic to detect a win
        boolean flag = false;
        for(int i =0; i < Gamelogic.getSecret_word().length; i++){
            for(int j =0; j< Gamelogic.getGuessed_chars().length; j++){
               if(Gamelogic.getGuessed_chars()[j] == Gamelogic.getSecret_word()[i]){
                   flag = true;
                   break;
               }else{flag = false;}
            }
            if(!flag){return;}
        }
        Show_win();
    }//end of draw_stage_1

    //show deathscreen/menu
    private void Show_loose(){
        Loose_Label.setVisible(true);
        //set all the Buttons invisible; Wanted a cleaner looking deathscreen!
        for(Button i : Buttonlist ){ i.setVisible(false); }
        Restart_button.setVisible(true);
        Back_button.setVisible(true);

        //show secret_word
        Secret_Label.setText(String.valueOf(Gamelogic.getSecret_word()));

    }//end of Show_loose

    //show Winscreen/menu
    private void Show_win(){
        Win_label.setVisible(true);
        //set all the Buttons invisible; Wanted a cleaner looking deathscreen!
        for(Button i : Buttonlist ){ i.setVisible(false); }
        Restart_button.setVisible(true);
        Back_button.setVisible(true);

        //show secret_word
        Secret_Label.setText(String.valueOf(Gamelogic.getSecret_word()));


    }//end of show_win

    @FXML
    private void restart(){

        Start_Image.setVisible(false);
        Play_Button.setVisible(false);
        Credits_Button.setVisible(false);
        Loose_Label.setVisible(false);
        Win_label.setVisible(false);
        Restart_button.setVisible(false);
        Back_button.setVisible(false);

        //set all the Buttons we stored in Buttonlist acitive and visible as they might be deactivated
        for(Button i : Buttonlist ){ i.setVisible(true); i.setDisable(false); }

        //set all the Stages invisible again
        for(ImageView j : Stagelist){j.setVisible(false);}

        //create a new Word
        //generate the word
        char[] S_word = Gamelogic.Create_Word();

        char[] G_word = Gamelogic.Guessed_Word();

        //update Secret_label
        Counter = 0;
        Gamelogic.setCounter(0);
        update_Secret_label();

    }//end of restart

    @FXML
    private void on_credits_button_click() {

    }


    //Purpose: Push all thr Buttons in Buttonlist/ could not find a good library for that. So may be changed!
    //same with all the Stages of the Hangman
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Buttonlist[0] = A_Button;
        Buttonlist[1] = B_Button;
        Buttonlist[2] = C_Button;
        Buttonlist[3] = D_Button;
        Buttonlist[4] = E_Button;
        Buttonlist[5] = F_Button;
        Buttonlist[6] = G_Button;
        Buttonlist[7] = H_Button;
        Buttonlist[8] = I_Button;
        Buttonlist[9] = J_Button;
        Buttonlist[10] = K_Button;
        Buttonlist[11] = L_Button;
        Buttonlist[12] = M_Button;
        Buttonlist[13] = N_Button;
        Buttonlist[14] = O_Button;
        Buttonlist[15] = P_Button;
        Buttonlist[16] = Q_Button;
        Buttonlist[17] = R_Button;
        Buttonlist[18] = S_Button;
        Buttonlist[19] = T_Button;
        Buttonlist[20] = U_Button;
        Buttonlist[21] = V_Button;
        Buttonlist[22] = W_Button;
        Buttonlist[23] = X_Button;
        Buttonlist[24] = Y_Button;
        Buttonlist[25] = Z_Button;
        Buttonlist[26] = Ä_Button;
        Buttonlist[27] = Ö_Button;
        Buttonlist[28] = Ü_Button;

        Stagelist[0] = Stage_1;
        Stagelist[1] = Stage_2;
        Stagelist[2] = Stage_3;
        Stagelist[3] = Stage_4;
        Stagelist[4] = Stage_5;
        Stagelist[5] = Stage_6;
    }
}//end of class

