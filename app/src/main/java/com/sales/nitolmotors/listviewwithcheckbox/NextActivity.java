package com.sales.nitolmotors.listviewwithcheckbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        tv = (TextView) findViewById(R.id.tv);

        for (int i = 0; i < CustomAdapter.modelArrayList.size(); i++){
            if(CustomAdapter.modelArrayList.get(i).getSelected()) {
                tv.setText(tv.getText() + " " + CustomAdapter.modelArrayList.get(i).getAnimal());
            }
        }


    }
}
