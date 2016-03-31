/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.vanwormerlevan;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author student
 */
public class RoshamboController implements Initializable {
    private int playerWins = 0;
    private int aiWins = 0;
    private int ties = 0;
    private String playerChoice;
    private String aiChoice;
    private Random r = new Random();
    @FXML
    private TextField player;
    @FXML
    private TextField ai;
    @FXML
    private TextField tie;
    @FXML
    private TextField playerMove;
    @FXML
    private TextField aiMove;
    @FXML
    private TextField whoWins;
    @FXML
    private void handleRock(ActionEvent event) {
        this.playerChoice = "rock";
        ai();
    }
    @FXML
    private void handlePaper(ActionEvent event) {
        this.playerChoice = "paper";
        ai();
    }
    @FXML
    private void handleScissor(ActionEvent event) {
        this.playerChoice = "scissors";
        ai();
    }
    private void ai() {
        int rng = r.nextInt(2 - 0 + 1) + 0;
        if (rng == 0) {
            this.aiChoice = "rock";
        } else if (rng == 1) {
            this.aiChoice = "paper";
        } else {
            this.aiChoice = "scissors";
        }
        compareChoices();
    }
    private void compareChoices() {
        if (this.playerChoice.equals("rock") && this.aiChoice.equals("scissors")) {
            this.playerWins++;
            whoWins.setText("Player Wins!");
        } else if (this.playerChoice.equals("scissors") && this.aiChoice.equals("paper")) {
            this.playerWins++;
            whoWins.setText("Player Wins!");
        } else if (this.playerChoice.equals("paper") && this.aiChoice.equals("rock")) {
            this.playerWins++;
            whoWins.setText("Player Wins!");
        } else if (this.playerChoice.equals(this.aiChoice)) {
            ties++;
            whoWins.setText("The Game is a Tie!");
        } else {
            aiWins++;
            whoWins.setText("The computer wins!");
        }
        player.setText(Integer.toString(this.playerWins));
        ai.setText(Integer.toString(this.aiWins));
        tie.setText(Integer.toString(this.ties));
        playerMove.setText("Player Choice = " + playerChoice);
        aiMove.setText("Computer's Choice = " + aiChoice);
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
