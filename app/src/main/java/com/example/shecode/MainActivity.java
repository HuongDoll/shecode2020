package com.example.shecode;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_dangky, btn_dangnhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_dangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sigUp = new Intent(MainActivity.this,SignUpActivity.class);
                startActivity(sigUp);
            }
        });
    }

    private void findID(){
        btn_dangky = findViewById(R.id.buttonDangKi);
        btn_dangnhap = findViewById(R.id.buttonDangNhap);
    }
}