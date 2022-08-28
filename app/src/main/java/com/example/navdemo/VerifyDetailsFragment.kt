package com.example.navdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.NavArgs
import androidx.navigation.fragment.navArgs

class VerifyDetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
//        Retrieving data -
//        val name = arguments?.getString("name")
//        val mobileNumber = arguments?.getLong("mobile")

//      Passing data using safeargs. using safeargs is strongly recommended because it ensures type safety. Document - Use Safe Args to pass data with type safety
        val args : VerifyDetailsFragmentArgs by navArgs()
        val name = args.name
        val mobileNumber = args.mobile
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val mobile = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tvName.text = name
        mobile.text = mobileNumber.toString()
        return rootView
    }
}