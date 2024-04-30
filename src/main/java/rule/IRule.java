package rule;

public interface IRule {
    void execute();
    void enable();
    void disable();
    boolean isEnabled();
}
