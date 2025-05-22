package com.climate.configuration;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration screen use case scenario
 */
public class client {

    public static void main(String[] args) {
        System.out.println("*************Configuration implementation - Adapter pattern********");
        configuration config = new configuration();
        config.getSensorData();
    }
}
