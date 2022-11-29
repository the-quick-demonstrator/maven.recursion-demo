package com.github.curriculeon;

import com.github.git_leon.console.SystemConsole;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class MyObject implements Runnable {
    public void run() {
        String menuInput = getMenuInput();
    }

    private String getMenuInput() {
        return getRestrictedInput("games", "stats", "players");
    }


    private String getRestrictedInput(String... possibleInputArray) {
        final List<String> possibleInputs = Arrays.asList(possibleInputArray);
        final String userInput = SystemConsole.getStringInput(new StringJoiner("\n")
                .add("Welcome to the main menu")
                .add("From here, you can select any of the following")
                .add(possibleInputs.toString())
                .toString());
        if (possibleInputs.contains(userInput)) {
            return userInput;
        } else {
            SystemConsole.println("%s is an invalid input!", userInput);
            return getRestrictedInput(possibleInputArray);
        }
    }
}
