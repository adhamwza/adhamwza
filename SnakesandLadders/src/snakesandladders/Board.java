package snakesandladders;

/**
 *
 * @author Adham
 */
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javafx.animation.TranslateTransition;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.util.Duration;
//a bunch of imports in order for the codes to work

public class Board extends Pane {

    private Cell[][] cells;
    private boolean gameStart = false;//sets that the game wont start unless gamestart = true
    private int Random;//random int
    private Label RandomResult;//random label
    private int P1count = 0;//sets count1 to 0
    private int P2count = 0;//sets count2 to 0
    Label count1 = new Label();//Creates label for the count under player 1
    Label count2 = new Label(); //Creates for the count under player2
    private int cow = 1; //determines cow is = 1 on board
    private int bull = 1; //determines that bull = 1 on board
    private int XPosP1 = 15;//determines player 1 position  x wise
    private int XPosP2 = 15;//determmines player 2 position x wise
//    private boolean Player1turn = true;
//    private boolean Player2turn = false;
    HashMap<Integer, List<Integer>> DiceHashMap = new HashMap<Integer, List<Integer>>();//Hashmap to label the cells and their coordinates
    HashMap<Integer, List<Integer>> SnakeLadderlocations = new HashMap<Integer, List<Integer>>();//hashmaps to locate the snakes and ladders
    Image img7 = new Image("bull.gif");//img for the bull
    ImageView Player1 = new ImageView();//imageview for the bull AKA player 1
    Image img8 = new Image("cow.gif");//player 2 img
    ImageView Player2 = new ImageView();//imageview for the cow AKA player 2
    Button Playertwo = new Button("Player2"); //button for player 2
    Button Playerone = new Button("Player1");//button for player 1
    Image img99 = new Image("win.gif");//new img for the win screen
    ImageView win = new ImageView();//creates img
    

//Some declarations for variables and such

    
    //creates that ladderPositions and snake positions are arraylist for the x and y. Ends on line 63
    List<Integer> LadderPos5 = new ArrayList<>();
    List<Integer> LadderPos9 = new ArrayList<>();
    List<Integer> LadderPos18 = new ArrayList<>();

    List<Integer> SnakePos8 = new ArrayList<>();
    List<Integer> SnakePos20 = new ArrayList<>();
    List<Integer> SnakePos24 = new ArrayList<>();

