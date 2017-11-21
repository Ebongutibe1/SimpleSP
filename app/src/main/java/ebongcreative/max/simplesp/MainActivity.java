package ebongcreative.max.simplesp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import ebongcreative.max.ssp.SSP;
import ebongcreative.max.ssp.SharedPreferenceStorage;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button save;
    TextView instruction;

    //Call Simple SharedPreference
    SSP simplePref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        instruction = (TextView) findViewById(R.id.instuction);
        editText = (EditText) findViewById(R.id.editText);
        save = (Button) findViewById(R.id.save);
        //Init Simple SharedPreference
        simplePref = new SharedPreferenceStorage(MainActivity.this,
                "sspNodes",MODE_PRIVATE);

        //Retriving saved text
        String getIt = simplePref.get("saved","");
        editText.setText(getIt);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editText.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Nothing to save", Toast.LENGTH_SHORT).show();
                }else {
                    //Saving text
                    simplePref.store("saved",editText.getText().toString());
                    Toast.makeText(MainActivity.this, "Text saved", Toast.LENGTH_SHORT).show();
                }
            }
        });

        //OnLongClickListener
        save.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                editText.setText("");
                return true;
            }
        });
    }
}
