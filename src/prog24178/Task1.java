/*
 * Name : Soni Kunj Mayurkumar
 * Student ID : 991591881
 * Performed Date : 16 July 2020 
 * Project : Design the calculator as per the project instruction with the help of JavaFX and functionality in assignment 4 design.
 * Modification in Assignment4 
 * Adding functionality in Assignment4
 */

package prog24178;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Task1 extends javafx.application.Application{
		//Declaring the variables.
		Label val1,val2,message;
		Button multiply,divide,addition,subtraction;
		TextField value1,value2;
	
		// main class to generate the design
		public static void main(String[] args) {
		launch(args);
		}//end of main method

		// Override the start method in the Application class
		@Override
		public void start(Stage as) throws Exception {
		val1 = new Label("Value 1:");
		val2 = new Label("Value 2:");
		
		message = new Label("(there is a label here but you can't see it yet)");
		message.setTextFill(Color.BLUE);
		
		multiply = new Button("_Multiply");
		divide = new Button("_Divide");
		addition = new Button("_Add");
		subtraction = new Button("_Subtract");
		
		value1 =new TextField();
		value2 = new TextField();
		
		//Create a pane for all the variables except for buttons and set its properties
		GridPane g = new GridPane();
		g.setAlignment(Pos.CENTER);
		g.setPadding(new Insets(4,4,4,10));
		g.setVgap(10);
		g.setHgap(10);
		
		ColumnConstraints c1 = new ColumnConstraints();
		c1.setPercentWidth(30);
		
		ColumnConstraints c2 = new ColumnConstraints();
		c2.setPercentWidth(70);
		
		g.getColumnConstraints().addAll(c1,c2);
		
		g.add(val1, 0, 0);
		GridPane.setHalignment(val1, HPos.RIGHT);
		g.add(value1,1,0);
		
		g.add(val2, 0, 1);
		GridPane.setHalignment(val2, HPos.RIGHT);
		g.add(value2,1,1);
		
		//Create a pane for buttons and set its properties
		GridPane g1 = new GridPane();
		
		g1.setHgap(9);
		multiply.setPrefWidth(100);
		divide.setPrefWidth(100);
		addition.setPrefWidth(100);
		subtraction.setPrefWidth(100);
		
		g1.add(multiply, 0, 1);
		g1.add(divide, 1, 1);
		g1.add(addition, 2, 1);
		g1.add(subtraction, 3, 1);
		
		g.add(g1, 0, 2);
		
		GridPane.setColumnSpan(g1,2);
		
		g.add(message, 0, 3);
		
		GridPane.setColumnSpan(message, 3);
		
		GridPane.setHalignment(message, HPos.CENTER);
		
		//Create a scene and place a button in the scene
		Scene scene = new Scene(g,370, 170);
		
		// Place the scene in the stage
		as.setScene(scene);
		
		// Set the stage title
		as.setTitle("Calculator");
		
		// Display the stage
		as.show();
		
		//Assignment5 Starts from here
		
		//Action for multiplication
		multiply.setOnAction(e->{
			double aaa = Double.parseDouble(value1.getText());
			double bbb = Double.parseDouble(value2.getText());
			
			//to get the name of button in result
			Button btnClicked = (Button)e.getSource();
			//to remove mnemonics '_' in result
			String ddd = btnClicked.getText().substring(1);
			
			//calculation for multiplication
			double ccc = aaa*bbb;
			message.setText("the "+ ddd + " of " + aaa + " and "+ bbb +" is " + ccc);
			});
		
		//action for division
		divide.setOnAction(e->{
			double aaa = Double.parseDouble(value1.getText());
			double bbb = Double.parseDouble(value2.getText());
			
			//to get the name of button in result
			Button btnClicked = (Button)e.getSource();
			//to remove mnemonics '_' in result
			String ddd = btnClicked.getText().substring(1);
			
			//calculation for division
			double ccc = aaa/bbb;
			message.setText("the "+ddd+" of " + aaa + " and "+ bbb +" is " + ccc);
			});
		
		//action for addition
		addition.setOnAction(e->{
			double aaa = Double.parseDouble(value1.getText());
			double bbb = Double.parseDouble(value2.getText());
			
			//to get the name of button in result
			Button btnClicked = (Button)e.getSource();
			//to remove mnemonics '_' in result
			String ddd = btnClicked.getText().substring(1);
			
			//calculation for addition
			double ccc = aaa+bbb;
			message.setText("the "+ ddd+" of " + aaa + " and "+ bbb +" is " + ccc);
			});
		
		//action for subtraction
		subtraction.setOnAction(e->{
			double aaa = Double.parseDouble(value1.getText());
			double bbb = Double.parseDouble(value2.getText());
			
			//to get the name of button in result
			Button btnClicked = (Button)e.getSource();
			//to remove mnemonics '_' in result
			String ddd = btnClicked.getText().substring(1);
			
			//calculation for subtraction
			double ccc = aaa-bbb;
			message.setText("the "+ ddd+ " of " + aaa + " and "+ bbb +" is " + ccc);
			});
	}

}//end of class
