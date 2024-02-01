package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

import java.util.Random;
import java.util.regex.Pattern;

public class SendAPackageReceipt extends AppCompatActivity {
    int code = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_a_package_receipt);
        code = getIntent().getIntExtra("code", 0);

        MaterialToolbar mt = (MaterialToolbar) findViewById(R.id.send_a_package_receipt_mt);
        mt.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        String address1 = getIntent().getStringExtra("address1");
        String country1 = getIntent().getStringExtra("country1");
        String phone1 = getIntent().getStringExtra("phone1");
        String others1 = getIntent().getStringExtra("others1");
        String address2 = getIntent().getStringExtra("address2");
        String country2 = getIntent().getStringExtra("country2");
        String phone2 = getIntent().getStringExtra("phone2");
        String others2 = getIntent().getStringExtra("others2");
        String address3 = getIntent().getStringExtra("address3");
        String country3 = getIntent().getStringExtra("country3");
        String phone3 = getIntent().getStringExtra("phone3");
        String others3 = getIntent().getStringExtra("others3");

        String pack = getIntent().getStringExtra("pack");
        String weight = getIntent().getStringExtra("weight");
        String worth = getIntent().getStringExtra("worth");

        TextView tv1 = (TextView) findViewById(R.id.send_a_package_receipt_tv1);
        TextView tv2 = (TextView) findViewById(R.id.send_a_package_receipt_tv2);
        TextView tv3 = (TextView) findViewById(R.id.send_a_package_receipt_tv3);
        TextView tv4 = (TextView) findViewById(R.id.send_a_package_receipt_tv4);
        TextView tv5 = (TextView) findViewById(R.id.send_a_package_receipt_tv5);
        TextView tv6 = (TextView) findViewById(R.id.send_a_package_receipt_tv6);
        TextView tv7 = (TextView) findViewById(R.id.send_a_package_receipt_tv7);
        TextView tv8 = (TextView) findViewById(R.id.send_a_package_receipt_tv8);
        TextView tv9 = (TextView) findViewById(R.id.send_a_package_receipt_tv9);
        TextView tv10 = (TextView) findViewById(R.id.send_a_package_receipt_tv10);
        TextView tv11 = (TextView) findViewById(R.id.send_a_package_receipt_tv11);
        TextView tv12 = (TextView) findViewById(R.id.send_a_package_receipt_tv12);
        TextView tv13 = (TextView) findViewById(R.id.send_a_package_receipt_tv13);
        TextView tv14 = (TextView) findViewById(R.id.send_a_package_receipt_tv14);
        TextView tv15 = (TextView) findViewById(R.id.send_a_package_receipt_tv15);

        if (code == 0) {
            tv1.setText(address1 + ", " + country1);
            tv2.setText(phone1);
            tv3.setText("1. " + address2 + ", " + country2);
            tv4.setText(phone2);
            if (address3 != null) {
                if (!address3.isEmpty()) {
                    LinearLayout ll = (LinearLayout) findViewById(R.id.send_a_package_receipt_ll);
                    ll.setVisibility(View.VISIBLE);
                    tv5.setText("2. " + address3 + ", " + country3);
                    tv6.setText(phone3);
                }
            }
            tv7.setText(others2 + ", " + others3);
            tv8.setText(weight);
            tv9.setText(worth);
        }

        String number = generateNumber();
        tv10.setText(number);

        MaterialButton mb1 = (MaterialButton) findViewById(R.id.send_a_package_receipt_mb1);

        MaterialButton mb2 = (MaterialButton) findViewById(R.id.send_a_package_receipt_mb2);
        if (code == 1) {
            tv15.setVisibility(View.VISIBLE);
            mb1.setText("Report");
            mb2.setText("Successful");
        }
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (code == 0) {
                    finish();
                } else if (code == 1) {

                }
            }
        });
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = null;
                if (code == 0) {
                    i = new Intent(getApplicationContext(), TransactionSuccessful.class);
                    i.putExtra("number", number);
                }
                else if (code == 1) {
                    i = new Intent(getApplicationContext(), DeliverySuccessful.class);
                }
                startActivity(i);
            }
        });
    }

    public String generateNumber() {
        String number = new String("R-");
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                number += r.nextInt(9 - 1) + 1;
            }
            if (i != 3) number += "-";
        }
        return number;
    }

    public static final Pattern TRACK_NUMBER = Pattern.compile("[0-9]{4}" + "-" + "[0-9]{4}" + "-" + "[0-9]{4}" + "-" + "[0-9]{4}" + "-");
}