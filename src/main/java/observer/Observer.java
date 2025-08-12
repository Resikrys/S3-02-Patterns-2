package observer;

import jdk.jfr.EventType;

public interface Observer {
    //void update (EventType event);
    void update(String change);
}
