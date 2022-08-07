package com.nitinberwal.navi_assignment.di

import com.nitinberwal.navi_assignment.model.PullRequestService
import com.nitinberwal.navi_assignment.viewmodel.PullRequestViewModel
import dagger.Component



@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: PullRequestService)

    fun inject(viewModel: PullRequestViewModel)
}