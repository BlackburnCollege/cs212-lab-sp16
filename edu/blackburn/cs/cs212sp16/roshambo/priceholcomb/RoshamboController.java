/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.priceholcomb;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author olivia.price
 */
public class RoshamboController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField output;
    private int playercount = 0;
    private int computerCount = 0;
    private int player;
    private static int ROCK = 1;
    private static int PAPER = 2;
    private static int SCISSORS = 3;
    
    @FXML
    private void handleRock(ActionEvent event) {
        player = ROCK;
        this.output.setText(Integer.toString(this.playercount));
    }
    public static int getRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