    //Creates the positions on the board as arraylists. Ends on 93 .
    List<Integer> Pos2 = new ArrayList<>();
    List<Integer> Pos3 = new ArrayList<>();
    List<Integer> Pos4 = new ArrayList<>();
    List<Integer> Pos5 = new ArrayList<>();
    List<Integer> Pos6 = new ArrayList<>();
    List<Integer> Pos7 = new ArrayList<>();
    List<Integer> Pos8 = new ArrayList<>();
    List<Integer> Pos9 = new ArrayList<>();
    List<Integer> Pos10 = new ArrayList<>();
    List<Integer> Pos11 = new ArrayList<>();
    List<Integer> Pos12 = new ArrayList<>();
    List<Integer> Pos13 = new ArrayList<>();
    List<Integer> Pos14 = new ArrayList<>();
    List<Integer> Pos15 = new ArrayList<>();
    List<Integer> Pos16 = new ArrayList<>();
    List<Integer> Pos17 = new ArrayList<>();
    List<Integer> Pos18 = new ArrayList<>();
    List<Integer> Pos19 = new ArrayList<>();
    List<Integer> Pos20 = new ArrayList<>();
    List<Integer> Pos21 = new ArrayList<>();
    List<Integer> Pos22 = new ArrayList<>();
    List<Integer> Pos23 = new ArrayList<>();
    List<Integer> Pos24 = new ArrayList<>();
    List<Integer> Pos25 = new ArrayList<>();
    List<Integer> Pos26 = new ArrayList<>();
    List<Integer> Pos27 = new ArrayList<>();
    List<Integer> Pos28 = new ArrayList<>();
    List<Integer> Pos29 = new ArrayList<>();


     
    public Board(double cellWidth) throws FileNotFoundException {
//This section from lines 81 till 128 sets a hashmap containing the locations of the ladders and snakes and also setting their x and ys to

//one position per each x and y pair in order to make it easier to call the locations by simply saying if bull == 5 for example.



        LadderPos5.add(415);
        LadderPos5.add(220);

        LadderPos9.add(115);
        LadderPos9.add(220);

        LadderPos18.add(215);
        LadderPos18.add(20);

        SnakePos8.add(215);
        SnakePos8.add(420);

        SnakePos20.add(15);
        SnakePos20.add(420);

        SnakePos24.add(315);
        SnakePos24.add(220);


        SnakeLadderlocations.put(5, LadderPos5);
        SnakeLadderlocations.put(9, LadderPos9);
        SnakeLadderlocations.put(18, LadderPos18);
        SnakeLadderlocations.put(8, SnakePos8);
        SnakeLadderlocations.put(20, SnakePos20);
        SnakeLadderlocations.put(24, SnakePos24);

        
        //This portion adds an x and a y to each position on the hashmap , which is the arraylist we made before ends on 217
        //One might be wondering why there are 29 positions when there are only 25 cells on the board but
        //that question would be answered later because i didnt want to ruin the surprise.

        Pos2.add(115);
        Pos2.add(420);

        Pos3.add(215);
        Pos3.add(420);

        Pos4.add(315);
        Pos4.add(420);

        Pos5.add(415);
        Pos5.add(420);

        Pos6.add(415);
        Pos6.add(320);

        Pos7.add(315);
        Pos7.add(320);

        Pos8.add(215);
        Pos8.add(320);

        Pos9.add(115);
        Pos9.add(320);

        Pos10.add(15);
        Pos10.add(320);

        Pos11.add(15);
        Pos11.add(220);

        Pos12.add(115);
        Pos12.add(220);

        Pos13.add(215);
        Pos13.add(220);

        Pos14.add(315);
        Pos14.add(220);

        Pos15.add(415);
        Pos15.add(220);

        Pos16.add(415);
        Pos16.add(120);

        Pos17.add(315);
        Pos17.add(120);

        Pos18.add(215);
        Pos18.add(120);

        Pos19.add(115);
        Pos19.add(120);

        Pos20.add(15);
        Pos20.add(120);

        Pos21.add(15);
        Pos21.add(20);

        Pos22.add(115);
        Pos22.add(20);

        Pos23.add(215);
        Pos23.add(20);

        Pos24.add(315);
        Pos24.add(20);

        Pos25.add(415);
        Pos25.add(20);

        Pos26.add(315);
        Pos26.add(20);

        Pos27.add(215);
        Pos27.add(20);

        Pos28.add(115);
        Pos28.add(20);

        Pos29.add(15);
        Pos29.add(20);
        
        //This portion puts a key for the positioning that will make it easier to call each position later on. Ends on 248

        DiceHashMap.put(2, Pos2);
        DiceHashMap.put(3, Pos3);
        DiceHashMap.put(4, Pos4);
        DiceHashMap.put(5, Pos5);
        DiceHashMap.put(6, Pos6);
        DiceHashMap.put(7, Pos7);
        DiceHashMap.put(8, Pos8);
        DiceHashMap.put(9, Pos9);
        DiceHashMap.put(10, Pos10);
        DiceHashMap.put(11, Pos11);
        DiceHashMap.put(12, Pos12);
        DiceHashMap.put(13, Pos13);
        DiceHashMap.put(14, Pos14);
        DiceHashMap.put(15, Pos15);
        DiceHashMap.put(16, Pos16);
        DiceHashMap.put(17, Pos17);
        DiceHashMap.put(18, Pos18);
        DiceHashMap.put(19, Pos19);
        DiceHashMap.put(20, Pos20);
        DiceHashMap.put(21, Pos21);
        DiceHashMap.put(22, Pos22);
        DiceHashMap.put(23, Pos23);
        DiceHashMap.put(24, Pos24);
        DiceHashMap.put(25, Pos25);
        DiceHashMap.put(26, Pos26);
        DiceHashMap.put(27, Pos27);
        DiceHashMap.put(28, Pos28);
        DiceHashMap.put(29, Pos29);

        
        //
        cells = new Cell[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                cells[i][j] = new Cell(cellWidth);
                cells[i][j].setLayoutX(j * cellWidth);
                cells[i][j].setLayoutY(i * cellWidth);
                getChildren().add(cells[i][j]);
                //This portion creates a 5*5 board with a a certain layout and
                //width and length
            }
        }
        //This creates a new button called start game with a x and a y and adds it to the Pane and has a set
        //on action in order to give functionality to the button which is setting the gamestart as true in order
        //for the game to start. It also creates a restart button that takes both characters to their starting locations 
        //and removes the win picture. ends on 292
        
