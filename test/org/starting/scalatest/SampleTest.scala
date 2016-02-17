package org.starting.scalatest

import org.scalatest.{FlatSpec, ShouldMatchers}
import org.scalatestplus.play.{HtmlUnitFactory, OneBrowserPerSuite, OneServerPerSuite}
import play.Logger;

/**
 * Created by noelking on 2/16/16.
 */
class SampleTest  extends FlatSpec with ShouldMatchers with OneServerPerSuite with OneBrowserPerSuite with HtmlUnitFactory {

  "The home page" should "have VSware School MIS in the title " in {
    go to ("http://vsware.ie")
    Logger.info(pageTitle)
    pageTitle should be ("VSware School MIS - Cloud based school administration and timetabling platform | Cloud and mobile based school administration and timetabling platform")
  }

  "Search for VSWare on Google " should " return VS in the results" in {
    go to ("http://google.ie")
    click on "q"
    textField("q").value = "VSWare"
    submit()
    // Google's search is rendered dynamically with JavaScript.
    eventually {
      pageTitle should be("VSWare - Google Search")
      click on linkText("About VSware")
      eventually {
        pageTitle should be ("About VSware | VSware School MIS - Cloud based school administration and timetabling platform")
      }
    }



  }

}
