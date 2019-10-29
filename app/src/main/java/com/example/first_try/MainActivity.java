package com.example.first_try;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    static int score = 0;
    static int score2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.countscore);



        /*
        Button button = findViewById(R.id.log);
        final EditText editText = findViewById(R.id.editText);
        editText.setText("牛批");

        Intent intent = new Intent(MainActivity.this,MusicServer.class);
        startService(intent);
        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
        */
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String score_a = ((TextView)findViewById(R.id.score)).getText().toString();
        String score_b = ((TextView)findViewById(R.id.score2)).getText().toString();

        outState.putString("score_a",score_a);
        outState.putString("score_b",score_b);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String score_a = savedInstanceState.getString("score_a");
        String score_b = savedInstanceState.getString("score_b");
        ((TextView)findViewById(R.id.score)).setText(score_a);
        ((TextView)findViewById(R.id.score2)).setText(score_b);

    }

    public void click(View v){

        int id  = v.getId();
        switch (id){
            case R.id.onepoint:
                score = score+1;
                break;
            case R.id.twopoint:
                score = score+2;
                break;
            case R.id.threepoint:
                score = score+3;
                break;
            case R.id.onepoint2:
                score2 = score2+1;
                break;
            case R.id.twopoint2:
                score2 = score2+2;
                break;
            case R.id.threepoint2:
                score2 = score2+3;
                break;
            case R.id.reset:
                score = 0;
                score2 = 0;
                break;

            default:
                    break;
        }
        TextView textView = findViewById(R.id.score);
        textView.setText(score+"");
        TextView textView2 = findViewById(R.id.score2);
        textView2.setText(score2+"");
        /*
        final EditText editText = findViewById(R.id.editText);
        final EditText editText1 = findViewById(R.id.editText2);
        editText.setText("素质真高");
        editText1.setText("冲冲冲！！！！");

        EditText editText = findViewById(R.id.sheshidu);
        TextView textView = findViewById(R.id.show);
        try {
            float degree = Float.parseFloat(editText.getText().toString());
            textView.setText("℉："+String.format("%.2f",degree*9/5+32));
        }
        catch (Exception e){
            editText.setText("");
            editText.setHint("请输入正确的数字！");
        }
        */
    }

    /*
    protected void onStop(){
        Intent intent = new Intent(MainActivity.this,MusicServer.class);
        stopService(intent);
        super.onStop();

    }
    */
}
