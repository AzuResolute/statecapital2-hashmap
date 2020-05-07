package com.statecapitals.service;

import java.util.List;
import java.util.Map;

public interface StateService {

    /**
     * database methods
     */
    void save();
    void load();

    /**
     * read methods
     * @return
     */
    Map.Entry<String, String> getRandomState();
    List<String> getStates();
    Map<String, String> getStatesWithCapitals();
    String getCapitalByState(String state);
    boolean doesStateAndCapitalMatch(String state, String capital);
}
