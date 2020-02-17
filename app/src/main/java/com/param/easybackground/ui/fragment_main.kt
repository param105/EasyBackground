package com.param.easybackground.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.param.easybackground.R
import com.param.easybackground.databinding.FragmentMainBinding

class MainFragment: Fragment(){

    lateinit var binding : FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_main,container,false)

        setClickActions()
        return binding.root
    }


    private fun setClickActions() {
        binding.btnSimpleService.setOnClickListener{
            findNavController().navigate(R.id.action_mainFragment_to_basicServiceFragment) }

    }
}