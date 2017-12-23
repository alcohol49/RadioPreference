package com.mccc.radiopreference;

import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.hello:
                if (checked) {
                    setStyle(0);
                }
                break;
            case R.id.world:
                if (checked) {
                    setStyle(1);
                }
                break;
        }
    }

    private void setStyle(int value) {
        PreferenceManager.getDefaultSharedPreferences(this).edit().putInt("style", value).apply();
    }

}
