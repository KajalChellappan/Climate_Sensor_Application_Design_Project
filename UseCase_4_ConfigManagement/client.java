package com.climate.ConfigManagement;


import java.util.ArrayList;
import java.util.List;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */
public class client {

    public static void print(Originator originator) {
        System.out.println("Current state of originators");
        System.out.println("ConfigList : " + originator.configs);
    }

    public static void main(String[] args) {
            System.out.println("************Memento Implementation**********");
            com.climate.ConfigManagement.configuration config1 = new com.climate.ConfigManagement.configuration();
            config1.setConfigName("config1");
            config1.setSensorID("12355");
            config1.setRegionID("EU01");
            config1.setSensors(new ArrayList<>());
            com.climate.ConfigManagement.configuration config2 = new com.climate.ConfigManagement.configuration();
            config2.setConfigName("config2");
            config2.setSensorID("1235222");
            config2.setRegionID("EU02");
            config2.setSensors(new ArrayList<>());
            com.climate.ConfigManagement.configuration config3 = new com.climate.ConfigManagement.configuration();
            config3.setConfigName("config3");
            config3.setSensorID("12355222");
            config3.setRegionID("EU03");
            config3.setSensors(new ArrayList<>());
            List<com.climate.ConfigManagement.configuration> configList = new ArrayList<>();
            Originator originator = new Originator();
            ConfigurationManage configuration = new ConfigurationManage(configList);
            configList.add(config1);
            originator.setConfigs(configList);
            print(originator);
            configuration.addConfigs("config1", originator);
            configList = new ArrayList<>();
            configList.add(config1);
            configList.add(config2);
            originator.setConfigs(configList);
            print(originator);
            configuration.addConfigs("config2", originator);
            configList = new ArrayList<>();
            configList.add(config1);
            configList.add(config2);
            configList.add(config3);
            originator.setConfigs(configList);
            print(originator);
            configuration.addConfigs("config3", originator);
            configuration.removeConfigs("config1");
            configuration.revertToState("config2");
            print(originator);
        }
}
