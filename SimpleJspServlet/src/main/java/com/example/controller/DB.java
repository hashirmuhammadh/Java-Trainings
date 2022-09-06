package com.example.controller;

import com.example.model.User;

import java.util.HashMap;
import java.util.Map;

public class DB {

    private Map<String, User> users=new HashMap<>();

    public String add(User user){

        try {

            users.put(user.getEmail(),user);
            return "User Saved!";
        }catch (Exception e){

            return "Exception!";
        }
    }

    public boolean already(String email){

        if (users.containsKey(email)){

            return true;
        }else{
            return false;
        }
    }

    public User getUser(String email){

        return users.get(email);

    }

    



}
