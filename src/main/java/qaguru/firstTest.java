package qaguru;


import jdk.jshell.Snippet;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class firstTest {
    void firstTest {
        //<input required="" autocomplete="off" placeholder="First Name" type="text" id="firstName" class=" mr-sm-2 form-control">
    //   примеры xpath  и сss

 $("[id=firstName]").setValue ("Ivanov");
 $(by("id", "firstName")).setValue("Ivanov");
 $x("//*[@id='firstName']").setValue("Ivanov"); //метод xpath
        $(By.id("firstName")).setValue("Ivanov"); //сокращение селектора
        $(byId("firstName")).setValue("Ivanov"); //сокращение селектора
    $("#firstName").setValue("Ivanov"); //сокращение селектора


        //<input required=""  class=" mr-sm-2 form-control">
        $("[class=form-control]").setValue ("Ivanov");
        $(by("class", "form-control")).setValue("Ivanov");
        $x("//*[@class='firstName']").setValue("Ivanov"); //метод xpath
        $(By.className("firstName")).setValue("Ivanov"); //сокращение селектора
        $(byClassName("firstName")).setValue("Ivanov"); //сокращение селектора
        $(".firstName").setValue("Ivanov"); //сокращение селектора
        $("[class="mr-sm-2"][class=form-control]").setValue("Ivanov");









    }


}
