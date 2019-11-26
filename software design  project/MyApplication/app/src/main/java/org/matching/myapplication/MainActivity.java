package org.matching.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onlogin(View v) {
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox) ;
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkBox2) ;
        if(checkBox1.isChecked()==true&&checkBox3.isChecked()==false) {
            Intent intent = new Intent(getApplicationContext(), catagory.class);
            startActivity(intent);
        }
        else if(checkBox1.isChecked()==false&&checkBox3.isChecked()==true){
            Intent intent = new Intent(getApplicationContext(),exhistory.class);
            startActivity(intent);
        }

    }
    public void onButton2Clicked(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.naver.com"));
        startActivity(intent);
    }
}
