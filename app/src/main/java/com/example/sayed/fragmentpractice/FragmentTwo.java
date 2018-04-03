package com.example.sayed.fragmentpractice;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Toast.makeText(getContext(), getArguments().getString("msg"), Toast.LENGTH_SHORT).show();
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_two, container, false);
    }

}
