package com.order.management.service.prompt;

import com.order.management.service.action.Action;

import java.util.Map;
import java.util.Scanner;

public class PromptService {

    public void show(Map<String, Action> prompt) {
        prompt.forEach((key, value) -> {
            System.out.println(key);
        });
    }

    public String takeInput(String message) {
        Scanner myObj = new Scanner(System.in);
        System.out.println(message);
        return myObj.nextLine();
    }

    public void execute(Map<String, Action> prompt, String input) {
        Action action = prompt.get(input);
        action.execute();
    }
}
