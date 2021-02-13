package com.utkudogan.todolist;

import com.utkudogan.todolist.datamodel.ToDoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    @FXML
    private ListView<ToDoItem> todoListView;
    @FXML
    private TextArea itemDetailTextArea;
    private List<ToDoItem> toDoItems;

    public void initialize(){
        ToDoItem item1 = new ToDoItem("Mail Birthday Card", "Buy a birthday card",
                LocalDate.of(2021, Month.JANUARY,12));
        ToDoItem item2 = new ToDoItem("Doctors appointment", "you have a appointment with doctor",
                LocalDate.of(2021, Month.MARCH,15));
        ToDoItem item3 = new ToDoItem("Java Exam", "you have a java exam ",
                LocalDate.of(2021, Month.APRIL,1));
        ToDoItem item4 = new ToDoItem("Fly to İstanbul", "you are going to visit your brother and his wife in istanbul",
                LocalDate.of(2021, Month.JULY,20));
        ToDoItem item5 = new ToDoItem("Meeting with friends", "you are going to meet with your friends",
                LocalDate.of(2021, Month.SEPTEMBER,19));

        toDoItems = new ArrayList<>();
        toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);

        todoListView.getItems().setAll(toDoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
    }

    @FXML
    public void handleClickListView(){
        ToDoItem item = todoListView.getSelectionModel().getSelectedItem();
        StringBuilder sb = new StringBuilder(item.getDetails());
        sb.append("\n\n\n\n");
        sb.append("Due: ");
        sb.append(item.getDeadLine().toString());
        itemDetailTextArea.setText(sb.toString());
    }
}
