import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Objects;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{



        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getClassLoader().getResource("f.fxml")));
        primaryStage.setTitle("jeecg综合漏洞利用工具v3.0");
        primaryStage.setScene(new Scene(root, 1450, 950));
        primaryStage.show();
        primaryStage.setMaximized(false);
        primaryStage.setResizable(false);


    }
    public static void main(String[] args) {
        launch(args);
    }
}
