package com.sowg.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by sam on 6/11/13
 * Splash Screen show up when the application is starting
 */
public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle Calcu){
        super.onCreate(Calcu);
        setContentView(R.layout.splash);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);// makes the application to sleep for 5 Seconds

                }catch (InterruptedException e){
                    e.printStackTrace();
            } finally{
                    Intent openCalcu = new Intent("com.sowg.calc.SOWGCALC");
                    startActivity(openCalcu);
            }
            }
        };
        timer.start();

    }
}

