package first.boldizsar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class Email extends Activity implements View.OnClickListener {
	EditText personsEmail, title, message;
	String emailAdd, beginning, name;
	Button sendEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.email);
		initializeVars();
		sendEmail.setOnClickListener(this);
	}
	
	private void initializeVars() {
		// TODO Auto-generated method stub
		personsEmail = (EditText) findViewById(R.id.etEmails);
		title = (EditText) findViewById(R.id.etTitle);
		message = (EditText) findViewById(R.id.etMessage);
		sendEmail = (Button) findViewById(R.id.bSentEmail);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub

		String emailaddress[] = { personsEmail.getText().toString() }; 
		String eTitle = title.getText().toString();
		String eMessage = message.getText().toString();

	}
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}