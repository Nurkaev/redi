package yunuiy_hacker.noname.oech;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.imageview.ShapeableImageView;

public class CallRider extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.call_rider);
        String name = getIntent().getStringExtra("name");
        int id = getIntent().getIntExtra("id", 0);
        ShapeableImageView siv = (ShapeableImageView) findViewById(R.id.call_rider_siv);
        TextView tv = (TextView) findViewById(R.id.call_rider_tv);
        switch (id) {
            case 0:
                siv.setImageResource(R.drawable.avatar);
                break;
            case 1:
                siv.setImageResource(R.drawable.chinoso);
                break;
            case 2:
                siv.setImageResource(R.drawable.raph);
                break;
            case 3:
                siv.setImageResource(R.drawable.joy);
                break;
            case 4:
                siv.setImageResource(R.drawable.joy2);
                break;
        }
        tv.setText(name);
    }

    public void endCall(View view) {
        finish();
    }
}
