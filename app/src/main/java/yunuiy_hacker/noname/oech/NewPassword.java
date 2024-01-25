package yunuiy_hacker.noname.oech;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class NewPassword extends AppCompatActivity {
    MaterialButton mb;
    TextInputLayout pass_til;
    TextInputEditText pass_tiet;
    TextInputLayout conf_pass_til;
    TextInputEditText conf_pass_tiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_password);
        mb = (MaterialButton) findViewById(R.id.new_password_mb);
        mb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NewPassword.this, Home.class);
                startActivity(i);
            }
        });

        pass_til = (TextInputLayout) findViewById(R.id.new_password_til1);
        pass_tiet = (TextInputEditText) findViewById(R.id.new_password_tiet1);
        conf_pass_til = (TextInputLayout) findViewById(R.id.new_password_til2);
        conf_pass_tiet = (TextInputEditText) findViewById(R.id.new_password_tiet2);

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
    }

    public void valid() {
        if (pass_tiet.getText().toString().length() >= 8) {
            if (conf_pass_tiet.getText().toString().length() >= 8) {
                if (pass_tiet.getText().toString().equals(conf_pass_tiet.getText().toString())) {
                    conf_pass_til.setError(null);
                    conf_pass_til.setErrorEnabled(false);
                    pass_til.setError(null);
                    pass_til.setErrorEnabled(false);
                    mb.setEnabled(true);
                } else {
                    mb.setEnabled(false);
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
    }


}
