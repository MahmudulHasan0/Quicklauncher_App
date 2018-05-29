/*GOAL:
Clicking SecondActivity Button: Open up to a new window where it will print "Hello World!"
Clicking Google: Opens up google app*/
package org.hasan.quicklauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //***LAUNCHING AN ACTIVITY WITHIN APP (SHARING INFO BETWEEN ACTIVITIES):***
        Button secActivityBtn = (Button) findViewById(R.id.secondActivityBtn); //just referenced the button in layout
        secActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //a) LINKING THE ACTIVITY AND THE INTENT:
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class); //getting this application's information
                    //^Creating an Intent object called "startIntent". Already made a class/activity already called "SecondActivity"
                //b) PASSING INFORMATION TO ANOTHER ACTIVITY/CLASS:
                startIntent.putExtra("org.hasan.quicklauncher.hello", "Hello World!");
                    //^Can put a lot of extra information in a bundle and send it to the other activity. the other activity can unbundle it and use the info.
                    //Key-Value Pairs: "packageName.nameOfKey" , "value you want to pass"
                //c) STARTING THE SecondActivity
                startActivity(startIntent);
                    /*The onClick listener of the "Second Activity" Button is going to say
                    "Hey i have this INTENT, the user is interacting with this button. What do we want to do with it?"
                    The INTENT is to go to the SecondActivity, so go start that....Switch to the SecondActivity class*/
            }
        });

    //***LAUNCHING ACTIVITY OUTSIDE APP:***
        Button googleActivityBtn = (Button) findViewById(R.id.googleBtn); //just referenced the button in layout
        googleActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google = "https://www.google.com/"; //making a string that holds the url
                Uri webaddress = Uri.parse(google); //parse (divide into small components to be analyzed) the url as a URI (universal resource identifier)
                //Intent is to launch something on the android device that can browse to that webpage
                Intent goToGoogle = new Intent(Intent.ACTION_VIEW, webaddress);  //going outside of application to do an action (launch). sending it to the webaddress to try and open up
                    //Will send out a broadcast asking "can any apps on this device that can do this (the action that's being requested, opening to this webaddress)?"
                    //Need to see if the response back is NULL(meaning "no there are no apps that can do this):
                if (goToGoogle.resolveActivity(getPackageManager()) != null) { //is the response back is "yes theres an app that can do this".
                    //^If there is a list of something, that can do this, then go ahead and give me that activity
                    startActivity(goToGoogle);
                }
            }
        });



    }
}
