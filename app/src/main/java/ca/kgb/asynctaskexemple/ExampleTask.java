package ca.kgb.asynctaskexemple;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.ProgressBar;

/**
 * Created by admin on 7/29/2016.
 */
public class ExampleTask extends AsyncTask<Void, Integer, Void> {
    private static final String TAG = "ExampleTask";
    private ProgressBar mProgressBar;
    public ExampleTask(ProgressBar progressBar){
        mProgressBar = progressBar;
        //mProgressBar.setMax(100);
    }
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.d(TAG, "onPreExecute: " + Thread.currentThread());
    }

    @Override
    protected Void doInBackground(Void... voids) {
        Log.d(TAG, "doInBackground: " + Thread.currentThread());

        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
                Log.d(TAG, "onThreadTime: " + i);
                publishProgress(i);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return null;
    }


    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        mProgressBar.setProgress(values[0]);
        Log.d(TAG, "onProgressUpdate: " + Thread.currentThread());
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(TAG, "onPostExecute: " + Thread.currentThread());
    }

    @Override
    protected void onCancelled() {
        super.onCancelled();
        Log.d(TAG, "onCancelled: " + Thread.currentThread());
    }
}
