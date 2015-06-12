package edu.olemiss.p4ststasny;

/**
 * Created by Sean Staz on 4/29/2015.
 */
import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView;

//*This satisfies the ScrollView Concept
public class ScrollViewActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);
        //*This satisfies the Dynamic UI Concept
        TextView view =	(TextView) findViewById(R.id.TextView02);
        Resources res = getResources();
        String[] nutrHealProp = res.getStringArray(R.array.nutrHealProp);
        String s="";
        for (int i=0; i < nutrHealProp.length; i++)
        {
            s += nutrHealProp[i] + "\n";
        }
        view.setText(s);
    }
}
