package com.example.lab2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class PageController {

    @FXML Label question;
    @FXML Label result;
    @FXML Button getResult;
    @FXML Button next;

    ArrayList<String> questions = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();
    String temp;
    int i = 0;
    int click = 0;

    @FXML
    public void initialize() {
        questions.add(Data.QUESTION_1);
        questions.add(Data.QUESTION_2);
        questions.add(Data.QUESTION_3);

        answers.add(Data.ANSWER_1);
        answers.add(Data.ANSWER_2);
        answers.add(Data.ANSWER_3);

        question.setText(questions.get(i));

        temp = answers.get(i);
        result.setText("");
    }


    public void onNextClick(ActionEvent actionEvent) {
        result.setText("");
        i++;
        click = 0;
        if(i < questions.size()) {
            question.setText(questions.get(i));
            temp = answers.get(i);
        }
    }


    public void onResultClick(ActionEvent actionEvent) {
        click++;
        if(click % 2 != 0)
        result.setText(temp);
        else result.setText("");
    }

}
