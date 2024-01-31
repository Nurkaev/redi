package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forgot_password);
        MaterialButton send_otp_mb = (MaterialButton) findViewById(R.id.forgot_password_mb1);
        TextInputLayout til1 = (TextInputLayout) findViewById(R.id.forgot_password_til1);
        TextInputEditText tiet1 = (TextInputEditText) findViewById(R.id.forgot_password_tiet1);
        tiet1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (ForgotPassword.EMAIL_ADDRESS.matcher(s.toString().trim()).matches()) {
                    send_otp_mb.setEnabled(true);
                } else {
                    send_otp_mb.setEnabled(false);
                }
            }
        });
        send_otp_mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgotPassword.this, OTPVerification.class);
                startActivity(i);
            }
        });
        TextView forgot_password_sign_in_tv = (TextView) findViewById(R.id.forgot_password_sign_in_tv);
        forgot_password_sign_in_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ForgotPassword.this, LogIn.class);
                startActivity(i);
            }
        });
    }

    public static final Pattern EMAIL_ADDRESS
            = Pattern.compile(
            "[a-z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-z0-9][a-z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-z0-9][a-z0-9\\-]{0,25}" +
                    ")+"
    );
}