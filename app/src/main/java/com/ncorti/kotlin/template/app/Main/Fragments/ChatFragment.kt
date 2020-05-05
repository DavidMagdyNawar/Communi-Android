package com.ncorti.kotlin.template.app.Main.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.ncorti.kotlin.template.app.R

/**
 * A simple [Fragment] subclass.
 */
class ChatFragment : Fragment() {

    companion object{
        fun newInstance(): ChatFragment = ChatFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

}