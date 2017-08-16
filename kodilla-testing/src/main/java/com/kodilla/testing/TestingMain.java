package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("adam");

        String result = simpleUser.getUsername();

        if (result.equals("adam")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
    }
}