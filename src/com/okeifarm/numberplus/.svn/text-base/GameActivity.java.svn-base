package com.okeifarm.numberplus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class GameActivity extends Activity {

	TextView mQnum;
	TextView mAns;
	Button mButton1_1;
	Button mButton1_2;
	Button mButton1_3;
	Button mButton2_1;
	Button mButton2_2;
	Button mButton2_3;
	Button mButton3_1;
	Button mButton3_2;
	Button mButton3_3;
	Button mAnsButton;

	Boolean mButtonState1_1;
	Boolean mButtonState1_2;
	Boolean mButtonState1_3;
	Boolean mButtonState2_1;
	Boolean mButtonState2_2;
	Boolean mButtonState2_3;
	Boolean mButtonState3_1;
	Boolean mButtonState3_2;
	Boolean mButtonState3_3;

	int mAnser;
	int mSeikai;
	
	int mScore;
	
	private AnswerTimerTask ans;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);

		//テキストビューの取得
		this.mQnum = (TextView) findViewById(R.id.qnum);
		this.mAns = (TextView) findViewById(R.id.anser);

		//ボタンの取得
		this.mButton1_1 = (Button)findViewById(R.id.button1_1);
		this.mButton1_2 = (Button)findViewById(R.id.button1_2);
		this.mButton1_3 = (Button)findViewById(R.id.button1_3);
		this.mButton2_1 = (Button)findViewById(R.id.button2_1);
		this.mButton2_2 = (Button)findViewById(R.id.button2_2);
		this.mButton2_3 = (Button)findViewById(R.id.button2_3);
		this.mButton3_1 = (Button)findViewById(R.id.button3_1);
		this.mButton3_2 = (Button)findViewById(R.id.button3_2);
		this.mButton3_3 = (Button)findViewById(R.id.button3_3);
		this.mAnsButton = (Button)findViewById(R.id.anser_button);

		//clicklistenerの設定
		mButton1_1.setOnClickListener(new BClickListener());
		mButton1_2.setOnClickListener(new BClickListener());
		mButton1_3.setOnClickListener(new BClickListener());
		mButton2_1.setOnClickListener(new BClickListener());
		mButton2_2.setOnClickListener(new BClickListener());
		mButton2_3.setOnClickListener(new BClickListener());
		mButton3_1.setOnClickListener(new BClickListener());
		mButton3_2.setOnClickListener(new BClickListener());
		mButton3_3.setOnClickListener(new BClickListener());
		mAnsButton.setOnClickListener(new BClickListener());

		//解答と正解の初期化
		mSeikai = 0;
		mAnser = 0;
		
		mScore = 0;

		//ボタンの押下状態の初期化
		mButtonState1_1 = false;
		mButtonState1_2 = false;
		mButtonState1_3 = false;
		mButtonState2_1 = false;
		mButtonState2_2 = false;
		mButtonState2_3 = false;
		mButtonState3_1 = false;
		mButtonState3_2 = false;
		mButtonState3_3 = false;

		//Gameの初期化
		setGame();
		mAns.setText("10");
		
		ans = new AnswerTimerTask();
		ans.execute(10);
	}

	// クリックリスナークラス
	private class BClickListener implements OnClickListener{
		// クリック時イベント
		public void onClick(View v){
			switch(v.getId()){
			case R.id.button1_1:
				if(mButtonState1_1){
					mButtonState1_1 = false;
					mButton1_1.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState1_1 = true;
					mButton1_1.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button1_2:
				if(mButtonState1_2){
					mButtonState1_2 = false;
					mButton1_2.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState1_2 = true;
					mButton1_2.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button1_3:
				if(mButtonState1_3){
					mButtonState1_3 = false;
					mButton1_3.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState1_3 = true;
					mButton1_3.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button2_1:
				if(mButtonState2_1){
					mButtonState2_1 = false;
					mButton2_1.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState2_1 = true;
					mButton2_1.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button2_2:
				if(mButtonState2_2){
					mButtonState2_2 = false;
					mButton2_2.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState2_2 = true;
					mButton2_2.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button2_3:
				if(mButtonState2_3){
					mButtonState2_3 = false;
					mButton2_3.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState2_3 = true;
					mButton2_3.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button3_1:
				if(mButtonState3_1){
					mButtonState3_1 = false;
					mButton3_1.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState3_1 = true;
					mButton3_1.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button3_2:
				if(mButtonState3_2){
					mButtonState3_2 = false;
					mButton3_2.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState3_2 = true;
					mButton3_2.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.button3_3:
				if(mButtonState3_3){
					mButtonState3_3 = false;
					mButton3_3.setBackgroundColor(Color.rgb(221, 221, 221));
				}else{
					mButtonState3_3 = true;
					mButton3_3.setBackgroundColor(Color.rgb(255, 0, 0));
				}
				break;
			case R.id.anser_button:
				if(mButtonState1_1){
					mAnser = mAnser + Integer.parseInt((String) mButton1_1.getText());
				}
				if(mButtonState1_2){
					mAnser = mAnser + Integer.parseInt((String) mButton1_2.getText());
				}
				if(mButtonState1_3){
					mAnser = mAnser + Integer.parseInt((String) mButton1_3.getText());
				}
				if(mButtonState2_1){
					mAnser = mAnser + Integer.parseInt((String) mButton2_1.getText());
				}
				if(mButtonState2_2){
					mAnser = mAnser + Integer.parseInt((String) mButton2_2.getText());
				}
				if(mButtonState2_3){
					mAnser = mAnser + Integer.parseInt((String) mButton2_3.getText());
				}
				if(mButtonState3_1){
					mAnser = mAnser + Integer.parseInt((String) mButton3_1.getText());
				}
				if(mButtonState3_2){
					mAnser = mAnser + Integer.parseInt((String) mButton3_2.getText());
				}
				if(mButtonState3_3){
					mAnser = mAnser + Integer.parseInt((String) mButton3_3.getText());
				}

				//mQnum.setText(String.valueOf(mAnser));

				if(mAnser == mSeikai){
					//mAns.setText("*** 正解 ***");
					Toast.makeText(getBaseContext(), "*** 正解 ***", Toast.LENGTH_SHORT).show();
					mScore = mScore + 1;
					setGame();	
				}else{
					//mAns.setText("不正解！　残念！！");
					Toast.makeText(getBaseContext(), "不正解！　残念！！", Toast.LENGTH_SHORT).show();
				}

				mAnser = 0;

				break;
			}
		}
	}

	void setGame(){
		//お題の数字をランダムに表示
		//Randomクラスのインスタンス化
		Random rnd = new Random();
		mSeikai = rnd.nextInt(44) + 1;
		mQnum.setText(String.valueOf(mSeikai));

		//mQnum.setText("10");

		//ボタンの色を初期化
		mButtonState1_1 = false;
		mButton1_1.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState1_2 = false;
		mButton1_2.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState1_3 = false;
		mButton1_3.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState2_1 = false;
		mButton2_1.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState2_2 = false;
		mButton2_2.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState2_3 = false;
		mButton2_3.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState3_1 = false;
		mButton3_1.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState3_2 = false;
		mButton3_2.setBackgroundColor(Color.rgb(221, 221, 221));
		mButtonState3_3 = false;
		mButton3_3.setBackgroundColor(Color.rgb(221, 221, 221));

		//ボタンの数字をランダムに表示
		// 1 ～ 10 の数値が入ったリストを作成
		ArrayList list = new ArrayList();
		for ( int i = 0; i < 9; i++ ) {
			list.add(i+1);
		}
		// リストの内容をシャッフル
		Collections.shuffle(list);

		mButton1_1.setText(String.valueOf(list.get(0)));
		mButton1_2.setText(String.valueOf(list.get(1)));
		mButton1_3.setText(String.valueOf(list.get(2)));
		mButton2_1.setText(String.valueOf(list.get(3)));
		mButton2_2.setText(String.valueOf(list.get(4)));
		mButton2_3.setText(String.valueOf(list.get(5)));
		mButton3_1.setText(String.valueOf(list.get(6)));
		mButton3_2.setText(String.valueOf(list.get(7)));
		mButton3_3.setText(String.valueOf(list.get(8)));

		//タイマーを起動
	}

	/**
	 * バックキーを押した時にアプリを終了するようにした
	 */
	public void onPause() {
		super.onPause();
		finish();
	}

	// ゲーム時間をカウントするクラス
	//終了したら、OverActivityへ遷移させる
	private class AnswerTimerTask extends AsyncTask<Integer, Void, Void> {
		/**
		 * バックグランドで行う処理
		 */
		
		int limitTime;
		
		@Override
		public Void doInBackground(Integer... sec) {
			int s = sec[0].intValue();
			limitTime = sec[0].intValue();
			
			try {
				for (int i = s; i > 0; i--) {
					Thread.sleep(1000); // 1秒スリープ
					publishProgress();
				}
			} catch (Exception e) {

			}
			return null;
		}

		/**
		 * 進捗状況を表示する
		 */
		@Override
		public void onProgressUpdate(Void... progress) {
			//制限時間を１減らして描画する
			limitTime = limitTime - 1;
			mAns.setText(String.valueOf(limitTime));
		}

		/**
		 * バックグランド処理が完了し、UIスレッドに反映する
		 */
		@Override
		public void onPostExecute(Void result) {
			Toast.makeText(getBaseContext(), "終了", Toast.LENGTH_SHORT).show();
			Intent gameOver = new Intent(GameActivity.this,GameOverActivity.class);
			gameOver.putExtra("score", mScore);
			startActivity(gameOver);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
