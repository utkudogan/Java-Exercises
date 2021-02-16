package com.utkudogan.todolist;

import com.utkudogan.todolist.datamodel.ToDoData;
import com.utkudogan.todolist.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

public class Controller {
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailTextArea;
    @FXML
    private Label deadLineLabel;
    @FXML
    private BorderPane mainBorderPane;

    private List<ToDoItem> toDoItems;

    public void initialize() {
        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem toDoItem, ToDoItem t1) {
                if (t1 != null) {
                    ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemDetailTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadLineLabel.setText(df.format(item.getDeadLine()));
                }
            }
        });

        todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void showNewItemDialog() {
        Dialog<ButtonType> dialog = new Dialog<>();
        dialog.initOwner(mainBorderPane.getScene().getWindow());
        dialog.setTitle("Add new ToDo Item");
        dialog.setHeaderText("Header Text Example");
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("todoitemdialog.fxml"));
        try {
            dialog.getDialogPane().setContent(fxmlLoader.load());
        } catch (IOException exc) {
            System.out.println("Couldn't load the dialog");
            exc.printStackTrace();
            return;
        }
        dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
        dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

        Optional<ButtonType> result = dialog.showAndWait();
        if (result.isPresent() && result.get() == ButtonType.OK) {
            DialogController controller = fxmlLoader.getController();
            ToDoItem newItem = controller.processResult();
            todoListView.getItems().setAll(ToDoData.getInstance().getToDoItems());
            todoListView.getSelectionModel().select(newItem);
            System.out.println("OK");
        }else{
            System.out.println("Cancel");
        }
    }

    @FXML
    public void handleClickListView() {
        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailTextArea.setText(item.getDetails());
        deadLineLabel.setText(item.getDeadLine().toString());
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadLine().toString());
//        itemDetailTextArea.setText(sb.toString());
    }
}
