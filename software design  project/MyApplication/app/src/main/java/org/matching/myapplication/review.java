package org.matching.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import org.matching.myapplication.R;

public class review extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.review);
    }
    public void onhistory(View v) {
        Intent intent = new Intent(getApplicationContext(),exhistory.class);
        startActivity(intent);
    }
}
