package com.dimi.qrpasswordscanner;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.preference.PreferenceFragment;


@SuppressLint("NewApi")
public class SettingsFragment extends PreferenceFragment {

	 @Override
	 public void onCreate(Bundle savedInstanceState) {
	  // TODO Auto-generated method stub
	  super.onCreate(savedInstanceState);
	  
	  // Load the preferences from an XML resource
	        addPreferencesFromResource(R.xml.preferences);
	 }
}