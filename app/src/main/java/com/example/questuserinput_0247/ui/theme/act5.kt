package com.example.questuserinput_0247.ui.theme

import androidx.compose.material3.rememberSearchBarState
import androidx.compose.runtime.mutableStateOf
import java.lang.reflect.Modifier



@composable
fun FormDataDiri(modifier: Modifier){
    var TextNama by remember{ mutableStateOf(value="") }
    var TextAlamat by remember{ mutableStateOf(value="") }
    var TextJK by remember{ mutableStateOf(value="") }
}

