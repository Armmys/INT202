package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import utils.CSVLoader;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class QuizSession {
    private List<Question> questions;
    private int currentQuestionIndex;
    private int correctAnswersCount;

    public void fetchQuestion(){
        questions = CSVLoader.getQuestions();
    }

    public void moveToNextQuestion(){
        currentQuestionIndex++;
    }

    public boolean isQuizEnded(){
        return currentQuestionIndex == questions.size();
    }
    public void checkCorrectQuestion(int selectedIndex){
        if(questions.get(currentQuestionIndex).checkAnswer(selectedIndex)) {
            correctAnswersCount++;
        }
    }
    public void resetQuiz(){
        currentQuestionIndex = 0;
        correctAnswersCount = 0;
    }
}
