package com.okeifarm.numberplus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends Activity {

	//textViewの宣言
	TextView ScoreText;
	TextView BestScoreText;

	//ボタンの宣言
	Button Retry;
	Button GameEnd;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game_over);

		//スコア系の変数宣言
		int Score = 0;
		int BestScore = 0;

		//テキストビューの取得
		this.ScoreText = (TextView) findViewById(R.id.score);
		this.BestScoreText = (TextView) findViewById(R.id.bestScore);

		//ボタンの取得
		this.Retry = (Button)findViewById(R.id.retry);
		this.GameEnd = (Button)findViewById(R.id.end);

		Score = getIntent().getIntExtra("score", 0);

		//最高記録の保存
		/*
		 * sharedprefferenceで保存
		 */

		//記録の表示
		ScoreText.setText(String.valueOf(Score));

		//クリックリスナーの登録
		Retry.setOnClickListener(new EndClickListener());
		GameEnd.setOnClickListener(new EndClickListener());
	}

	private class EndClickListener implements OnClickListener{
		// クリック時イベント
		public void onClick(View v){
			switch(v.getId()){
			case R.id.retry:
				Intent GameStart = new Intent(GameOverActivity.this,GameActivity.class);
				startActivity(GameStart);				
				break;
			case R.id.end:
				finish();
				break;
			}
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game_over, menu);
		return true;
	}

}
