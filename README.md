CLicking the "Print Read Me" button: Will open another window within the app with will print "Hello World!".
PROCESS:
Will make in intent to get the app's information and open up to another class/activity.  
Will start an intent to put information in a packet using key-value pairs, the second class/activity will then unpackage it. Basically passing information between activities
Will start the activity
In the second class/activity, the app will check to see if there is information being shared. 
If there is, the app will unpackage the information be using the key and then turn it into a string
Will then print the unpackaged string on the device screen. 

Clicking the "Launch Google" button: Will launch chrome and will display an url.
PROCESS:
Will take a string such as "https://www.google.com/" will then turn it into an URL using URI. 
Will then make an ACTION intent to go outside of the app to perform an action (in this case, it is to open to the url). 
Will send out a brodcast asking if there are any apps on the android device that can do the action that is being requested (which is opening to the webaddress)
Will check to see if the response back is a null. if its not a null, then we ask to get the list of apps that can perform the activity.
We finilly start the activity. 



