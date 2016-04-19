package com.okeifarm.numberplus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_start);
		
		// ボタンを取得
        Button startButton = (Button)findViewById(R.id.start_button);
        
        // クリックリスナーを登録
        startButton.setOnClickListener( new SBClickListener() );
	}
	
	// スタートボタンのクリックリスナークラス
	private class SBClickListener implements OnClickListener{
		// クリック時イベント
		public void onClick(View v){
			//GameActivityへ遷移する
			Intent intent = new Intent(StartActivity.this,GameActivity.class);
			startActivity(intent);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.start, menu);
		return true;
	}

}
