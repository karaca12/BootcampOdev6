package com.example.bootcampodev6.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bootcampodev6.R;
import com.example.bootcampodev6.databinding.FragmentPlaylistBinding;


public class PlaylistFragment extends Fragment {

    private FragmentPlaylistBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentPlaylistBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}