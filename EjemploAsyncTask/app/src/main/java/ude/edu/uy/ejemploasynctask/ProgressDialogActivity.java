package ude.edu.uy.ejemploasynctask;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ProgressDialogActivity extends AppCompatActivity implements UpdatableProgress {
    private BdAsyncTask BdAsyncTask;
    private ProgressDialog pgdProgress;
    private static final String TAG = "ProgressDialogActivity";
    private final int MAX_REGISTER = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Inicializando componentes");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressdialog);
        pgdProgress = new ProgressDialog(this);
        //pgdProgress.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        pgdProgress.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        pgdProgress.setMessage("Por favor espere..");
        pgdProgress.setCancelable(false);
        pgdProgress.setMax(MAX_REGISTER);
    }

    public void startAsyncTask(View v) {
        pgdProgress.show();
        BdAsyncTask = new BdAsyncTask(this);
        BdAsyncTask.execute(MAX_REGISTER);
    }

    public void stopAsyncTask(View v) {
        BdAsyncTask.cancel(false);
    }

    public void back(View v) {
        finish();
    }

    @Override
    public void update(int count) {
        Log.i(TAG, "Progreso asynctask: " + count);
        pgdProgress.setProgress(count);
        pgdProgress.setMessage("Insertando " + count + " de " + MAX_REGISTER);
        if (count == MAX_REGISTER - 1) {
            pgdProgress.dismiss();
        }
    }

    @Override
    public void cancel() {
        Toast.makeText(this,"Tarea cancelada",Toast.LENGTH_SHORT).show();
    }
}
