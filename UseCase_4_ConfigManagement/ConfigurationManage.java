package com.climate.ConfigManagement;

import com.climate.Alert.Subject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

/*
 * @Author Kajal Chellappan (12204385)
 * This program is related to configuration management use case scenario
 */
@Getter
@Setter
public class ConfigurationManage {

    @Autowired
    private Originator originator = new Originator();

    Map<String, Memento> mementoMap = new HashMap<>();
    List<configuration> configs = new ArrayList<>();

    public ConfigurationManage(List<configuration> configs) {
        this.configs = configs;
    }

    public void addConfigs(String name , Originator origin){
        this.originator= origin;
        Memento temp = this.originator.saveToMemento();
        mementoMap.put(name, temp);
        System.out.println("Memento was added to the mementomap with "+ mementoMap.size() +" elements");
        System.out.println("--------------------------------------------------------------------------------");

    }

    public void removeConfigs(String name){
        if(mementoMap.size() > 1)
            this.mementoMap.remove(name);
        System.out.println("Memento :"+ name +" was removed from map");
    }

    // restoring to a certain state
    void revertToState(String name) {
       // System.out.println("Restoration was invoked ");
        if(mementoMap.size()>1)
            this.originator.restore(mementoMap.get(name));
    }

    public void editConfigs(List<configuration> configs){
        this.configs = configs;
        System.out.println("config List updated");
    }
}
