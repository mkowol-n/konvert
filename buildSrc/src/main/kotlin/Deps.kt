@file:Suppress("UnusedReceiverParameter")

import org.gradle.api.artifacts.dsl.DependencyHandler
import org.gradle.kotlin.dsl.kotlin

val DependencyHandler.kotlinTest get() = kotlin("test")
val DependencyHandler.kotlinReflect get() = kotlin("reflect")
val DependencyHandler.kotlinStdlib get() = kotlin("stdlib-jdk8")
val DependencyHandler.kotlinCompilerEmbeddable get() = kotlin("compiler-embeddable")

val DependencyHandler.kotlinCompileTesting get() = "dev.zacsweers.kctfork:core:${Versions.kotlinCompileTesting}"
val DependencyHandler.kotlinCompileTestingKsp get() = "dev.zacsweers.kctfork:ksp:${Versions.kotlinCompileTesting}"
val DependencyHandler.symbolProcessing get() = "com.google.devtools.ksp:symbol-processing:${Versions.kotlin}-${Versions.ksp}"
val DependencyHandler.symbolProcessingApi get() = "com.google.devtools.ksp:symbol-processing-api:${Versions.kotlin}-${Versions.ksp}"

val DependencyHandler.autoServiceAnnotations get() = "com.google.auto.service:auto-service-annotations:${Versions.autoServiceAnnotations}"
val DependencyHandler.autoServiceKsp get() = "dev.zacsweers.autoservice:auto-service-ksp:${Versions.autoServiceKsp}"

val DependencyHandler.orgReflections get() = "org.reflections:reflections:${Versions.orgReflections}"

val DependencyHandler.kotlinPoet get() = "com.squareup:kotlinpoet:${Versions.kotlinPoet}"
val DependencyHandler.kotlinPoetKsp get() = "com.squareup:kotlinpoet-ksp:${Versions.kotlinPoet}"
val DependencyHandler.kotlinxCollectionsImmutable get() = "org.jetbrains.kotlinx:kotlinx-collections-immutable:${Versions.kotlinxCollectionsImmutable}"

object Versions {
    const val kotlin = "1.9.22" // has to match buildSrc/gradle.properties
    const val ksp = "1.0.16"

    /**
     * com.google.auto.service:auto-service-annotations
     */
    const val autoServiceAnnotations = "1.1.1"

    /**
     * dev.zacsweers.autoservice:auto-service-ksp
     */
    const val autoServiceKsp = "1.1.0"

    /**
     * org.reflections:reflections
     */
    const val orgReflections = "0.10.2"

    /**
     * com.github.dpaukov:combinatoricslib3
     */
    const val combinatoricslib3 = "3.3.3"

    /**
     * net.steppschuh.markdowngenerator:markdowngenerator
     */
    const val markdownGenerator = "1.3.1.1"

    const val kotlinCompileTesting = "0.4.0"

    const val kotlinPoet = "1.16.0"
    const val jUnit = "5.10.1"
    const val kotlinxCollectionsImmutable = "0.3.7"
}
