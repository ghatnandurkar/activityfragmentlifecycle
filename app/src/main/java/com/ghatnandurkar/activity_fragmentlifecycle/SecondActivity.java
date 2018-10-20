package com.ghatnandurkar.activity_fragmentlifecycle;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}








