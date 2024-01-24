package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class OnBoarding extends AppCompatActivity {

    //Класс-контейнер для фрагментов
    //25.01.2024
    //Нуркаев.А.Х

    static ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding);
        vp = (ViewPager) findViewById(R.id.onboarding_vp);
        vp.setAdapter(new Adapter(getSupportFragmentManager()));
    }

    class Adapter extends FragmentPagerAdapter {

        public Adapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return new OnBoardingFragment(position);
        }


        @Override
        public int getCount() {
            return 3;
        }
    }

    public static void setPage(int position) {
        vp.setCurrentItem(position);
    }
}
