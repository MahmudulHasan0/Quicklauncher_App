package org.hasan.quicklauncher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //When the app runs, it first runs the Activity files (look at the AndroidManifest.xml file)
        //So it can run the SecondActivity or the MainActivity java file first. SecondActivity can get information or it may not.
        //Will make it so that SecondActivity DOES get information (so if it runs first, it just switches to  MainActivity?)

        //LAUNCHING AN ACTIVITY WITHIN APP (SHARING INFO BETWEEN ACTIVITIES):
        if (getIntent().hasExtra("org.hasan.quicklauncher.hello")) {  //if the intent has extra information, such as (the key), then do the following:
                //1) Making sure MainActivity runs so this SecondAvtivity can get information (unpackage info)
                //I already put the value of  "Hello World!" in the "org.hasan.quicklauncher.hello" package/key
            String text = getIntent().getExtras().getString("org.hasan.quicklauncher.hello");
                //2)^ *unloading package: [ String text = getIntent().getExtras().getString("sent package's Key") ]
                //"text" will hold a reference to whatever the value of the key "org.hasan.quicklauncher.hello" is.
            TextView tview = (TextView) findViewById(R.id.textView);
                //3)^ "tv" will hold a reference to the TextView display in the 2nd layout
            tview.setText(text);
                //4)^ will put that text in the TextView box
        }

        //LAUNCHING ACTIVITY OUTSIDE APP:






    }
}
