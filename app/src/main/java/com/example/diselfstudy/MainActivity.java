package com.example.diselfstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import dagger.Component;

public class MainActivity extends AppCompatActivity {

    private TextView boltonPrep;
    private TextView boltonRep;
    private TextView starkPrep;
    private TextView starkRep;
    private Button gameThronesButton;

    private BattleComponent component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        gameThronesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            /*
            Stark stark = new Stark();
            Boltons boltons = new Boltons();

            War war = new War(stark, boltons);
            war.prepare();
            war.report();
            */

            BattleComponent component = DaggerBattleComponent.create();
            War war = component.getWar();
            war.report();
            war.prepare();
            }
        });
    }


    public void initViews() {
        boltonPrep = findViewById(R.id.boltonPrepare);
        boltonRep = findViewById(R.id.boltonReport);
        starkPrep = findViewById(R.id.starkPrepare);
        starkRep = findViewById(R.id.starkReport);
        gameThronesButton = findViewById(R.id.gotButton);

    }
}
