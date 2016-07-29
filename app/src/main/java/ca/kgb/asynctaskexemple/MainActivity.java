package ca.kgb.asynctaskexemple;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    private ProgressBar mProgressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProgressBar = (ProgressBar)findViewById(R.id.progressBar);
        new ExampleTask(mProgressBar).execute();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void doMagic(View view) {
        Log.d(TAG, "doMagic: Hello World");
        //Intent intent = new Intent(this, MyService.class);
        //startService(intent);
    }
}
