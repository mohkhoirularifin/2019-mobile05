package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.FitnessFragment;

public class FitnesKu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitnes_ku);
    }

    public void handlerPushUp(View view) {
    }

    public void handlerHandStand(View view) {

        FitnessFragment checkVisible = (FitnessFragment) getSupportFragmentManager().findFragmentByTag("FRAGMENT_FITNESS");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.myFitnessPlaceholder,new FitnessFragment(),"FRAGMENT_FITNESS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerDips(View view) {
        DipsFragment checkVisible = (DipsFragment) getSupportFragmentManager().findFragmentByTag("FRAGMENT_DIPS");
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (checkVisible != null && checkVisible.isVisible() ){
//            fragmentTransaction.commit();
        }
        else {
//            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.myFitnessPlaceholder,new DipsFragment(),"FRAGMENT_DIPS");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
