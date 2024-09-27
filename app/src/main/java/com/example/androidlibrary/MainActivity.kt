package com.example.androidlibrary

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.androidlibrary.ui.theme.AndroidLibraryTheme
import com.example.image_preview.ImagePreview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            AndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ImagePreview(
                        image = painterResource(id = R.drawable.kermit),
                    )
                }
            }
        }

    }
}