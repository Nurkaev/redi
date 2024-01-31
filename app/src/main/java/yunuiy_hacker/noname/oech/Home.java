package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.navigation.NavigationBarView;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        BottomNavigationView bnv = (BottomNavigationView) findViewById(R.id.home_bnv);
        bnv.setSelectedItemId(R.id.main_menu_item1);
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
        MaterialButton mb1 = (MaterialButton) findViewById(R.id.home_mb1);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SendAPackage.class);
                startActivity(i);
            }
        });
    }
}