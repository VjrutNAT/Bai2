package com.tutaro.bai2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class StudentInfoActivity extends AppCompatActivity {

    private TextView mName;
    private TextView mHometown;
    private TextView mMelaOrFemale;
    private TextView mBirthday;
    private TextView mClassSutdent;
    private TextView mCourse;
    private Student mInfoName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        mName = (TextView) findViewById(R.id.tv_name_student);
        mHometown = (TextView) findViewById(R.id.tv_hometown);
        mMelaOrFemale = (TextView) findViewById(R.id.tv_male_or_female);
        mBirthday = (TextView) findViewById(R.id.tv_birthday);
        mClassSutdent = (TextView) findViewById(R.id.tv_class);
        mCourse = (TextView) findViewById(R.id.tv_course);

        Bundle bundle = getIntent().getExtras();
        mInfoName = bundle.getParcelable("INFO_STUDENT");

        mName.setText(getString(R.string.name) + " " + mInfoName.getName());
        mHometown.setText(getString(R.string.hometown) + " " + mInfoName.getHometown());
        mMelaOrFemale.setText(getString(R.string.male_or_female) + " " + mInfoName.getMaleOrFemale());
        mBirthday.setText(getString(R.string.birthday) + " " + mInfoName.getBirthday());
        mClassSutdent.setText(getString(R.string.class_student) + " " + mInfoName.getClassStudent());
        mCourse.setText(getString(R.string.course) + " " + mInfoName.getCourse());
    }
}
