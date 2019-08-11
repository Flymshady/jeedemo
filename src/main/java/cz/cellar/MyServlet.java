package cz.cellar;

import cz.cellar.beans.HelloStatelessBean;
import cz.cellar.interfaces.Message;
import cz.cellar.interfaces.RandomNumber;

import javax.ejb.EJB;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Výpis 7, 8, 12
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {

    @EJB
    HelloStatelessBean helloStatelessBean;

    @Inject
    @Named("SecondMessage") Message message;

    RandomNumber randomNumber;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(message.getMessage());
        System.out.println(randomNumber.get());
        helloStatelessBean.helloName("Name");
    }
}
