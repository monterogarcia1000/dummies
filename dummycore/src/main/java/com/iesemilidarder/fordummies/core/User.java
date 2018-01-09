package com.iesemilidarder.fordummies.core;

/**
 * dummies
 * com.iesemilidarder.fordummies.web
 * Created by winadmin in 15/12/2017.
 * Description:
 */

public class User extends DBObject{

    private int id;

    private String name;

    public int getId() {
        return id;
    }

    /**
     * set the id
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    /**
     * set the name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    protected void beforeSave() {
        doLOg(String.format("Saving %s", this.getClass().getCanonicalName()));
    }
}
