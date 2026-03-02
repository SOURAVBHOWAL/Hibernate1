package M1Mock;

import java.util.Queue;

public interface IAnalyticsStore {
    void storeAction(Queue<ActionEnum> actions);
}
