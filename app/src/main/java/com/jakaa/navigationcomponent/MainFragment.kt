package com.jakaa.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class MainFragment : Fragment() {

    private lateinit var fragmentABtn: Button
    private lateinit var fragmentBBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        fragmentABtn.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentA)
        }
        fragmentBBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_fragmentB)
        }

    }

}