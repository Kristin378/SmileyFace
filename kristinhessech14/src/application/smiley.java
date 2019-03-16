package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class smiley extends Application {

	@Override
	public void start(Stage primaryStage) {
		Circle circle = new Circle();
		circle.setCenterX(250);
		circle.setCenterY(250);
		circle.setRadius(235);
		circle.setStroke(Color.BLACK);
		circle.setFill(null);
		
		Circle eye1 = new Circle();
		Circle eye2 = new Circle();
		Circle pupil1 = new Circle();
		Circle pupil2 = new Circle();
		
		pupil1.setCenterX(125);
		pupil1.setCenterY(125);
		pupil1.setRadius(13);
		pupil1.setStroke(Color.BLACK);
		pupil1.setFill(Color.BLACK);
		
		pupil2.setCenterX(350);
		pupil2.setCenterY(125);
		pupil2.setRadius(13);
		pupil2.setStroke(Color.BLACK);
		pupil2.setFill(Color.BLACK);
		
		eye1.setCenterX(125);
		eye1.setCenterY(125);
		eye1.setRadius(35);
		eye1.setStroke(Color.BLUE);
		eye1.setFill(Color.BLUE);
		
		eye2.setCenterX(350);
		eye2.setCenterY(125);
		eye2.setRadius(35);
		eye2.setStroke(Color.BLUE);
		eye2.setFill(Color.BLUE);
	    
		Arc arc1 = new Arc(250, 175, 120, 150, 243, 50);
		
		arc1.setFill(Color.LIGHTBLUE);
		arc1.setType(ArcType.ROUND);
		arc1.setStroke(Color.DARKBLUE);
		
		Arc arc2 = new Arc(268, 192, 200, 215, 222, 85);
		
		arc2.setFill(Color.WHITE);
		arc2.setType(ArcType.OPEN);
		arc2.setStroke(Color.BLACK);
		
		
	 // Create a pane to hold the circle 
	    Pane pane = new Pane();
	    pane.getChildren().add(circle);
	    
	    pane.getChildren().add(eye1);
	    pane.getChildren().add(eye2);
	    pane.getChildren().add(pupil1);
	    pane.getChildren().add(pupil2);
	    pane.getChildren().add(arc1);
	    pane.getChildren().add(arc2);
	   
	    
	    
	    
	    
	    
	    // Create a scene and place it in the stage
	    Scene scene = new Scene(pane, 500, 500);
	    primaryStage.setTitle("smiley"); // Set the stage title
	    primaryStage.setScene(scene); // Place the scene in the stage
	    primaryStage.show(); // Display the stage
	  }
	
		
	

	public static void main(String[] args) {
		launch(args);
	}
}
