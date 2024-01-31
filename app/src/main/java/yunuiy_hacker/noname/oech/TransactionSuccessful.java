package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class TransactionSuccessful extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_successful_1);
        String number = getIntent().getStringExtra("number");
        TextView tv = (TextView) findViewById(R.id.transaction_successful_1_tv2);
        tv.setText(number);
        ProgressBar pd = (ProgressBar) findViewById(R.id.transaction_successful_1_pd);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        pd.setVisibility(View.GONE);
                        ImageView iv = (ImageView) findViewById(R.id.transaction_successful_1_iv);
                        iv.setVisibility(View.VISIBLE);
                        TextView tv = (TextView) findViewById(R.id.transaction_successful_1_tv);
                        tv.setVisibility(View.VISIBLE);
                    }
                });
            }
        }, 2000);
        MaterialButton mb1 = (MaterialButton) findViewById(R.id.transaction_successful_1_mb1);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Track.class);
                startActivity(i);
            }
        });
        MaterialButton mb2 = (MaterialButton) findViewById(R.id.transaction_successful_1_mb2);
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Home.class);
                startActivity(i);
            }
        });
    }
}