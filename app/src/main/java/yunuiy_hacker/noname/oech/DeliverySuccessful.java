package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DeliverySuccessful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delivery_successful);
        ProgressBar pd = (ProgressBar) findViewById(R.id.delivery_successful_pd);
        Handler h = new Handler();
        h.postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pd.setVisibility(View.GONE);
                        ImageView iv = (ImageView) findViewById(R.id.delivery_successful_iv);
                        iv.setVisibility(View.VISIBLE);
                        TextView tv = (TextView) findViewById(R.id.delivery_successful_tv);
                        tv.setVisibility(View.VISIBLE);
                        TextView tv2 = (TextView) findViewById(R.id.delivery_successful_tv2);
                        tv2.setVisibility(View.VISIBLE);
                    }
                });
            }
        }, 2000);
    }

    public void done(View view) {
        Intent i = new Intent(getApplicationContext(), Home.class);
        startActivity(i);
    }
}