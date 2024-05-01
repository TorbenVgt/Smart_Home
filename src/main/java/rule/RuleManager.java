package rule;

import java.util.HashMap;
import java.util.Map;

public class RuleManager {
    private Map<String, IRule> rules = new HashMap<>();

    public void addRule(String ruleName, IRule rule) {
        rules.put(ruleName, rule);
    }

    public void removeRule(String ruleName) {
        rules.remove(ruleName);
    }

    public void enableRule(String ruleName) {
        if (rules.containsKey(ruleName)) {
            rules.get(ruleName).enable();
            System.out.println(ruleName + " wurde aktiviert.");
        } else {
            System.out.println("Regel " + ruleName + " nicht gefunden.");
        }
    }

    public void disableRule(String ruleName) {
        if (rules.containsKey(ruleName)) {
            rules.get(ruleName).disable();
            System.out.println(ruleName + " wurde deaktiviert.");
        } else {
            System.out.println("Regel " + ruleName + " nicht gefunden.");
        }
    }

    public void executeRule(String ruleName) {
        if (rules.containsKey(ruleName)) {
            rules.get(ruleName).execute();
        } else {
            System.out.println("Regel " + ruleName + " nicht gefunden.");
        }
    }
}

