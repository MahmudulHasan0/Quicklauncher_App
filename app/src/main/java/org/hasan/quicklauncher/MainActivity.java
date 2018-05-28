/*GOAL:
Clicking SecondActivity Button: Open up to a new window where it will print "Hello World!"
Clicking Google: Opens up google app*/
package org.hasan.quicklauncher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button secActivityBtn = (Button) findViewById(R.id.secondActivityBtn); //just referenced the button in layout
        secActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //a) LINKING THE ACTIVITY AND THE INTENT:
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class); //Intent(get_the_applications_Context, its_Class).
                    //^Creating an Intent object called "startIntent". Already made a class/activity already called "SecondActivity"
                //b) PASSING INFORMATION TO ANOTHER ACTIVITY:
                startIntent.putExtra("org.hasan.quicklauncher.hello", "Hello World!")
                    //^Can put a lot of extra information in a bundle and send it to the other activity. the other activity can unbundle it and use the info.
                    //Key-Value Pairs: "packageName.nameOfKey" , "value you want to pass"
                //c) STARTING THE SecondActivity
                startActivity(startIntent);
                    /*The onClick listener of the "Second Activity" Button is going to say
                    "Hey i have this INTENT, the user is interacting with this button. What do we want to do with it?"
                    The INTENT is to go to the SecondActivity, so go start that.
                     */
            }
        });



    }
}
