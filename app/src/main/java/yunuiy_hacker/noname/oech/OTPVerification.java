package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.Timer;

public class OTPVerification extends AppCompatActivity {
    boolean is1;
    boolean is2;
    boolean is3;
    boolean is4;
    boolean is5;
    boolean is6;
    MaterialButton mb;
    TextView resend_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.otp_verification);
        mb = (MaterialButton) findViewById(R.id.otp_verification_mb);
        TextView sign_in_tv = (TextView) findViewById(R.id.otp_verification_sign_in_tv);
        sign_in_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTPVerification.this, LogIn.class);
                startActivity(i);
            }
        });
        EditText ed1 = (EditText) findViewById(R.id.otp_verification_ed1);
        EditText ed2 = (EditText) findViewById(R.id.otp_verification_ed2);
        EditText ed3 = (EditText) findViewById(R.id.otp_verification_ed3);
        EditText ed4 = (EditText) findViewById(R.id.otp_verification_ed4);
        EditText ed5 = (EditText) findViewById(R.id.otp_verification_ed5);
        EditText ed6 = (EditText) findViewById(R.id.otp_verification_ed6);
        ed1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed1.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    ed2.requestFocus();
                    is1 = true;
                    isFilled();
                } else {
                    ed1.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    is1 = false;
                }
            }
        });
        ed2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed2.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    ed3.requestFocus();
                    is2 = true;
                    isFilled();
                } else {
                    ed2.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    ed1.requestFocus();
                    is2 = false;
                }
            }
        });
        ed3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed3.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    ed4.requestFocus();
                    is3 = true;
                    isFilled();
                } else {
                    ed3.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    ed2.requestFocus();
                    is3 = false;
                }
            }
        });
        ed4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed4.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    ed5.requestFocus();
                    is4 = true;
                    isFilled();
                } else {
                    ed4.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    ed3.requestFocus();
                    is4 = false;
                }
            }
        });
        ed5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed5.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    ed6.requestFocus();
                    is5 = true;
                    isFilled();
                } else {
                    ed5.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    ed4.requestFocus();
                    is5 = false;
                }
            }
        });
        ed6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.toString().length() > 0) {
                    ed6.setBackground(getDrawable(R.drawable.otp_ed_backgr2));
                    is6 = true;
                    isFilled();
                } else {
                    ed6.setBackground(getDrawable(R.drawable.otp_ed_backgr));
                    ed5.requestFocus();
                    is6 = false;
                }
            }
        });
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(OTPVerification.this, NewPassword.class);
                startActivity(i);
            }
        });
        resend_tv = (TextView) findViewById(R.id.resend_afte);
        resend_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callTimer();
                resend_tv.setText(" resend after 0:" + 59);
                resend_tv.setTextColor(Color.parseColor("#A7A7A7"));
            }
        });

        callTimer();
    }

    public void isFilled() {
        if (is1 && is2 && is3 && is4 && is5 && is6) {
            mb.setEnabled(true);
        } else {
            mb.setEnabled(false);
        }
    }

    public void callTimer() {
        final int[] time = {59};
        Timer timer = new Timer();
        class TimerTask extends java.util.TimerTask {
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        if (time[0] > 0) {
                            resend_tv.setText(" resend after 0:" + time[0]);
                            time[0]--;
                        }
                        else {
                            resend_tv.setText(" resend");
                            resend_tv.setTextColor(Color.parseColor("#006CEC"));
                            timer.cancel();
                            cancel();
                        }
                    }
                });
            }
        }
        TimerTask task = new TimerTask();
        timer.scheduleAtFixedRate(task, 1000, 1000);
    }
}