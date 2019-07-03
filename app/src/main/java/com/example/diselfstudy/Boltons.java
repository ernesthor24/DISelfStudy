package com.example.diselfstudy;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class Boltons implements House {

    @Inject
    public Boltons() {

    }

    private static final String TAG = "LOG";

    @Override
    public void prepareForWar() {

        String prepWar = this.getClass().getSimpleName() + " preparing for war!";
        Log.d(TAG, this.getClass().getSimpleName() + " preparing for war!");

        Bundle warBundle = new Bundle();
        warBundle.putString("boltonPrep", prepWar);
    }

    @Override
    public void reportForWar() {
        String repWar = this.getClass().getSimpleName() + " preparing for war!";
        Log.d(TAG, this.getClass().getSimpleName() + " reporting for war!");

        Bundle warBundle = new Bundle();
        warBundle.putString("boltonReport", repWar);
    }
}