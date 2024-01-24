package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;

public class OnBoardingFragment extends Fragment {

    //Класс-фрагмент для OnBoarding
    //25.01.2024
    //Нуркаев.А.Х

    ImageView iv;
    TextView tv1;
    TextView tv2;
    MaterialButton btn_pre;
    MaterialButton btn_post;
    MaterialButton btn_sign_up;
    LinearLayout sign_in_ll;
    TextView btn_sign_in;
    int page;

    public OnBoardingFragment(int page) {
        this.page = page;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.onboarding_fragment, container, false);
        switch (page) {
            case 0:
                iv = (ImageView) view.findViewById(R.id.onboarding_fragment_iv);
                iv.setImageResource(R.drawable.onboarding_img_1);
                tv1 = (TextView) view.findViewById(R.id.onboarding_fragment_tv1);
                tv1.setText("Quick Delivery At Your Doorstep");
                tv2 = (TextView) view.findViewById(R.id.onboarding_fragment_tv2);
                tv2.setText("Enjoy quick pick-up and delivery to your destination");
                btn_pre = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn1);
                btn_post = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn2);
                btn_post.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        OnBoarding.setPage(1);
                    }
                });
                break;
            case 1:
                iv = (ImageView) view.findViewById(R.id.onboarding_fragment_iv);
                iv.setImageResource(R.drawable.onboarding_img_2);
                tv1 = (TextView) view.findViewById(R.id.onboarding_fragment_tv1);
                tv1.setText("Flexible Payment");
                tv2 = (TextView) view.findViewById(R.id.onboarding_fragment_tv2);
                tv2.setText("Different modes of payment either before and after delivery without stress");
                btn_pre = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn1);
                btn_post = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn2);
                btn_post.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        OnBoarding.setPage(2);
                    }
                });
                break;
            case 2:
                iv = (ImageView) view.findViewById(R.id.onboarding_fragment_iv);
                iv.setImageResource(R.drawable.onboarding_img_3);
                tv1 = (TextView) view.findViewById(R.id.onboarding_fragment_tv1);
                tv1.setText("Real-time Tracking");
                tv2 = (TextView) view.findViewById(R.id.onboarding_fragment_tv2);
                tv2.setText("Track your packages/items from the comfort of your home till final destination");
                btn_pre = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn1);
                btn_pre.setVisibility(View.GONE);
                btn_post = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn2);
                btn_post.setVisibility(View.GONE);
                sign_in_ll = (LinearLayout) view.findViewById(R.id.onboarding_fragment_sign_in_ll);
                sign_in_ll.setVisibility(View.VISIBLE);
                btn_sign_up = (MaterialButton) view.findViewById(R.id.onboarding_fragment_btn3);
                btn_sign_up.setVisibility(View.VISIBLE);
                btn_sign_up.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), Holder.class);
                        startActivity(i);
                    }
                });
                btn_sign_in = (TextView) view.findViewById(R.id.onboarding_fragment_sign_in_tv);
                btn_sign_in.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i = new Intent(getContext(), Holder.class);
                        startActivity(i);
                    }
                });
                break;
        }
        btn_pre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Holder.class);
                startActivity(i);
            }
        });
        return view;
    }
}
