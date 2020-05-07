package com.statecapitals;

import com.statecapitals.controller.StateController;
import com.statecapitals.controller.StateControllerImpl;
import com.statecapitals.service.StateService;
import com.statecapitals.service.StateServiceImpl;
import com.statecapitals.view.View;
import com.statecapitals.view.ViewImpl;

public class App {
    public static void main(String[] args) {
        View view = new ViewImpl();
        StateService stateService = new StateServiceImpl();
        StateController controller = new StateControllerImpl(view, stateService);

        controller.run();
    }
}
