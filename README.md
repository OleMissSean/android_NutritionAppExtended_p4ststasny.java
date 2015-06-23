# p4ststasny_NutritionAppExtended
Program 4 for Mobile Applications: Android


Mobile Application Development
Programming Assignment #4
Spring 2015
Due: Thursday,April 9th at Midnight.

For this assignment, there is no specific application to develop.
You are asked to demonstrate that you understand and can implement a set of Android concepts in a single application of your choosing.
It might be helpful if you use this programming assignment as a start toward figuring out pieces of your final class project.
Or you can use the money tracking example from the last quiz/lab.

Develop a single application (you choose the domain) that demonstrates the use of at least five of the following Android concepts.
Plus, you should also include one extra concept of your choice, so long as it isn’t something basic that we have already covered.
It is probably best to clear it with me before you count on using a different concept.

• Action Bar
• Long Press
• ListView
• Dynamic UI
• Fragment (or DialogFragment)
• Drawable
• Database
• SharedPreferences
>EXTENDED PART: ADD TWO NEW ANDROID CONCEPTS THAT HAVE NOT BEEN PART OF THE LESSON PLAN FOR THIS COURSE.

Upload a single zip file to Blackboard, Prog3.
The file should that contains the whole project and a README.
The README is very important this time so put some extra effort into it.
In the README, explain which of the concepts you implemented, why that feature makes sense to use the way you did, and any resources you consulted to figure out how to use it.


__________________________________________________________________________________________

CONCEPTS IMPLEMENTED
__________________________
[Sean Stasny]
[ststasny]
[Program Assignment #4]
[04/30/2015]
__________________________
-Long Press
        >MainActivity.java - Lines: 38-63
            >activity_main.xml - Lines: 56-62
                ~I used a drawable with a long press click listener to randomly generate a separate drawable below the one clicked.
                 The drawable that is generated is the chemical formula for one of the 8 B Vitamins.
             
-Dynamic UI
        >MainActivity.java - Lines: 37-63
            >activity_main.xml - Lines: 71-77
                >strings.xml - Lines: 7-27
                    ~I used a drawable with a long press click listener to dynamically and randomly generate a separate drawable below the one clicked.
                     The drawable that is generated is the chemical formula for one of the 8 B Vitamins. I used a string array to hold the file names.
                     I dynamically did this so I could show each picture.
                     
        >ScrollViewActivity - Lines: 18-26
            >activity_scroll_view: 28-34
                >strings.xml - 86-246
                    ~I used dynamically added text to the TextField from an array in the strings.xml file.
            
        >activity_nutr_info.xml - Lines: 8-14
            >NutrInfo.java - Lines: 21-26
                >ListFrag.java: - Lines: 20-36
                    ~I created a FrameLayout in activity_nutr_info.xml and used a fragment manager and transaction in NutrInfo.java to dynamically add the ListView (ListFrag.java) to the FrameLayout.
                     This ListView is for selected which nutrient you would like to display information about.

        >NutrInfo.java - Lines: 34-48
            >Communicator.java
                >InfoFrag.java - Lines: 49-86
                    ~I dynamically changed the information in the fragment (InfoFrag.java) to display information for the nutrient selected in the ListView.
                     I dynamically did this so I could reuse the same fragment.
                     
                     #I consulted Dr. Wilkins' Fragment3 & SEC_Fragment Android Apps.
    
-Drawable
        >activity_main.xml - Lines: 40-45
            >activity_main.xml - Lines: 71-77
                >strings.xml - Lines: 8-30
                    >MainActivity - Lines: 39-64
                        ~I used a drawable with a long press click listener to dynamically and randomly generate a separate drawable below the one clicked.
                         The drawable that is generated is the chemical formula for one of the 8 B Vitamins. I used a string array to hold the file names.
                         
                        #I consulted http://stackoverflow.com/questions/9156698/how-to-get-images-dynamically-from-drawable-folder
                         to figure out how to retrieve the names of the drawables.
                        #I consulted https://en.wikipedia.org/wiki/B_vitamins for the images used for drawables. They were all labelled for reuse.
                        
        >menu-main - Lines: 14-26
            ~I used drawables for the Toolbar icons.
-ListView
        >ListFrag.java
            ~I created a FrameLayout in activity_nutr_info.xml and used a fragment manager and transaction in NutrInfo.java to add the ListView (ListFrag.java) to the FrameLayout.
             This ListView is for selected which nutrient you would like to display information about.
             Using a ListView worked well for the amount of items I need to display on the screen.
                     
             #I consulted Dr. Wilkins' SEC_Fragment Android App.
                
-Fragment
        >activity_nutr_info.xml - Lines: 16-22
            >NutrInfo.java - Lines: 29-51
                >activity_info_frag.xml
                    >InfoFrag.java
                        ~I used a fragment (InfoFrag.java) to display information about the nutrient that is selected on the ListView.
                         Using a fragment was a clean way to show the information.
                         
                         #I consulted Dr. Wilkins' Fragment3 Android App.
                         
        >ListFrag.java
            >NutrInfo.java - Lines: 21-27
                ~I created a FrameLayout in activity_nutr_info.xml and used a fragment manager and transaction in NutrInfo.java to add the ListView (ListFrag.java) to the FrameLayout.
                 This ListView is for selected which nutrient you would like to display information about.
                 Using a ListView worked well for the amount of items I need to display on the screen. This also satisfies the Fragment Concept requirement.
             
-Toolbar
        >build.gradel (Module: app) - Lines: 23-25
        >MainActivity.java - Lines: 17-31
            >activity_main.xml - Lines: 9-13
                >tool_bar.xml
                    >menu_main.xml - Lines: 7-26
                        >color.xml
                            >styles.xml
                                >tree.png
                                        >food.png
                                            ~I created a Toolbar to handle connecting to my other activities rather than via buttons from the main screen.
                                             The Android Support Library states, "A Toolbar is a generalization of action bars for use within application layouts.
                                             While an action bar is traditionally part of an Activity's opaque window decor controlled by the framework, a Toolbar 
                                             may be placed at any arbitrary level of nesting within a view hierarchy.
                                             An application may choose to designate a Toolbar as the action bar for an Activity using the setSupportActionBar() method."

                                            ##I was given permission by Dr. Wilkins, via email,to use this as one of my 2 additional concepts that we didn’t consider for Program 3 (and wasn’t an “extra”	that I did for Program 3).	
                                                #I consulted The Android API @ https://developer.android.com/reference/android/support/v7/widget/Toolbar.html
                                                #I consulted Android For Devs @ http://www.android4devs.com/2014/12/how-to-make-material-design-app.html
                                    
-ScrollView
        >ScrollViewActivity
            >activity_scroll_view.xml
                ~I created a activity that is a ScrollView and displayed benefits for each essential nutrient in it via a dynamic TextView.

                ##I was given permission by Dr. Wilkins, via email, to use this as one of my 2 additional concepts that we didn’t consider for Program 3 (and wasn’t an “extra”	that I did for Program 3).	
                    #I consulted The Android API @ http://developer.android.com/reference/android/widget/ScrollView.html
                    #I consulted Vogella @ http://www.vogella.com/code/de.vogella.android.scrollview/codestartpage.html
