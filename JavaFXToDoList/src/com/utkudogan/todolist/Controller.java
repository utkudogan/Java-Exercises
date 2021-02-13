package com.utkudogan.todolist;

import com.utkudogan.todolist.datamodel.ToDoData;
import com.utkudogan.todolist.datamodel.ToDoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailTextArea;
    @FXML
    private Label deadLineLabel;


    private List<ToDoItem> toDoItems;

    public void initialize(){
//        ToDoItem item1 = new ToDoItem("Mail Birthday Card", "Buy a birthday card",
//                LocalDate.of(2021, Month.JANUARY,12));
//        ToDoItem item2 = new ToDoItem("Doctors appointment", "you have a appointment with doctor",
//                LocalDate.of(2021, Month.MARCH,15));
//        ToDoItem item3 = new ToDoItem("Java Exam", "you have a java exam ",
//                LocalDate.of(2021, Month.APRIL,1));
//        ToDoItem item4 = new ToDoItem("Fly to İstanbul", "you are going to visit your brother and his wife in istanbul",
//                LocalDate.of(2021, Month.JULY,20));
//        ToDoItem item5 = new ToDoItem("Meeting with friends", "you are going to meet with your friends",
//                LocalDate.of(2021, Month.SEPTEMBER,19));
//
//        toDoItems = new ArrayList<>();
//        toDoItems.add(item1);
//        toDoItems.add(item2);
//        toDoItems.add(item3);
//        toDoItems.add(item4);
//        toDoItems.add(item5);
//
//        ToDoData.getInstance().setToDoItems(toDoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ToDoItem>() {
            @Override
            public void changed(ObservableValue<? extends ToDoItem> observableValue, ToDoItem toDoItem, ToDoItem t1) {
                if (t1 != null){
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

//    @FXML
//    public void handleClickListView(){
//        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
//        itemDetailTextArea.setText(item.getDetails());
//        deadLineLabel.setText(item.getDeadLine().toString());
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadLine().toString());
//        itemDetailTextArea.setText(sb.toString());
//    }
}
