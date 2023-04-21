package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
    public String skillTracker(){
        String html =
                "<html>" +
                        "<body>" +
                            "<h1>Skill Tracker</h1>" +
                                "<h2>We have a few skills we would like to learn. Here is the list.</h2>"+
                                    "<ol>1. Java</ol>" +
                                    "<ol>2. JavaScript</ol>" +
                                    "<ol>3. Python</ol?" +
                        "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String trackerForm() {
        String html =
                "<html>" +
                            "<body>" +
                                "<form method = 'get' action = '/form'>" +
                                     "<input type = 'text' name = 'coder' />" +
                                      "<input type = 'submit' value = 'Enter your name' />" +
                        "<br>"+
                        "<label for='dropdown1'>Pick your 1st favorite languages</label>"+
                        "<br>"+
                        "<select name = 'My 1st Favorite Language' id = 'dropdown1'>" +
                        "<option value ='java'>Java</option>" +
                        "<option value ='javaScript'>JavaScript</option>" +
                        "<option value ='python'>Python</option>" +
                        "</select>"+
                        "<br>"+
                        "<label for='dropdown2'>Pick your 2nd favorite language</label>"+
                        "<br>"+
                        "<select name = 'My 2nd Favorite Language' id = 'dropdown2'>" +
                        "<option value ='java'>Java</option>" +
                        "<option value ='javaScript'>JavaScript</option>" +
                        "<option value ='python'>Python</option>" +
                        "</select>"+
                        "<br>"+
                        "<label for='dropdown3'>Pick your 3rd favorite language</label>"+
                        "<br>"+
                        "<select name = 'My 3rd Favorite Language' id = 'dropdown3'>" +
                        "<option value ='java'>Java</option>" +
                        "<option value ='javaScript'>JavaScript</option>" +
                        "<option value ='python'>Python</option>" +
                        "</select>"+
                                "</form>" +
                            "</body>" +
                "</html>";
        return html;
    }
}
