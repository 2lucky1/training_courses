package com.muntian.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    //    PrintWriter writer = resp.getWriter();
//        writer.println("<h1>" + servletName + "</h1>");
//        writer.println("<form method='post' action='/student'>" +
//                "<label for='first_name'>Name:</label>" +
//                "<input type='text' value='" + first_name + "' id='first_name' name='first_name'/><br/>" +
//            "<label for='email'>Email:</label>" +
//            "<input type='email' id='email' value='"+email+"' name='email'/><br/>" +
//            "<label for='age'>Age:</label>" +
//            "<input type='number' id='age' value='"+age+"' name='age'/><br/>" +
//            "<input type='submit'/>" +
//            "</form>");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        PrintWriter writer = resp.getWriter();

        writer.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Forms</title>\n" +
                "    <link rel=\"stylesheet\" href=\"Forms.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div class=\"container\">\n" +
                "    <h1>Form for adding educational course</h1>\n" +
                "    <form action=\"/register\" method=\"post\">\n" +
                "        <div class=\"block\">\n" +
                "            <fieldset>\n" +
                "                <legend>Course description</legend>\n" +
                "                <table>\n" +
                "                    <tr>\n" +
                "                        <td>\n" +
                "                            Name\n" +
                "                        </td>\n" +
                "                               \n" +
                "                        <td>\n" +
                "                            <input class=\"text_input\" type=\"text\" name=\"name\" autofocus required>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                        <td>\n" +
                "                            Duration\n" +
                "                        </td>\n" +
                "                        <td>\n" +
                "                            <input class=\"text_input\" type=\"text\" name=\"duration\">\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                        <td>\n" +
                "                            Category\n" +
                "                        </td>\n" +
                "                        <td>\n" +
                "                            <select name='category' id=\"category\">\n" +
                "                               <option selected disabled>Choose a category</option>" +
                "                               <option value='Java'>Java</option>" +
                "                               <option value='.Net Framework'>.Net Framework</option>" +
                "                               <option value='Python'>Python</option>" +
                "                               <option value='Ruby'>Ruby</option>" +
                "                               <option value='HTML5 & CSS3'>HTML5 & CSS3</option>" +
                "                               <option value='Node.js'>Node.js</option>" +
                "                            </select>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                    <tr>\n" +
                "                        <td id=\"comments\">\n" +
                "                           Short<br>description\n" +
                "                        </td>\n" +
                "                        <td>\n" +
                "                            <textarea name='course_description'></textarea>\n" +
                "                        </td>\n" +
                "                    </tr>\n" +
                "                </table>\n" +
                "            </fieldset>\n" +
                "        <div id=\"send_button\">\n" +
                "            <input type=\"submit\" value=\"Submit\">\n" +
                "        </div>\n" +
                "        </div>\n" +
                "    </form>\n" +
                "</div>\n" +


                "<style>body{\n" +
                "\n" +
                "}\n" +
                "\n" +
                ".container{\n" +
                "    width: 580px;\n" +
                "    margin: 0 auto;\n" +
                "    font-family: 'Palatino Linotype', serif;\n" +
                "    padding: 0 30px;\n" +
                "}\n" +
                "\n" +
                "h1{\n" +
                "    margin-bottom: 0;\n" +
                "}\n" +
                "\n" +
                "#appeal{\n" +
                "    margin-top: 0;\n" +
                "    font-style: italic;\n" +
                "    font-size: 14px;\n" +
                "}\n" +
                "\n" +
                "table {\n" +
                "    border-spacing: 0 10px;\n" +
                "    font-size: 14px;\n" +
                "    margin-bottom: 4px;\n" +
                "}\n" +
                "\n" +
                "legend{\n" +
                "    padding: 0 3px;\n" +
                "    font-weight: bold;\n" +
                "    font-variant: small-caps;\n" +
                "}\n" +
                "\n" +
                "input:focus {\n" +
                "    background: #eaeaea;\n" +
                "}\n" +
                "\n" +
                "input[type=submit] {\n" +
                "    width: 170px;\n" +
                "    padding: 10px;\n" +
                "}\n" +
                ".block{\n" +
                "    margin: 0 0 15px 0 ;\n" +
                "}\n" +
                "\n" +
                "textarea{\n" +
                "    height: 100px;\n" +
                "    width: 250px;\n" +
                "    margin-left: 70px;\n" +
                "}\n" +
                "\n" +
                "#animals_choosing{\n" +
                "    border-spacing: 30px 0;\n" +
                "}\n" +
                "\n" +
                "#send_button{\n" +
                "margin: 20px 0 0 1px;\n" +
                "}\n" +
                "\n" +
                "#category{\n" +
                "    width: 254px;\n" +
                "    margin-left: 70px;\n" +
                "}\n" +
                "\n" +
                ".text_input{\n" +
                "    margin-left: 70px;\n" +
                "    width: 250px;\n" +
                "}\n" +
                "\n" +
                ".personal_in{\n" +
                "    margin-left: 37px;\n" +
                "    width: 250px;\n" +
                "}\n" +
                "\n" +
                ".animals{\n" +
                "    margin-right: 5px;\n" +
                "}</style>" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String course_name = req.getParameter("name");
        String course_duration = req.getParameter("duration");
        String course_category = req.getParameter("category");
        String course_description = req.getParameter("description");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        PrintWriter writer = resp.getWriter();
        writer.println("<h1>Course description</h1>");
        writer.println("<table>" +
                "<tr><th>Course name</th><td>" + course_name + "</td></tr>" +
                "<tr><th>Course duration</th><td>" + course_duration + "</td></tr>" +
                "<tr><th>Course category</th><td>" + course_category + "</td></tr>" +
                "<tr><th>Course description</th><td>" + course_description + "</td></tr>" +
                "</table>" +
                "<table>\n" +
                "    <!--Row 1-->\n" +
                "    <tr>\n" +
                "        <td colspan=\"3\"></td>\n" +
                "        <td rowspan=\"2\"></td>\n" +
                "        <td rowspan=\"2\"></td>\n" +
                "        <td colspan=\"3\"></td>" +
                "    </tr>" +
                "</table>"
        );
    }
}
