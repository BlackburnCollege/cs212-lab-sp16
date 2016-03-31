/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.rainfordsmith;


import java.net.*;
import java.util.*;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author shelby.rainford
 */
public class RoshamboController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    private TextField output;
    
    private int counter = 0;
    
    private int kPWins = 0;
    
    private int ties = 0;
    
    private int scarlettWins = 0;
    
    private final int ROCK = 1;
    
    private final int SCISSORS = 2;
    
    private final int PAPER = 3;
    
    private int playerChoice;
    
    private int computerChoice;
    
    @FXML
    private void handleRock(ActionEvent event) {
        this.playerChoice = ROCK;
        this.output.setText(Integer.toString(ROCK));
    }
    
    @FXML
    private void handleScissors(ActionEvent event) {
        this.playerChoice = SCISSORS;
        //this.output.setText(Integer.toString(this.counter));
    }
    @FXML
    private void handlePaper(ActionEvent event) {
        this.playerChoice = PAPER;
        //this.output.setText(Integer.toString(this.counter));
    }
    
    private void play(){
        
    }
}
