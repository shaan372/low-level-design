package com.order.management.service.prompt;

import com.order.management.service.action.Action;

import java.util.Map;

public interface PromptService {

    void show(Map<String, Action> prompt);
    void execute(Map<String, Action> prompt, String input);
}
