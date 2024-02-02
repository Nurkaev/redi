package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Wallet extends AppCompatActivity {
    TextView balance_tv;
    String balance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wallet);
        balance_tv = (TextView) findViewById(R.id.wallet_balance_tv);
        balance = balance_tv.getText().toString();
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.wallet_bnv);
        bnv.setSelectedItemId(R.id.main_menu_item2);
        bnv.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent i = null;
                switch (item.getItemId()) {
                    case R.id.main_menu_item1:
                        i = new Intent(getApplicationContext(), Home.class);
                        break;
                    case R.id.main_menu_item2:
                        i = new Intent(getApplicationContext(), Wallet.class);
                        break;
                    case R.id.main_menu_item3:
                        i = new Intent(getApplicationContext(), Track.class);
                        break;
                    case R.id.main_menu_item4:
                        i = new Intent(getApplicationContext(), Profile.class);
                        break;
                }
                startActivity(i);
                overridePendingTransition(0, 0);
                return false;
            }
        });
    }

    public void setBalanceVisibility(View view) {
        if (balance_tv.getText().toString().contains("*")) {
            balance_tv.setText(balance);
        } else {
            balance_tv.setText(balance.replaceAll(".", "*"));
        }
    }
}
