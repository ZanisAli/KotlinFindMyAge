package startup.softflix.com.startup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buFindAge.setOnClickListener()
        {
            //this code will run when button will be clicked
            val yearOfBirth:Int= textYearOfBirth.text.toString().toInt() //val because it will  never change , not varialbe
            if(yearOfBirth==0)
            {
                tvShowAge.text="Your entered year is not valid"
                return@setOnClickListener //return will not let program execute after this line
            }
            val currentYear= Calendar.getInstance().get(Calendar.YEAR)
            val myAge:Int= currentYear-yearOfBirth
            tvShowAge.text="Your age is $myAge years"



        }


    }
}
