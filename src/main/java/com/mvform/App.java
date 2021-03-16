package com.mvform;

import org.joda.time.LocalTime;

import org.jsoup.Jsoup;

import com.entities.Greeter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String htmlText = "<h1>Hello World!</h1>";
        System.out.println(htmlText);
        
        System.out.println(Jsoup.parse(htmlText).text());
        
        //1 declaration et init nouvelle variable et l afficher en console
        //repackager l appli et voir le resultat
        //gestion du cycle de vie
        
        String htmlText2 = "Test Affichage";
        System.out.println(htmlText2);
        
        System.out.println(Jsoup.parse(htmlText2).text());
        
        //2 nouvelle dependance
        //joda-time
        
        LocalTime currentTime = new LocalTime();
    	System.out.println("Il est " + currentTime);
    	
    	//3 insertion autre classe
    	Greeter aGreeter = new Greeter();
    	System.out.println(aGreeter.sayHello());
    }
}

