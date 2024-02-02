package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;

public class ChatRider extends AppCompatActivity {
    String name;
    int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_rider);
        MaterialToolbar mt = (MaterialToolbar) findViewById(R.id.chat_rider_mt);
        mt.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        name = getIntent().getStringExtra("name");
        id = getIntent().getIntExtra("id", 0);
        ShapeableImageView siv = (ShapeableImageView) findViewById(R.id.chat_rider_siv);
        TextView tv = (TextView) findViewById(R.id.chat_rider_tv);
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

    public void call(View view) {
        Intent i = new Intent(getApplicationContext(), CallRider.class);
        i.putExtra("name", name);
        i.putExtra("id", id);
        startActivity(i);
    }

    public void sendMessage(View view) {
        LinearLayout ll = (LinearLayout) findViewById(R.id.chat_rider_ll_messages);
        EditText ed = (EditText) findViewById(R.id.chat_rider_ed);
        String message = ed.getText().toString();
        if (message.isEmpty()) return;
        TextView tv = new TextView(getApplicationContext());
        LinearLayout.LayoutParams tv_params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        tv_params.topMargin = (int) pxToDp(12);
        tv_params.leftMargin = (int) pxToDp(24);
        tv_params.rightMargin = (int) pxToDp(24);
        tv.setPadding((int) pxToDp(10), (int) pxToDp(10), (int) pxToDp(10), (int) pxToDp(10));
        tv_params.gravity = Gravity.RIGHT;
        tv.setBackgroundResource(R.drawable.message_bacckground);
        tv.setBackgroundTintList(ColorStateList.valueOf(Color.parseColor("#0560FA")));
        tv.setTextColor(Color.parseColor("#FFFFFF"));
        tv.setLayoutParams(tv_params);
        tv.setText(message);
        ll.addView(tv);
        ed.setText("");
    }

    public float pxToDp(float dip) {
        Resources r = getResources();
        return TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP,
                dip,
                r.getDisplayMetrics()
        );
    }
}
