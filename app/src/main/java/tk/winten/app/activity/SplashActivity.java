package tk.winten.app.activity;

import android.content.Intent;
import android.os.Bundle;

import tk.winten.app.R;
import tk.winten.app.tool.Functions;

public class SplashActivity extends Functions {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        /* TODO */
        startActivity(new Intent(this, HomeActivity.class));
        finish();
        /* TODO */
    }
}
