package com.example.login.LoginScreen

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.wanderwisely.R
import com.example.wanderwisely.viewmodel.LoginViewModel

@Composable
fun LoginScreen(viewModel: LoginViewModel){
    val errorMessage by viewModel.errorMessage.observeAsState()

    Row(
        modifier = Modifier
            .fillMaxSize()
    ){
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1f)
        ){
            Image(painter = painterResource(id = R.drawable.background),
                contentDescription = "background",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.fillMaxSize())
        }
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1.7f)
        ) {
            val configuration = LocalConfiguration.current
            when (configuration.orientation) {
                Configuration.ORIENTATION_LANDSCAPE -> {
                    Row (modifier = Modifier.fillMaxSize().weight(1f)){
                        Header(Modifier.padding(start = 20.dp))
                        Body(Modifier.padding(start = 5.dp), viewModel)
                        Footer(Modifier.fillMaxWidth())
                    }
                }
                else -> {
                    Column (modifier = Modifier.fillMaxHeight().weight(1f)){
                        Header(Modifier.padding(start = 20.dp))
                        Body(Modifier.padding(start = 20.dp), viewModel)
                    }
                    Footer(Modifier.fillMaxWidth())
                }
            }


        }
    }

    if (!errorMessage.isNullOrBlank()) {
        // Display Toast if there's an error message
        Toast.makeText(LocalContext.current, errorMessage, Toast.LENGTH_SHORT).show()

        viewModel.clearError()
    }
}