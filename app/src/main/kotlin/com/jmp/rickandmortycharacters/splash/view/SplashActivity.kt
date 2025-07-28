package com.jmp.rickandmortycharacters.splash.view

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.WindowCompat
import com.jmp.rickandmortycharacters.main.view.MainActivity
import com.jmp.rickandmortycharacters.splash.viewmodel.SplashViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

@SuppressLint("CustomSplashScreen")
class SplashActivity : ComponentActivity() {

    private val viewModel: SplashViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition { true }
        WindowCompat.setDecorFitsSystemWindows(window, false)

        viewModel.loadList(
            forceRemote = true,
            onResult = ::navigateToMainActivity
        )
    }

    private fun navigateToMainActivity() {
        val intent = Intent(this, MainActivity::class.java)

        startActivity(intent)
        finish()
    }
}
