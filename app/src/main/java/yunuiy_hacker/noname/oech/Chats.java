package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;

public class Chats extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chats);
        MaterialToolbar mt = (MaterialToolbar) findViewById(R.id.chats_mt);
        mt.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void john(View view) {
        Intent i = new Intent(getApplicationContext(), ChatRider.class);
        i.putExtra("name", "John Joshua");
        i.putExtra("id", 0);
        startActivity(i);
    }

    public void chinoso(View view) {
        Intent i = new Intent(getApplicationContext(), ChatRider.class);
        i.putExtra("name", "Chinonso James");
        i.putExtra("id", 1);
        startActivity(i);
    }

    public void raph(View view) {
        Intent i = new Intent(getApplicationContext(), ChatRider.class);
        i.putExtra("name", "Raph Ron");
        i.putExtra("id", 2);
        startActivity(i);
    }

    public void joy(View view) {
        Intent i = new Intent(getApplicationContext(), ChatRider.class);
        i.putExtra("name", "Joy Ezekiel");
        i.putExtra("id", 3);
        startActivity(i);
    }

    public void joy2(View view) {
        Intent i = new Intent(getApplicationContext(), ChatRider.class);
        i.putExtra("name", "Joy Ezekiel");
        i.putExtra("id", 4);
        startActivity(i);
    }
}
