package com.soap.mynavigation.fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.soap.mynavigation.R;
import com.soap.mynavigation.databinding.HomeFragmentBinding;
import com.soap.mynavigation.viewmodel.HomeViewModel;

public class HomeFragment extends Fragment {

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        HomeFragmentBinding binding = HomeFragmentBinding.inflate(inflater,container,false);
        HomeViewModel mViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding.setDataContext(mViewModel);
        binding.btnSpace.setOnClickListener(v -> Navigation.findNavController(v).navigate(R.id.spaceFragment));
        return binding.getRoot();
    }

}