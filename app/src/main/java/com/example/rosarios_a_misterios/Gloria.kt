package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit


/**
 * A simple [Fragment] subclass.
 * Use the [Gloria.newInstance] factory method to
 * create an instance of this fragment.
 */
class Gloria : Fragment(R.layout.fragment_gloria) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btnSiguientegG)


    }



    companion object {


        fun newInstance() =
            Gloria().apply {
                arguments = Bundle().apply {

                }
            }
    }
}