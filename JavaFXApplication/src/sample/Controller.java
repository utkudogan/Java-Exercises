package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;


public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPane;
    @FXML
    private WebView webView;

    public void initialize(){
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter(){
        label.setScaleY(2.0);
        label.setScaleX(2.0);
    }

    @FXML
    public void handleMouseExit(){
        label.setScaleY(1.0);
        label.setScaleX(1.0);
    }

    @FXML
    public void handleClick(){
        FileChooser chooser = new FileChooser();
        //chooser.setTitle("Save");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Zip", "*.zip"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.png", "*.gif"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
        //DirectoryChooser chooser = new DirectoryChooser();
        //File file = chooser.showOpenDialog()Dialog(gridPane.getScene().getWindow());
        List<File> file = chooser.showOpenMultipleDialog(gridPane.getScene().getWindow());
        if (file == null) {
            for (int i=0;i<file.size();i++) {
                System.out.println(file.get(i).getPath());
            }
        }else{
            System.out.println("cancelled");
        }
    }

    @FXML
    public void handleLinkClick(){
        try{
           Desktop.getDesktop().browse(new URI("www.javafx.com"));
        }catch (Exception e){
            e.printStackTrace();
       }

        WebEngine engine = webView.getEngine();
        engine.load("htttp://www.javafx.com");
    }

}
