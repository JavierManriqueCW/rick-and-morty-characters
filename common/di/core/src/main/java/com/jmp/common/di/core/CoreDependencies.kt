package com.jmp.common.di.core

import com.jmp.common.diprovider.DependencyInjectorModules
import com.jmp.data.di.DataDependencies
import com.jmp.domain.di.DomainDependencies
import org.koin.core.module.Module

object CoreDependencies : DependencyInjectorModules {
    override val modules: List<Module>
        get() = listOf(
            DomainDependencies.modules,
            DataDependencies.modules
        ).flatten()
}
