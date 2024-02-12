package com.careerit.jfs.quiz;

import java.util.List;
import java.util.Scanner;

public class QuizService {

        private List<Question> questions;

        public QuizService(){
            this.questions = QuizUtil.getQuestions();
        }

        public void startQuiz(String userName){

            System.out.println("Welcome to the quiz : "+userName);
            System.out.println("-------------------------------------------------");
            System.out.println("Total questions : "+questions.size());
            Scanner sc = new Scanner(System.in);
            // Show the question and options
            // Get the answer from the user
            // Check user answer with the correct answer
            // If answer is correct increment the score
            // Show the next question
            // Repeat the process till all questions are answered
            // Show the score


        }

}
