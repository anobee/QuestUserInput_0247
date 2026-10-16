package com.example.questuserinput_0247.ui.theme

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.mutableStateOf
import java.lang.reflect.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment






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
        OutlinedTextField(
            value = TextNama,
            singleLine = true,
            shape = MaterialTheme.shapes.large,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {
                TextNama = it
            }
        )
        Row(){
            Gender.forEach{ item ->
                Row(modifier = Modifier.selectable(
                    selected = TextJK == item,
                    onClick = {TextJK =item}
                ),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = TextJK == item,
                        onClick = {
                            TextJK = item
                        })
                    Text(item)
                }

            }
        }

        OutlinedTextField(
            value = TextAlamat,
            singleLine = true,
            modifier = Modifier.width(250.dp),
            label = {Text(text = "Nama Lengkap")},
            onValueChange = {
                TextAlamat = it
            }
        )
    }




}

