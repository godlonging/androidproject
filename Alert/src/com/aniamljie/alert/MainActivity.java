package com.aniamljie.alert;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button button=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button=(Button)findViewById(R.id.button);
		button.setOnClickListener(new buttonlistener());
	}

	private class buttonlistener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			new AlertDialog.Builder(MainActivity.this).setTitle("结束程序").setMessage("确定结束程序？").setIcon(R.drawable.ic_launcher)
					.setPositiveButton("确定", 
					new DialogInterface.OnClickListener()
					{public void onClick(DialogInterface dialog,int id){
						MainActivity.this.finish();
					   }
					})
					.setNegativeButton("取消", new DialogInterface.OnClickListener(){
						public void onClick(DialogInterface dialog, int id) {
							// TODO Auto-generated method stub
							dialog.cancel();
						}
					}).setCancelable(false).show();
			
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
