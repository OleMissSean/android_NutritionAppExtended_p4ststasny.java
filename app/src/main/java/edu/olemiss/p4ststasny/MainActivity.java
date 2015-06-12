package edu.olemiss.p4ststasny;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Random;

// When using Appcombat support library you need to extend Main Activity to ActionBarActivity.
public class MainActivity extends ActionBarActivity {

    //*This satisfies the Toolbar Concept
    // Declaring the Toolbar Object
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*This satisfies the Toolbar Concept
        toolbar = (Toolbar) findViewById(R.id.tool_bar); // Attaching the layout to the toolbar object
        setSupportActionBar(toolbar);                   // Setting toolbar as the ActionBar with setSupportActionBar() call

//        Button B_callNutrInfo = (Button) (findViewById(R.id.B_callNutrInfo));
//        B_callNutrInfo.setOnClickListener(nutrInfoListener);
//
//        Button test_button = (Button) (findViewById(R.id.test_button));
//        test_button.setOnClickListener(test_buttonListener);

        //*This satisfies the Dynamic UI Concept
        //*This satisfies the Long Press Concept
        //*This satisfies the Drawable Concept
        ImageView clicker = (ImageView) (findViewById(R.id.clickz));
        clicker.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ImageView iv = (ImageView) (findViewById(R.id.iv));
                Random r = new Random();
                int ranNum = r.nextInt(8);
                Resources res = getResources();

                String[] nameArr2 = res.getStringArray(R.array.nameArray2);

                TextView type = (TextView)(findViewById(R.id.type));
                type.setText(nameArr2[ranNum]);

                //*This satisfies the Drawable Concept
                //Pictures from: https://en.wikipedia.org/wiki/B_vitamins
                //http://stackoverflow.com/questions/9156698/how-to-get-images-dynamically-from-drawable-folder
                String uri = "@drawable/" + imageName(ranNum);

                int imageResource = getResources().getIdentifier(uri, null, getPackageName());

                Drawable res2 = getResources().getDrawable(imageResource);
                iv.setImageDrawable(res2);
                return false;
            }
        });
    }

    public String imageName(int num)
    {
        Resources res = getResources();

        String[] nameArr = res.getStringArray(R.array.nameArray);
        String ret = nameArr[num];
        showToast(ret);
        return ret;
    }

    public void showToast(String message)
    {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

//    public View.OnClickListener nutrInfoListener = new View.OnClickListener()
//    {
//        public void onClick(View v)
//        {
//            Intent i = new Intent("edu.olemiss.NutrInfo");
//            startActivity(i);
//        }
//    };
//
//    public View.OnClickListener test_buttonListener = new View.OnClickListener()
//    {
//        public void onClick(View v)
//        {
//            Intent i = new Intent("edu.olemiss.ScrollViewActivity");
//            startActivity(i);
//        }
//    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.action_healProp:
                Intent i1 = new Intent("edu.olemiss.NutrInfo");
                startActivity(i1);
                return true;
            case R.id.action_nutrInfo:
                Intent i2 = new Intent("edu.olemiss.ScrollViewActivity");
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
