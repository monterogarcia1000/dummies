package com.iesemilidarder.fordummies.core;
import  org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * dummies
 * com.iesemilidarder.fordummies.core
 * Created by winadmin in 15/12/2017.
 * Description:
 * Basic class for saving object into an H2 or Derby system by default
 */
public abstract class DBObject implements IDatabaseActions{

    private final Logger log = LoggerFactory.getLogger(DBObject.class);

    protected abstract void beforeSave();

    public void save(){

        try {

            beforeSave();
            //

        }catch (Exception e){

            log.error("Saving data", e);

        }

    }

    public void delete(){

        log.error("Not implemeted yet");

    }

    public void update(){

        log.error("Not implemented yet");

    }

    protected void doLOg(String txt){

        System.out.println("dpOperation: " + txt);
        log.warn(txt);

    }

}