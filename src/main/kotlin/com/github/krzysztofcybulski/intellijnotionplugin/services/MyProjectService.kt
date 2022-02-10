package com.github.krzysztofcybulski.intellijnotionplugin.services

import com.intellij.openapi.project.Project
import com.github.krzysztofcybulski.intellijnotionplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