        Button GameButton = new Button("Start Game");
        GameButton.setTranslateX(200);
        GameButton.setTranslateY(530);
        Group root9 = new Group(GameButton);
        GameButton.setOnAction(e -> {
            GameButton.setText("Game Started");
            System.out.println("New Game!");
            gameStart = true;

        });
        Button RestartButton = new Button("Restart");
        RestartButton.setTranslateX(200);
        RestartButton.setTranslateY(570);
        getChildren().addAll(RestartButton, GameButton);
        RestartButton.setOnAction(e -> {
            gameStart = false;
            GameButton.setText("Start Game");
            getChildren().remove(win);
            bull = 1;
            this.moveBull(15, 420);
            this.moveCow(15, 440);
            cow = 1;
            Playertwo.setDisable(false);
            Playerone.setDisable(false);
        });

//This portion until lines 519 is labeling each individual cell adn setting its location, font, font weight, and font
//size. This also fills the label with a certain color and finally adds it to the board.
        Label lbl1 = new Label("1");
        lbl1.setTranslateX(10);
        lbl1.setTranslateY(400);
        Font font1 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl1.setFont(font1);
        lbl1.setTextFill(Color.BLACK);
        Group root12 = new Group(lbl1);
        getChildren().add(lbl1);

        Label lbl2 = new Label("2");
        lbl2.setTranslateX(110);
        lbl2.setTranslateY(400);
        Font font2 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl2.setFont(font2);
        lbl2.setTextFill(Color.BLACK);
        Group root13 = new Group(lbl2);
        getChildren().add(lbl2);

        Label lbl3 = new Label("3");
        lbl3.setTranslateX(210);
        lbl3.setTranslateY(400);
        Font font3 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl3.setFont(font3);
        lbl3.setTextFill(Color.BLACK);
        Group root14 = new Group(lbl3);
        getChildren().add(lbl3);

        Label lbl4 = new Label("4");
        lbl4.setTranslateX(310);
        lbl4.setTranslateY(400);
        Font font4 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl4.setFont(font4);
        lbl4.setTextFill(Color.BLACK);
        Group root15 = new Group(lbl4);
        getChildren().add(lbl4);

        Label lbl5 = new Label("5");
        lbl5.setTranslateX(410);
        lbl5.setTranslateY(400);
        Font font5 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl5.setFont(font5);
        lbl5.setTextFill(Color.BLACK);
        Group root16 = new Group(lbl5);
        getChildren().add(lbl5);

        Label lbl6 = new Label("6");
        lbl6.setTranslateX(410);
        lbl6.setTranslateY(300);
        Font font6 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl6.setFont(font6);
        lbl6.setTextFill(Color.BLACK);
        Group root17 = new Group(lbl6);
        getChildren().add(lbl6);

        Label lbl7 = new Label("7");
        lbl7.setTranslateX(310);
        lbl7.setTranslateY(300);
        Font font7 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl7.setFont(font7);
        lbl7.setTextFill(Color.BLACK);
        Group root18 = new Group(lbl7);
        getChildren().add(lbl7);

