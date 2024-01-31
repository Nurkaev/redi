package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;

public class SendAPackage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.send_a_package);
        MaterialToolbar mt = (MaterialToolbar) findViewById(R.id.send_a_package_mt);
        mt.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        MaterialButton mb1 = (MaterialButton) findViewById(R.id.send_a_package_mb1);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText ed1 = (EditText) findViewById(R.id.send_a_package_ed1);
                EditText ed2 = (EditText) findViewById(R.id.send_a_package_ed2);
                EditText ed3 = (EditText) findViewById(R.id.send_a_package_ed3);
                EditText ed4 = (EditText) findViewById(R.id.send_a_package_ed4);
                EditText ed5 = (EditText) findViewById(R.id.send_a_package_ed5);
                EditText ed6 = (EditText) findViewById(R.id.send_a_package_ed6);
                EditText ed7 = (EditText) findViewById(R.id.send_a_package_ed7);
                EditText ed8 = (EditText) findViewById(R.id.send_a_package_ed8);
                EditText ed9 = (EditText) findViewById(R.id.send_a_package_ed9);
                EditText ed10 = (EditText) findViewById(R.id.send_a_package_ed10);
                EditText ed11 = (EditText) findViewById(R.id.send_a_package_ed11);
                EditText ed12 = (EditText) findViewById(R.id.send_a_package_ed12);
                EditText ed13 = (EditText) findViewById(R.id.send_a_package_ed13);
                EditText ed14 = (EditText) findViewById(R.id.send_a_package_ed14);
                EditText ed15 = (EditText) findViewById(R.id.send_a_package_ed15);
                String address1 = ed1.getText().toString();
                String country1 = ed2.getText().toString();
                String phone1 = ed3.getText().toString();
                String others1 = ed4.getText().toString();
                String address2 = ed5.getText().toString();
                String country2 = ed6.getText().toString();
                String phone2 = ed7.getText().toString();
                String others2 = ed8.getText().toString();
                String address3 = ed9.getText().toString();
                String country3 = ed10.getText().toString();
                String phone3 = ed11.getText().toString();
                String others3 = ed12.getText().toString();
                String pack = ed13.getText().toString();
                String weight = ed14.getText().toString();
                String worth = ed15.getText().toString();

                if (ed12.getVisibility() == View.VISIBLE) {
                    address3 = ed9.getText().toString();
                }
                if (ed13.getVisibility() == View.VISIBLE) {
                    country3 = ed10.getText().toString();
                }
                if (ed14.getVisibility() == View.VISIBLE) {
                    phone3 = ed11.getText().toString();
                }
                if (ed15.getVisibility() == View.VISIBLE) {
                    others3 = ed12.getText().toString();
                }
                Intent i = new Intent(getApplicationContext(), SendAPackageReceipt.class);
                i.putExtra("address1", address1);
                i.putExtra("country1", country1);
                i.putExtra("phone1", phone1);
                i.putExtra("others1", others1);
                i.putExtra("address2", address2);
                i.putExtra("country2", country2);
                i.putExtra("phone2", phone2);
                i.putExtra("others2", others2);
                i.putExtra("address3", address3);
                i.putExtra("country3", country3);
                i.putExtra("phone3", phone3);
                i.putExtra("others3", others3);
                i.putExtra("pack", pack);
                i.putExtra("weight", weight);
                i.putExtra("worth", worth);
                startActivity(i);
            }
        });
        LinearLayout add_dest_ll = (LinearLayout) findViewById(R.id.send_a_package_add_dest_ll);
        add_dest_ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayout dest_ll = (LinearLayout) findViewById(R.id.send_a_package_dest_ll2);
                dest_ll.setVisibility(View.VISIBLE);
            }
        });
    }
}