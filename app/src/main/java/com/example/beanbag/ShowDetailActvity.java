package com.example.beanbag;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.beanbag.Domain.BeanDomain;

public class ShowDetailActvity extends AppCompatActivity {
   private TextView addtocardBtn;
   private  TextView titleTxt,feeTxt,descriptionTxt,numberOrderTxt;
   private ImageView plusBtn, minusBtn,beanpic;
   private BeanDomain object;
   private int  numberOrder=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail_actvity);
        initView();
        getBundle();
    }
    private  void  getBundle(){
        object=(BeanDomain) getIntent().getSerializableExtra("object");
        int drawableResourceId=this.getResources().getIdentifier(object.getPic(),"drawable",this.getPackageName());
        Glide.with(this)
                .load(drawableResourceId)
                .into(beanpic);
        titleTxt.setText(object.getTitle());
        feeTxt.setText("$"+object.getFee());
        descriptionTxt.setText(object.getDescription());
        numberOrderTxt.setText(String.valueOf(numberOrder));
        plusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberOrder=numberOrder +1;
                numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if (numberOrder>1){
                   numberOrder=numberOrder-1;
               }
               numberOrderTxt.setText(String.valueOf(numberOrder));
            }
        });
        addtocardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    private  void initView(){
        addtocardBtn=findViewById(R.id.addtoCardBtn);
        titleTxt=findViewById(R.id.titleTxt);
        feeTxt=findViewById(R.id.priceTxt);
        descriptionTxt=findViewById(R.id.description);
        numberOrderTxt=findViewById(R.id.numberorderTxt);
        plusBtn=findViewById(R.id.plusBtn);
        minusBtn=findViewById(R.id.minudBtn);
        beanpic=findViewById(R.id.beanpic);

    }
}