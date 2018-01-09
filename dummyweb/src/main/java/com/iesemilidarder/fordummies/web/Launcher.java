package com.iesemilidarder.fordummies.web;

import com.iesemilidarder.fordummies.core.User;

import static spark.Spark.*;

import java.util.*;

public class Launcher {

    /**
     * Colección de datos tipo lista
      */
    private static List<User> lUser = new ArrayList<User>();

    public static void init(){

        for (int i=0;i<10;i++) {

            User user = new User();
            user.setId(i);
            user.setName("Sos inimputable" + i);
            user.save();
            lUser.add(user);

        }

    }

    public static void main(String... args) {

        init();
        port(8080);
        get("/hello", (req, res) -> "Hello World");

    }

}
