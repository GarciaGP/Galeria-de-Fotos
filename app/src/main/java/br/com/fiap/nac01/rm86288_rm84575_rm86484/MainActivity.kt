package br.com.fiap.nac01.rm86288_rm84575_rm86484

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    lateinit var imgDisplay: ImageView
    private var posicao = 0

    private val imgs = intArrayOf(
            R.drawable.p0,
            R.drawable.p1,
            R.drawable.p2,
            R.drawable.p3,
            R.drawable.p4,
            R.drawable.p5,
            R.drawable.p6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgDisplay = findViewById(R.id.imgGaleria01)

    }

    fun navegar(view: View) {
        try {

            validar(view);

            when (view.id) {
                R.id.btnProx -> posicao++
                R.id.btnVoltar -> posicao--
            }

            imgDisplay.setImageResource(imgs[posicao])

            Toast.makeText(this,
                    "Imagem: ${posicao + 1}",
                    Toast.LENGTH_SHORT
            ).show()


        } catch (e: Exception) {
            Toast.makeText(this,
                    e.message,
                    Toast.LENGTH_SHORT
            ).show()
        }

    }

    fun validar(view: View) {
        if (view.id == R.id.btnProx) {
            if (posicao == imgs.size -1)
                throw Exception("Não há mais imagens para exibir")
        } else {
            if (posicao == 0) {
                throw Exception("Não há imagens antes dessa!")
            }
        }
    }

}