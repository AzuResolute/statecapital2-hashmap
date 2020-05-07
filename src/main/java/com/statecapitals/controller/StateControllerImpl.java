package com.statecapitals.controller;

import com.statecapitals.service.StateService;
import com.statecapitals.view.View;

import java.util.Map;

public class StateControllerImpl implements StateController {
    private View view;
    private StateService stateService;
    private boolean isRunning = true;

    public StateControllerImpl(View view, StateService stateService) {
        this.view = view;
        this.stateService = stateService;
    }

    @Override
    public void run() {

        stateService.load();
        while(isRunning) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    view.displayStatesOnly(
                        stateService.getStates()
                    );
                    break;
                case 2:
                    view.displayStatesWithCapitals(
                        stateService.getStatesWithCapitals()
                    );
                    break;
                case 3:
                    Map.Entry<String,String> stateEntry
                            = stateService.getRandomState();
                    String state = stateEntry.getKey();
                    String capital = stateEntry.getValue();
                    String answer = view.displayQuestion(state);
                    boolean isCorrect
                            = stateService.doesStateAndCapitalMatch(state, answer);
                    view.displayResult(isCorrect, capital);
                    break;
                case 4:
                    quitProgramme();
                    break;
            }
        }
    }

    @Override
    public void quitProgramme() {
        this.isRunning = false;
    }
}