        Label lbl8 = new Label("8");
        lbl8.setTranslateX(210);
        lbl8.setTranslateY(300);
        Font font8 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl8.setFont(font8);
        lbl8.setTextFill(Color.BLACK);
        Group root19 = new Group(lbl8);
        getChildren().add(lbl8);

        Label lbl9 = new Label("9");
        lbl9.setTranslateX(110);
        lbl9.setTranslateY(300);
        Font font9 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl9.setFont(font9);
        lbl9.setTextFill(Color.BLACK);
        Group root20 = new Group(lbl9);
        getChildren().add(lbl9);

        Label lbl10 = new Label("10");
        lbl10.setTranslateX(10);
        lbl10.setTranslateY(300);
        Font font10 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl10.setFont(font10);
        lbl10.setTextFill(Color.BLACK);
        Group root21 = new Group(lbl10);
        getChildren().add(lbl10);

        Label lbl11 = new Label("11");
        lbl11.setTranslateX(10);
        lbl11.setTranslateY(200);
        Font font11 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl11.setFont(font11);
        lbl11.setTextFill(Color.BLACK);
        Group root22 = new Group(lbl11);
        getChildren().add(lbl11);

        Label lbl12 = new Label("12");
        lbl12.setTranslateX(110);
        lbl12.setTranslateY(200);
        Font font12 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl12.setFont(font12);
        lbl12.setTextFill(Color.BLACK);
        Group root23 = new Group(lbl12);
        getChildren().add(lbl12);

        Label lbl13 = new Label("13");
        lbl13.setTranslateX(210);
        lbl13.setTranslateY(200);
        Font font13 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl13.setFont(font13);
        lbl13.setTextFill(Color.BLACK);
        Group root24 = new Group(lbl13);
        getChildren().add(lbl13);

        Label lbl14 = new Label("14");
        lbl14.setTranslateX(310);
        lbl14.setTranslateY(200);
        Font font14 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl14.setFont(font14);
        lbl14.setTextFill(Color.BLACK);
        Group root25 = new Group(lbl14);
        getChildren().add(lbl14);

        Label lbl15 = new Label("15");
        lbl15.setTranslateX(410);
        lbl15.setTranslateY(200);
        Font font15 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl15.setFont(font15);
        lbl15.setTextFill(Color.BLACK);
        Group root26 = new Group(lbl15);
        getChildren().add(lbl15);

        Label lbl16 = new Label("16");
        lbl16.setTranslateX(410);
        lbl16.setTranslateY(100);
        Font font16 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl16.setFont(font16);
        lbl16.setTextFill(Color.BLACK);
        Group root27 = new Group(lbl16);
        getChildren().add(lbl16);

        Label lbl17 = new Label("17");
        lbl17.setTranslateX(310);
        lbl17.setTranslateY(100);
        Font font17 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl17.setFont(font17);
        lbl17.setTextFill(Color.BLACK);
        Group root28 = new Group(lbl17);
        getChildren().add(lbl17);

        Label lbl18 = new Label("18");
        lbl18.setTranslateX(210);
        lbl18.setTranslateY(100);
        Font font18 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl18.setFont(font18);
        lbl18.setTextFill(Color.BLACK);
        Group root29 = new Group(lbl18);
        getChildren().add(lbl18);

        Label lbl19 = new Label("19");
        lbl19.setTranslateX(110);
        lbl19.setTranslateY(100);
        Font font19 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl19.setFont(font19);
        lbl19.setTextFill(Color.BLACK);
        Group root30 = new Group(lbl19);
        getChildren().add(lbl19);

        Label lbl20 = new Label("20");
        lbl20.setTranslateX(10);
        lbl20.setTranslateY(100);
        Font font20 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl20.setFont(font20);
        lbl20.setTextFill(Color.BLACK);
        Group root31 = new Group(lbl20);
        getChildren().add(lbl20);

