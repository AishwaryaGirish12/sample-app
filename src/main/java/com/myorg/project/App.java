package com.myorg.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.google.common.base.Strings;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        String projectName = "DevOps Pipeline";

        if (!Strings.isNullOrEmpty(projectName)) {

            String output = buildMessage(projectName);
            logger.info(output);
            System.out.println(output);

        } else {

            logger.error("Project name is missing!");
        }
    }

    public static String buildMessage(String projectName) {

        return "Welcome to " + projectName + "! Maven build successful.";
    }
}
