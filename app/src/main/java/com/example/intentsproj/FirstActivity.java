package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class FirstActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "m1";
    public static final String EXTRA_MESSAGE2 = "m2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
    }


        /** Called when the user taps the Send button */
        public void sendMessage(View view) {
            Intent intent = new Intent(this, FirstActivity.class);

            EditText Num1_txt=(EditText)findViewById(R.id.editText);
            String message=Num1_txt.getText().toString();

            EditText Num2_txt=(EditText)findViewById(R.id.editText2);
            String message2=Num2_txt.getText().toString();

            intent.putExtra(EXTRA_MESSAGE, message);
            intent.putExtra(EXTRA_MESSAGE2, message2);
            startActivity(intent);
        }
}
