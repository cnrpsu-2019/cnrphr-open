package com.cnr.phr_android.dashboard.monitor.supplementary

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import com.cnr.phr_android.R
import com.cnr.phr_android.databinding.FragmentAboutBinding

/**
 * Created by theethawat@cnr - 2020-06-13
 * */


class AboutFragment: Fragment(){

    private lateinit var binding:FragmentAboutBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about,container,false)
        return  binding.root
    }
}