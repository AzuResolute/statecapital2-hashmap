package com.statecapitals.view;

import com.userio.UserIO;
import com.userio.UserIOImpl;

import java.util.List;
import java.util.Map;

public class ViewImpl implements View {
    private UserIO ui = new UserIOImpl();

    public int displayMenu() {
        return ui.readInt(
                "(1) Display all States only\n" +
                        "(2) Display all States with Capitals\n"+
                        "(3) Test Your Knowledge\n"+
                        "(4) Quit Programme"
        );
    }

    @Override
    public void displayStatesOnly(List<String> states) {
        ui.print("HERE ARE THE STATES :");
        ui.print(String.join(", ", states));
    }

    @Override
    public void displayStatesWithCapitals(Map<String, String> stateCapitals) {
        ui.print("HERE ARE THE STATES WITH CAPITALS:");
        stateCapitals.forEach((state, capital) -> System.out.println(state + ": " + capital));
    }

    @Override
    public String displayQuestion(String state) {
        String answer = ui.readString("What is the capital of " + state + "?");
        return answer;
    }

    @Override
    public void displayResult(boolean result, String capital) {
        if(result) {
            displaySuccessfulAnswer(capital);
        } else {
            displayIncorrectAnswer(capital);
        }
    }

    private void displaySuccessfulAnswer(String answer) {
        ui.print("Awesome! " + answer +" is the correct answer");
    }

    private void displayIncorrectAnswer(String answer) {
        ui.print("Wrong Answer. " + answer +" is the correct answer");
    }

    @Override
    public void loadedStatesAndCapitals(int size) {
        ui.print(size + "STATES AND CAPITALS ARE LOADED\n" +
                "========================================"
        );
    }

}
