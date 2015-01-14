package com.androidsnippets.wordpress.testfragments;

import android.os.Bundle;

import com.androidsnippets.wordpress.fragments.FragmentC1;
import com.androidsnippets.wordpress.fragmentutils.MyBaseFragmentActivity;

public class TabC extends MyBaseFragmentActivity
{
   @Override
   protected void onCreate(Bundle savedInstanceState) 
   {
	   super.onCreate(savedInstanceState);
	   
	   FragmentC1 fragmentC1 = new FragmentC1(R.layout.fragment_layout_c1);
       Bundle bundle = new Bundle();
       bundle.putInt("fragmentLayoutId", R.layout.fragment_layout_c1);
       fragmentC1.setArguments(bundle);
	   navigateTo(fragmentC1,fragmentC1.getClass().getSimpleName());
   }
   
    @Override
	protected void onDestroy() 
    {
		super.onDestroy();
	}
    
    @Override
    protected void onResume() 
    {
       super.onResume();
    }
}