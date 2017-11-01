package com.example.tyler.mycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

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
    int topOfStackOperator = 0;
    int currentOperator = 0;
    Stack operatorStack = new Stack();
    Stack operandStack = new Stack();
    boolean done = false;
    int counter = 0;
    String token;
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
                /*List<String> operatorList = new ArrayList<String>();//fgisdfgasuklgfalskufghsaklugalsdiugsaduk,fgdskulfgsdiulfgasdjlhfgasiodufgasadsilufgasdilugsdfiluggsdfiugsdfilu
                List<String> operandList = new ArrayList<String>();
                List<String> listOfTokens = new ArrayList<String>();
                String currentToken = "";
                String previousToken = "";
                Boolean negativeInList = false;
                StringTokenizer st = new StringTokenizer(edt11, "+-()^", true);// this line needs to be there and is part in quotes is........"+-*division()^"
                while (st.hasMoreTokens()) {
                    String token = st.nextToken();
                    previousToken = currentToken;
                    currentToken = token;
                    if(negativeInList == true){
                        listOfTokens.add("-" + token);
                        negativeInList = false;
                    }else{
                        listOfTokens.add(token);
                    }
                    if((("-".contains(previousToken)) || ("+".contains(previousToken)) || ("/".contains(previousToken)) || ("*".contains(previousToken)) || ("^".contains(previousToken)) || ("(".contains(previousToken)) || (")".contains(previousToken)) || ("".contains(previousToken))) && ("-".contains(currentToken))){// || previousToken = "+" || previousToken = "/" || previousToken = "(" || previousToken = ")" || previousToken = "^" || previousToken = "*" || previousToken = "Y") && (currentToken = "-")){
                        listOfTokens.remove(listOfTokens.size() - 1);
                        //listOfTokens.add("-" + token)
                        negativeInList = true;
                        //edt1.setText("xdfgdfgdffffff");
                    }else{
                        //listOfTokens.add(token);
                       //edt1.setText("xdfgdfgdf" + "P" + previousToken + "C" + currentToken);
                    }


                    //listOfTokens.add(token);
                    /*if ("+-/*()^".contains(token)) {
                        operatorList.add(token);

                    } else {
                        operandList.add(token);
                    }*/
                    /*tooString();
                    //edt1.setText("ator=" + operatorList + " and=" + operandList);
                    edt1.setText("x" + listOfTokens);
                }
                calculate(listOfTokens);*///sdhfgsduifgaildufgaisudfgailsudgalfiughadlfuighadfku;ghadkflu;ghasdofu;ighdfioughsdflsdfkuhasdfjk;hasdofu;hasiugasdku;fghasdku;fghasdoiu;fghasdiku;ghalirugdfuklg
                calculate();
                //String[] tokens = edt11.split("(?<=[-+*/])|(?=[-+*/])");
                //String[] tokens = edt11.split("[0-9]+(?<=[-+*/()])|(?=[-+*/()])");
                //String[] tokens = edt11.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
                //String[] tokens = edt11.split("\\.");
                /*for (String token : tokens) {
                    tooString();
                    edt1.setText(edt11 + "[" + token + "]");


                }*/



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
                operandStack.clear();
                operatorStack.clear();
                counter = 0;

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
                    } else if (numLeftPeren > numRightPeren && (Character.isDigit(edt11.charAt(lengthOfEquation - 1))) || (numLeftPeren > numRightPeren && currentCharacter == ')')) {     //there exists a *,-,+,/,^ between last (
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
   if((currentCharacter == '+' || currentCharacter == '*' || currentCharacter == '/' || currentCharacter == '^') && (previousCharacter == '+' || previousCharacter == '-' || previousCharacter == '*' || previousCharacter == '/' || previousCharacter == '(' || previousCharacter == '^')) { //any of these should not be able to be typed one after the other aka in a row
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
        //dfdsg
        //edt1.setText("its now true2");
        numPoints = 0;
    }

}

    public void calculate(){
        int plusMinus = 1;
        int mulDiv = 2;
        int exp = 3;
        int peren = 4;
        char operatorForStackCheck;
        //Stack operatorStack = new Stack();
        //Stack operandStack = new Stack();
        List<String> operatorList = new ArrayList<String>();
        List<String> operandList = new ArrayList<String>();
        List<String> listOfTokens = new ArrayList<String>();
        String currentToken = "";
        String previousToken = "";
        Boolean negativeInList = false;
        StringTokenizer st = new StringTokenizer(edt11, "+-*/()^", true);
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            previousToken = currentToken;
            currentToken = token;
            if(negativeInList == true) {
                operandStack.push("-" + token);
                listOfTokens.add("-" + token);
                negativeInList = false;
            }else if((("-+/^*()".contains(previousToken)) || (operandStack.empty() && operatorStack.empty())) && ("-".contains(currentToken))) {
                negativeInList = true;

            }else{
                if(("-+/^*()".contains(token))) {
                    if(("-+".contains(currentToken))){
                        currentOperator = 1;

                    }else if(("*/".contains(currentToken))){
                        currentOperator = 2;

                    }else if(("^".contains(currentToken))){
                        currentOperator = 3;

                    }else if(("*/".contains(currentToken))){
                        currentOperator = 4;
                    }else{

                    }
                    //topOfStackOperatorNum();


                   do {
                        if (operatorStack.empty()) {
                            operatorStack.push(token);
                            done = true;
                        }else if(("(".contains(currentToken))){
                            operatorStack.push(token);
                            //edt1.setText("xXXXpushXXX" + (operatorStack.peek()) + currentOperator + topOfStackOperator + done);
                            done = true;

                        }else if((")".contains(currentToken)) && !(operatorStack.peek().equals("("))) {
                            while (!operatorStack.peek().equals("(")) {
                                operandStack.push(operatorStack.peek());
                                operatorStack.pop();
                            }
                            operatorStack.pop();
                            done = true;
                        }else if((")".contains(currentToken)) && (operatorStack.peek().equals("("))){
                            operatorStack.pop();
                            //edt1.setText("xXpopXXX" + (operatorStack.peek()) + currentOperator + topOfStackOperator + done);
                            done = true;

                        } else if ((operatorStack.peek().equals("-")) && ("-+/^*()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;


                        } else if ((operatorStack.peek().equals("+")) && ("-+/^*()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals("*")) && ("*/^()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals("/")) && ("*/^()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals("*")) && ("-+".contains(currentToken))) {
                            operatorStack.pop();
                            operandStack.push("*");
                            //operatorStack.push(token);
                            topOfStackOperatorNum();
                            //operandStack.push(token);
                            if(done == true){
                                //edt1.setText("xXXXtXXX" + (operatorStack.peek()) + currentOperator + topOfStackOperator);
                                operatorStack.push(token);

                            }else{
                                //edt1.setText("xXXXgXXX" + (operatorStack.peek()) + currentOperator + topOfStackOperator + done);
                                //operatorStack.push(token);
                            }
                            //edt1.setText("xXX");

                        } else if ((operatorStack.peek().equals("/")) && ("-+".contains(currentToken))) {
                            operatorStack.pop();
                            operandStack.push("/");
                            topOfStackOperatorNum();
                            //operatorForStackCheck = '/';
                            //stackCheck();
                            //operandStack.push(token);
                            if(done == true){
                                //edt1.setText("xXXXXghghhjhg" + (operatorStack.peek()) + currentOperator + topOfStackOperator + done);
                                operatorStack.push(token);
                            }else{

                            }

                        } else if ((operatorStack.peek().equals("^")) && ("()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals("^")) && ("-+*/".contains(currentToken))) {
                            operatorStack.pop();
                            operandStack.push("^");
                            topOfStackOperatorNum();
                            //operandStack.push(token);
                            if(done == true){
                                operatorStack.push(token);
                            }

                        } else if ((operatorStack.peek().equals("(")) && ("()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals(")")) && ("()".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;

                        } else if ((operatorStack.peek().equals("(")) && ("-+*/^".contains(currentToken))) {
                            operatorStack.push(token);
                            done = true;
                            //operatorStack.pop();
                            //operandStack.push("(");
                            //topOfStackOperatorNum();
                            //operandStack.push(token);

                        } else if ((operatorStack.peek().equals(")")) && ("-+*/^".contains(currentToken))) {
                            operatorStack.pop();
                            operandStack.push(")");
                            topOfStackOperatorNum();
                            //operandStack.push(token);
                            if(done == true){
                                operatorStack.push(token);
                            }

                        } else {
                            edt1.setText("something went wrong");
                        }
                    }while(!(operatorStack.empty()) && (done == false));
                    //edt1.setText("xXttttXXX" + (operatorStack.peek()) + currentOperator + topOfStackOperator + done);
                    //operatorStack.push(token);
                }else{
                    operandStack.push(token);
                }
                //edt1.setText("x" + operandStack + operatorStack);

                listOfTokens.add(token);

            }
            /*if((("-+/^*()".contains(previousToken)) || ("".contains(previousToken))) && ("-".contains(currentToken))){
            //if((("-".contains(previousToken)) || ("+".contains(previousToken)) || ("/".contains(previousToken)) || ("*".contains(previousToken)) || ("^".contains(previousToken)) || ("(".contains(previousToken)) || (")".contains(previousToken)) || ("".contains(previousToken))) && ("-".contains(currentToken))){// || previousToken = "+" || previousToken = "/" || previousToken = "(" || previousToken = ")" || previousToken = "^" || previousToken = "*" || previousToken = "Y") && (currentToken = "-")){
                listOfTokens.remove(listOfTokens.size() - 1);
                operandStack.pop();
                //listOfTokens.add("-" + token)
                negativeInList = true;
                //edt1.setText("xdfgdfgdffffff");
            }else{
                //listOfTokens.add(token);
                //edt1.setText("xdfgdfgdf" + "P" + previousToken + "C" + currentToken);
            }
            /*for(int i = 0; i < listOfTokens.size(); i++){
                if(listOfTokens[i].contains("+")){
            }*/




            //listOfTokens.add(token);
                    /*if ("+-/*()^".contains(token)) {
                        operatorList.add(token);

                    } else {
                        operandList.add(token);
                    }*/
                    tooString();
                    //edt1.setText("ator=" + operatorList + " and=" + operandList);
                    //edt1.setText("x" + operandStack + operatorStack);
        }


        while(!operatorStack.empty()){
            operandStack.push(operatorStack.peek());
            operatorStack.pop();
        }
///////////////////////////////////////////NOW IN POST FIX//////////////////////////////////////////////////
        /*Stack finalStack = new Stack();
        Stack reverseOperandStack = new Stack();
        //double element1 = 0;
        //double element2 = 0;
        //char operator = 'g';
        double answer = 0;



        while(!operandStack.empty()){
            reverseOperandStack.push(operandStack.peek());
            operandStack.pop();
        }

        while(!reverseOperandStack.empty() || (!finalStack.empty())) {
            if((reverseOperandStack.peek().equals("-")) || (reverseOperandStack.peek().equals("+")) || (reverseOperandStack.peek().equals("/")) || (reverseOperandStack.peek().equals("*")) || (reverseOperandStack.peek().equals("^"))){

                //double two = finalStack.pop();
                //double one = finalStack.pop();
                //double two = element2.doubleValue();
                //element2 = finalStack.peek();
                //finalStack.pop();
               // Double element2 = (Double) finalStack.pop();
               // Double element1 = (Double) finalStack.pop();
                String t = finalStack.pop().toString();
                String o = finalStack.pop().toString();
                double one = Double.parseDouble(o);
                double two = Double.parseDouble(t);
                //double one = element1.doubleValue();
                //operator = reverseOperandStack.peek();
                String oper = reverseOperandStack.pop().toString();
                char operator = oper.charAt(0);
                //char operator = (char) reverseOperandStack.pop();
                if(operator == '-'){
                    answer = one - two;
                }else if(operator == '+'){
                    answer = one + two;
                }else if(operator == '/'){
                    answer = one / two;
                }else if(operator == '*'){
                    answer = one * two;
                }else if(operator == '^'){
                    answer = Math.pow(one, two);
                }else{
                    edt1.setText("something went wrong");
                }
                if(finalStack.empty()){


                }else{
                    Double answerObj = new Double(answer);
                    finalStack.push(answerObj);

                }
                //Double answerObj = new Double(answer);
                //finalStack.push(answerObj);
                //edt1.setText("something went wronggggggggggggg" + reverseOperandStack + finalStack + one + two + operator);
                //finalStack.clear();
               //reverseOperandStack.clear();



            }else{
                finalStack.push(reverseOperandStack.peek());
                reverseOperandStack.pop();
                edt1.setText("something went wronggggg");
            }
        }*/



        edt1.setText("x" + operandStack + operatorStack);
        //edt1.setText("Answer: " + answer);




    }

    public void topOfStackOperatorNum() {

        if(operatorStack.empty()){
            topOfStackOperator = 0;
        }else if((operatorStack.peek().equals("-")) || (operatorStack.peek().equals("+"))){
            topOfStackOperator = 1;

        }else if((operatorStack.peek().equals("*")) || (operatorStack.peek().equals("/"))){
            topOfStackOperator = 2;

        }else if((operatorStack.peek().equals("^"))){
            topOfStackOperator = 3;

        }else if((operatorStack.peek().equals("(")) || (operatorStack.peek().equals(")"))){
            topOfStackOperator = 4;
        }
        else{
            //edt1.setText("x");
        }
        if(operatorStack.empty()){
            done = true;
            //edt1.setText("yyyyyy");
        }else{
        tooString();
        //edt1.setText(edt11 + " " + currentOperator + " " + topOfStackOperator);
            if (currentOperator < topOfStackOperator) {
                done = false;
                //edt1.setText("xxxx" + done);
            } else {
                //if (counter > 0) {
                    done = true;
                //edt1.setText("XXXXXx");
                //} else {
                  //  counter++;
                   // done = false;
               // }
            }
        }
        //return topOfStackOperator;
    }



}











