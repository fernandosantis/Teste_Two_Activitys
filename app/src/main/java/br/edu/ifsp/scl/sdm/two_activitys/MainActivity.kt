package br.edu.ifsp.scl.sdm.two_activitys

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.edu.ifsp.scl.sdm.two_activitys.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    companion object {
        var quantidade: Int = 0
    }

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditar.setOnClickListener {
            val intent = Intent(this, EditarActivity::class.java)
            quantidade = binding.txtQtd.text.toString().toInt()
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        binding.txtQtd.setText(quantidade.toString())
    }
}
