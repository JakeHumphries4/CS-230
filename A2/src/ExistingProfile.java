import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.io.File;
import java.io.FileNotFoundException;
import static java.util.Date.parse;
import java.util.Scanner;

/**
 * This class represents the java fx of the window of picking an existing profile.
 *   @author Bryony Hughes
 *   @version 1.2
 */
public class ExistingProfile extends Application {

    final StackPane rootPane = new StackPane();
    private String name1 ="";
    private String currentLevel1 = "";
    private String character1 ="";
    private String name2 ="";
    private String currentLevel2 = "";
    private String character2 ="";
    private String name3 ="";
    private String currentLevel3 = "";
    private String character3 ="";
    private String name4 ="";
    private String currentLevel4 = "";
    private String character4 ="";
    private String name5 ="";
    private String currentLevel5 = "";
    private String character5 ="";

    /**
     * Main method to launch the class.
     */
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    /**
     * Create main menu by adding each attribute to the stackplane.
     * @param primarystage - The main window.
     */
    public void start(Stage primaryStage) {

        File fileName = new File("Player.txt");
        Scanner in = null;
        String profileName1 = null ;
        String profileName2 = null ;
        String profileName3 = null ;
        String profileName4 = null ;
        String profileName5 = null;
        String[]info;
        String readLine;

        try {

        	/* Now you have a String array containing
        	 * each word in the current line
        	*/

            in = new Scanner(fileName);

            if (in.hasNext()) {
                readLine = (in.nextLine());
                info = readLine.split(",");
                name1 = (info[0]);
                currentLevel1 = (info[1]);
                character1 =(info[2]);
            } else {
                profileName1 = "No user." ;
            }
            if (in.hasNextLine()) {
                readLine = (in.nextLine());
                info = readLine.split(",");
                name2 = (info[0]);
                currentLevel2 = (info[1]);
                character2 =(info[2]);
            } else {
                profileName2 = "No user." ;
            }
            if (in.hasNextLine()) {
                readLine = (in.nextLine());
                info = readLine.split(",");
                name3 = (info[0]);
                currentLevel3 = (info[1]);
                character3 =(info[2]);
            } else {
                profileName3 = "No user." ;
            }
            if (in.hasNextLine()) {
                readLine = (in.nextLine());
                info = readLine.split(",");
                name4 = (info[0]);
                currentLevel4 = (info[1]);
                character4 =(info[2]);
            } else {
                profileName4 = "No user." ;
            }
            if (in.hasNextLine()) {
                readLine = (in.nextLine());
                info = readLine.split(",");
                name5 = (info[0]);
                currentLevel5 = (info[1]);
                character5 =(info[2]);
            } else {
                profileName5 = "No user." ;
            }

        } catch (FileNotFoundException e) {
            System.out.print("failed");
        }

        /*
         * Generates the images for the profiles
         */
        Label gameTitle = new Label();
        gameTitle.setText("Create Existing Player");
        gameTitle.setStyle("-fx-font-size: 50px; -fx-text-fill: white; -fx-font-weight: bold;");
        Button profile1 = new Button();
        Image imge = new Image(character1+"logo.png");
        profile1.setGraphic(new ImageView(imge));
        profile1.setText("                  Profile 1: " + name1 + "\n                  Current level : "+currentLevel1);
        profile1.setStyle("-fx-border-color:green;-fx-pref-height: 8px; -fx-pref-width: 300px;");
        Button profile2 = new Button();
        Image imge2 = new Image(character2+"logo.png");
        profile2.setGraphic(new ImageView(imge2));
        profile2.setText("                  Profile 2: " + name2 + "\n                  Current level : "+currentLevel2);
        Button profile3 = new Button();
        Image imge3 = new Image(character3+"logo.png");
        profile3.setGraphic(new ImageView(imge3));
        profile3.setText("                  Profile 3: " + name3 + "\n                  Current level : "+currentLevel3 );
        profile3.setStyle("-fx-border-color:green;-fx-pref-height: 8px; -fx-pref-width: 300px;");
        Button profile4 = new Button();
        Image imge4 = new Image(character4 +"logo.png");
        profile4.setGraphic(new ImageView(imge4));
        profile4.setText("                  Profile 4: " + name4 + "\n                  Current level : " +currentLevel4);
        profile4.setStyle("-fx-border-color:green;-fx-pref-height: 8px; -fx-pref-width: 300px;");
        profile4.setWrapText(true);
        Button profile5 = new Button();
        Image imge5 = new Image(character5+"logo.png");
        profile5.setGraphic(new ImageView(imge5));
        profile5.setText("                  Profile 5: " + name5 + "\n                  Current level : "+currentLevel5 );
        profile5.setStyle("-fx-border-color:green;-fx-pref-height: 8px; -fx-pref-width: 300px;");
        Button back = new Button();
        back.setText("Back");
        back.setStyle("-fx-background-color: transparent;-fx-text-fill: white; -fx-font-size: 10px; -fx-font-weight: bold;-fx-border-color:white;-fx-border-width: 3 3 3 3; -fx-background-insets: 0");
        Button next = new Button();
        next.setText("Next");
        next.setStyle("-fx-background-color: transparent;-fx-text-fill: white; -fx-font-size: 10px; -fx-font-weight: bold;-fx-border-color:white;-fx-border-width: 3 3 3 3; -fx-background-insets: 0");
        Button editProfile = new Button();
        editProfile.setText("Edit Profile");
        editProfile.setStyle("-fx-background-color: transparent;-fx-text-fill: white; -fx-font-size: 10px; -fx-font-weight: bold;-fx-border-color:white;-fx-border-width: 3 3 3 3; -fx-background-insets: 0");
        Button deleteProfile = new Button();
        deleteProfile.setText("Delete Profile");
        deleteProfile.setStyle("-fx-background-color: transparent;-fx-text-fill: white; -fx-font-size: 10px; -fx-font-weight: bold;-fx-border-color:white;-fx-border-width: 3 3 3 3; -fx-background-insets: 0");

        StackPane rootPane = new StackPane();
        BackgroundImage backgroundImage = new BackgroundImage(new Image("mainmenuwall.png"),
                BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        rootPane.setBackground(new Background(backgroundImage));

        rootPane.getChildren().add(gameTitle);
        StackPane.setMargin(gameTitle, new Insets(0, 0, 440, 0));
        rootPane.getChildren().add(profile1);
        StackPane.setMargin(profile1, new Insets(0, 20, 300, 0));
        rootPane.getChildren().add(profile2);
        StackPane.setMargin(profile2, new Insets(0, 20, 150, 0));
        rootPane.getChildren().add(profile3);
        StackPane.setMargin(profile3, new Insets(0, 20, 0, 0));
        rootPane.getChildren().add(profile4);
        StackPane.setMargin(profile4, new Insets(150, 20, 0, 0));
        rootPane.getChildren().add(profile5);
        StackPane.setMargin(profile5, new Insets(300, 20, 0, 0));
        rootPane.getChildren().add(back);
        StackPane.setMargin(back, new Insets(450,650,0,0));
        rootPane.getChildren().add(next);
        StackPane.setMargin(next, new Insets(450,0,0,650));
        rootPane.getChildren().add(editProfile);
        StackPane.setMargin(editProfile, new Insets(450,0,0,100));
        rootPane.getChildren().add(deleteProfile);
        StackPane.setMargin(deleteProfile, new Insets(450,100,0,0));

        editProfile.setOnAction(e -> {
            EditProfile edit = new EditProfile();
            primaryStage.getScene().setRoot(edit.getRootPane(primaryStage));});

        deleteProfile.setOnAction(e -> {
            System.out.print("done");
            DeleteProfile delete = new DeleteProfile();
            primaryStage.getScene().setRoot(delete.getRootPane(primaryStage));});

        next.setOnAction(e -> {
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});
        back.setOnAction(e -> {
            Menu mainMenu = new Menu();
            primaryStage.getScene().setRoot(mainMenu.getRootPane(primaryStage));});

        profile1.setOnAction(e -> {
            Profile player = new Profile(name1,currentLevel1,character1);
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});
        profile2.setOnAction(e -> {
            Profile player = new Profile(name2,currentLevel2,character2);
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});
        profile3.setOnAction(e -> {
            Profile player = new Profile(name3,currentLevel3,character3);
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});
        profile4.setOnAction(e -> {
            Profile player = new Profile(name4,currentLevel4,character4);
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});
        profile5.setOnAction(e -> {
            Profile player = new Profile(name5,currentLevel5,character5);
            LevelSelect level = new LevelSelect();
            primaryStage.getScene().setRoot(level.getRootPane(primaryStage));});

        Scene scene = new Scene(rootPane, 900, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * This method will return the root stage
     * @param primaryStage - The main window
     * @return The root pane
     */
    public Pane getRootPane(Stage primaryStage) {
        start(primaryStage);
        return rootPane;
    }
}
