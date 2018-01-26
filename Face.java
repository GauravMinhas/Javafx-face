/**
 * 
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * To create a face using JavaFX.
 * @author Gaurav Minhas
 * @version 1
 *
 */
public class Face extends Application {
    
    /** Scene WIDTH. */
    public static final int SCENE_WIDTH = 500;
    
    /**  WIDTH center. */
    public static final int WIDTH_CENTER = 250;
    
    /** Total degrees in a circle. */
    public static final int FULL_CIRCLE = 360;
    
    /** Opacity of the colors if applicable.     */
    public static final float OPACITY = 0.85f;
    
    
    /** Bias of three. */
    public static final int B3 = 3;
    
    /** Bias of four. */
    public static final int B4 = 4;
    
    /** Bias of five. */
    public static final int B5 = 5;
    
    /** Bias of six. */
    public static final int B6 = 6;
    
    /** Bias of seven. */
    public static final int B7 = 7;
    
    /** Bias of eight. */
    public static final int B8 = 8;
    
    /** Bias of ten. */
    public static final int B10 = 10;
    
    /** Bias of twenty. */
    public static final int B20 = 20;
    
    /** Bias of thirty. */
    public static final int B30 = 30;
    
    /** Bias of Forty. */
    public static final int B40 = 40;
    
    /** Bias of Fifty. */
    public static final int B50 = 50;
    
    /** Number 80. */
    public static final int EIGHTY = 80;
    
    /** Number 90. */
    public static final int NINETY = 90;
    
    

