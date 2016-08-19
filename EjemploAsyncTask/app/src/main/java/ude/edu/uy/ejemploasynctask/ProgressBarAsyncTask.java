package ude.edu.uy.ejemploasynctask;

import android.app.Activity;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.test.ActivityTestCase;
import android.util.Log;

public class ProgressBarAsyncTask extends AsyncTask<Void, Integer, Void> {
    private ProgressBarActivity activity;
    private final static String TAG = "ProgressBarAsyncTask";

    public ProgressBarAsyncTask(ProgressBarActivity activity) {
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... params) {
        Log.i(TAG, "Ejecutando asynctask");
        for (int i = 0; i < 100; i++) {
            publishProgress(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        Log.i(TAG, "Progreso asynctask: " + values[0]);
        activity.getPgbProgress().setProgress(values[0]);
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}
