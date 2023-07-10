package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [Gloria.newInstance] factory method to
 * create an instance of this fragment.
 */
class Gloria : Fragment(R.layout.fragment_gloria) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btn6)

        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MadreDeGracia.newInstance())
            }
        }
    }

    companion object {

        fun newInstance() =
            Gloria().apply {
                arguments = Bundle().apply {

                }
            }
    }
}