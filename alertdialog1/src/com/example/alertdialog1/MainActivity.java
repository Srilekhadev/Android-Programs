package com.example.alertdialog1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	private Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
        b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new myclicklistener() );

	}
	
	class myclicklistener implements OnClickListener
	{
		public void onClick(View arg0)
		{
			// TODO Auto-generated method stub
			
		//Toast.makeText(Alertdialog1Activity.this, "ok", //Toast.LENGTH_SHORT).show();
			
			AlertDialog.Builder adb=new AlertDialog.Builder(MainActivity.this);
			adb.setTitle("Apex");
			adb.setMessage("Click yes to exit");
			adb.setCancelable(false);
			adb.setPositiveButton("Yes",new mydialoglisteneryes());
			adb.setNegativeButton("No", new mydialoglistenerno());
			
			AlertDialog obj=adb.create();
			obj.show();
				
		}
	}

	 class mydialoglisteneryes implements DialogInterface.OnClickListener
	 {
		 public void onClick(DialogInterface dialog,int id)
		 {
			 MainActivity.this.finish();
		 }
	}
	 class mydialoglistenerno implements DialogInterface.OnClickListener
	 {
		 public void onClick(DialogInterface dialog,int id)
		 {
			 dialog.cancel();
		 }
	}


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
