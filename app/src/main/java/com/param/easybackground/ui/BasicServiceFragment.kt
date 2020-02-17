package com.param.easybackground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.param.easybackground.R
import com.param.easybackground.databinding.FragmentBasicserviceBinding


class BasicServiceFragment : Fragment() {

    lateinit var binding : FragmentBasicserviceBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_basicservice,container,false)
        setActions()
        return binding.root
    }

    private fun setActions() {
        binding.button.setOnClickListener{
            //TODO start service

        }
    }


}