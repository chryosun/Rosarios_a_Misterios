package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit


/**
 * A simple [Fragment] subclass.
 * Use the [PadreNuestro.newInstance] factory method to
 * create an instance of this fragment.
 */
class PadreNuestro : Fragment(R.layout.fragment_padre_nuestro) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btnSiguiente2)

        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, Avemaria.newInstance())
            }
        }
    }


    companion object {
        fun newInstance() =
            PadreNuestro().apply {
                arguments = Bundle().apply {

                }
            }
    }
}