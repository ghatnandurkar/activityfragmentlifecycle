package com.ghatnandurkar.activity_fragmentlifecycle;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.setOnClickListener(this);
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onRestart");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState)");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onSaveInstanceState(Bundle outState)");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(Constants.TAG,getClass().getSimpleName().toString()+"onRestoreInstanceState(Bundle outState)");

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textView:
                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
                break;
        }
    }
}

