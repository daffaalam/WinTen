package tk.winten.app.tool;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

@SuppressLint("Registered")
public class Functions extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = Functions.this;
    }

    public void myIntent(Class tujuan) {
        startActivity(new Intent(context, tujuan));
    }

    public void myToast(String pesan) {
        Toast.makeText(context, pesan, Toast.LENGTH_SHORT).show();
    }

    public void myLog(String pesan) {
        Log.v("myLOG", pesan);
    }
}
