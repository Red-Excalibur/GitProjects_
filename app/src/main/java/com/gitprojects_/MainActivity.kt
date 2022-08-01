package com.gitprojects_

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"kotlin to Github",Toast.LENGTH_SHORT).show()


        Toast.makeText(this,"kotlin to Github for the second time",Toast.LENGTH_SHORT).show()

        //a third update
        Toast.makeText(this,"kotlin to Github for the third time",Toast.LENGTH_SHORT).show()
        
        //forth test
        Toast.makeText(this,"kotlin from Github for the first time",Toast.LENGTH_SHORT).show()
        



    }
}
