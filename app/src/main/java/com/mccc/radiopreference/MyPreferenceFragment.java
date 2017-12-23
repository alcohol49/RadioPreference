package com.mccc.radiopreference;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;
import android.preference.SwitchPreference;

public class MyPreferenceFragment extends PreferenceFragment {

    SwitchPreference mEnable;
    Preference mStyle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.my_preference);

        mEnable = (SwitchPreference) findPreference("enable");
        mStyle = findPreference("style");

        mStyle.setEnabled(mEnable.isChecked());
    }

    @Override
    public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
        if (preference.equals(mEnable)) {
            mStyle.setEnabled(mEnable.isChecked());
        }
        return super.onPreferenceTreeClick(preferenceScreen, preference);
    }
}
