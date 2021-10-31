package com.example.pinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TinnhanActivity extends AppCompatActivity {
Button tk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tinnhan);

        tk=findViewById(R.id.btn_ten);
        tk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNoidungActivity();
            }
        });
    }
    private void goToNoidungActivity() {
        Intent intent = new Intent(this,NoidungTNActivity.class);
        startActivity(intent);
    }
}