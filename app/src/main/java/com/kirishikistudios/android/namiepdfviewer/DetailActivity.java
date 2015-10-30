package com.kirishikistudios.android.namiepdfviewer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.joanzapata.pdfview.PDFView;

/**
 * Created by yamadanaoyuki on 15/10/30.
 */
public class DetailActivity extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        final PDFView pdfView = (PDFView) findViewById(R.id.pdfview);
        Intent i = this.getIntent();
        String fileName = i.getStringExtra("fileName");
        pdfView.fromAsset(fileName).load();
    }
    public void onClick(View view){
        finish();
    }
}
