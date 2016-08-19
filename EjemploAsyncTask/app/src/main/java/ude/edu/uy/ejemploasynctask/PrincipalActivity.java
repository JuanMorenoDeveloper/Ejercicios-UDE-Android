package ude.edu.uy.ejemploasynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class PrincipalActivity extends AppCompatActivity {

    private Button btnProgressBarActivity;
    private Button btnProgressDialogActivity;
    private static final String TAG = "PrincipalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "Inicianlizando componentes");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        btnProgressBarActivity = (Button) findViewById(R.id.btn_progressbar);
        btnProgressBarActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentProgressBar = new Intent(PrincipalActivity.this, ProgressBarActivity.class);
                startActivity(intentProgressBar);
            }
        });
        btnProgressDialogActivity = (Button) findViewById(R.id.btn_progressdialog);
        btnProgressDialogActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PrincipalActivity.this, ProgressDialogActivity.class);
                startActivity(intent);
            }
        });
    }
}
