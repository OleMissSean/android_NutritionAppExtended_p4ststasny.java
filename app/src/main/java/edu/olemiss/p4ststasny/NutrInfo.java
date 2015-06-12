package edu.olemiss.p4ststasny;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

/**
 * Created by Sean Staz on 4/8/2015.
 */
public class NutrInfo extends ActionBarActivity implements Communicator{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutr_info);

        FragmentManager fM = getFragmentManager();
        FragmentTransaction fT;

        //*This satisfies Fragment Concept
        //*This satisfies the Dynamic UI Concept
        // construct and add fragment for listFrag
        fT = fM.beginTransaction();
        ListFrag nutrList = new ListFrag();
        fT.add(R.id.listFragment, nutrList);
        fT.commit();

        //*This satisfies Fragment Concept
        // construct and add fragment for infoFrag
        fT = fM.beginTransaction();
        InfoFrag iFrag = new InfoFrag();
        fT.add(R.id.infoFragment, iFrag, "InfoView");
        fT.commit();
    }

    //*This satisfies the Dynamic UI Concept
    @Override
    public void strMessage(String mess) {
        FragmentManager manager = getFragmentManager();
        InfoFrag iFrag = (InfoFrag) manager.findFragmentById(R.id.infoFragment);
        iFrag.changeTitle(mess);
    }

    //*This satisfies the Dynamic UI Concept
    @Override
    public void intMessage(int pos) {
        FragmentManager manager = getFragmentManager();
        InfoFrag iFrag = (InfoFrag) manager.findFragmentById(R.id.infoFragment);
        iFrag.changeDescr(pos);
    }
}
