package org.matching.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.matching.myapplication.R;

public class catagory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.catagory);
    }
    public void onlist(View v) {
        Intent intent = new Intent(getApplicationContext(),exlist.class);
        startActivity(intent);
    }
    public void onmy(View v) {
        Intent intent = new Intent(getApplicationContext(),myreservation.class);
        startActivity(intent);
    }
    public void onqa(View v) {
        Intent intent = new Intent(getApplicationContext(),qa.class);
        startActivity(intent);
    }
}