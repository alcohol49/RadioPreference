package com.mccc.radiopreference;

import android.content.Context;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;

public class RadioPreference extends Preference {

    public RadioPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(R.layout.radio_preference);
    }

    @Override
    protected void onBindView(View view) {

        switch (PreferenceManager.getDefaultSharedPreferences(getContext()).getInt("style", 0)) {
            case 0:
                RadioButton mWithNumberButton = view.findViewById(R.id.hello);
                if (mWithNumberButton != null) mWithNumberButton.setChecked(true);
                break;
            case 1:
                RadioButton mWithoutNumberButton = view.findViewById(R.id.world);
                if (mWithoutNumberButton != null) mWithoutNumberButton.setChecked(true);
                break;
        }

        super.onBindView(view);
    }

}
