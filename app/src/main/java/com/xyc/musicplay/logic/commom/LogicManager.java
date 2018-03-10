package com.xyc.musicplay.logic.commom;

/**
 * Created by hasee on 2018/3/10.
 */

public class LogicManager {

    public static LogicManager instance = null;

    private LogicManager() {

    }

    public LogicManager getInstance() {
        if (instance == null) {
            instance = new LogicManager();
        }
        return instance;
    }

}
