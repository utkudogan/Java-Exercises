package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button btnHello;
    @FXML
    private Button btnBye;
    @FXML
    private CheckBox  ourCheckBox;
    @FXML
    private Label ourLabel;

    @FXML
    public void handleChange(){
        System.out.println("the checkbox is " + ((ourCheckBox.isSelected() ? "checked" : "isn't checked")));
    }

    @FXML
    public void initialize(){
        btnHello.setDisable(true);
        btnBye.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e){
        if (e.getSource().equals(btnHello)) {
            System.out.println("hello " + nameField.getText());
        }else if (e.getSource().equals(btnBye)) {
            System.out.println("Bye " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            ourLabel.setText("adadfaf");
                        }
                    });
                }catch (InterruptedException ex){

                }
            }
        };

        new Thread(task).start();

        if (ourCheckBox.isSelected()){
            nameField.clear();
            btnBye.setDisable(true);
            btnHello.setDisable(true);
        }
    }
    @FXML
    public void handleKeyReleased(){
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        btnHello.setDisable(disableButtons);
        btnBye.setDisable(disableButtons);
    }
}
