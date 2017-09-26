package com.tutaro.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_STUDENT = "NAME_STUDENT";

    private EditText mAddName;
    private Button mAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAddName = (EditText) findViewById(R.id.edt_add_name);
        mAdd = (Button) findViewById(R.id.btn_add);

        mAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentActivity.class);
                intent.putExtra(NAME_STUDENT, new Student(mAddName.getText()+""));
                startActivity(intent);
            }
        });
    }
}
