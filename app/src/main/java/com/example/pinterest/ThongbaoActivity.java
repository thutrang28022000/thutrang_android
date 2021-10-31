package com.example.pinterest;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThongbaoActivity extends AppCompatActivity {

    Button tinnhan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongbao);

        tinnhan= findViewById(R.id.tinnhan);
        tinnhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToTinnhanActivity();
            }
        });


    }
    private void goToTinnhanActivity() {
        Intent intent = new Intent(ThongbaoActivity.this,TinnhanActivity.class);
      startActivity(intent);
    }
}