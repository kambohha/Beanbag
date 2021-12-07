package com.example.beanbag;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.beanbag.Fragment.Gallery;

public class ImageAdpter extends BaseAdapter {
       private  Context mcontext;
       public  int[] imageArray={
            R.drawable.imag1,R.drawable.imag2,R.drawable.imag3,R.drawable.imag4,R.drawable.imag5,
               R.drawable.imag6,R.drawable.imag7,R.drawable.imag8,R.drawable.imag9,R.drawable.imag10,
               R.drawable.imag11,R.drawable.imag12,R.drawable.imag13,R.drawable.imag14,R.drawable.imag15,
               R.drawable.imag16,R.drawable.imag17,R.drawable.imag18,R.drawable.imag19,R.drawable.imag20,
               R.drawable.imag21,R.drawable.imag22,R.drawable.imag23,R.drawable.imag24,R.drawable.imag25,
    };

    public ImageAdpter(Context mcontext) {
        this.mcontext = mcontext;
    }



    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mcontext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(340,350));
        return imageView;
    }
}
