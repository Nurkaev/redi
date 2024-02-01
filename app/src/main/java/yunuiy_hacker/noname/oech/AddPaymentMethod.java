package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.appbar.MaterialToolbar;

public class AddPaymentMethod extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_payment_method);
        MaterialToolbar mt = (MaterialToolbar) findViewById(R.id.add_payment_method_mt);
        mt.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        RadioButton rb1 = (RadioButton) findViewById(R.id.add_payment_method_rb1);
        RadioButton rb2 = (RadioButton) findViewById(R.id.add_payment_method_rb2);
        RadioGroup rg = (RadioGroup) findViewById(R.id.add_payment_method_rg);
        RadioButton rb3 = (RadioButton) findViewById(R.id.add_payment_method_rb3);
        RadioButton rb4 = (RadioButton) findViewById(R.id.add_payment_method_rb4);

        LinearLayout cv1 = (LinearLayout) findViewById(R.id.add_payment_method_cv1);
        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(true);
                rb2.setChecked(false);
                rg.setVisibility(View.GONE);
            }
        });
        LinearLayout cv2 = (LinearLayout) findViewById(R.id.add_payment_method_cv2);
        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb1.setChecked(false);
                rb2.setChecked(true);
                rg.setVisibility(View.VISIBLE);
            }
        });
        LinearLayout cv3 = (LinearLayout) findViewById(R.id.add_payment_method_cv3);
        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3.setChecked(true);
                rb4.setChecked(false);
            }
        });
        LinearLayout cv4 = (LinearLayout) findViewById(R.id.add_payment_method_cv4);
        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rb3.setChecked(false);
                rb4.setChecked(true);
            }
        });
    }
}
