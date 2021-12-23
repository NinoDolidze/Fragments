package com.example.fragments.fragments

import android.content.Context.MODE_PRIVATE
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragments.R

class FragmentSeventh : Fragment(R.layout.fragment_seventh) {

    private lateinit var addButton: Button
    private lateinit var noteEditText: EditText
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        addButton = view.findViewById(R.id.buttonAdd)
        noteEditText = view.findViewById(R.id.editTextNote)
        textView = view.findViewById(R.id.textView2)

        val sharedPreferences = requireActivity().getSharedPreferences("APP_PR", MODE_PRIVATE)
        val notes = sharedPreferences.getString("notes", "")

        textView.text = notes

        addButton.setOnClickListener {

            val note = noteEditText.text.toString()
            val text = textView.text.toString()
            val result = note + "\n" + text
            textView.text = result
            noteEditText.text.clear()

            sharedPreferences.edit()
                .putString("notes", result)
                .apply()
    }

    }
}