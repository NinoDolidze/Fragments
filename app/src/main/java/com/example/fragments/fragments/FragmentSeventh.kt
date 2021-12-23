package com.example.fragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class FragmentSeventh : Fragment(R.layout.fragment_seventh) {

    private lateinit var buttonAdd: Button
    private lateinit var editTextNote: EditText
    private lateinit var textView: TextView

//    override fun onCreate(view: View, savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        buttonAdd = view.findViewById(R.id.buttonAdd)
//        editTextNote = view.findViewById(R.id.editTextNote)
//        textView = view.findViewById(R.id.textView)
//
//        buttonAdd.setOnClickListener {
//
//            val note = editTextNote.text.toString()
//            val text = textView.text.toString()
//            val result = note + "\n" + text
//            textView.text = result
//        }
//
//    }
}