        Label lbl21 = new Label("21");
        lbl21.setTranslateX(10);
        lbl21.setTranslateY(0);
        Font font21 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl21.setFont(font21);
        lbl21.setTextFill(Color.BLACK);
        Group root32 = new Group(lbl21);
        getChildren().add(lbl21);

        Label lbl22 = new Label("22");
        lbl22.setTranslateX(110);
        lbl22.setTranslateY(0);
        Font font22 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl22.setFont(font22);
        lbl22.setTextFill(Color.BLACK);
        Group root33 = new Group(lbl22);
        getChildren().add(lbl22);

        Label lbl23 = new Label("23");
        lbl23.setTranslateX(210);
        lbl23.setTranslateY(0);
        Font font23 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl23.setFont(font23);
        lbl23.setTextFill(Color.BLACK);
        Group root34 = new Group(lbl23);
        getChildren().add(lbl23);

        Label lbl24 = new Label("24");
        lbl24.setTranslateX(310);
        lbl24.setTranslateY(0);
        Font font24 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl24.setFont(font24);
        lbl24.setTextFill(Color.BLACK);
        Group root35 = new Group(lbl24);
        getChildren().add(lbl24);

        Label lbl25 = new Label("25");
        lbl25.setTranslateX(410);
        lbl25.setTranslateY(0);
        Font font25 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 25);
        lbl25.setFont(font25);
        lbl25.setTextFill(Color.BLACK);
        Group root36 = new Group(lbl25);
        getChildren().add(lbl25);

