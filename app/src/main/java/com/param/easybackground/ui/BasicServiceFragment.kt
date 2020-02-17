package com.param.easybackground.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.param.easybackground.R
import com.param.easybackground.databinding.FragmentBasicserviceBinding
import com.param.easybackground.service.BasicService


class BasicServiceFragment : Fragment() {

    lateinit var binding : FragmentBasicserviceBinding
    lateinit var intent:Intent

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_basicservice,container,false)
        init()
        setActions()
        return binding.root
    }

    private fun init() {
        intent = Intent(activity,BasicService::class.java)
    }

    private fun setActions() {
        binding.button.setOnClickListener{
            activity?.startService(intent)
        }
    }


}