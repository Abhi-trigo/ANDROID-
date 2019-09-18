package Calculator.Assignment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private EditText input;
    private Button inp1,inp2,inp3,inp4,inp5,inp6,inp7,inp8,inp9,inp0,inpc,inpclr,inpdel,inpadd,inpsub,
    inpmul,inpdiv,res,inpf,inpsign;
    float value1,value2,res_2;
    boolean add=false,sub=false,mul=false,div=false,inp=false,res_1=false,press=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculatorlayout);
        addListnerOn();
    }
       public void addListnerOn(){
            inp1=(Button)findViewById(R.id.bt6);
            inp2=(Button)findViewById(R.id.bt7);
            inp3=(Button)findViewById(R.id.bt8);
            inp4=(Button)findViewById(R.id.bt10);
            inp5=(Button)findViewById(R.id.bt11);
            inp6=(Button)findViewById(R.id.bt12);
            inp7=(Button)findViewById(R.id.bt14);
            inp8=(Button)findViewById(R.id.bt15);
            inp9=(Button)findViewById(R.id.bt16);
            inp0=(Button)findViewById(R.id.bt19);
            inpadd=(Button)findViewById(R.id.bt5);
            inpsub=(Button)findViewById(R.id.bt9);
            inpmul=(Button)findViewById(R.id.bt13);
            inpdiv=(Button)findViewById(R.id.bt17);
            inpc=(Button)findViewById(R.id.bt1);
            inpsign=(Button)findViewById(R.id.bt3);
            inpclr=(Button)findViewById(R.id.bt4);
            inpf=(Button)findViewById(R.id.bt18);
            inpdel=(Button)findViewById(R.id.bt20);
            res=(Button)findViewById(R.id.bt21);
            input=(EditText)findViewById(R.id.et1);
           inp1.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {

                   if ( inp == false) {
                       input.setText("1");
                       inp=true;
                   }
                   else {
                       System.out.println("print");
                       input.setText(input.getText() + "1");
                   }
               }
           });
           inp2.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("2");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "2");
                   }
               }
           });
           inp3.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("3");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "3");
                   }
               }
           });
           inp4.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false) {
                       input.setText("4");
                       inp=true;
                   }
                   else{
                       input.setText(input.getText() + "4");
                   }

               }

           });
           inp5.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("5");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "5");
                   }
               }
           });
           inp6.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("6");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "6");
                   }
               }
           });
           inp7.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("7");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "7");
                   }
               }
           });
           inp8.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("8");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "8");
                   }
               }
           });
           inp9.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("9");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "9");
                   }
               }
           });
           inp0.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false){
                       input.setText("0");
                       inp=true;
                   }
                   else {
                       input.setText(input.getText() + "0");
                   }
               }
           });
           inpf.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(press==false){
                    input.setText(input.getText()+".");
                    }
                   press=true;
           }});
           inpclr.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   input.setText("");
                   inp=false;
                   press=false;
               }
           });
           inpadd.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false && res_1==true ){
                       input.setText("");
                       value1=res_2;
                       res_1=false;
                       add=true;
                       inp=true;
                   }
                   else {
                       if (inp==false && res_1==false){
                           input.setText("");
                       }
                       else{

                            if(inp==true && (sub==true || mul==true || div==true)){
                                input.setText("");
                                add = true;
                                sub=false;
                                mul=false;
                                div=false;
                            }
                            else{
                                if(add==false) {
                                    value1 = Float.parseFloat(input.getText() + "");
                                    add = true;
                                    input.setText("");
                                }
                            }
                       }
                   }
               press=false;
               }
           });
           inpsub.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false && res_1==true ){
                       input.setText("");
                       value1=res_2;
                       res_1=false;
                       sub=true;
                       inp=true;
                   }
                   else {
                       if (inp==false && res_1==false){
                           input.setText("");
                       }
                       else{

                           if(inp==true && (add==true || mul==true || div==true)){
                               input.setText("");
                               add = false;
                               sub=true;
                               mul=false;
                               div=false;
                           }
                           else{if(sub==false){
                               value1 = Float.parseFloat(input.getText() + "");
                               sub = true;
                               input.setText("");
                           }}
                       }
                   }
               press=false;
               }
           });
           inpmul.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){
                   if(inp==false && res_1==true ){
                       input.setText("");
                       value1=res_2;
                       res_1=false;
                       mul=true;
                       inp=true;
                   }
                   else {
                       if (inp==false && res_1==false){
                           input.setText("");
                       }
                       else{

                           if(inp==true && (sub==true || add==true || div==true)){
                               input.setText("");
                               add = false;
                               sub=false;
                               mul=true;
                               div=false;
                           }
                           else{if(mul==false) {
                               value1 = Float.parseFloat(input.getText() + "");
                               mul = true;
                               input.setText("");
                           }}
                       }
                   }
                   press=false;
               }
           });
           inpdiv.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v){


                   if(inp==false && res_1==true ){
                       input.setText("");
                       value1=res_2;
                       res_1=false;
                       div=true;
                       inp=true;
                   }
                   else {
                       if (inp==false && res_1==false){
                           input.setText("");
                       }
                       else{

                           if(inp==true && (sub==true || mul==true || add==true)){
                               input.setText("");
                               add = false;
                               sub=false;
                               mul=false;
                               div=true;
                           }
                           else{if(div==false) {
                               value1 = Float.parseFloat(input.getText() + "");
                               div = true;
                               input.setText("");
                           }}
                       }
                   }
                   press=false;
               }});
           res.setOnClickListener(new View.OnClickListener(){
               @Override
               public void onClick(View v) {
                   String temp = new String();
                   temp = input.getText().toString();
                   if (temp.length() < 1 || temp.equalsIgnoreCase("System Error")) {
                       input.setText("");
                   }
                   else {

                       if (temp.equalsIgnoreCase(".")) {
                           input.setText("System Error" + "");
                       } else {
                           value2 = Float.parseFloat(input.getText() + "");
                           //System.out.println("Done");
                           if (add == true) {
                               res_2 = value1 + value2;
                               res_1 = true;
                               input.setText(res_2 + "");
                               add = false;
                           }
                           if (sub == true) {
                               res_2 = value1 - value2;
                               res_1 = true;
                               input.setText(res_2 + "");
                               sub = false;
                           }
                           if (mul == true) {
                               res_2 = value1 * value2;
                               res_1 = true;
                               input.setText(res_2 + "");
                               mul = false;
                           }
                           if (div == true) {
                               if (value2 == 0) {
                                   input.setText("System Error" + "");
                                   div = false;
                               } else {
                                   res_2 = value1 / value2;
                                   res_1 = true;
                                   input.setText(res_2 + "");
                                   div = false;
                               }
                           }
                           inp = false;
                       }
                   }
                   press=false;
               }
           });

            inpc.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    input.setText("");
                    inp=false;
                    res_1=false;
                    press=false;
                }
                });
            inpsign.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String temp=new String();
                    temp=input.getText().toString();
                    if(temp.length()<1 || temp.equalsIgnoreCase("System Error")){
                        input.setText("");
                    }
                    else{
                        if(inp==true){
                            value2=Float.parseFloat(input.getText()+"");
                            value2=value2*-1;
                            input.setText(value2+"");
                        }
                        else {
                            value1 = Float.parseFloat(input.getText() + "");
                            value1 = value1 * -1;
                            input.setText(value1 + "");
                        }
                    }
                }
            });
            inpdel.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){
                    String temp=new String();
                    temp=input.getText().toString();
                    if(temp.length()<1 || temp.equalsIgnoreCase("System Error")){
                        input.setText("");
                        press=false;
                    }
                    else {
                            temp = temp.substring(0,temp.length() - 1);
                            if(temp.length()<1){
                                input.setText("");
                                press=false;
                            }
                            else {
                                input.setText(temp + "");
                            }

                    }
                }
            });
       }
    }

