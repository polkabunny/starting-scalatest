# starting-scalatest

This assignment requires you to write an acceptance test using Scala Test framework.  This is an easy and fun way to write automated tests for an application

To get setup you will need to have
 * Java 8 installed
 * Activator installed (https://www.typesafe.com/activator/download)

Once you have downloaded and installed activator you are ready to run your first test which I have written.  To run the test download this code from GitHub using the Download Zip link, unzip it and navigate to the folder on the command line

```
$ cd starting-scalatest-master
$ activator test
```

This should run successfully with no errors, will take a bit of time the first time to run as it will need to download all the dependencies

Your task is the write a new test that will

1. Go to Google.ie
2. Add input into the search box for VSWare
3. Open the About Us page and verify its there

## Resources

To do this you will first need to research ScalaTest

* http://scalatest.org
* http://www.scalatest.org/user_guide/using_selenium (Best resource)
* https://www.playframework.com/documentation/2.2.x/ScalaFunctionalTestingWithScalaTest

## Hints

1. Create a new scala class exactly like SampleTest.scala in the same package
2. Copy the first function written but get it to naviage to google
3. There is a good google example in the second resource above
4. To find the link for VSWare about after you have searched google use the following code

```
click on linkText("About VSware")
```

## Good luck

This task is fairly easy so please do not spend longer than 3 hours on it.  Any questions please send us an email.
