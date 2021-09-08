package com.arajshow.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.ArithmeticException

class MainActivity : AppCompatActivity() {

    var lastNumeric = false
    var lastdot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDigit(view: View){
    result.append((view as Button).text)
        lastNumeric = true

        if(result.text.contains("6204714782")) result.text ="Arajshow"
        if(result.text.contains("9736672200")) result.text ="Chhutki noob"
        if(result.text.contains("7479768251")) result.text ="Aman Jii\uD83C\uDF1A"
        if(result.text.contains("9459328843")) result.text ="Bantu noob"
        if(result.text.contains("9142187344")) result.text ="Bacchi hai tu abhi"
        if(result.text.contains("9982857597")) result.text ="Palu"
        if(result.text.contains("7412917615")) result.text ="Santilal kya hal-chal"
        if(result.text.contains("9559042657")) result.text ="submit michri"
        if(result.text.contains("7650921500")) result.text ="Sambhu noob"
        if(result.text.contains("7807859959")) result.text ="Billi"
        if(result.text.contains("9949607761")) result.text ="Duru chapri"
        if(result.text.contains("9693167170")) result.text ="aur L.abhishek kaisa hai"
        if(result.text.contains("9882251050")) result.text ="Bhootni\uD83D\uDC7B"
        if(result.text.contains("9949607761")) result.text ="Ravi babu"
        if(result.text.contains("8219090868")) result.text ="alpha man KARAN"
        if(result.text.contains("8894112312")) result.text ="amar-vir shera "
        if(result.text.contains("7355292927")) result.text ="Kavya noob"
        if(result.text.contains("6204939940")) result.text ="Raushan babu"
        if(result.text.contains("8894435721")) result.text ="Digu Noob"
        if(result.text.contains("8091734849")) result.text ="Kshiti Noob"
        if(result.text.contains("8929467816")) result.text ="pranjal hard-coder"
        if(result.text.contains("7981028485")) result.text ="Aarti Piro"
        if(result.text.contains("6301810812")) result.text ="Abhinay Bro\uD83C\uDF7B"
        if(result.text.contains("7300725962")) result.text ="Bhanu piro\uD83C\uDF7B"
        if(result.text.contains("7876142757")) result.text ="aur Himanshu kya halchal"
        if(result.text.contains("7267888021")) result.text ="Kartika Pir0\uD83C\uDF7B"
        if(result.text.contains("8352965490")) result.text ="Mohit Minathi"
        if(result.text.contains("9984476171")) result.text ="Priyansh00 \uD83D\uDE02"
        if(result.text.contains("8894293090")) result.text ="Sarthak"
        if(result.text.contains("7590082188")) result.text ="Priyanshu Gupta ji"
        if(result.text.contains("9116899468")) result.text ="Deepak Bro  Piro-Coder"
        if(result.text.contains("7018388159")) result.text ="Suryanshu Bro\uD83C\uDF7B"
        if(result.text.contains("7021229343")) result.text ="Welcome Vandana Noob"
        if(result.text.contains("7073536296")) result.text ="Rohit Roy Jii"
        if(result.text.contains("8239290993")) result.text ="Vandana ji"
        if(result.text.contains("9587028021")) result.text ="Meghu Chapri"
        if(result.text.contains("7493845770")) result.text ="hero no. 1"
        if(result.text.contains("8789807387")) result.text ="Aastha Jahri"
        if(result.text.contains("9752198837")) result.text ="gaurav \uD83D\uDCA9"
        if(result.text.contains("8252315050")) result.text ="Kajri"
        if(result.text.contains("7206637018")) result.text ="Lovkesh Piro"
        if(result.text.contains("9798284411")) result.text ="Nitish Jii"
        if(result.text.contains("6398454025")) result.text ="Pratiksha \uD83C\uDF1A\uD83C\uDF1A"
        if(result.text.contains("82196 86632")) result.text ="Pankaj Tripathi"
        if(result.text.contains("75054 64386")) result.text ="Tara Devi"
        if(result.text.contains("81714 33933")) result.text ="Oashvi Pandit-ji"
        if(result.text.contains("73729 98484")) result.text ="Nayak Sahab"
        if(result.text.contains("9435592596")) result.text ="Jain Bhaiya"


    }

    fun onEqual(view: View){
        if(lastNumeric){
            var resultvalue = result.text.toString()
            var prefix =""

            try {
                if(resultvalue.startsWith("-")){
                    prefix ="-"
                    resultvalue = resultvalue.substring(1)
                }

                if(resultvalue.contains("-")){
                    val splitvalue = resultvalue.split("-")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    if(!prefix.isEmpty()){
                        one = prefix +one
                    }
                    result.text =  removezero((one.toDouble().toBigDecimal() - two.toDouble().toBigDecimal()).toString())
                }
            }catch ( e : ArithmeticException){
                e.printStackTrace()
            }

            try {
                if(resultvalue.contains("+")){
                    var splitvalue = resultvalue.split("+")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    result.text =  removezero((one.toDouble() + two.toDouble()).toString())

                }

            }catch ( e : ArithmeticException){
                e.printStackTrace()
            }

            try {
                if(resultvalue.contains("*")){
                    var splitvalue = resultvalue.split("*")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    result.text =  removezero((one.toDouble() * two.toDouble()).toString())

                }

            }catch ( e : ArithmeticException){
                e.printStackTrace()
            }

            try {
                if(resultvalue.contains("/")){
                    var splitvalue = resultvalue.split("/")

                    var one = splitvalue[0]
                    var two = splitvalue[1]

                    result.text =  removezero((one.toDouble() / two.toDouble()).toString())

                }

            }catch ( e : ArithmeticException){
                e.printStackTrace()
            }
        }
    }

    fun removezero(ans : String) : String{
        var value = ans
        if(ans.contains(".0"))
            value = ans.substring(0, ans.length - 2)
            //98.0 then this will remove last two index make it 99 only
            return value
    }

    fun onOperator(view: View){
        if(lastNumeric && !isOperatorAdd(result.text.toString())){
            result.append((view as Button).text)
            lastNumeric = false
        }
    }

    private fun isOperatorAdd(value : String) : Boolean{
        return if(value.startsWith("-")) {
            false
        }else{
            value.contains("/") ||value.contains("*") || value.contains("+") ||value.contains("-")
        }
    }

    fun onClear(view: View){
        result.text=""
        lastNumeric = false
        lastdot = false
    }

    fun onDecimal(view: View){
        if(lastNumeric && !lastdot){
            result.append(".")
            lastdot = true
        }
    }
}