    /** To generate the face.
     *  @param primaryStage sent from main().
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        
        Arc face = new Arc(WIDTH_CENTER, WIDTH_CENTER + B30, 
                           FULL_CIRCLE / 2 - B20, WIDTH_CENTER,
                           FULL_CIRCLE / 2, FULL_CIRCLE / 2);
        face.setStroke(Color.web("#000000", OPACITY));
        face.setStrokeWidth(B5);
        face.setFill(Color.web("FFDCB2"));
        Line line1 = new Line(NINETY,  WIDTH_CENTER + B30,
                              EIGHTY, WIDTH_CENTER - B20);
        line1.setStroke(Color.BLACK);
        line1.setStrokeWidth(B5);
        Line line2 = new Line(SCENE_WIDTH - NINETY, WIDTH_CENTER + B30, 
                              SCENE_WIDTH - EIGHTY, WIDTH_CENTER - B20);
        line2.setStroke(Color.BLACK);
        line2.setStrokeWidth(B5);
        Line line3 = new Line(EIGHTY, NINETY + B40, 
                                EIGHTY, WIDTH_CENTER - B20);
        line3.setStroke(Color.BLACK);
        line3.setStrokeWidth(2);
        Line line4 = new Line(SCENE_WIDTH - EIGHTY, WIDTH_CENTER - B20,
                                SCENE_WIDTH - EIGHTY, NINETY + B40);
        line4.setStroke(Color.BLACK);
        line4.setStrokeWidth(2);
        Line line5 = new Line(NINETY, WIDTH_CENTER + B10,
                                NINETY + B20 + B5, WIDTH_CENTER - B40);
        line5.setStroke(Color.BLACK);
        line5.setStrokeWidth(2);
        Line line6 = new Line(SCENE_WIDTH - NINETY, WIDTH_CENTER + B10,
                                FULL_CIRCLE + B20 + B5, WIDTH_CENTER - B40);
        line6.setStroke(Color.BLACK);
        line6.setStrokeWidth(2);
        Line line7 = new Line(WIDTH_CENTER - B10, WIDTH_CENTER + B30 + B4,
                                WIDTH_CENTER - B40, FULL_CIRCLE + B20);
        line7.setStroke(Color.BLACK);
        line7.setStrokeWidth(2);
        Line line8 = new Line(WIDTH_CENTER + B10, WIDTH_CENTER + B30 + B4,
                              WIDTH_CENTER + B40, FULL_CIRCLE + B20);
        line8.setStroke(Color.BLACK);
        line8.setStrokeWidth(2);
        
        Polygon nose = new Polygon(WIDTH_CENTER - B10, WIDTH_CENTER + B30 + B4,
                                    WIDTH_CENTER - B40, FULL_CIRCLE + B20,
                                    WIDTH_CENTER + B40,  FULL_CIRCLE + B20,
                                    WIDTH_CENTER + B10, WIDTH_CENTER + B30 + B4,
                                    WIDTH_CENTER + B10, FULL_CIRCLE - NINETY,
                                    WIDTH_CENTER - B10, FULL_CIRCLE - NINETY);
        nose.setFill(Color.web("#FFDFC4"));
        Polygon p1 = new Polygon(NINETY, WIDTH_CENTER + B30,
                                 EIGHTY, WIDTH_CENTER - B20,
                                 EIGHTY, WIDTH_CENTER - B40,
                                 SCENE_WIDTH - EIGHTY, WIDTH_CENTER - B40,
                                 SCENE_WIDTH - EIGHTY, WIDTH_CENTER - B20,
                                 SCENE_WIDTH - NINETY, WIDTH_CENTER + B30);
        p1.setFill(Color.web("FFDCB2"));
        Polygon p2 = new Polygon(NINETY - 2, WIDTH_CENTER + B10 + 2,
                                 EIGHTY, WIDTH_CENTER - B20, 
                                 EIGHTY, WIDTH_CENTER - B40,
                                 NINETY + B20 + B5, WIDTH_CENTER - B40);
        p2.setFill(Color.web("#000000", OPACITY));
        Polygon p3 = new Polygon(SCENE_WIDTH - NINETY + 2,
                                 WIDTH_CENTER + B10 + 2, SCENE_WIDTH - EIGHTY,
                                 WIDTH_CENTER - B20, SCENE_WIDTH - EIGHTY,
                                 WIDTH_CENTER - B40, FULL_CIRCLE + B20 + B5,
                                 WIDTH_CENTER - B40);
        p3.setFill(Color.web("#000000", OPACITY));
        Arc a1 = new Arc(WIDTH_CENTER - B20 + 1, FULL_CIRCLE + B20 - 1,
                 B6 + B8, B8, FULL_CIRCLE / 2 + B10, FULL_CIRCLE / 2 - B20);
        a1.setFill(Color.BLACK);
        Arc a2 = new Arc(WIDTH_CENTER + B20 - 1, FULL_CIRCLE + B20 - 1,
                B6 + B8, B8, FULL_CIRCLE / 2 + B10, FULL_CIRCLE / 2 - B20);
        a2.setFill(Color.BLACK);
        Arc a3 = new Arc(WIDTH_CENTER - B20 + 1, FULL_CIRCLE + B20 + B3, 
                        B6 + B8, B8, B10, FULL_CIRCLE / 2 - B20);
        a3.setFill(Color.BLACK);
        Arc a4 = new Arc(WIDTH_CENTER + B20 - 1, FULL_CIRCLE + B20 + B3, 
                B6 + B8, B8, B10, FULL_CIRCLE / 2 - B20);
        a4.setFill(Color.BLACK);
        Rectangle rect1 = new Rectangle(EIGHTY - 1, NINETY + B40, 
                FULL_CIRCLE - B20, EIGHTY);
        rect1.setFill(Color.web("#000000", OPACITY));        
        Rectangle rect2 = new Rectangle(WIDTH_CENTER - B5, FULL_CIRCLE,
                                        B10, B20);
        rect2.setFill(Color.web("#FFDFC4"));
        
        Arc e3 = new Arc(WIDTH_CENTER, FULL_CIRCLE + B20, B40, B10 + B6,
                    NINETY + EIGHTY, WIDTH_CENTER - B50);
        e3.setFill(Color.web("#E5A073"));
        
        Arc forehead = new Arc(WIDTH_CENTER, WIDTH_CENTER - B30,
                NINETY + B40 + B5, NINETY + B10, 0, FULL_CIRCLE / 2);
        forehead.setFill(Color.web("FFDCB2"));
        
        Arc head = new Arc(WIDTH_CENTER, NINETY + B40, NINETY + EIGHTY,
                NINETY + B10, 0, FULL_CIRCLE / 2);
        head.setFill(Color.web("#000000", OPACITY));
        head.setStroke(Color.BLACK);
        head.setStrokeWidth(2);
        
        
        
        
        Arc leftEyeUpper = new Arc(NINETY + EIGHTY + B3,
                WIDTH_CENTER + B30 + B5, B30 + B5, B20, B20, NINETY + B50);
        leftEyeUpper.setFill(Color.WHITE);
        leftEyeUpper.setStroke(Color.BLACK);
        leftEyeUpper.setStrokeWidth(2);
        
        Arc leftEyeLower = new Arc(NINETY + EIGHTY + B3, WIDTH_CENTER + B20,
                B30 + B5, B20, WIDTH_CENTER - B50, NINETY + B50);
        leftEyeLower.setFill(Color.WHITE);
        leftEyeLower.setStroke(Color.BLACK);
        leftEyeLower.setStrokeWidth(2);
        
        Arc rightEyeUpper = new Arc(WIDTH_CENTER + EIGHTY - B3,
                WIDTH_CENTER + B30 + B5, B30 + B5, B20, B20, NINETY + B50);
        rightEyeUpper.setFill(Color.WHITE);
        rightEyeUpper.setStroke(Color.BLACK);
        rightEyeUpper.setStrokeWidth(2);
        
        Arc rightEyeLower = new Arc(WIDTH_CENTER + EIGHTY - B3,
                WIDTH_CENTER + B20, B30 + B5, B20, 
                WIDTH_CENTER - B50, NINETY + B50);
        rightEyeLower.setFill(Color.WHITE);
        rightEyeLower.setStroke(Color.BLACK);
        rightEyeLower.setStrokeWidth(2);
        
        
        Circle leftEyeBall = new Circle(NINETY + EIGHTY + B3, 
                WIDTH_CENTER + B30 - B3, B10 + 2);
        leftEyeBall.setFill(Color.web("#603101"));
        leftEyeBall.setStroke(Color.BLACK);
        leftEyeBall.setStrokeWidth(2);
        
        Circle rightEyeBall = new Circle(WIDTH_CENTER + EIGHTY - B3,
                WIDTH_CENTER + B30 - B3, B10 + 2);
        rightEyeBall.setFill(Color.web("#603101"));
        rightEyeBall.setStroke(Color.BLACK);
        rightEyeBall.setStrokeWidth(2); 
        
        Circle leftPupil = new Circle(NINETY + EIGHTY + B3, 
                WIDTH_CENTER + B30 - B3, B6);
        leftPupil.setFill(Color.BLACK);
        
        Circle rightPupil = new Circle(WIDTH_CENTER + EIGHTY - B3,
                WIDTH_CENTER + B30 - B3, B6);
        rightPupil.setFill(Color.BLACK);
        
        Arc lipMiddle = new Arc(WIDTH_CENTER, FULL_CIRCLE + B10,
                FULL_CIRCLE / 2 - B20, B50 + B5, WIDTH_CENTER - B3, B40 + B6);
        lipMiddle.setFill(Color.BLACK);
        lipMiddle.setStroke(Color.BLACK);
        lipMiddle.setStrokeWidth(2);
        
        Arc upperLip = new Arc(WIDTH_CENTER, SCENE_WIDTH - B40 - B5,
                NINETY + B10, B50, B40 + B5, NINETY);
        upperLip.setFill(Color.web("#C98276"));
        upperLip.setStroke(Color.web("#E5A073"));
        upperLip.setStrokeWidth(2);
        
        Arc lowerLip = new Arc(WIDTH_CENTER, FULL_CIRCLE + 2, NINETY + B5,
                EIGHTY + B5, WIDTH_CENTER + B3 - B30, NINETY + B4);
        lowerLip.setFill(Color.web("#C98276"));
        lowerLip.setStroke(Color.web("#E5A073"));
        lowerLip.setStrokeWidth(2);
        
        Arc leftEyebrow = new Arc(NINETY + B30 + B5, WIDTH_CENTER + B40, 
                NINETY + B30, B50, B20, B50 + B20);
      //  leftEyebrow.setFill(Color.TRANSPARENT);
        leftEyebrow.setStroke(Color.BLACK);
        leftEyebrow.setStrokeWidth(B5);
        
        Arc rightEyebrow = new Arc(FULL_CIRCLE + B10 + B5, WIDTH_CENTER + B40,
                 NINETY + B30, B50,NINETY,70);
      //  rightEyebrow.setFill(Color.TRANSPARENT);
        rightEyebrow.setStroke(Color.BLACK);
        rightEyebrow.setStrokeWidth(B5);
        
        Arc beard = new Arc(SCENE_WIDTH / 2, WIDTH_CENTER + B30, FULL_CIRCLE / 2 - B20, WIDTH_CENTER,205,NINETY + B40);
        beard.setFill(Color.web("#000000",OPACITY));
        beard.setStroke(Color.BLACK);
        beard.setStrokeWidth(5);
        
        Arc a5 = new Arc(WIDTH_CENTER,430,75,55,170,WIDTH_CENTER - B50);
        a5.setFill(Color.web("FFDCB2"));
        
        Polygon beardCutRight = new Polygon(290,384,345,405,350,440,FULL_CIRCLE + B20,419,393,384);
        beardCutRight.setFill(Color.web("FFDCB2"));
        
        Polygon beardCutLeft = new Polygon(WIDTH_CENTER - B40,384,155,405,150,440,120,419,107,384);
        beardCutLeft.setFill(Color.web("FFDCB2"));

        
        Group root = new Group(face,head,rect1,p1,p2,p3,nose,e3,a1,a2,a3, a4,forehead,
                line1,line2,line3,line4,line5,line6,line7,line8, 
                leftEyeUpper, leftEyeLower,rightEyeUpper,
                rightEyeLower, leftEyeBall, rightEyeBall, leftPupil,
                rightPupil, leftEyebrow, rightEyebrow,rect2,beard,beardCutLeft,beardCutRight,a5,upperLip,lowerLip,lipMiddle);
        Scene scene = new Scene(root, 500, 600, Color.LIGHTBLUE);
        primaryStage.setTitle("My Face JavaFX Program");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * Drives the program.
     * @param args
     *          unused
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
            launch(args);
    }

}
