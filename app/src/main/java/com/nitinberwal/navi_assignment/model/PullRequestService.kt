package com.nitinberwal.navi_assignment.model

import com.nitinberwal.navi_assignment.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject

//Service used for api call
class PullRequestService {

    @Inject
    lateinit var api: PullRequestApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getPullRequest(): Single<List<PullRequest>> {
        return api.getPullRequest()
    }
}