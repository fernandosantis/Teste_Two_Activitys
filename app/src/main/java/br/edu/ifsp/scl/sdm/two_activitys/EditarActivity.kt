package br.edu.ifsp.scl.sdm.two_activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.edu.ifsp.scl.sdm.two_activitys.databinding.ActivityEditarBinding
import br.edu.ifsp.scl.sdm.two_activitys.databinding.ActivityMainBinding

class EditarActivity : AppCompatActivity() {

    private lateinit var bindingEdit: ActivityEditarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bindingEdit = ActivityEditarBinding.inflate(layoutInflater)
        setContentView(bindingEdit.root)

        supportActionBar?.title = "Editar"

        bindingEdit.txtQtd.setText(MainActivity.quantidade.toString())


        bindingEdit.btnSalvar.setOnClickListener {
            MainActivity.quantidade = bindingEdit.txtQtd.text.toString().toInt()
            setResult(RESULT_OK, Intent())
            finish()
        }

        bindingEdit.btnCancelar.setOnClickListener {
            setResult(RESULT_CANCELED, Intent())
            finish()
        }


    }
}