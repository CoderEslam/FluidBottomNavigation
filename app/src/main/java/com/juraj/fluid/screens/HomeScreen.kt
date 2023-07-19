package com.juraj.fluid.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.navigation.NavController


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun HomeScreen(
    navController: NavController
) {

    Scaffold {

        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

            Text(
                text = "Home",
                textAlign = TextAlign.Center
            )

        }

    }

}