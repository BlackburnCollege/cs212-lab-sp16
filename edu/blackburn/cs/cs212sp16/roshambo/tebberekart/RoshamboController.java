/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.blackburn.cs.cs212sp16.roshambo.tebberekart;

import java.net.*;
import java.util.*;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

/**
 * FXML Controller class
 *
 * @author dakota.tebbe
 */
public class RoshamboController implements Initializable {
    @FXML
    private TextField output;
    
    private int choice;
    private int counter=0;
    
    @FXML
    private void handleRock(ActionEvent event) {
        this.choice=1;
        this.output.setText(Integer.toString(this.choice));
    }
    
    @FXML
    private void handlePaper(ActionEvent event) {
        this.choice=2;
        this.output.setText(Integer.toString(this.choice));
    }
    
    @FXML
    private void handleScissors(ActionEvent event) {
        this.choice=3;
        this.output.setText(Integer.toString(this.choice));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
