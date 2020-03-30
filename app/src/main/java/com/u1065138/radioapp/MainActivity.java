package com.u1065138.radioapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnOK(View view) {
        TextView txvShow =(TextView)findViewById(R.id.txvShow);
        RadioGroup KGirGroup = (RadioGroup)findViewById(R.id.KGirGroup);

        int id = KGirGroup.getCheckedRadioButtonId();
        RadioButton selected = (RadioButton)findViewById(id);

        txvShow.setText("我的最愛是:" + selected.getText());
    }
}
