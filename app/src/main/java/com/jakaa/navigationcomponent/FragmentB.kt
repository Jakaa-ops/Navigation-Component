package com.jakaa.navigationcomponent

import android.os.Bundle
import android.os.Message
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController


class FragmentB : Fragment() {

    private lateinit var textMessage: EditText
    private lateinit var sendMessageBtn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false)


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        sendMessageBtn.setOnClickListener {
            val message = textMessage.text.toString()
            if (message.isNotEmpty()){
                val action = FragmentBDirections.actionFragmentBToFragmentC(message)
                Navigation.findNavController(view).navigate(action)
            }else{
                Toast.makeText(activity, "Please enter a message", Toast.LENGTH_LONG).show()
            }
        }
    }

}