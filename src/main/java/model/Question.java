package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Question {
    private String title;
    private List<String> options;
    private int correctAnswerIndex;

    public boolean checkAnswer(int selectedIndex) {
        return selectedIndex == correctAnswerIndex;
    }


}
