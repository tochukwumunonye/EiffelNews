# EiffelNews
A news Application built with offline-First Architecture



## Preview
<img src="https://user-images.githubusercontent.com/61085272/110530766-1e74c000-811b-11eb-9b9c-4c844067aa69.jpg" width="33%" /> <img src="https://user-images.githubusercontent.com/61085272/110530798-25033780-811b-11eb-8764-215f992ca14b.jpg" width="33%" /> 
<img src="https://user-images.githubusercontent.com/61085272/110530835-2af91880-811b-11eb-97cb-6a2886b7db68.jpg" width="33%"/> <img src="/previews/screenshot_3.png" width="33%"/>


EiffelNews is a demo application that uses MVVM pattern and Android Jetpack: the Pagging 3 library with a backend API, Saved State module for ViewModel, LiveData, ViewBinding, Room, Dagger-Hilt and Navigations Components. The app fetches data from the network with use of Retrofit integrating persisted data in the database via repository pattern. The app also uses and Kotlin Coroutines + Flow. Eiffel News functions efficiently even when network is flaky.

## Tech stack & Open-source libraries
### Jetpack components:</b>
  - Paging 3 sets up a Repository that will use the local database to page in data for the UI and also back-fill the database from the network as the user reaches to the end of the data in the database.
  - Room Persistence - Access app's SQLite database with in-app objects and compile-time checks.
  - ViewBinding - allows to more easily write code that interacts with views and replaces ```findViewById```.
  - Saved State module for ViewModel data that survives background process restart.
  - Lifecycles - Create a UI that automatically responds to lifecycle events.
  - SafeArgs for navigating and passing data between fragments.
  - Room - Access app's SQLite database with in-app objects and compile-time checks.
  
* [Android Jetpack](https://developer.android.com/jetpack/?gclid=Cj0KCQjwhJrqBRDZARIsALhp1WQBmjQ4WUpnRT4ETGGR1T_rQG8VU3Ta_kVwiznZASR5y4fgPDRYFqkaAhtfEALw_wcB) - Suite of libraries, tools, and guidance to help developers write high-quality apps easier.
  * [Android KTX](https://developer.android.com/kotlin/ktx)
  * [Databinding](https://developer.android.com/jetpack/androidx/releases/databinding)
  * [LiveData](https://developer.android.com/topic/libraries/architecture/livedata)
  * [Navigation](https://developer.android.com/jetpack/androidx/releases/navigation)
  * [Preference](https://developer.android.com/jetpack/androidx/releases/preference)
  * [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel)
* [Glide](https://github.com/bumptech/glide) - A fast and efficient open source media management and image loading framework for Android.
* [Google Play Core](https://developer.android.com/guide/playcore) - Offers a runtime interface with the Google Play Store.
* [GSON](https://github.com/google/gson) - Java library that can be used to convert Java Objects into their JSON representation.
* [Hilt](https://developer.android.com/training/dependency-injection/hilt-android) - Library that provides a standard way to incorporate Dagger dependency injection into an Android application.
* [Kotlin Coroutines](https://developer.android.com/kotlin/coroutines) - Concurrency design pattern used on Android to simplify code that executes asynchronously.
* [Retrofit 2](https://github.com/square/retrofit) - A type-safe HTTP client for Android and Java.
* [Timber](https://github.com/JakeWharton/timber) - Logger with a small, extensible API which provides utility on top of Android's normal Log class.
.
 
### Architecture:
  - MVVM Architecture 
  - Repository pattern
  

## Features
+ Picking categories.
+ Opening an article's web site,
+ Sharing and article link,
+ Supporting landscape mode.
                                       

## Open API
EiffelNews uses the NewsApi for constructing RESTful API. Obtain your free API_KEY [NewsApi](https://newsapi.org/register) and paste it to the Constants file to try the app.

## License

[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)


Copyright 2020 Tochukwu Okey-Munonye

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.


## Author

* **Okey-Munonye Tochukwu**  
