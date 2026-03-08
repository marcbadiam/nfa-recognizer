
# Llenguatges Formals — Practical Assessment Task 2 (NFA)

# Project overview

This project implements an NFA recognizer in Java, based on the provided template.

The implemented work focuses on:

- Completing `src/main/java/NFA.java`:
  - constructor and basic state management
  - epsilon closure computation
  - NFA to DFA conversion algorithm (subset construction)
  - input acceptance logic
  - transition handling (regular and epsilon)
- Implementing the parser integration in `NFABuilder.java` for parsing NFA specifications
- Supporting NFA specifications with epsilon transitions and partial transition functions
- Providing the corresponding NFA specifications on:
  - `nfa-member1.txt` (3-state NFA recognizing binary strings containing substring "01")
  - `nfa-member2.txt` (4-state NFA recognizing strings where symbol 3 positions before end is "1")
  - `nfa-member3.txt` (6-state NFA recognizing strings with even number of 0s OR exactly two 1s)

# Contribution of each member

- Marc Badia
  - Implementation of `epsilonClosure()` method and epsilon transition handling (`addEpsilonTransition`).
  - Implementation of `getInitialNfaState()` helper method used in NFAtoDFA conversion.
  - Implementation of `NFABuilder.java` methods: `visitTransitions()` and `visitTransition()`.
  - Co-implementation of `NFAtoDFA()` main conversion loop and unmarked states processing.
  - `nfa-member1.txt`

- Pol Caballé
  - Implementation of `getAlphabet()` and `getNextDfaState()` helper methods used in NFAtoDFA conversion.
  - Implementation of NFA basic methods: constructor, `setInitialState()`, `addFinalState()`, `addTransition()`.
  - Co-implementation of `NFAtoDFA()` transition construction logic.
  - Testing and validation of NFA parsing and conversion functionality.
  - `nfa-member2.txt`

- Adrian Stefan Rusu
  - Implementation of `buildDfaObject()` and `generateStateName()` helper methods used in NFAtoDFA conversion.
  - Implementation of `accept()` method and `getAllLabels()` utility method.
  - Implementation of `NFABuilder.java` methods: `visitNfa()`, `visitStates()`, `visitFinalStates()`, `visitIniState()`.
  - Co-implementation of `NFAtoDFA()` DFA initialization and final state determination.
  - `nfa-member3.txt`

- Each member has contributed to a final review and submission checks and preparation of this document.
