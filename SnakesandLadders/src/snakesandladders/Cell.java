
package snakesandladders;

/**
 *
 * @author Adham
 */
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Cell extends StackPane{
    private boolean empty;
    private Rectangle rectangle;
    //Just sets the layout of the board and the colors to fill the lining of the cells and 
    //the insides of the cells.
    public Cell(double cellWidth){
        empty = true;
        rectangle = new Rectangle();
        rectangle.setWidth(cellWidth);
        rectangle.setHeight(cellWidth);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        getChildren().add(rectangle);
        

        
        
   

    }
}