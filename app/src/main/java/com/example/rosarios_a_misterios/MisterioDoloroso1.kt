package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit


/**
 * A simple [Fragment] subclass.
 * Use the [MisterioDoloroso1.newInstance] factory method to
 * create an instance of this fragment.
 */
class MisterioDoloroso1 : Fragment(R.layout.fragment_misterio_doloroso1) {
    // TODO: Rename and change types of parameters
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonSiguiente = view.findViewById<Button>(R.id.btnSiguiente)

        botonSiguiente.setOnClickListener{
            requireActivity().supportFragmentManager.commit{
                replace(R.id.contenedorFragmento, FrgMenuPrincipal.newInstance())
            }
        }


    }

    companion object {
        fun newInstance() =
            MisterioDoloroso1().apply {
                arguments = Bundle().apply {

                }
            }
    }
}