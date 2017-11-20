//Caleb Miller and is own work//
package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class Main extends Application {
	
	BorderPane bp = new BorderPane();
	VBox vb = new VBox();
	HBox hb = new HBox();
	static double diskSpace1 = 0;
	static double diskSpace2 = 0;
	static double diskSpace3 = 0;
	static double diskSpace4 = 0;
	
    
	@Override
	public void start(Stage primaryStage) {
        
		vb.setPadding(new Insets(10));
		vb.setSpacing(8);
		
		Label label = new Label("Enter a video length in seconds:");
		label.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		Label label2 = new Label();
		label2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		Label label3 = new Label();
		label3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		Label label4 = new Label();
		label4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
		
		TextField tf = new TextField();
		
		vb.getChildren().addAll(label,tf);
		
		Button submit = new Button("Submit");
		submit.setOnAction(e -> {
			int l = Integer.valueOf(tf.getText());
			videoCalc sizeVideo1 = new videoCalc(720, l);
		    videoCalc sizeVideo2 = new videoCalc(1080, l);
	        diskSpace1 = sizeVideo1.getFileSizeGB();
	        diskSpace2 = sizeVideo2.getFileSizeGB();
	        diskSpace3 = sizeVideo1.getFileSizeMB();
	        diskSpace4 = sizeVideo2.getFileSizeMB();
	        if ((tf.getText() != null && !tf.getText().isEmpty())) {
	        	 label2.setText("A video with a resolution of " + sizeVideo1.getResolution() + "p\n"
	        		        +"with a length of " + sizeVideo1.getVideoLength() + " seconds,\n"
	        		        +"will require " + String.format( "%.2f", diskSpace3 )+ " GB of disk space and " + String.format( "%.2f", diskSpace1 )+ " MB of disk space.");
	        	        
	        	  label3.setText("");
	        	        
	        	  label4.setText("A video with a resolution of " + sizeVideo2.getResolution() + "p\n"
	        	            +"with a length of " + sizeVideo2.getVideoLength() + " seconds,\n"
	        	            +"will require " + String.format( "%.2f", diskSpace4 )+ " GB of disk space and " + String.format( "%.2f", diskSpace2 )+ " MB of disk space.");
	        } else {
	            label2.setText("You have not given a time.");
	        }
		});	
	
		bp.setTop(vb);
		bp.setRight(submit);
		bp.setBottom(hb);
		bp.setLeft(label2);
		bp.setBottom(label4);
		
		Scene scene = new Scene(bp,700,190);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Video Estimate");
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
