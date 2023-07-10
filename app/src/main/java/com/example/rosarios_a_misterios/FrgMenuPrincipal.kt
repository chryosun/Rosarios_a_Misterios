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
        val boton =view.findViewById<Button>(R.id.btnDoloroso)
        val btn_luminoso = view.findViewById<Button>(R.id.btnLuminoso)
        val btnGosozo = view.findViewById<Button>(R.id.btnGosozo)
        val btnGlorioso = view.findViewById<Button>(R.id.btnGlorioso)



        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MisterioDoloroso1.newInstance())
            }
        }

        btn_luminoso.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, misterio_luminoso.newInstance())
            }
        }

        btnGosozo.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MisterioGososo.newInstance())
            }
        }

        btnGlorioso.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, MisterioGlorioso.newInstance())
            }
        }
    }

    companion object {


        fun newInstance() =
            FrgMenuPrincipal().apply {
                arguments = Bundle().apply {

                }
            }
    }
}