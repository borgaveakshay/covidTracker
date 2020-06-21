package com.covidtracker.home.testData

import com.covidtracker.home.presentation.CountriesItem
import com.covidtracker.home.presentation.CovidSummary

object TestUtils {

    fun getCovidSummary(): CovidSummary {
        val covidSummary = CovidSummary()
        val countriesItem = CountriesItem(1,1,1,1, "India")
        val countriesItem2 = CountriesItem(1,1,1,1, "Australia")
        val countriesItem3 = CountriesItem(1,1,1,1, "China")
        covidSummary.countries = listOf(countriesItem, countriesItem2, countriesItem3)

        return covidSummary
    }
}