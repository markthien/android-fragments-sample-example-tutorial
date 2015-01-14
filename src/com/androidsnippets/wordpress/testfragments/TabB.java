package com.androidsnippets.wordpress.testfragments;

import android.os.Bundle;

import com.androidsnippets.wordpress.fragments.FragmentB1;
import com.androidsnippets.wordpress.fragmentutils.MyBaseFragmentActivity;

public class TabB extends MyBaseFragmentActivity
{
   @Override
   protected void onCreate(Bundle savedInstanceState) 
   {
	   super.onCreate(savedInstanceState);
	   FragmentB1 fragmentB1 = new FragmentB1(R.layout.fragment_layout_b1);
       Bundle bundle = new Bundle();
       bundle.putInt("fragmentLayoutId", R.layout.fragment_layout_b1);
       fragmentB1.setArguments(bundle);
	   navigateTo(fragmentB1,fragmentB1.getClass().getSimpleName());
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