package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.fragment.app.commit


class FrgMenuPrincipal : Fragment(R.layout.fragment_menu_principal) {
    // TODO: Rename and change types of parameters
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton =view.findViewById<Button>(R.id.button)

        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MisterioDoloroso1.newInstance())
            }
        }
    }
}