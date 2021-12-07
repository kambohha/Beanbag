package com.example.beanbag.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import com.example.beanbag.ImageAdpter;
import com.example.beanbag.PhotoImageAdapter;
import com.example.beanbag.R;
public class Gallery extends Fragment{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        GridView gridview = (GridView) this.getActivity().findViewById(R.id.grid_view);
        gridview.setAdapter(new PhotoImageAdapter(this.getActivity()));
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}


