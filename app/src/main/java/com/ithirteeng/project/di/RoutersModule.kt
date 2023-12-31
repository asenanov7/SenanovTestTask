package com.ithirteeng.project.di

import com.ithirteeng.common.extensions.LOCAL_ROUTER
import com.ithirteeng.project.navigation.routers.DishesRouterImpl
import com.ithirteeng.project.navigation.routers.KitchensRouterImpl
import com.ithirteeng.project.navigation.routers.MainHostRouterImpl
import com.ithirteeng.project.navigation.routers.MainRouterImpl
import com.ithirteeng.features.category.presentation.DishesRouter
import com.ithirteeng.features.kitchens.presentation.KitchensRouter
import com.ithirteeng.features.main.presentation.MainRouter
import com.ithirteeng.features.mainhost.presentation.MainHostRouter
import org.koin.core.qualifier.named
import org.koin.dsl.module

val routersModule = module {
    factory<MainHostRouter> { MainHostRouterImpl(router = get()) }

    factory<MainRouter> { MainRouterImpl(router = get(named(LOCAL_ROUTER))) }
    factory<KitchensRouter> { KitchensRouterImpl(router = get(named(LOCAL_ROUTER))) }
    factory<DishesRouter> { DishesRouterImpl(router = get(named(LOCAL_ROUTER))) }

}