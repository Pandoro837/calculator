package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //필드
    private TextView txtResult;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btn0;
    private Button btnDivide;
    private Button btnMulti;
    private Button btnMinus;
    private Button btnPlus;
    private Button btnCe;
    private Button btnResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //이벤트 확인용
                //Log.d("Calculator", "onClick: button");
                //Log.d("Calculator",""+view.getId());

                switch (view.getId()) {

                    case R.id.btn0:
                        txtResult.append("0");
                        break;

                    case R.id.btn1:
                        txtResult.append("1");
                        break;

                    case R.id.btn2:
                        txtResult.append("2");
                        break;

                    case R.id.btn3:
                        txtResult.append("3");

                        break;

                    case R.id.btn4:
                        txtResult.append("4");

                        break;

                    case R.id.btn5:
                        txtResult.append("5");

                        break;

                    case R.id.btn6:
                        txtResult.append("6");

                        break;

                    case R.id.btn7:
                        txtResult.append("7");

                        break;

                    case R.id.btn8:
                        txtResult.append("8");

                        break;

                    case R.id.btn9:
                        txtResult.append("9");

                        break;

                    case R.id.btnDivide:
                        txtResult.append("/");

                        break;

                    case R.id.btnMulti:
                        txtResult.append("*");

                        break;

                    case R.id.btnMinus:
                        txtResult.append("-");

                        break;

                    case R.id.btnPlus:
                        txtResult.append("+");
                        String str = "123";

                        break;

                    case R.id.btnCe:
                        txtResult.setText("");

                        break;

                    case R.id.btnResult:
                        
                        String formula = txtResult.getText().toString();
                        
                        //나눗셈
                        if(formula.contains("/")) {
                            //값을 /로 구분하여 배열로 만든다
                            String[] sResult = formula.split("\\/");
                            //계산을 위한 int 배열
                            int[] iResult = new int[sResult.length];

                            //문자열 -> 숫자로 전환
                            for(int i = 0; i < sResult.length; i++){
                                iResult[i] = Integer.parseInt(sResult[i]);
                            }
                            
                            //iResult 확인
//                            for(int i = 0; i < iResult.length; i++){
//                                Log.d("Calculator", "onClick: "+iResult[i]);
//                            }
                            
                            //나머지가 0인지 확인(딱 떨어지는지)
                            if(iResult[0] % iResult[1] != 0) {
                                //아닐 경우, 소숫점 표기
                                float result = (float) iResult[0] / (float) iResult[1];
                                txtResult.setText(""+result);
                            } else {
                                //맞을 경우, 그냥 출력
                                int result = iResult[0] / iResult[1];
                                txtResult.setText(""+result);
                            }
                        //곱셈
                        } else if(formula.contains("*")) {
                            //값을 *로 구분하여 배열로 만든다
                            String[] sResult = formula.split("\\*");
                            //계산을 위한 int 배열
                            int[] iResult = new int[sResult.length];

                            //문자열 -> 숫자로 전환
                            for(int i = 0; i < sResult.length; i++){
                                iResult[i] = Integer.parseInt(sResult[i]);
                            }
                            
                            // * 계산
                            int result = iResult[0] * iResult[1];
                            txtResult.setText(""+result);
                        //뺄셈
                        } else if(formula.contains("-")) {
                            //값을 -로 구분하여 배열로 만든다
                            String[] sResult = formula.split("\\-");
                            //계산을 위한 int 배열
                            int[] iResult = new int[sResult.length];

                            //문자열 -> 숫자로 전환
                            for(int i = 0; i < sResult.length; i++){
                                iResult[i] = Integer.parseInt(sResult[i]);
                            }
                            
                            // - 계산
                            int result = iResult[0] - iResult[1];
                            txtResult.setText(""+result);
                        //덧셈    
                        } else if(formula.contains("+")) {
                            //값을 +로 구분하여 배열로 만든다
                            String[] sResult = formula.split("\\+");
                            //계산을 위한 int 배열
                            int[] iResult = new int[sResult.length];

                            //문자열 -> 숫자로 전환
                            for(int i = 0; i < sResult.length; i++){
                                iResult[i] = Integer.parseInt(sResult[i]);
                            }
                            // + 계산
                            int result = iResult[0] + iResult[1];
                            txtResult.setText(""+result);
                        }
                        break;

                    default:
                        txtResult.setText("다시 입력해주세요");
                };

            }
        };

        txtResult = (TextView) findViewById(R.id.txtResult);
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(listener);

        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(listener);

        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(listener);

        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(listener);

        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(listener);

        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(listener);

        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(listener);

        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(listener);

        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(listener);

        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(listener);

        btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(listener);

        btnMulti = (Button) findViewById(R.id.btnMulti);
        btnMulti.setOnClickListener(listener);

        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMinus.setOnClickListener(listener);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(listener);

        btnCe = (Button) findViewById(R.id.btnCe);
        btnCe.setOnClickListener(listener);

        btnResult = (Button) findViewById(R.id.btnResult);
        btnResult.setOnClickListener(listener);

    }
}