package com.tutaro.bai2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentActivity extends AppCompatActivity {

    public static final String INFO_STUDENT = "INFO_STUDENT";

    private TextView mName;
    private EditText mHometown;
    private EditText mMelaOrFemale;
    private EditText mBirthday;
    private EditText mClassSutdent;
    private EditText mCourse;
    private Button mSave;
    private Student mAddName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        mName = (TextView) findViewById(R.id.tv_name_student);
        mHometown = (EditText) findViewById(R.id.edt_hometown);
        mMelaOrFemale = (EditText) findViewById(R.id.edt_male_or_female);
        mBirthday = (EditText) findViewById(R.id.edt_birthday);
        mClassSutdent = (EditText) findViewById(R.id.edt_class);
        mCourse = (EditText) findViewById(R.id.edt_course);
        mSave = (Button) findViewById(R.id.btn_save);

        Bundle bundle = getIntent().getExtras();
        mAddName = (Student) bundle.getParcelable(MainActivity.NAME_STUDENT);
        mName.setText(mAddName.getName());
        Log.d("",mAddName.getName() + "");

        mSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(StudentActivity.this, StudentInfoActivity.class);
                intent.putExtra(INFO_STUDENT, new Student(mAddName.getName(), mHometown.getText()+"",
                        mMelaOrFemale.getText()+"", mBirthday.getText()+"", mClassSutdent.getText()+"",
                        mCourse.getText()+""));
                startActivity(intent);
            }
        });
    }
}
