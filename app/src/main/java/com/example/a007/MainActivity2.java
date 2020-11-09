package com.example.a007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        A();
    }
    public void BtoA(View v){

        EditText edit_B = (EditText)findViewById(R.id.edit);

        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("1R", edit_B.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void A() {
        int A1= 0;
        Bundle bundle = this.getIntent().getExtras();
        if (bundle != null) {
            A1 = Integer.parseInt(bundle.getString("T1"));

            TextView A = (TextView)findViewById(R.id.value);
            A.setText(Integer.toString(A1));
        }
    }
}