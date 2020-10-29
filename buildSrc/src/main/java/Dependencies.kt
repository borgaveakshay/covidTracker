object Apps {
    const val compileSdk = 29
    const val minSdk = 22
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val buildToolsVersion = "29.0.2"

}

object Versions {
    const val gradle = "3.6.2"
    const val hilt = "2.28-alpha"
    const val kotlin = "1.3.71"
    const val appcompat = "1.1.0"
    const val androidx = "1.1.0"
    const val constraintLayout = "1.1.3"
    const val retrofit = "2.8.1"
    const val gsonConverter = "2.8.1"
    const val okhttp = "4.6.0"
    const val rxAndroid = "3.0.0"
    const val rxJava = "3.0.3"
    const val viewModel = "2.2.0"
    const val liveData = "2.2.0"
    const val navigation = "2.3.0-alpha06"
    const val dagger = "2.27"
    const val gson = "2.8.6"

    /* test */
    const val junit = "4.12"
    const val androidXExtension = "1.1.1"
    const val androidXExpresso = "3.2.0"
    const val roboletric = "4.3"
    const val mockito = "3.3.3"
    const val liveDataTestHelper = "2.1.0"
    const val testCore = "1.0.0"
    const val testRunner = "1.1.0"
    const val mockitoAll = "1.10.19"


}

object Android {

    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.viewModel}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.liveData}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val navigationFragment =
        "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    const val navigationUI = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    const val dynamicNavigation =
        "androidx.navigation:navigation-dynamic-features-fragment:${Versions.navigation}"

}

object Dagger {
    const val dagger = "com.google.dagger:dagger:${Versions.dagger}"
    const val compiler = "com.google.dagger:dagger-compiler:${Versions.dagger}"
    const val android = "com.google.dagger:dagger-android:${Versions.dagger}"
    const val androidSupport = "com.google.dagger:dagger-android-support:${Versions.dagger}"
    const val annotationProcessor = "com.google.dagger:dagger-android-processor:${Versions.dagger}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
}

object Rx {
    const val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"
    const val rxJava = "io.reactivex.rxjava3:rxjava:${Versions.rxJava}"
}


object Core {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val androidCore = "androidx.core:core-ktx:${Versions.androidx}"
}

object Network {
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val gsonConvertor = "com.squareup.retrofit2:converter-gson:${Versions.gsonConverter}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Versions.okhttp}"
    const val gson = "com.google.code.gson:gson:${Versions.gson}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
    const val androidXTestExtension = "androidx.test.ext:junit:${Versions.androidXExtension}"
    const val androidXExpresso =
        "androidx.test.espresso:espresso-core:androidx.test.espresso:espresso-core:${Versions.androidXExpresso}"
    const val roboletric = "org.robolectric:robolectric:${Versions.roboletric}"
    const val mockito = "org.mockito:mockito-android:${Versions.mockito}"
    const val mokitoCore = "org.mockito:mockito-core:${Versions.mockito}"
    const val mokitoAll = "org.mockito:mockito-all:${Versions.mockitoAll}"
    const val liveDataTestHelpers = "androidx.arch.core:core-testing:${Versions.liveDataTestHelper}"
    const val navigation = "androidx.navigation:navigation-testing:${Versions.navigation}"
    const val testCore = "androidx.test:core:${Versions.testCore}"
    const val testRunner = "androidx.test:runner:${Versions.testRunner}"

}