# :point_right: CrispyToast-Android
[ ![Download](https://img.shields.io/badge/Version-1.0.0-blue.svg) ](https://bintray.com/aminullahtajmuhammad/CrispyToast/com.aminullahtajmuhammad.crispytoast/1.0.0) [![API](https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=15)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html) [![Twitter](https://img.shields.io/twitter/url/https/github.com/wajahatkarim3/MediumClap-Android.svg?style=social)](https://twitter.com/intent/tweet?text=Wow:&url=https%3A%2F%2Fgithub.com%2FAminullahTajMuhammad%2FCrispyToast)

<div align="center">
  <sub>Built with ❤︎ by
  <a href="https://twitter.com/TajAminullah">Aminullah Taj Muhammad</a> under the mentorship of
  <a href="https://twitter.com/WajahatKarim">
    Wajahat Karim
  </a>
</div>
<br/>

A Toast Library for creating custom theme toast in android

![](https://github.com/AminullahTajMuhammad/CrispyToast/blob/master/demo/ezgif.com-resize.gif)

## 💻 Installation
Add this in your app's build.gradle file:
```groovy
dependencies {
  implementation 'com.aminullahtajmuhammad.crispytoast:crispytoast:1.0.0'
}
```

Or add CrispyToast as a new dependency inside your pom.xml

```xml
<dependency>
  <groupId>com.aminullahtajmuhammad.crispytoast</groupId>
  <artifactId>crispytoast</artifactId>
  <version>1.0.0</version>
  <type>pom</type>
</dependency>
```

## ❔ Usage

```java
CrispyToast.makeCrispyToast(
              context,
              "This is Example Toast",
              CrispyToast.DEFAULT_STATE,
              CrispyToast.LENGTH_SHORT
            ).show();
```

## 👨 Developed By

```
Aminullah Taj Muhammad
```
- Website (http://aminullahtajmuhammad.github.io)
- Twitter (http://twitter.com/TajAminullah)
- Medium (https://medium.com/@aminullahtaj)

# 👍 How to Contribute
1. Fork it
2. Create your feature branch (git checkout -b my-new-feature)
3. Commit your changes (git commit -am 'Add some feature')
4. Push to the branch (git push origin my-new-feature)
5. Create new Pull Request

# 📃 License

    Copyright 2018 Aminullah Taj Muhammad

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
