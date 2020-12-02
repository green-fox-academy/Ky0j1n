package com.greenfoxacademy.PostIt;
//Create a PostIt class that has
//        a backgroundColor represented by a String
//        a text on it
//        a textColor represented by a String
//        Create a few example post-it objects:
//        an orange with blue text: "Idea 1"
//        a pink with black text: "Awesome"
//        a yellow with green text: "Superb!"

public class Main {
    public static void main(String[] args) {
        PostIt post1 = new PostIt();
        post1.background = "orange";
        post1.text = "Idea1";
        post1.textColor = "Blue";

        PostIt post2 = new PostIt();
        post2.background = "pink";
        post2.text = "Awesome";
        post2.background = "black";


        PostIt post3 = new PostIt();
        post3.background = "yellow";
        post3.text = "Superb!";
        post3.textColor = "green";

        
    }
}
