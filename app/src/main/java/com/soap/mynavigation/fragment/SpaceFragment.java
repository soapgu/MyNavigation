package com.soap.mynavigation.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soap.mynavigation.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link SpaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SpaceFragment extends Fragment {

    public SpaceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment SpaceFragment.
     */
    public static SpaceFragment newInstance() {
        return new SpaceFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_space, container, false);
    }
}