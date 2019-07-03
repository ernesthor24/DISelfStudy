package com.example.diselfstudy;

import dagger.Component;

@Component
public interface BattleComponent {
    War getWar();
    Stark getStark();
    Boltons getBolton();
}