//This portion adds to the board the snakes and ladders with their location and size. finishes in line 586
        Image img = new Image("snake3.gif");
        ImageView Snake1 = new ImageView();
        Snake1.setImage(img);
        Snake1.setFitHeight(250);
        Snake1.setFitWidth(100);
        Snake1.setX(25);
        Snake1.setY(170);
        Snake1.setPreserveRatio(true);
        Group root = new Group(Snake1);
        getChildren().add(Snake1);

        Image img2 = new Image("snake.gif");
        ImageView Snake2 = new ImageView();
        Snake2.setImage(img2);
        Snake2.setFitHeight(200);
        Snake2.setFitWidth(120);
        Snake2.setX(320);
        Snake2.setY(50);
        Snake2.setPreserveRatio(true);
        Group root2 = new Group(Snake2);
        getChildren().add(Snake2);

        Image img3 = new Image("snake2.gif");
        ImageView Snake3 = new ImageView();
        Snake3.setImage(img3);
        Snake3.setFitHeight(100);
        Snake3.setFitWidth(250);
        Snake3.setX(240);
        Snake3.setY(370);
        Snake3.setPreserveRatio(true);
        Group root3 = new Group(Snake3);
        getChildren().add(Snake3);

        Image img4 = new Image("ladder.gif");
        ImageView ladder1 = new ImageView();
        ladder1.setImage(img4);
        ladder1.setFitHeight(150);
        ladder1.setFitWidth(250);
        ladder1.setX(130);
        ladder1.setY(250);
        ladder1.setPreserveRatio(true);
        Group root4 = new Group(ladder1);
        getChildren().add(ladder1);

        Image img5 = new Image("ladder2.gif");
        ImageView ladder2 = new ImageView();
        ladder2.setImage(img5);
        ladder2.setFitHeight(250);
        ladder2.setFitWidth(250);
        ladder2.setX(425);
        ladder2.setY(250);
        ladder2.setPreserveRatio(true);
        Group root5 = new Group(ladder2);
        getChildren().add(ladder2);

        Image img6 = new Image("ladder3.gif");
        ImageView ladder3 = new ImageView();
        ladder3.setImage(img6);
        ladder3.setFitHeight(150);
        ladder3.setFitWidth(250);
        ladder3.setX(225);
        ladder3.setY(40);
        ladder3.setPreserveRatio(true);
        Group root6 = new Group(ladder3);
        getChildren().add(ladder3);

        //This portion creates a new label and places it on the board with a font, and a location.
        //Also places the labels count1 and count 2. Ends on 608
        RandomResult = new Label("0");
        Font font26 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 35);
        RandomResult.setFont(font26);
        RandomResult.setTranslateX(535);
        RandomResult.setTranslateY(270);
        Group root37 = new Group(RandomResult);
        getChildren().add(RandomResult);

        Font font27 = Font.font("Brush Script MT", FontWeight.BOLD, FontPosture.REGULAR, 15);
        this.count1.setText(String.valueOf(P1count));
        count1.setFont(font27);
        count1.setTranslateX(50);
        count1.setTranslateY(570);

        this.count2.setText(String.valueOf(P2count));
        count2.setFont(font27);
        count2.setTranslateX(350);
        count2.setTranslateY(570);
        getChildren().addAll(count1, count2);

        //This portion adds two buttons which are player 1 and player 2 and sets their location and
        //their set on action information such as getting the value of Random, printing in the system
        //the dice number rolled, making the button upon pressing disabled in order to guarantee turns
        //and animating the player. Ends on line 650
        
        Playertwo.setTranslateX(350);
        Playertwo.setTranslateY(530);
        Group root10 = new Group(Playertwo);
        getChildren().add(Playertwo);
        Playertwo.setOnAction(e -> {
            Playertwo.setDisable(true);
            if (gameStart) {
                GetDice();
                RandomResult.setText(String.valueOf(Random));
                System.out.println("Cow, you rolled a " + Random);
                animateCow(Random);

            }
            Playerone.setDisable(false);

        });

        Playerone.setTranslateX(50);
        Playerone.setTranslateY(530);
        Group root11 = new Group(Playerone);
        getChildren().add(Playerone);
        Playerone.setOnAction(e -> {
            
            if (gameStart) {
                
                GetDice();
                Playerone.setDisable(true);
                RandomResult.setText(String.valueOf(Random));
                System.out.println("Bull, you rolled a " + Random);
                animateBull(Random);
            }
            
            Playertwo.setDisable(false);

        });
    }

    //This portion creates a math.random function for the dice and is limited from 1 to 6, also this portion
    //includes several if statements to show an image of the dice depending of the random number picked out by
    //the function. Ends on line 717
    public void GetDice() {

        Random = (int) (Math.random() * 6 + 1);
        switch (Random) {
            case 1:
                Image img7 = new Image("dice1.gif");
                ImageView dice1 = new ImageView();
                dice1.setImage(img7);
                dice1.setTranslateX(535);
                dice1.setTranslateY(200);
                Group root38 = new Group();
                getChildren().add(dice1);
                break;
            case 2:
                Image img8 = new Image("dice2.gif");
                ImageView dice2 = new ImageView();
                dice2.setImage(img8);
                dice2.setTranslateX(535);
                dice2.setTranslateY(200);
                Group root39 = new Group();
                getChildren().add(dice2);
                break;
            case 3:
                Image img9 = new Image("dice3.gif");
                ImageView dice3 = new ImageView();
                dice3.setImage(img9);
                dice3.setTranslateX(535);
                dice3.setTranslateY(200);
                Group root40 = new Group();
                getChildren().add(dice3);
                break;
            case 4:
                Image img10 = new Image("dice4.gif");
                ImageView dice4 = new ImageView();
                dice4.setImage(img10);
                dice4.setTranslateX(535);
                dice4.setTranslateY(200);
                Group root41 = new Group();
                getChildren().add(dice4);
                break;
            case 5:
                Image img11 = new Image("dice5.gif");
                ImageView dice5 = new ImageView();
                dice5.setImage(img11);
                dice5.setTranslateX(535);
                dice5.setTranslateY(200);
                Group root42 = new Group();
                getChildren().add(dice5);
                break;
            case 6:
                Image img12 = new Image("dice6.gif");
                ImageView dice6 = new ImageView();
                dice6.setImage(img12);
                dice6.setTranslateX(535);
                dice6.setTranslateY(200);
                Group root43 = new Group();
                getChildren().add(dice6);
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
   //This portion adds both the bull and the cow to the map, however we dont need to declare them
    //as imageviews because we already did so up top, we just call them by their img no.Ends on line 740

    public void addPlayer() {
        Player1.setImage(img7);
        Player1.setFitHeight(50);
        Player1.setFitWidth(50);
        Player1.setTranslateX(15);
        Player1.setTranslateY(420);
        Player1.setPreserveRatio(true);
        Group root7 = new Group(Player1);
        getChildren().add(Player1);

        Player2.setImage(img8);
        Player2.setFitHeight(50);
        Player2.setFitWidth(50);
        Player2.setTranslateX(15);
        Player2.setTranslateY(460);
        Player2.setPreserveRatio(true);
        Group root8 = new Group(Player2);
        getChildren().add(Player2);

    }
    //This portion animates the bull to a certain point in the span of 2 seconds using the translate tansition, and the remove player 1 
    //image to avoid after images. Ends on 760


    public void moveBull(int x, int y) {

        Group root7 = new Group(Player1);
        getChildren().remove(Player1);
        Player1.setImage(img7);
        Player1.setFitHeight(50);
        Player1.setFitWidth(50);
        TranslateTransition translate = new TranslateTransition();
        translate.setDuration(Duration.seconds(2));
        translate.setNode(Player1);
        translate.setToX(x);
        translate.setToY(y);
        translate.play();
        getChildren().add(Player1);
        Player1.setPreserveRatio(true);

    }
    //This portion moves the bull depending of the dice number rolled and if bull has reahed cell 25, it 
    //prints out player 1 won and displays a YOU WIN screen. Also if player is not on 25
    //the pain method is called. This will be discussed later also. End on line 885.

    public void animateBull(int diceNum) {
        this.Random = diceNum;
        if (diceNum == 1) {
            bull += diceNum;
            if (bull >= 25) {
                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");

            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }
        }
        if (diceNum == 2) {
            bull += diceNum;
            if (bull == 25) {

                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");
            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }
        }
        if (diceNum == 3) {

            bull += diceNum;
            if (bull == 25) {

                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");
            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }
        }
        if (diceNum == 4) {
            bull += diceNum;
            if (bull == 25) {

                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");
            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }

        }
        if (diceNum == 5) {
            bull += diceNum;
            if (bull == 25) {

                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");
            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }
        }
        if (diceNum == 6) {
            bull += diceNum;
            if (bull == 25) {

                P1count++;
                this.count1.setText(String.valueOf(P1count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 1 WON!!!");
            } else {
                painbull();
                List<Integer> List = DiceHashMap.get(bull);
                int x = List.get(0);
                int y = List.get(1);
                this.moveBull(x, y);
            }
        }
        moveSnakeLadderBull();
    }
    //This is a copy and paste of the aniamtion and movement of the bull code, however, the only change
    //is changing the naming to cow instead of bull. Ends on line 1042 

    public void moveCow(int x, int y) {

        Group root8 = new Group(Player2);
        getChildren().remove(Player2);
        Player2.setImage(img8);
        Player2.setFitHeight(50);
        Player2.setFitWidth(50);
        TranslateTransition translate = new TranslateTransition();
        translate.setDuration(Duration.seconds(2));
        translate.setNode(Player2);
        translate.setToX(x);
        translate.setToY(y + 20);
        translate.play();
        Player2.setPreserveRatio(true);
        getChildren().add(Player2);
    }

    public void animateCow(int diceNum) {


        this.Random = diceNum;
        if (diceNum == 1) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");

            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }
        }
        if (diceNum == 2) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");


            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }
        }
        if (diceNum == 3) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");


            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }
        }
        if (diceNum == 4) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");

            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }

        }
        if (diceNum == 5) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");
