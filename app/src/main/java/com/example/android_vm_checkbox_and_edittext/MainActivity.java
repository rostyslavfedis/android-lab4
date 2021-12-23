package com.example.android_vm_checkbox_and_edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;

import android.widget.CheckBox;

import android.widget.EditText;

import android.widget.ImageView;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String getName(){
        EditText editText = (EditText) findViewById((R.id.name));
        String name = editText.getText().toString();
        return name;
    }
    public boolean onCheckOne(View view){
        CheckBox check = findViewById(R.id.checkBoxOne);
        boolean isCheck = check.isChecked();
        return isCheck;
    }
    public boolean onCheckTwo(View view){
        CheckBox check = findViewById(R.id.checkBoxTwo);
        boolean isCheck2 = check.isChecked();
        return isCheck2;
    }
    public boolean onCheckThree (View view){
        CheckBox check = findViewById(R.id.checkBoxThree);
        boolean isCheck3 = check.isChecked();
        return isCheck3;
    }
    public boolean onCheckFour (View view){
        CheckBox check = findViewById(R.id.checkBoxFour);
        boolean isCheck4 = check.isChecked();
        return isCheck4;
    }
    public boolean onCheckFive (View view){
        CheckBox check = findViewById(R.id.checkBoxFive);
        boolean isCheck5 = check.isChecked();
        return isCheck5;
    }
    public boolean onCheckSix (View view){
        CheckBox check = findViewById(R.id.checkBoxSix);
        boolean isCheck6 = check.isChecked();
        return isCheck6;
    }
    private String inCheckBox (View view){
        String result;
        if(onCheckOne(view)){
            result="JavaScript";
        }
        else if (onCheckTwo(view)){
            result="C++";
        }
        else{
            result="Python";
        }
        return result;
    }
    private String inCheckBoxTwo (View view){
        String result;
        if(onCheckFour(view)){
            result="Денний";
        }
        else if (onCheckFive(view)){
            result="Вечірній";
        }
        else{
            result="Фулл-дей";
        }
        return result;
    }
    public void house(View view) {
        ImageView beforehouseImageView = (ImageView)
                findViewById(R.id.android_house_image_view);
        beforehouseImageView.setImageResource(R.drawable.prog);
        TextView statusInitialTextView = (TextView)
                findViewById(R.id.status_text_view);
        statusInitialTextView.setText(getName() +" Ваш курс вибрано.");
        TextView statusInitialTextViewTwo = (TextView)
                findViewById(R.id.status_text_viewTwo);
        statusInitialTextViewTwo.setText("Це " + inCheckBox(view) + " курс. З періодом " + inCheckBoxTwo(view));
    }
}