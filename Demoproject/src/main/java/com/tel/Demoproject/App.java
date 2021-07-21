package com.tel.Demoproject;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
        Alien obj = (Alien)factory.getBean("Alien");
    }
}
