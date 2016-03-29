package com.example.fragmentnavi;

import android.os.Bundle;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;

public class MainActivity extends Activity {

	private FragmentManager fm;
	private FragmentTransaction ft;
	private RadioButton me;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        me = (RadioButton)findViewById(R.id.rbMe);
        me.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				fm = getFragmentManager();
				ft = fm.beginTransaction();
				Fragment1 frag1 = new Fragment1();
				ft.add(R.id.fragmentRoot, frag1,"me");
				ft.addToBackStack("me");
				ft.commit();
			}
		});
        
        
    }


    
    
}
