package com.statecapitals.view;

import java.util.List;
import java.util.Map;

public interface View {
    int displayMenu();
    void displayStatesOnly(List<String> states);
    void displayStatesWithCapitals(Map<String, String> stateCapitals);
    String displayQuestion(String state);
    void displayResult(boolean result, String capital);
    void loadedStatesAndCapitals(int size);
}
