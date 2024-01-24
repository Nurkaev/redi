package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class Splash extends AppCompatActivity {

    //Начальный класс с логотипом
    //25.01.2024
    //Нуркаев.А.Х

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        SharedPreferences sharedPreferences = getSharedPreferences("user", MODE_PRIVATE);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i;
                if (sharedPreferences.getAll().isEmpty()) {
                    i = new Intent(Splash.this, OnBoarding.class);
                }
                else {
                    i = new Intent(Splash.this, Holder.class);
                }
                startActivity(i);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                finish();
            }
        }, 400);
    }
}
