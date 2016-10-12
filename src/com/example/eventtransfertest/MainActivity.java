package com.example.eventtransfertest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
        MyButton myButton=(MyButton)findViewById(R.id.MyBtn);
        myButton.setOnTouchListener(new OnTouchListener() {			
			public boolean onTouch(View v, MotionEvent event) {
				System.out.println("�������еĴ����¼������ˣ�");
				return false;
			}
		});
    }
    public boolean onTouchEvent(MotionEvent event) {
    	System.out.println("MainActivity�еĴ����¼������ˣ�");
    	return false;
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
