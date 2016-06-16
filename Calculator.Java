package com.example.yoganand.calculator;
 
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.View.OnKeyListener;
 
 
public class MainActivity extends ActionBarActivity implements View.OnClickListener {
    private Button btnAdd,btnSub,btndivide,btnmul,btnrat;
    private TextView tvresult;
 
    private EditText first,second;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
 
    private void init() {
        btnAdd =(Button)findViewById(R.id.btnAdd);
        btnsub = (Button)findViewById(R.id.btnSubtract);
        btndivide = (Button)findViewById(R.id.btnDivide);
        btnmul = (Button)findViewById(R.id.btnMultiply);
        btnrat = (Buttin)findViewById(R.id.btnRatio);
        first = (EditText)findViewById(R.id.FirstNumber);
        second =(EditText)findViewById(R.id.SecondNumber);
        result = (TextView)findViewById(R.id.Result);
 
        btnAdd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btndivide.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btnrat.setOnClickListener(this);
    }
 
    @Override
    public void onClick(View view) {
        String num1 = first.getText().toString();
        String num2 = second.getText().toString();
        switch(view.getId()){
            case R.id.btnAdd:
                int addition = Integer.parseInt(num1) + Integer.parseInt(num2);
                result.setText(String.valueOf(addition));
                break;
            case R.id.btnSubtract:
                int subtraction = Integer.parseInt(num1) - Integer.parseInt(num2);
                result.setText(String.valueOf(subtraction));
                break;
            case R.id.btnDivide:
                try{
                    int division = Integer.parseInt(num1) / Integer.parseInt(num2);
                    tvresult.setText(String.valueOf(division));
                }catch(Exception e){
                    result.setText("Cannot DIVIDE!");
                }
                break;
            case R.id.btnMultiply:
                int multiply = Integer.parseInt(num1) * Integer.parseInt(num2);
                result.setText(String.valueOf(multiply));
                break;
           //additional feature case R.id.btnRatio;
                //int ratio = Integer.parseInt(num1) % Integer.parse.Int(num2);
                //result.setText(String.valueOf(Ratio));
                //break;
        }
    }
}
