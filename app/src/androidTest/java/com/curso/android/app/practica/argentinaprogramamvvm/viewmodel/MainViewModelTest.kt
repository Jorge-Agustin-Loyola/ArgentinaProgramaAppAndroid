package com.curso.android.app.practica.argentinaprogramamvvm.view



import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.argentinaprogramamvvm.R
import org.junit.Assert.*
import org.junit.Rule


import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest{

    @get:Rule
    var rule : ActivityScenarioRule<*> = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun mainActivity_btnComparar(){
        Espresso.onView(
            ViewMatchers.withId(R.id.btnComparar)
        ).perform(
            ViewActions.click()
        )

        Espresso.onView(
            ViewMatchers.withId(R.id.tvResultado)
        ).check(
            ViewAssertions.matches(
                ViewMatchers.withText("Los strings SON iguales")
            )
        )

    }

}


