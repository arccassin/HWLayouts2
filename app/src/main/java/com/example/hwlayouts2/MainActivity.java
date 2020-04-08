package com.example.hwlayouts2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSendButton(View view) {
        TextView tvSendedMsg = findViewById(R.id.tvSendedMsg);
        TextView tvGroup = findViewById(R.id.tvGroup);
        TextView tvName = findViewById(R.id.tvName);
        Spinner spnNames = findViewById(R.id.spnNames);
        Spinner spnGroup = findViewById(R.id.spnGroups);
        EditText edtEnterMsg = findViewById(R.id.edtEnterMsg);
        tvSendedMsg.setText(edtEnterMsg.getText().toString());
        tvGroup.setText(spnGroup.getSelectedItem().toString());
        tvName.setText(spnNames.getSelectedItem().toString());
    }
}
