package org.jvk.calculator;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private EditText editOperand1;
    private EditText editOperand2;
    private Button btnAddition;
    private Button btnSubstraction;
    private Button btnDivision;
    private Button btnMultiplication;
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        editOperand1 = (EditText) findViewById(R.id.operand1);
        editOperand2 = (EditText) findViewById(R.id.operand2);
        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnSubstraction = (Button) findViewById(R.id.btnSubstraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        txtResult = (TextView) findViewById(R.id.txtResult);

        btnAddition.setOnClickListener(view -> {
            double operand1 = Double.parseDouble(editOperand1.getText().toString());
            double operand2 = Double.parseDouble(editOperand2.getText().toString());
            txtResult.setText(Double.toString(operand1 + operand2));
        });

        btnSubstraction.setOnClickListener(view -> {
            double operand1 = Double.parseDouble(editOperand1.getText().toString());
            double operand2 = Double.parseDouble(editOperand2.getText().toString());
            txtResult.setText(Double.toString(operand1 - operand2));
        });

        btnMultiplication.setOnClickListener(view -> {
            double operand1 = Double.parseDouble(editOperand1.getText().toString());
            double operand2 = Double.parseDouble(editOperand2.getText().toString());
            txtResult.setText(Double.toString(operand1 * operand2));
        });

        btnDivision.setOnClickListener(view -> {
            double operand1 = Double.parseDouble(editOperand1.getText().toString());
            double operand2 = Double.parseDouble(editOperand2.getText().toString());
            txtResult.setText(Double.toString(operand1 / operand2));
        });
        Log.d(TAG, "onCreate invoked");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        Log.d(TAG, "onCreateOptionsMenu invoked");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //noinspection SimplifiableIfStatement
        if (item.getItemId() == R.id.action_settings) {
            Snackbar.make(findViewById(R.id.content_main),
                    "Settings updated", Snackbar.LENGTH_SHORT)
                    .setAction("Action", null)
                    .show();
            Log.d(TAG, "Settings tapped");
            return true;
        }
        Log.d(TAG, "MenuItem " + item.getItemId() + " tapped");
        return super.onOptionsItemSelected(item);
    }


}
