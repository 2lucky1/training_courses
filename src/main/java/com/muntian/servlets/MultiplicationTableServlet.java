package com.muntian.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MultiplicationTableServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int columns = 10;
        int rows = 10;

        if(req.getParameter("col")!=null){
            columns = Integer.parseInt(req.getParameter("col"));
        }

        if(req.getParameter("row")!=null){
            rows = Integer.parseInt(req.getParameter("row"));
        }

        PrintWriter writer = resp.getWriter();
        writer.println(
        "       <!DOCTYPE html>\n" +
        "             <html lang=\"en\">\n" +
        "             <head>\n" +
        "                 <meta charset=\"UTF-8\">\n" +
        "                 <title>Multiplication table</title>\n" +
        "                 <link rel=\"stylesheet\" href=\"/resources/css/multi.css\">\n" +
        "             </head>\n" +
        "             <body>\n" +
        "             <div class=\"container\">\n" +
        "                 <table>\n" +
        "                       <tr>\n"
        );


        for (int i = 0; i <= columns; i++) {
            if (i < 1) {
                writer.println("<th class='logo'><div><img src='img/logo/logo4.png' id='logo'></div></th>");
            } else {
                writer.println("<th class='top_header'>" + i + "</th>");
            }
        }

        writer.println(
                "</tr>"
        );

        for (int k = 1; k <= rows; k++) {
            writer.println("<tr>");
            writer.println("<th class='left_header'>" + k + "</th>");
            for (int j = 1; j <= columns; j++) {
                writer.println("<td>" + k * j + "</td>");
            }
            writer.println("</tr>");
        }

        writer.println("</table>" +
                "</div>\n" +
                "</body>\n" +
                "</html>");
    }
}
