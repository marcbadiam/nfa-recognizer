import java.util.*;

public class NFA {

    String estatInicial;
    String[] states;
    String[] estatsFinals;
    int numEFinals = 0;
    Map<String, Map<Character, String>> taulaTransicions = new HashMap<>();

    public NFA(String[] states) {
        estatsFinals = new String[states.length];
        this.states = states;
    }

    public void setInitialState(String state) {
        estatInicial = state;
    }

    public String getInitialState() {
        return estatInicial;
    }

    public void addFinalState(String state) {
        estatsFinals[numEFinals++] = state;
    }

    // Method to add a transition to the table
    public void addTransition(String state, Character input, String nextState) {
        taulaTransicions.putIfAbsent(state, new HashMap<>());
        taulaTransicions.get(state).put(input, nextState);
    }

    public void addEpsilonTransition(String state, String nextState) {
        addTransition(state, null, nextState);
    }

    // Outputs true if the NFA accept the input string
    // The strategy we follow is to convert the NFA into a DFA
    public boolean accept(String input) {
        // your code goes here
        return false;
    }

    public DFA NFAtoDFA() {
        // your code goes here
        return null;
    }

    public Set<Label> getAllLabels() {
        // your code goes here
        return null;
    }

}
