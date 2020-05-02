package com.covid.base.usecase

import com.covid.base.utils.Transformer
import io.reactivex.rxjava3.core.Observable

/**
 * [BaseUseCase] class represents the basic foundation for use case implementation,
 * Every use case will inherit this class, inorder to provide its own use case implementation.
 */
abstract class BaseUseCase<REQ, RES>(private val transformation: Transformer<RES>) {

    /**
     * [observe] this method will be overridden in the extended class to provide implementation for
     * providing observables to next level.
     */
    protected abstract fun observe(request: REQ? = null): Observable<RES>

    /**
     * [observable] method calls [observe] using the given transformation object to provide desired
     * observable for the given use case.
     */
    fun observable(request: REQ? = null): Observable<RES> = observe(request).compose(transformation)

}