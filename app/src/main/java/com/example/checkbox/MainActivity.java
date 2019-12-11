package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1,cb2,cb3,cb4;
    EditText et1,et2,et3,et4;
    RadioButton rb1,rb2,rb3;
    Button btn1;
    TextView tv1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        et1=(EditText)findViewById(R.id.editText1);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText3);
        et4=(EditText)findViewById(R.id.editText4);
        rb1=(RadioButton)findViewById(R.id.radioButton1);
        rb2=(RadioButton)findViewById(R.id.radioButton2);
        rb3=(RadioButton)findViewById(R.id.radioButton3);
        btn1=(Button)findViewById(R.id.button1);
        tv1=(TextView)findViewById(R.id.textView1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int sum = 0;
                String msg = " ";
                if (cb1.isChecked()) {
                    String s1 = et1.getText().toString();
                    int n1 = Integer.parseInt(s1);
                    sum = sum + n1;
                    msg = msg + cb1.getText() + ":" + et1.getText().toString() + "\n";
                }
                if (cb2.isChecked()) {
                    String s2 = et2.getText().toString();
                    int n2 = Integer.parseInt(s2);
                    sum = sum + n2;
                    msg = msg + cb2.getText() + ":" + et2.getText().toString() + "\n";
                }
                if (cb3.isChecked()) {
                    String s3 = et3.getText().toString();
                    int n3 = Integer.parseInt(s3);
                    sum = sum + n3;
                    msg = msg + cb3.getText() + ":" + et3.getText().toString() + "\n";
                }
                if (cb4.isChecked()) {
                    String s4 = et4.getText().toString();
                    int n4 = Integer.parseInt(s4);
                    sum = sum + n4;
                    msg = msg + cb4.getText() + ":" + et4.getText().toString() + "\n";
                }
                tv1.setText(msg + "原始價格:" + sum+"元\n");
            }
        });

        View.OnClickListener rBOCL=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RadioButton rb=((RadioButton)v);
                String msg="折扣";
                if(rb.isChecked())
                    msg=msg+rb.getText();
                Toast.makeText(MainActivity.this,msg,Toast.LENGTH_SHORT).show();

            }
        };
        rb1.setOnClickListener(rBOCL);
        rb2.setOnClickListener(rBOCL);
        rb3.setOnClickListener(rBOCL);

       CompoundButton.OnCheckedChangeListener CBOCCL= new CompoundButton.OnCheckedChangeListener() {
           @Override
           public void onCheckedChanged(CompoundButton view, boolean state) {
               int id=((CheckBox)view).getId();
               switch(id){

                   case R.id.checkBox1:
                       if(state)
                             et1.setText("150");
                       else
                             et1.setText(" ");
                       break;
                   case R.id.checkBox2:
                       if(state)
                             et2.setText("170");
                       else
                             et2.setText(" ");
                       break;
                   case R.id.checkBox3:
                       if(state)
                             et3.setText(R.string.ed3);
                       else
                             et3.setText(" ");
                       break;
                   case R.id.checkBox4:
                       if(state)
                             et4.setText(R.string.ed4);
                       else
                             et4.setText(" ");
                       break;
               }

           }
       };
       cb1.setOnCheckedChangeListener(CBOCCL);
       cb2.setOnCheckedChangeListener(CBOCCL);
       cb3.setOnCheckedChangeListener(CBOCCL);
       cb4.setOnCheckedChangeListener(CBOCCL);





        View.OnClickListener COCBL= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox cb=((CheckBox)v);
                if(cb.isChecked())
                    Toast.makeText(MainActivity.this,"選擇:"+cb.getText(),Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"取消："+cb.getText(),Toast.LENGTH_SHORT).show();
//                int id=((CheckBox)v).getId();
//                switch(id){
//
//                    case R.id.checkBox1:
//                        if(cb1.isChecked())
//                            Toast.makeText(MainActivity.this ,"選擇:"+cb1.getText(),Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(MainActivity.this,"取消"+cb1.getText(),Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.checkBox2:
//                        if(cb2.isChecked())
//                            Toast.makeText(MainActivity.this ,"選擇:"+cb2.getText(),Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(MainActivity.this,"取消"+cb2.getText(),Toast.LENGTH_SHORT).show();
//                        break;
//
//                    case R.id.checkBox3:
//                        if(cb3.isChecked())
//                            Toast.makeText(MainActivity.this ,"選擇:"+cb3.getText(),Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(MainActivity.this,"取消"+cb3.getText(),Toast.LENGTH_SHORT).show();
//
//                        break;
//                    case R.id.checkBox4:
//                        if(cb4.isChecked())
//                            Toast.makeText(MainActivity.this ,"選擇:"+cb4.getText(),Toast.LENGTH_SHORT).show();
//                        else
//                            Toast.makeText(MainActivity.this,"取消"+cb4.getText(),Toast.LENGTH_SHORT).show();
//                        break;



                }

        };
        cb1.setOnClickListener(COCBL);
        cb2.setOnClickListener(COCBL);
        cb3.setOnClickListener(COCBL);
        cb4.setOnClickListener(COCBL);
    }
}
