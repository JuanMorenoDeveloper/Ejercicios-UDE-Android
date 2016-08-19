package ude.edu.uy.ejemploasynctask;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ProgressDialogActivity extends AppCompatActivity {

    private Button btnActivity1;
    private Button btnActivity2;
    private static final String TAG="ProgressDialogActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG,"Inicianlizando componentes");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }
}
