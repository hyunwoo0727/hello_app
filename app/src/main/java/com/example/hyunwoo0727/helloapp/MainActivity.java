package com.example.hyunwoo0727.helloapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements TextView.OnClickListener{

    EditText et_first_num,et_second_num;
    Button bt_plus,bt_minus,bt_multi,bt_div,bt_mod,bt_equal,bt_one,bt_two,bt_three,bt_four,bt_five,bt_six,bt_seven,bt_eight,bt_nine,bt_zero,bt_dot;
    TextView tv_result;
    private int calcResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_first_num = (EditText) findViewById(R.id.et_first_num);
        et_second_num = (EditText) findViewById(R.id.et_second_num);
        bt_plus = (Button) findViewById(R.id.bt_plus);
        bt_minus = (Button) findViewById(R.id.bt_minus);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_div = (Button) findViewById(R.id.bt_div);
        bt_mod = (Button) findViewById(R.id.bt_mod);
        bt_equal = (Button) findViewById(R.id.bt_equal);
        bt_zero = (Button) findViewById(R.id.bt_zero);
        bt_one = (Button) findViewById(R.id.bt_one);
        bt_two = (Button) findViewById(R.id.bt_two);
        bt_three = (Button) findViewById(R.id.bt_three);
        bt_four = (Button) findViewById(R.id.bt_four);
        bt_five = (Button) findViewById(R.id.bt_five);
        bt_six = (Button) findViewById(R.id.bt_six);
        bt_seven = (Button) findViewById(R.id.bt_seven);
        bt_eight = (Button) findViewById(R.id.bt_eight);
        bt_nine = (Button) findViewById(R.id.bt_nine);
        bt_dot = (Button) findViewById(R.id.bt_dot);
        tv_result = (TextView) findViewById(R.id.tv_result);
        bt_plus.setOnClickListener(this);
        bt_minus.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_div.setOnClickListener(this);
        bt_mod.setOnClickListener(this);
        bt_equal.setOnClickListener(this);
        bt_zero.setOnClickListener(this);
        bt_one.setOnClickListener(this);
        bt_two.setOnClickListener(this);
        bt_three.setOnClickListener(this);
        bt_four.setOnClickListener(this);
        bt_five.setOnClickListener(this);
        bt_six.setOnClickListener(this);
        bt_seven.setOnClickListener(this);
        bt_eight.setOnClickListener(this);
        bt_nine.setOnClickListener(this);
        bt_dot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bt_plus:
               this.setCalcResult(Integer.parseInt(et_first_num.getText().toString()) + Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_minus:
                this.setCalcResult(Integer.parseInt(et_first_num.getText().toString()) - Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_multi:
                this.setCalcResult(Integer.parseInt(et_first_num.getText().toString()) * Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_div:
                this.setCalcResult(Integer.parseInt(et_first_num.getText().toString()) / Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_mod:
                this.setCalcResult(Integer.parseInt(et_first_num.getText().toString()) % Integer.parseInt(et_second_num.getText().toString()));
                break;
            case R.id.bt_equal:
                tv_result.setText("결과 : " + this.getCalcResult());
                break;
            default:
                break;
        }

    }
    public int getCalcResult() {
        return calcResult;
    }
    public void setCalcResult(int calcResult) {
        this.calcResult = calcResult;
    }
}