//            }else if(cow == 24) {
//                cow = 21;}
//            else if(cow == 24) {
//                cow = 22;} 
//            else if(cow == 24){
//                cow = 23;
//            } else if(cow == 24){
//                cow = 24;
            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }
        }
        if (diceNum == 6) {
            cow += diceNum;
            if (cow == 25) {

                P2count++;
                this.count2.setText(String.valueOf(P2count));
                win.setImage(img99);
                win.setFitHeight(500);
                win.setFitWidth(600);
                getChildren().add(win);
                System.out.println("Player 2 WON!!!");


            } else {
                paincow();
                List<Integer> List = DiceHashMap.get(cow);
                int x = List.get(0);
                int y = List.get(1);
                this.moveCow(x, y);
            }
        }
        moveSnakeLadderCow();
    }

    //This portion just declares what should happen to the bull or the cow if they stop on a cell
    //containing either a snake or a ladder. Ends on line 1100.
    public void moveSnakeLadderCow() {
        switch (this.cow) {
            case 5: {
                List<Integer> List = SnakeLadderlocations.get(5);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 15;
                this.moveCow(x, y);
                break;
            }
            case 9: {
                List<Integer> List = SnakeLadderlocations.get(9);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 12;
                this.moveCow(x, y);
                break;
            }
            case 18: {
                List<Integer> List = SnakeLadderlocations.get(18);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 23;
                this.moveCow(x, y);
                break;
            }
            case 8: {
                List<Integer> List = SnakeLadderlocations.get(8);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 3;
                this.moveCow(x, y);
                break;
            }
            case 20: {
                List<Integer> List = SnakeLadderlocations.get(20);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 1;
                this.moveCow(x, y);
                break;
            }
            case 24: {
                List<Integer> List = SnakeLadderlocations.get(24);
                int x = List.get(0);
                int y = List.get(1);
                this.cow = 14;
                this.moveCow(x, y);
                break;
            }
            default:
                break;
        }
    }

    //The pain method, this method guarantees that if for example the cow is on cell 23 and rolls anything
    //above 2 it takes them back depending on the remainder of the dice number, so if cow rolls a 3 they are
    //placed on cell 24. Furthermore this explains why there are 29 locations on the declarations part because
    //the system adds on, so it is 23 + 3 = 26, therefore it had to be set to its new location. Ends on 1121.
    public void paincow() {

        if (this.cow == 26) {
            this.cow = 24;
        }
        if (this.cow == 27) {
            this.cow = 23;
        }
        if (this.cow == 28) {
            this.cow = 22;

        }
        if (this.cow == 29) {
            this.cow = 21;


        }
    }

    //same method as pain cow but for the bull. Ends on 1140
    public void painbull() {

        if (this.bull == 26) {
            this.bull = 24;
        }
        if (this.bull == 27) {
            this.bull = 23;
        }
        if (this.bull == 28) {
            this.bull = 22;

        }
        if (this.bull == 29) {
            this.bull = 21;
        }
    }

        //This portion just declares what should happen to the bull or the cow if they stop on a cell
    //containing either a snake or a ladder. Ends on line 1200.
    public void moveSnakeLadderBull() {
        switch (this.bull) {
            case 5: {
                List<Integer> List = SnakeLadderlocations.get(5);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 15;
                this.moveBull(x, y);
                break;
            }
            case 9: {
                List<Integer> List = SnakeLadderlocations.get(9);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 12;
                this.moveBull(x, y);
                break;
            }
            case 18: {
                List<Integer> List = SnakeLadderlocations.get(18);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 23;
                this.moveBull(x, y);
                break;
            }
            case 8: {
                List<Integer> List = SnakeLadderlocations.get(8);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 3;
                this.moveBull(x, y);
                break;
            }
            case 20: {
                List<Integer> List = SnakeLadderlocations.get(20);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 1;
                this.moveBull(x, y);
                break;
            }
            case 24: {
                List<Integer> List = SnakeLadderlocations.get(24);
                int x = List.get(0);
                int y = List.get(1);
                this.bull = 14;
                this.moveBull(x, y);
                break;
            }
            default:
                break;
        }
    }
}

