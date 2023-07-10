package com.example.rosarios_a_misterios

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.commit

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [Avemaria.newInstance] factory method to
 * create an instance of this fragment.
 */
class Avemaria : Fragment(R.layout.fragment_avemaria) {
    private var contador = 1
    private lateinit var txtavemaria : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val botonSiguiente = view.findViewById<Button>(R.id.btnSiguiente4)
        txtavemaria = view.findViewById(R.id.textView7)

        actualizarLabel()

        botonSiguiente.setOnClickListener{
            if (contador < 10) {
                contador++
                actualizarLabel()
            } else {
                requireActivity().supportFragmentManager.commit {
                    replace(R.id.contenedorFragmento, Gloria.newInstance())
                }
            }
        }
    }

    private fun actualizarLabel() {
        txtavemaria.text = "$contador° Avemaria"
    }

    companion object {

        fun newInstance() =
            Avemaria().apply {
                arguments = Bundle().apply {

                }
            }
    }
}