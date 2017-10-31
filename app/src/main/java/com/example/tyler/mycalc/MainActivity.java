package com.example.tyler.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 , button7 , button8 , button9 , buttonAdd , buttonSub , buttonDiv , buttonMul , buttonClear , buttonEqual, buttonPoint, buttonPower, buttonPeren, buttonNegative;
    TextView edt1;
    String edt11;
    int lengthOfEquation;
    char currentCharacter;
    char previousCharacter;
    int numPeren, numLeftPeren, numRightPeren;
    boolean pointHasEnded = true;
    int numPoints;
    String originalString;
    //Button buttonC, buttonleftPeren, buttonrightPeren, buttonPower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int test = 0;


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonMul = findViewById(R.id.buttonMul);
        buttonDiv = findViewById(R.id.buttonDiv);
        buttonClear = findViewById(R.id.buttonClear);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPoint = findViewById(R.id.buttonPoint);
        buttonPower = findViewById(R.id.buttonPower);
        buttonPeren = findViewById(R.id.buttonPeren);
        buttonNegative = findViewById(R.id.buttonNegative);
        edt1 = findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"1");
                ttt();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"2");
                ttt();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"3");
                ttt();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"4");
                ttt();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"5");
                ttt();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"6");
                ttt();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"7");
                ttt();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"8");
                ttt();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"9");
                ttt();
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"0");
                ttt();
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"+");
                ttt();
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"-");
                ttt();
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"*");
                ttt();
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"/");
                ttt();
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                //edt1.setText(edt11 +"=");
                //int lengthOfEquation = edt11.length();




                //edt1.setText(edt11 + "=" + lengthOfEquation);
                    //if (s2.indexOf(s1.charAt(i)) == -1) {
                //edt11.indexOf("+") != -1;
               /* for (int i = 0; i < lengthOfEquation; i++){
                    char c = edt11.charAt(i);
                    tooString();
                    edt1.setText(edt11 + c);
                    //Process char
                }*/

                String[] tokens = edt11.split("\\.");
                for (String token : tokens) {
                    tooString();
                    edt1.setText(edt11 + "[" + token + "]");


                }



               /* if (mAddition == true){

                    edt1.setText(mValueOne + mValueTwo +"");
                    mAddition=false;
                }


                if (mSubtract == true){
                    //edt1.setText(mValueOne - mValueTwo+"");
                    mSubtract=false;
                }

                if (mMultiplication == true){
                    //edt1.setText(mValueOne * mValueTwo+"");
                    mMultiplication=false;
                }

                if (mDivision == true){
                    //edt1.setText(mValueOne / mValueTwo+"");
                    mDivision=false;
                }*/
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                lengthOfEquation = 0;
                numPeren = 0;
                numLeftPeren = 0;
                numRightPeren = 0;
                currentCharacter = '\0';
                previousCharacter = '\0';

            }
        });

        buttonPeren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //originalString = edt11;
                tooString();
                /*if(currentCharacter == '.'){

                    if (numLeftPeren > numRightPeren){
                        edt1.setText(originalString + "0)");
                        previousCharacter = '0';
                        currentCharacter = ')';
                        pointHasEnded = true;
                        numPoints = 0;
                        numRightPeren++;
                    } else {
                        edt1.setText(originalString + "0(");
                        previousCharacter = '0';
                        currentCharacter = '(';
                        pointHasEnded = true;
                        numPoints = 0;
                        numLeftPeren++;
                    }
                }else {*/
                    if (numPeren == 0) {
                        edt1.setText(edt11 + "(");
                        numLeftPeren++;
                    } else if ((numLeftPeren > numRightPeren && (Character.isDigit(edt11.charAt(lengthOfEquation - 1))) || (numLeftPeren > numRightPeren && currentCharacter == ')'))) {     //there exists a *,-,+,/,^ between last (
                        edt1.setText(edt11 + ")");
                        numRightPeren++;
                    } else {
                        edt1.setText(edt11 + "(");
                        numLeftPeren++;
                    }
                    numPeren++;
                    ttt();
               // }
            }
        });

        /*buttonNegative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"(-");
                numLeftPeren++;
                ttt();
            }
        });*/

        buttonPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +"^");
                ttt();

            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tooString();
                edt1.setText(edt11 +".");
                ttt();

            }
        });

        /*button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });*/

    }


public void tooString(){
    edt11 = MainActivity.this.edt1.getText().toString();

}
public void ttt(){
    originalString = edt11;
    tooString();
    lengthOfEquation = edt11.length();
    previousCharacter = currentCharacter;
    currentCharacter = edt11.charAt(lengthOfEquation-1);
   // System.out.print(lengthOfEquation);
      //edt1.setText(edt11 + currentCharacter);
   if((currentCharacter == '+' || currentCharacter == '*' || currentCharacter == '/' || currentCharacter == ')' || currentCharacter == '^') && lengthOfEquation <= 1 ){ //first thing is equation should not be any of these
        edt1.setText(originalString);
       previousCharacter = '\0';
       currentCharacter = '\0';
   }
   if(currentCharacter == '-' && (previousCharacter == '-')){
        edt1.setText(originalString);
   }
   if((currentCharacter == '+' || currentCharacter == '*' || currentCharacter == '/' || currentCharacter == '^') && (previousCharacter == '+' || previousCharacter == '-' || previousCharacter == '*' || previousCharacter == '/' || previousCharacter == ')' || previousCharacter == '(' || previousCharacter == '^')) { //any of these should not be able to be typed one after the other aka in a row
        edt1.setText(originalString);
        /*if(lengthOfEquation < 3){

        }else{
            previousCharacter = edt11.charAt(lengthOfEquation-3);
            currentCharacter = edt11.charAt(lengthOfEquation-2);
        }*/

   }
   /*if((currentCharacter == '(' || currentCharacter == ')') && previousCharacter == '.'){

       previousCharacter = '0';
       numPeren--;

       if(numLeftPeren > numRightPeren){
           currentCharacter = ')';
           edt1.setText(originalString + "0)");
       }
       else{
           currentCharacter = '(';
           edt1.setText(originalString + "0(");
       }

   }*/
   if((previousCharacter == '.' && !(Character.isDigit(edt11.charAt(lengthOfEquation - 1)))) && currentCharacter != '.'){
        //if(currentCharacter == '+' || currentCharacter == '-' || currentCharacter == '*' || currentCharacter == '/' || currentCharacter == '^' ){
            edt1.setText(originalString + "0" + currentCharacter);
            previousCharacter = '0';
            currentCharacter = currentCharacter;
            pointHasEnded = true;
            numPoints = 0;
        /*}else {
            edt1.setText(originalString + "0");
            previousCharacter = '.';
            currentCharacter = '0';
            pointHasEnded = true;
            numPoints = 0;
        }*/
       //edt1.setText("its now true1");
    }
    if(pointHasEnded == false && currentCharacter == '.' && numPoints > 0){
        edt1.setText(originalString);
        /*if(lengthOfEquation < 3){

        }else{
            previousCharacter = edt11.charAt(lengthOfEquation-3);
            currentCharacter = edt11.charAt(lengthOfEquation-2);
        }*/
    }
    if(currentCharacter == '.' && pointHasEnded == true && numPoints == 0){
       pointHasEnded = false;
       numPoints++;
        //edt1.setText(edt11 + "its now false");
    }
    if(currentCharacter == '+' || currentCharacter == '-' || currentCharacter == '*' || currentCharacter == '/' || currentCharacter == '(' || currentCharacter == ')' || currentCharacter == '^' ){
        pointHasEnded = true;
        //edt1.setText("its now true2");
        numPoints = 0;
    }

}

}
