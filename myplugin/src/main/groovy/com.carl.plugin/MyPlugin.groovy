package  com.carl.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class MyPlugin implements Plugin<Project> {

    void apply(Project project) {
        println("========================")
        println("hello gradle plugin!");
        println("========================");
    }
}