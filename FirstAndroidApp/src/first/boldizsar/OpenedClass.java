package first.boldizsar;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;


public class OpenedClass extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	TextView question, test;
	Button returnData;
	RadioGroup selectionList;
	String gotBread, setData;

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		inittialize();
		
		SharedPreferences getData = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		String et = getData.getString("name", "no value");
		String values = getData.getString("list", "4");
		
		if (values.contentEquals("1")) {
			question.setText(et);
		}
		
		//Bundle gotBasket = getIntent().getExtras();
		//gotBread = gotBasket.getString("key1");
		//question.setText(gotBread);
	}

	private void inittialize() {
		// TODO Auto-generated method stub
		question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvText);
		returnData = (Button) findViewById(R.id.bReturn);
		selectionList = (RadioGroup) findViewById(R.id.rgAnswers);

		returnData.setOnClickListener(this);
		selectionList.setOnCheckedChangeListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent person = new Intent();
		Bundle backpack = new Bundle();
		backpack.putString("answer", setData);
		person.putExtras(backpack);
		setResult(RESULT_OK, person);
		finish();
	}

	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch (arg1) {
		case R.id.rApple:
			setData = "Apple";
			break;
		case R.id.rOrange:
			setData = "Orange";			
			break;
		case R.id.rChicken:
			setData = "Chicken";
			break;

		default:
			break;
		}
		test.setText(setData);
	}

}
