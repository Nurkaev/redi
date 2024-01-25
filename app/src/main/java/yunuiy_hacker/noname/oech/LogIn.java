package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class LogIn extends AppCompatActivity {
    TextInputLayout email_til;
    TextInputEditText email_tiet;
    TextInputLayout pass_til;
    TextInputEditText pass_tiet;
    MaterialButton mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_in);
        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        sp.edit().putBoolean("isFirst", false).apply();
        MaterialButton forgot_pass_mb = (MaterialButton) findViewById(R.id.log_in_forgot_pass_mb);
        forgot_pass_mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogIn.this, ForgotPassword.class);
                startActivity(i);
            }
        });
        TextView log_in_already_sign_tv = (TextView) findViewById(R.id.log_in_already_sign_tv);
        log_in_already_sign_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogIn.this, SignUp.class);
                startActivity(i);
            }
        });

        email_til = (TextInputLayout) findViewById(R.id.log_in_til1);
        email_tiet = (TextInputEditText) findViewById(R.id.log_in_tiet1);
        pass_til = (TextInputLayout) findViewById(R.id.log_in_til2);
        pass_tiet = (TextInputEditText) findViewById(R.id.log_in_tiet2);

        email_tiet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                valid();
            }
        });
        pass_tiet.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                valid();
            }
        });

        mb = (MaterialButton) findViewById(R.id.log_in_mb);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LogIn.this, Home.class);
                startActivity(i);
            }
        });
    }

    public void valid() {
        if (LogIn.EMAIL_ADDRESS.matcher(email_tiet.getText().toString()).matches()) {
            if (pass_tiet.getText().toString().length() >= 8) {
                mb.setEnabled(true);
            } else {
                mb.setEnabled(false);
            }
        } else {
            mb.setEnabled(false);
        }
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