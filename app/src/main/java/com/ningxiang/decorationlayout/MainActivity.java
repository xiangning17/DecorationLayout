package com.ningxiang.decorationlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DecorationLayout layout = findViewById(R.id.decor_layout);
        final TextView verity = findViewById(R.id.btn_verify);
        verity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verity.setText("重新获取");
            }
        });
    }
}
