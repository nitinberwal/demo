package com.nitinberwal.navi_assignment.model

import io.reactivex.Single
import retrofit2.http.GET

interface PullRequestApi {
      @GET("repos/nitinberwal/demo/pulls?state=closed")
    fun getPullRequest(): Single<List<PullRequest>>
}
