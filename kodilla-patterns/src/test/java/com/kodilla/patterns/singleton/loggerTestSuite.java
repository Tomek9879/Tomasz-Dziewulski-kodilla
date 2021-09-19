package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class loggerTestSuite {

    private static Logger logger;
    @BeforeAll
    public static void Logger(){
        logger = Logger.Instance;

    }
    @Test
    void getLastLogTest(){
        logger.log("Alan 111");

        String log = logger.getLastLog();

        assertEquals("Alan 111",log);
    }
}
