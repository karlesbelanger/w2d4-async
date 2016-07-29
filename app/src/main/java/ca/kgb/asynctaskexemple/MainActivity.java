package ca.kgb.asynctaskexemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new ExampleTask().execute();
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public void doMagic(View view) {
        Log.d(TAG, "doMagic: Hello World");
    }
}
