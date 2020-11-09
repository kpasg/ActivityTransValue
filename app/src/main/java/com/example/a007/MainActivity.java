package com.example.a007;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        B();
    }
    public void AtoB(View v){

        EditText eA = (EditText)findViewById(R.id.editV1);

        Intent intent = new Intent(this, MainActivity2.class);
        Bundle bundle = new Bundle();
        bundle.putString("T1", eA.getText().toString());
        intent.putExtras(bundle);
        startActivity(intent);
    }
    private void B(){
        int B = 0;
        Bundle bundle = this.getIntent().getExtras();
        if(bundle != null) {
            B = Integer.parseInt(bundle.getString("1R"));

            TextView B2 = (TextView) findViewById(R.id.value);
            B2.setText(Integer.toString(B));
        }
    }
}