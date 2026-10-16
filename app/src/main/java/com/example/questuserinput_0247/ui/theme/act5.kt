package com.example.questuserinput_0247.ui.theme

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.mutableStateOf
import java.lang.reflect.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp





@Composable
fun FormDataDiri(modifier: Modifier){
    var TextNama by remember {mutableStateOf(value="") }
    var TextAlamat by remember {mutableStateOf(value="") }
    var TextJK by remember {mutableStateOf(value="") }

    var Nama by remember { mutableStateOf(value="") }
    var Alamat by remember { mutableStateOf(value="") }
    var Jenis by remember { mutableStateOf(value="") }
    val Gender: List<String> = listOf("laki-laki","Perempuan")
    Column(modifier = Modifier.padding(top = 50.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        OulinedTextField(
            value = textNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = modifier.width(250.dp),

        )
    }




}

