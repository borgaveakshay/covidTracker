package com.covidtracker.home.domain

import com.covid.base.usecase.BaseUseCase
import com.covid.base.utils.Transformer
import com.covidtracker.home.data.CovidSummaryRepository
import com.covidtracker.home.presentation.CovidSummary
import io.reactivex.rxjava3.core.Observable

class CovidSummaryUseCase(
    transformation: Transformer<CovidSummary>,
    private val repository: CovidSummaryRepository
) : BaseUseCase<Void, CovidSummary>(transformation) {

    override fun observe(request: Void?): Observable<CovidSummary> = repository.getSummary()
}