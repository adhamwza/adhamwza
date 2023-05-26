package snakesandladders;


import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
/**
 *
 * @author Adham
 */
public class SnakesandLadders extends Application {

    @Override
    

        public void start(Stage primaryStage) throws FileNotFoundException {
        //creates the board size and adds players to the board.
        
//         Media lol = new Media("rick.mp3");
//         MediaPlayer player = new MediaPlayer(lol);
//         MediaView mediaView = new MediaView(player);
//         
//       Media media = new Media("rick.mp3");
//       MediaPlayer player = new MediaPlayer(media); 
//       player.play();
       
        Board root1 = new Board(100);
        
        root1.addPlayer();
        
        //creates a new scene with a certain size
        Scene scene1 = new Scene(root1,600,600);
      
            
        //sets a title to the scene and shows the scene.
        primaryStage.setTitle("Snakes and ladders");
        primaryStage.setScene(scene1);
        //player.play();
        primaryStage.show();
        }
        
//        public void music(){
//            Media lol = new Media("rick.mp3");
//            MediaPlayer player = new MediaPlayer(lol);
//            MediaView mediaView = new MediaView(player);
//            
//            player.play();
            
        }

    
    
       
    
