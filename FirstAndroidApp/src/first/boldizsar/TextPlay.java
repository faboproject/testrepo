package first.boldizsar;

import java.util.Random;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

public class TextPlay extends Activity implements View.OnClickListener{
	
	Button chkCmd;
	ToggleButton passTog;
	EditText input;
	TextView display;
	
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		SetUpXMLReference();
		
		passTog.setOnClickListener(this);
		
		chkCmd.setOnClickListener(this);
	}

	private void SetUpXMLReference() {
		chkCmd = (Button) findViewById(R.id.bResults);
		passTog = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tvResults);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bResults:
			String check = input.getText().toString();
			if (check.contentEquals("left")) {
				display.setGravity(Gravity.LEFT);
			} else if (check.contentEquals("right")){
				display.setGravity(Gravity.RIGHT);					
			} else if (check.contentEquals("center")) {
				display.setGravity(Gravity.CENTER);					
			} else if (check.contentEquals("blue")) {
				display.setTextColor(Color.rgb(60, 60, 200));
			} else if (check.contentEquals("WTF")) {
				Random r = new Random();
				display.setText("Wtf");
				display.setTextSize(r.nextInt(75));
				display.setTextColor(Color.rgb(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
				switch (r.nextInt(3)) {
				case 0:
					display.setGravity(Gravity.LEFT);						
					break;
				case 1:
					display.setGravity(Gravity.CENTER);						
					break;
				case 2:
					display.setGravity(Gravity.RIGHT);												
					break;
				default:
					break;
				}
			} else {
				display.setText("invalid");
				display.setGravity(Gravity.CENTER);
			}
			break;

		case R.id.tbPassword:
			if (passTog.isChecked()) {
				input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
			} else {
				input.setInputType(InputType.TYPE_CLASS_TEXT);
			}
			break;
		default:
			break;
		}
	}
	
}
