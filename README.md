# LoginButtons

A simple library for building beautiful login buttons

## Gradle

Add this in your dependecies block
```
compile 'com.shaishavgandhi:login-buttons:0.1.1'
```

## Basic Usage

### Google Plus Login Button
```
<com.shaishavgandhi.loginbuttons.GooglePlusButton
        android:layout_width="match_parent"
        android:textAlignment="center"
        app:iconSize="30dp"
        android:text="Sign in with Google"
        android:layout_height="wrap_content"
        />
```

### Facebook Login Button
```
<com.shaishavgandhi.loginbuttons.FacebookButton
        android:layout_width="match_parent"
        android:text="Sign in with Facebook"
        app:iconSize="30dp"
        android:layout_height="wrap_content"
        />
```

### Twitter Login Button
```
<com.shaishavgandhi.loginbuttons.TwitterButton
        android:layout_width="match_parent"
        app:iconSize="30dp"
        android:text="Sign in with Twitter"
        android:layout_height="wrap_content"
        />
```

### LinkedIn Login Button
```
<com.shaishavgandhi.loginbuttons.LinkedInButton
        android:layout_width="match_parent"
        app:iconSize="30dp"
        android:text="Sign in with LinkedIn"
        android:layout_height="wrap_content"
        />
```

## Custom Properties

Every button has the following custom properties : 

* ``` app:iconSize="30dp" ``` value in dp
* ``` app:iconPadding="30dp"``` value in dp
* ``` app:iconCenterAligned="true/false" ``` icon center aligned by default. Set value ```false``` to set icon on left as shown [here](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/regular_transparent.png)
* ``` app:roundedCorner="true/false ``` Whether to set rounded corners. Default ```false```
* ```app:roundedCornerRadius="30dp" ``` value in dp
* ```app:transparentBackground="true/fasle``` Sets background to transparent and border to the color of the appropriate social media color. Examples [here](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/circular_transparent.png) and [here](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/regular_transparent.png) 

## Mix and match

The libary gives a fair amount of freedom and using several permutations and combinations to make a button of your choice.

A popular example are **circular buttons**, like FAB for login. Using the properties you can make a circular button like this : 
```
<com.shaishavgandhi.loginbuttons.GooglePlusButton
        android:layout_width="75dp"
        app:roundedCorner="true"
        app:iconSize="30dp"
        app:roundedCornerRadius="75dp"
        android:layout_height="75dp"
        />
```
In the above example, enabling roundedCorner and setting the width, height and roundedCornerRadius to the same value enables a circular button. Image [here](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/circular.png)

Another example is of **rounded corner** buttons :

```
<com.shaishavgandhi.loginbuttons.GooglePlusButton
        android:layout_width="match_parent"
        android:textAlignment="center"
        app:roundedCorner="true"
        app:iconCenterAligned="false"
        app:iconSize="30dp"
        android:text="Sign in with Google"
        android:layout_height="wrap_content"
        />
```
Above code uses various properties to get a rounded corner button, with icon on the left. See [here](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/regular_rounded.png)
  
## Examples
  
### [Square Buttons](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/square_button.png)
  
  ```
  <com.shaishavgandhi.loginbuttons.GooglePlusButton
        android:layout_width="75dp"
        app:iconSize="30dp"
        android:layout_height="75dp"
        />
  ```
  
### [Square Transparent Buttons](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/square_transparent.png)
  ```
  <com.shaishavgandhi.loginbuttons.GooglePlusButton
        android:layout_width="75dp"
        app:transparentBackground="true"
        app:iconSize="30dp"
        android:layout_height="75dp"
        />
```
    
### [Transparent Circular Buttons](https://github.com/shaishavgandhi05/LoginButtons/blob/master/screenshots/circular_transparent.png)
  ```
  <com.shaishavgandhi.loginbuttons.LinkedInButton
        android:layout_width="75dp"
        app:roundedCorner="true"
        app:transparentBackground="true"
        app:roundedCornerRadius="75dp"
        app:iconSize="30dp"
        android:layout_height="75dp"
        />
```

# Contributing

All contributions are welcome and much appreciated! Steps for contributing : 
* Fork this repo
* Clone to your work station for a local copy
* Create a new branch by ``` git checkout -b branch_name_here ```
* Make your awesome changes and contributions
* Push to your forked repo
* Make pull request

# License

```
MIT License

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
```





