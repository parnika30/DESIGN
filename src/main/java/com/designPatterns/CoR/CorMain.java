package com.designPatterns.CoR;

public class CorMain {
    public static void main(String[] args) {
        LogProcessor logObject = new LogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null))); //creating chain through constructor

        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "debug the error");
        logObject.log(LogProcessor.INFO, "just info");
    }
}
