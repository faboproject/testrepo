package first.boldizsar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Counter extends Activity {
    /** Called when the activity is first created. */
	
	int counter;
	Button add, sub;
	TextView display;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.counter);
        counter = 0;
        add = (Button) findViewById(R.id.button1);
        sub = (Button) findViewById(R.id.button2);
        display = (TextView) findViewById(R.id.tv1);
        add.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				counter += 10;
				display.setText("Your total is " + counter);
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
        	
        		
        	public void onClick(View v) {
        		// TODO Auto-generated method stub
        		counter -= 10;
        		display.setText("Your total is " + counter);
        	}
        });
    }
}