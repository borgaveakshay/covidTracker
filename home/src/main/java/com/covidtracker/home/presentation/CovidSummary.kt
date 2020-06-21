package com.covidtracker.home.presentation

import com.google.gson.annotations.SerializedName


data class CovidSummary(

	@SerializedName("Countries")
	var countries: List<CountriesItem?>? = null,

	@SerializedName("Global")
	var global: Global? = null,

	@SerializedName("Date")
	var date: String? = null
)

data class CountriesItem(

	@SerializedName("NewRecovered")
	var newRecovered: Int? = null,

	@SerializedName("NewDeaths")
	var newDeaths: Int? = null,

	@SerializedName("TotalRecovered")
	var totalRecovered: Int? = null,

	@SerializedName("TotalConfirmed")
	var totalConfirmed: Int? = null,

	@SerializedName("Country")
	var country: String? = null,

	@SerializedName("CountryCode")
	var countryCode: String? = null,

	@SerializedName("Slug")
	var slug: String? = null,

	@SerializedName("NewConfirmed")
	var newConfirmed: Int? = null,

	@SerializedName("TotalDeaths")
	var totalDeaths: Int? = null,

	@SerializedName("Date")
	var date: String? = null
)

data class Global(

	@SerializedName("NewRecovered")
	var newRecovered: Int? = null,

	@SerializedName("NewDeaths")
	var newDeaths: Int? = null,

	@SerializedName("TotalRecovered")
	var totalRecovered: Int? = null,

	@SerializedName("TotalConfirmed")
	var totalConfirmed: Int? = null,

	@SerializedName("NewConfirmed")
	var newConfirmed: Int? = null,

	@SerializedName("TotalDeaths")
	var totalDeaths: Int? = null
)
