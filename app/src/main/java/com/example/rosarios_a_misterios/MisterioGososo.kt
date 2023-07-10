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
 * Use the [MisterioGososo.newInstance] factory method to
 * create an instance of this fragment.
 */
class MisterioGososo : Fragment(R.layout.fragment_misterio_gososo) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btnRegGosozo = view.findViewById<Button>(R.id.btnRegGosozo)

        btnRegGosozo.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.contenedorFragmento, FrgMenuPrincipal.newInstance())
            }
        }
    }
        companion object {

        fun newInstance() =
            MisterioGososo().apply {
                arguments = Bundle().apply {

                }
            }
    }
}