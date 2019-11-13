package com.example.fun_tap.todo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.example.fun_tap.R

/**
 * A simple [Fragment] subclass.
 */
class To_DoFragment : Fragment() {
 private lateinit var todoViewModel: To_DoViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        todoViewModel = ViewModelProviders.of(this).get(To_DoViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_to__do,container,false)


        return root
    }

}
