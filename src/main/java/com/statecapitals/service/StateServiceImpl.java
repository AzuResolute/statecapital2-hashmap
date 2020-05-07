package com.statecapitals.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.Collectors;

public class StateServiceImpl implements StateService {
    /**
     * Map<state, capital>
     *     We're not using the State class until StateCapital3, as per instruction
     */
    Map<String, String> statesWithCapitals = new HashMap<>();

    @Override
    public void save() {
        try {
            PrintWriter out = new PrintWriter(new FileWriter("StateCapitals.txt"));
            this.statesWithCapitals.forEach(
                (state, capital) -> out.println(state + "::" + capital));
            out.flush();
            out.close();
        } catch (Exception ex) {
            System.out.println("Saving error");
        }
    }

    @Override
    public void load() {
        try {
            Scanner scanner = new Scanner(
                new BufferedReader(new FileReader("StateCapitals.txt"))
            );
            while(scanner.hasNextLine()) {
                String[] currentLine = scanner.nextLine().split("::");
                String state = currentLine[0];
                String capital = currentLine[1];
                this.statesWithCapitals.put(state, capital);
            }
        } catch (Exception ex) {
            System.out.println("Loading error");
        }
    }

    @Override
    public Map.Entry<String, String> getRandomState() {
        Iterator<Map.Entry<String, String>> stateCapitalIterator
                = this.statesWithCapitals.entrySet().iterator();
        return stateCapitalIterator.next();
    }

    @Override
    public List<String> getStates() {
        return statesWithCapitals
                .keySet()
                .stream()
                .collect(Collectors.toList());
    }

    @Override
    public Map<String, String> getStatesWithCapitals() {
        return statesWithCapitals;
    }

    @Override
    public String getCapitalByState(String state) {
        return statesWithCapitals.get(state);
    }

    @Override
    public boolean doesStateAndCapitalMatch(String state, String capital) {
        return statesWithCapitals.get(state) == capital;
    }
}
