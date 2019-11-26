package org.matching.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class exhistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exhistory);

    }
    public void onapprove1(View v) {
        final TextView tv3 = (TextView)findViewById(R.id.textView3);
        tv3.setText("예약 승인");
    }
    public void onapprove2(View v) {
        final TextView tv4 = (TextView)findViewById(R.id.textView4);
        tv4.setText("예약 승인");
    }
    public void onapprove3(View v) {
        final TextView tv9 = (TextView)findViewById(R.id.textView9);
        tv9.setText("예약 승인");
    }
    public void ondeny1(View v) {
        final TextView tv3 = (TextView)findViewById(R.id.textView3);
        tv3.setText("예약 거부");
    }
    public void ondeny2(View v) {
        final TextView tv4 = (TextView)findViewById(R.id.textView4);
        tv4.setText("예약 거부");
    }
    public void ondeny3(View v) {
        final TextView tv9 = (TextView)findViewById(R.id.textView9);
        tv9.setText("예약 거부");
    }
    public void onreview(View v) {
        Intent intent = new Intent(getApplicationContext(),review.class);
        startActivity(intent);
    }
}