package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit


/**
 * A simple [Fragment] subclass.
 * Use the [misterio_luminoso.newInstance] factory method to
 * create an instance of this fragment.
 */
class misterio_luminoso : Fragment(R.layout.fragment_misterio_luminoso) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnRegresarLuminoso = view.findViewById<Button>(R.id.btnREGRESAR_luminoso)

        btnRegresarLuminoso.setOnClickListener{
            requireActivity().supportFragmentManager.commit{
                replace(R.id.contenedorFragmento, FrgMenuPrincipal.newInstance())
            }
        }
    }

    companion object {

        fun newInstance() =
            misterio_luminoso().apply {
                arguments = Bundle().apply {

                }
            }
    }
}