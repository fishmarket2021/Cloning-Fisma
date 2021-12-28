package com.fisma.marketplacefisma.ui.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.fisma.marketplacefisma.R
import com.fisma.marketplacefisma.databinding.ActivityLoginBinding
import com.fisma.marketplacefisma.databinding.FragmentDashboardBinding
import com.fisma.marketplacefisma.util.Prefs
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.logging.LogManager

class LoginActivity : AppCompatActivity() {

    private val viewModel : LoginViewModel by viewModel()

    private var _binding: ActivityLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setData()
    }

    fun setData(){
        viewModel.text.observe(this,{
            binding.edtEmail.setText(it)
        })
        binding.btnMasuk.setOnClickListener{
            viewModel.ubahData()
        }
    }

    fun testing(){
        val s = Prefs(this)
        if (s.getIsLogin()){
            binding.tvStatus.text = "SUDAH LOGIN"
        }else binding.tvStatus.text = "BELUM LOGIN"

        binding.btnLogin.setOnClickListener {
            s.setIsLogin(true)
            onBackPressed()
        }

        binding.btnLogout.setOnClickListener {
            s.setIsLogin(false)
            onBackPressed()
        }

        Log.d("RESPON","PESAN SINGKAT")
    }

}