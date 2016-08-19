package ude.edu.uy.ejemploasynctask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    private Button btnActivityPrincipal;
    private Button btnStartAsyncTask;
    private Button btnStopAsyncTask;
    private ProgressBar pgbProgress;
    private static final String TAG="ProgressBarActivity";
    private ProgressBarAsyncTask progressBarAsyncTask;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"Inicializando componentes");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progressbar);
        btnActivityPrincipal=(Button)findViewById(R.id.btn_principal);
        btnStartAsyncTask=(Button)findViewById(R.id.btn_start);
        btnStopAsyncTask=(Button)findViewById(R.id.btn_stop);
        pgbProgress=(ProgressBar)findViewById(R.id.pgb_progress);
        pgbProgress.setMax(100);
        progressBarAsyncTask=new ProgressBarAsyncTask(this);
        btnStartAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarAsyncTask.execute();
            }
        });
        btnStopAsyncTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBarAsyncTask.cancel(false);
            }
        });

        btnActivityPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public ProgressBar getPgbProgress() {
        return pgbProgress;
    }
}
