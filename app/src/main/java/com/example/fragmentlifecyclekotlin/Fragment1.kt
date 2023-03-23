package com.example.fragmentlifecyclekotlin

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment

class Fragment1 : IOnBackPressed, Fragment() {

    private val COMMON_TAG = "CombinedLifeCycle"
    private val FRAGMENT_NAME = Fragment1::class.java.simpleName
    private val TAG = COMMON_TAG

    override fun onAttach(context: Context) {
        Log.i(TAG, "$FRAGMENT_NAME onAttach")
        Toast.makeText(activity, "I am on onAttach from Fragment1", Toast.LENGTH_SHORT).show()
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i(TAG, "$FRAGMENT_NAME onCreate")
        Toast.makeText(activity, "I am on onCreate from Fragment1", Toast.LENGTH_SHORT).show()
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        // Inflate the layout for this fragment
        //this is Basic one.
        Log.i(TAG, "$FRAGMENT_NAME onCreateView")
        Toast.makeText(activity, "I am on onCreateView from Fragment1", Toast.LENGTH_SHORT).show()

        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.i(TAG, "$FRAGMENT_NAME onActivityCreated")
        Toast.makeText(activity, "I am on onActivityCreated from Fragment1", Toast.LENGTH_SHORT)
            .show()
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.i(TAG, "$FRAGMENT_NAME onStart")
        Toast.makeText(activity, "I am on onStart from Fragment1", Toast.LENGTH_SHORT).show()
        super.onStart()
    }

    override fun onResume() {
        Log.i(TAG, "$FRAGMENT_NAME onResume")
        Toast.makeText(activity, "I am on onResume from Fragment1", Toast.LENGTH_SHORT).show()
        super.onResume()
    }

    override fun onPause() {
        Log.i(TAG, "$FRAGMENT_NAME onPause")
        Toast.makeText(activity, "I am on onPause from Fragment1", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Log.i(TAG, "$FRAGMENT_NAME onStop")
        Toast.makeText(activity, "I am on onStop from Fragment1", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onDestroyView() {
        Log.i(TAG, "$FRAGMENT_NAME onDestroyView")
        Toast.makeText(activity, "I am on onDestroyView from Fragment1", Toast.LENGTH_SHORT).show()
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.i(TAG, "$FRAGMENT_NAME onDestroy")
        Toast.makeText(activity, "I am on onDestroy from Fragment1", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

    override fun onDetach() {
        Log.i(TAG, "$FRAGMENT_NAME onDetach")
        Toast.makeText(activity, "I am on onDetach from Fragment1", Toast.LENGTH_SHORT).show()
        super.onDetach()
    }

    override fun onBackPressed(): Boolean {
        val intent = Intent(activity, MainActivity::class.java)
        startActivity(intent)
        return false
    }
}
