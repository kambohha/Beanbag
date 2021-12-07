package com.example.beanbag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.beanbag.Adpter.CatagoryAdpter;
import com.example.beanbag.Adpter.PopulerAdpter;
import com.example.beanbag.Domain.BeanBagDomain;
import com.example.beanbag.Domain.BeanDomain;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private  RecyclerView recyclerViewCatagorylist,recyclerViewpopulerlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerViewCatagory();
        recyclerViewpopuler();
    }

    private void recyclerViewpopuler() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewpopulerlist=findViewById(R.id.recyclerView5);
        recyclerViewpopulerlist.setLayoutManager(linearLayoutManager);
        ArrayList<BeanDomain> beanlist=new ArrayList<>();

        beanlist.add(new  BeanDomain("Chair","imag6","This is a beautiful beanbag ,chair and Good Quality,leather and color",10000));
        beanlist.add(new  BeanDomain("BeanBag","imag7","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        beanlist.add(new  BeanDomain("BeanBag Pets","imag9","",15000));
        adapter2=new PopulerAdpter(beanlist);
        recyclerViewpopulerlist.setAdapter(adapter2);


    }

    private void recyclerViewCatagory() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCatagorylist=findViewById(R.id.recyclerView4);
       recyclerViewCatagorylist.setLayoutManager(linearLayoutManager);
       ArrayList<BeanBagDomain> catagoryList=new ArrayList<>();
       catagoryList.add(new BeanBagDomain("Chair","imag1"));
        catagoryList.add(new BeanBagDomain("BeanBag","imag2"));

        catagoryList.add(new BeanBagDomain("Chair","imag9"));
        catagoryList.add(new BeanBagDomain("Chair","imag5"));
        adapter=new CatagoryAdpter(catagoryList);
        recyclerViewCatagorylist.setAdapter(adapter);



    }
}