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
 * Use the [MadreDeDios.newInstance] factory method to
 * create an instance of this fragment.
 */
class MadreDeDios : Fragment(R.layout.fragment_madre_de_dios) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boton = view.findViewById<Button>(R.id.btnSiguienteMdg)

        boton.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, OhJesus.newInstance())
            }
        }
    }


    companion object {

        fun newInstance() =
            MadreDeDios().apply {
                arguments = Bundle().apply {

                }
            }
    }
}