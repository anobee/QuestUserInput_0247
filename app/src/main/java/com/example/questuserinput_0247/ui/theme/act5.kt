package com.example.questuserinput_0247.ui.theme

import android.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource


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

        HorizontalDivider(
            modifier = Modifier.padding(
                bottom =
                    dimensionResource(R.dimen.padding_medium,
                        top =dimensionResource(
                        id = R.dimen.padding_medium
                    )),
                thickness = dimensionResource(id = R.dimen.divider_tipis),
                color = Color.DarkGray
            )
        )

        Button(
            modifier = Modifier.fillMaxWidth(fraction = 1f)
            enabled = TextAlamat.isNotEmpty(),
            onClick = {
                Nama = TextNama
                Jenis = TextJK
                Alamat = TextAlamat
            }
        ) {
            Text(stringResource(id=R.string.submit))
        }
        HorizontalDivider(modifier = Modifier.padding(
            bottom =
                dimensionResource(R.dimen.padding_medium,
                    top =dimensionResource(
                        id = R.dimen.padding_medium
                    )),
            thickness = dimensionResource(id = R.dimen.divider_tipis),
            color = Color.DarkGray
        )
        )



    }




}

