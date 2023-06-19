package com.ithirteeng.project.navigation

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router

fun createCicerone(): Cicerone<Router> =
    Cicerone.create()