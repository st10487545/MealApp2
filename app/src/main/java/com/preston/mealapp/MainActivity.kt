package com.preston.mealapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }//code starts here
        val resetButton: Button = findViewById(R.id.btnReset)
        val submitButton: Button = findViewById(R.id.btnSubmit)
        val foodSuggestion: TextView = findViewById(R.id.tvFoodSuggestion)
        val userInput : EditText = findViewById(R.id.timesOfDay)

        resetButton.setOnClickListener {
            userInput.text.clear()
            foodSuggestion.text = ""
            userInput.hint = "Examples:Morning,Mid-Morning,Afternoon,Mid-afternoon,Dinner,Late-night"
        }
        submitButton.setOnClickListener {
            val timePeriod = userInput.text.toString().trim().lowercase()

            val timePeriodLower = timePeriod.lowercase() // Convert to lowercase for case-insensitive matching

            if (timePeriodLower == "morning") {
                foodSuggestion.text = "Breakfast Choices:\n- Cereal\n- Omelette\n- Smoothie\n- Toast & Jam"
            } else if (timePeriodLower == "mid-morning") {
                foodSuggestion.text = "Brunch Selections:\n- Croissants\n- Fruit Bowl\n- Yogurt & Granola\n- Tea & Biscuits"
            } else if (timePeriodLower == "afternoon") {
            } else if (timePeriodLower == "afternoon") {
                foodSuggestion.text = "Lunch Ideas:\n- Grilled Cheese\n- Club Sandwich\n- Chicken Wrap\n- Caesar Salad"
            } else if (timePeriodLower == "mid-afternoon") {
                foodSuggestion.text = "Snack Options:\n- Muffins\n- Nut Bars\n- Popcorn\n- Crackers & Cheese"
            } else if (timePeriodLower == "dinner") {
                foodSuggestion.text = "Dinner Specials:\n- Grilled Salmon\n- Lasagna\n- BBQ Chicken\n- Vegetable Stir Fry"
            } else if (timePeriodLower == "late-night") {
                foodSuggestion.text = "Midnight Snacks:\n- Ice Cream\n- Brownies\n- Hot Chocolate\n- Pudding"
            } else {
                foodSuggestion.text = "Invalid Input. Please enter a valid time of day: Morning, Mid-morning, Afternoon, Mid-afternoon, Dinner, Late-night."
            }
            }
        }
        }
    









        


