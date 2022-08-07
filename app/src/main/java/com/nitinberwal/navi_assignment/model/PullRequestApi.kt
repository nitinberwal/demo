package com.nitinberwal.navi_assignment.model

import com.nitinberwal.navi_assignment.model.PullRequest
import io.reactivex.Single
import retrofit2.http.GET

interface PullRequestApi {
      @GET("repos/prakashshuklahub/Pull-Request-GithubApi-Demo-App/pulls?state=closed")
    fun getPullRequest(): Single<List<PullRequest>>
}
