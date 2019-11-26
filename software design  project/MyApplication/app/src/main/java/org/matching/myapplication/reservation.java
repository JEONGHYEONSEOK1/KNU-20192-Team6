package org.matching.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class reservation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservation);

        final CheckBox cb3 = (CheckBox)findViewById(R.id.checkBox3);
        final CheckBox cb4 = (CheckBox)findViewById(R.id.checkBox4);
        final TextView tv = (TextView)findViewById(R.id.textView8);
        cb3.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((cb3.isChecked() == true&&cb4.isChecked()==true)||cb3.isChecked() == false&&cb4.isChecked()==false)
                    tv.setText("사용 여부를 선택하세요");
                else{
                    String result = "0";
                    if(cb3.isChecked() == true&&cb4.isChecked()==false) result = "5000";
                    tv.setText(result+" point");
                }
            }
        }) ;
        cb4.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((cb3.isChecked() == true&&cb4.isChecked()==true)||cb3.isChecked() == false&&cb4.isChecked()==false)
                    tv.setText("사용 여부를 선택하세요");
                else{
                    String result = "0";
                    if(cb3.isChecked() == true&&cb4.isChecked()==false) result = "5000";
                    tv.setText(result+" point");
                }
            }
        }) ;

    }
    public void oncomplete(View v) {
        Intent intent = new Intent(getApplicationContext(),complete.class);
        startActivity(intent);
    }

}