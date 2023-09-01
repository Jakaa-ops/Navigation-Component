package com.jakaa.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs




class FragmentC : Fragment() {

    private lateinit var messageTextView: TextView
    val args: FragmentCArgs by navArgs()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_c, container, false)

        //var messageTextView = view.findViewById<TextView>(R.id.messageTextView)
        val textMessage = args.message
       // view.messageTextView.text = textMessage

        return view
    }


}