package com.kirishikistudios.android.namiepdfviewer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view){
        Intent i = new Intent(this, com.kirishikistudios.android.namiepdfviewer.DetailActivity.class);
        String fileName;
        switch(view.getId()){
            case R.id.buttonA:
                fileName = "913.pdf";
                break;
            case R.id.buttonB:
                fileName = "914.pdf";
                break;
            case R.id.buttonC:
                fileName = "917.pdf";
                break;
            default:
                fileName = "";
                break;
        }
        i.putExtra("fileName", fileName);
        startActivity(i);
    }
}
