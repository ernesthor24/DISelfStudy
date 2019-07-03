package com.example.diselfstudy;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class Stark implements House {

    @Inject
    public Stark() {

    }

    private static final String TAG = "LOG";

    @Override
    public void prepareForWar() {
        String prepWarString = this.getClass().getSimpleName() + " preparing for war!";
        Log.d(TAG, this.getClass().getSimpleName() + " preparing for war!");
    }

    @Override
    public void reportForWar() {
        String repWar = this.getClass().getSimpleName() + " reporting for war!";
        Log.d(TAG, this.getClass().getSimpleName() + " reporting for war!");

    }

}
