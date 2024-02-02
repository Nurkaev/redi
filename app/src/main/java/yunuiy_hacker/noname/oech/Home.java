package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.helper.widget.Carousel;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.carousel.CarouselLayoutManager;
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
//        MaterialButton mb1 = (MaterialButton) findViewById(R.id.home_mb1);
//        mb1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), SendAPackage.class);
//                startActivity(i);
//            }
//        });
    }

    public void customer(View view) {
        CardView cv = (CardView) view;
        ImageView iv = (ImageView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(0);
        TextView tv = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(1);
        TextView tv2 = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(2);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
                    tv.setTextColor(Color.parseColor("#FFFFFF"));
                    tv2.setTextColor(Color.parseColor("#FFFFFF"));
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F2F2F2")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    tv.setTextColor(Color.parseColor("#0560FA"));
                    tv2.setTextColor(Color.parseColor("#3A3A3A"));
                }
                return false;
            }
        });
    }

    public void sendAPackage(View view) {
        CardView cv = (CardView) view;
        ImageView iv = (ImageView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(0);
        TextView tv = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(1);
        TextView tv2 = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(2);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
                    tv.setTextColor(Color.parseColor("#FFFFFF"));
                    tv2.setTextColor(Color.parseColor("#FFFFFF"));
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F2F2F2")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    tv.setTextColor(Color.parseColor("#0560FA"));
                    tv2.setTextColor(Color.parseColor("#3A3A3A"));
                }
                return false;
            }
        });
        Intent i = new Intent(getApplicationContext(), SendAPackage.class);
        startActivity(i);
    }

    public void fund(View view) {
        CardView cv = (CardView) view;
        ImageView iv = (ImageView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(0);
        TextView tv = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(1);
        TextView tv2 = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(2);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
                    tv.setTextColor(Color.parseColor("#FFFFFF"));
                    tv2.setTextColor(Color.parseColor("#FFFFFF"));
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F2F2F2")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    tv.setTextColor(Color.parseColor("#0560FA"));
                    tv2.setTextColor(Color.parseColor("#3A3A3A"));
                }
                return false;
            }
        });
        Intent i = new Intent(getApplicationContext(), AddPaymentMethod.class);
        startActivity(i);
    }

    public void chats(View view) {
        CardView cv = (CardView) view;
        ImageView iv = (ImageView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(0);
        TextView tv = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(1);
        TextView tv2 = (TextView) ((ViewGroup)((ViewGroup) cv).getChildAt(0)).getChildAt(2);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#FFFFFF")));
                    tv.setTextColor(Color.parseColor("#FFFFFF"));
                    tv2.setTextColor(Color.parseColor("#FFFFFF"));
                }
                else if (event.getAction() == MotionEvent.ACTION_UP) {
                    cv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#F2F2F2")));
                    iv.setImageTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
                    tv.setTextColor(Color.parseColor("#0560FA"));
                    tv2.setTextColor(Color.parseColor("#3A3A3A"));
                }
                return false;
            }
        });
        Intent i = new Intent(getApplicationContext(), Chats.class);
        startActivity(i);
    }
}