package first.boldizsar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Email extends Activity implements View.OnClickListener {
	EditText etEmail, etTitle, etMessage;
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
		etEmail = (EditText) findViewById(R.id.etEmail);
		etTitle = (EditText) findViewById(R.id.etTitle);
		etMessage = (EditText) findViewById(R.id.etMessage);
		sendEmail = (Button) findViewById(R.id.bSendEmail);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub

		String emailaddress[] = { etEmail.getText().toString() }; 
		String title = etTitle.getText().toString();
		String message = etMessage.getText().toString();
		
		Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
		emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, emailaddress);
		emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, title);
		emailIntent.setType("plain/text");
		emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, message);
		startActivity(emailIntent);

	}
	

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}
}