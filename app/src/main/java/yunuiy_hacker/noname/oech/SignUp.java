package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.util.LinkifyCompat;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.regex.Pattern;

public class SignUp extends AppCompatActivity {
    CheckBox cb;
    TextInputLayout full_name_til;
    TextInputEditText full_name_tiet;
    TextInputLayout phone_til;
    TextInputEditText phone_tiet;
    TextInputLayout email_til;
    TextInputEditText email_tiet;
    TextInputLayout pass_til;
    TextInputEditText pass_tiet;
    TextInputLayout conf_pass_til;
    TextInputEditText conf_pass_tiet;
    MaterialButton mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);
        SharedPreferences sp = getSharedPreferences("user", MODE_PRIVATE);
        sp.edit().putBoolean("isFirst", false).apply();
        TextView sign_up_already_sign_tv = (TextView) findViewById(R.id.sign_up_already_sign_tv);
        sign_up_already_sign_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this, LogIn.class);
                startActivity(i);
            }
        });
        cb = (CheckBox) findViewById(R.id.sign_up_cb);
        cb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                valid();
            }
        });
        LinkifyCompat.addLinks(cb, Linkify.ALL);

        full_name_til = (TextInputLayout) findViewById(R.id.sign_up_til1);
        full_name_tiet = (TextInputEditText) findViewById(R.id.sign_up_tiet1);
        phone_til = (TextInputLayout) findViewById(R.id.sign_up_til2);
        phone_tiet = (TextInputEditText) findViewById(R.id.sign_up_tiet2);
        email_til = (TextInputLayout) findViewById(R.id.sign_up_til3);
        email_tiet = (TextInputEditText) findViewById(R.id.sign_up_tiet3);
        pass_til = (TextInputLayout) findViewById(R.id.sign_up_til4);
        pass_tiet = (TextInputEditText) findViewById(R.id.sign_up_tiet4);
        conf_pass_til = (TextInputLayout) findViewById(R.id.sign_up_til5);
        conf_pass_tiet = (TextInputEditText) findViewById(R.id.sign_up_tiet5);

        full_name_tiet.addTextChangedListener(new TextWatcher() {
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
        phone_tiet.addTextChangedListener(new TextWatcher() {
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
        conf_pass_tiet.addTextChangedListener(new TextWatcher() {
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

        mb = (MaterialButton) findViewById(R.id.sign_up_mb);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SignUp.this, LogIn.class);
                startActivity(i);
            }
        });
    }

    public void valid() {
        if (full_name_tiet.getText().toString().length() > 3) {
            if (Patterns.PHONE.matcher(phone_tiet.getText().toString()).matches()) {
                if (SignUp.EMAIL_ADDRESS.matcher(email_tiet.getText().toString()).matches()) {
                    if (pass_tiet.getText().toString().length() >= 8) {
                        if (conf_pass_tiet.getText().toString().length() >= 8) {
                            if (conf_pass_tiet.getText().toString().equals(pass_tiet.getText().toString())) {
                                conf_pass_til.setError(null);
                                conf_pass_til.setErrorEnabled(false);
                                pass_til.setError(null);
                                pass_til.setErrorEnabled(false);
                                if (cb.isChecked()) {
                                    mb.setEnabled(true);
                                } else {
                                    mb.setEnabled(false);
                                }
                            } else {
                                conf_pass_til.setError("Пароли не совпадают");
                                conf_pass_til.setErrorEnabled(true);
                                pass_til.setError("Пароли не совпадают");
                                pass_til.setErrorEnabled(true);
                            }
                        } else {
                            mb.setEnabled(false);
                        }
                    } else {
                        mb.setEnabled(false);
                    }
                } else {
                    mb.setEnabled(false);
                }
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
