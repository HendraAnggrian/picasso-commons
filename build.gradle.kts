buildscript {
    repositories {
        google()
        jcenter()
    }
    dependencies {
        classpath(android())
        classpath(kotlin("gradle-plugin", kotlinVersion))
        classpath(dokka())
        classpath(gitPublish())
        classpath(bintrayRelease())
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
    tasks.withType<Javadoc> {
        isEnabled = false
    }
}

tasks {
    "clean"(Delete::class) {
        delete(rootProject.buildDir)
    }
    "wrapper"(Wrapper::class) {
        gradleVersion = "4.4.1"
    }
}

/** bintray upload snippet
./gradlew bintrayUpload -PdryRun=false -PbintrayUser=hendraanggrian -PbintrayKey=
 */