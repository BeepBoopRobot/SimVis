package Main;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting SimVis");
        new JFXPanel();
        Platform.runLater(() -> {
            try {
                launch();
            } catch (IOException e) {
                System.out.println("w0w something broke here's some words");
                e.printStackTrace();
            }
        });

    }

    private static int windowWidth = 650;
    private static int windowHeight = 450;

    private static void close() {
        // shut down any pending simulations, prompt
        // save anything that needs to be saved
        // flush iostream
    }

    static void launch() throws IOException {
        Stage stage = new Stage();
        stage.setWidth(windowWidth);
        stage.setHeight(windowHeight);

        Parent root = FXMLLoader.load(Main.class.getResource("mainLayout.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setOnCloseRequest(we -> close());
        stage.show();

    }
}
