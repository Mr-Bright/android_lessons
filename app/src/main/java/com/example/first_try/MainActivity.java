package com.example.first_try;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.log);
        final EditText editText = findViewById(R.id.editText);
        editText.setText("牛批");
        /*
        Intent intent = new Intent(MainActivity.this,MusicServer.class);
        startService(intent);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        */
    }
    public void click(View v){
        final EditText editText = findViewById(R.id.editText);
        final EditText editText1 = findViewById(R.id.editText2);
        editText.setText("素质真高");
        editText1.setText("冲冲冲！！！！");
    }

    /*
    protected void onStop(){
        Intent intent = new Intent(MainActivity.this,MusicServer.class);
        stopService(intent);
        super.onStop();

    }
    */
}
