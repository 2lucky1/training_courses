package com.muntian.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        PrintWriter writer = resp.getWriter();

        writer.println(
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
                        "                            <textarea name='description'></textarea>\n" +
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
                        "</body>\n" +


                        "<style>" +
                        "body{\n" +
                        "background-image: url(\"https://vignette.wikia.nocookie.net/p__/images/4/49/Red-Background-Wallpaper-Texture.jpg/revision/latest?cb=20140603164948&path-prefix=protagonist\");\n" +
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
                        "}</style>" +
                        "</body>\n" +
                        "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String courseName = req.getParameter("name");
        String courseDuration = req.getParameter("duration");
        String courseCategory = req.getParameter("category");
        String courseDescription = req.getParameter("description");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf8");
        PrintWriter writer = resp.getWriter();
//        writer.println("<h1>Course description</h1>");
//        writer.println("<table>" +
//                "<tr><th>Course name</th><td>" + courseName + "</td></tr>" +
//                "<tr><th>Course duration</th><td>" + courseDuration + "</td></tr>" +
//                "<tr><th>Course category</th><td>" + courseCategory + "</td></tr>" +
//                "<tr><th>Course description</th><td>" + courseDescription + "</td></tr>" +
//                "</table>" +
//                "<table>\n" +
//                "    <!--Row 1-->\n" +
//                "    <tr>\n" +
//                "        <td colspan=\"3\"></td>\n" +
//                "        <td rowspan=\"2\"></td>\n" +
//                "        <td rowspan=\"2\"></td>\n" +
//                "        <td colspan=\"3\"></td>" +
//                "    </tr>" +
//                "</table>"
//        );

        writer.println(
                    "<body>\n" +
                        "<div class=\"container\">\n" +
                        "   <h1>Course description</h1>" +
                        "   <table>\n" +
                        "        <tr>\n" +
                        "            <th>\n" +
                        "                Course name\n" +
                        "            </th>\n" +
                        "                   \n" +
                        "            <td>\n" +
                                        courseName +
                        "            </td>\n" +
                        "        </tr>\n" +
                        "        <tr>\n" +
                        "             <th>\n" +
                        "                 Duration\n" +
                        "             </th>\n" +
                        "             <td>\n" +
                                         courseDuration +
                        "             </td>\n" +
                        "         </tr>\n" +
                        "         <tr>\n" +
                        "             <th>\n" +
                        "                 Category\n" +
                        "             </th>\n" +
                        "             <td>\n" +
                                         courseCategory +
                        "             </td>\n" +
                        "         </tr>\n" +
                        "         <tr>\n" +
                        "             <th>\n" +
                        "                Short<br>description\n" +
                        "             </th>\n" +
                        "             <td>\n" +
                                         courseDescription +
                        "             </td>\n" +
                        "         </tr>\n" +
                        "     </table>\n" +
                        "</div>\n" +
                    "</body>\n" +

                        "<style>" +
//                ".Wrapper{\n" +
//                "    background-color: #F6F6FF;\n" +
//                "    width: 800px;\n" +
//                "\n" +
//                "}\n" +
//                ".Table{\n" +
//                "    padding: 8px;\n" +
//                "    font-size: 22px;\n" +
//                "    font-family: Calibri,serif;\n" +
//                "}\n" +
//                "\n" +
                        "body{\n" +
                        "background-image: url(\"https://www.planwallpaper.com/static/images/Alien_Ink_2560X1600_Abstract_Background_1.jpg\");\n" +
                        "}\n" +
                        "\n" +
                        ".container{\n" +
                        "    width: 580px;\n" +
                        "    text-align: center;\n" +
                        "    margin: 0 auto;\n" +
                        "    font-family: 'Palatino Linotype', serif;\n" +
                        "    padding: 0 30px;\n" +
                        "}\n" +
                        "\n" +
                            "table, tr, th, td{\n" +
                        "    border-collapse: collapse;\n" +
                        "}\n" +
                        "\n" +
                        "table{\n" +
                        "    margin-left: 135px;\n" +
                        "}\n" +
                        "\n" +
                        "td{\n" +
                        "    border: 2px solid black;\n" +
                        "    width: 200px;\n" +
                        "}\n" +
                        "\n" +
                        "th{\n" +
                        "    border: 2px solid black;\n" +
                        "    width: 100px;\n" +
                        "    text-align: left;\n" +
                        "    background-color: #89D3F4;\n" +
                        "}\n" +
//                "\n" +
//                "tr>td+td{\n" +
//                "    text-align: right;\n" +
//                "    border-left: 2px solid #DCDCDF;\n" +
//                "}\n" +
//                "\n" +
//                "tr:nth-child(even){\n" +
//                "    background-color: #FDE9D9\n" +
//                "}\n" +
//                "\n" +
//                ".Main_head{\n" +
//                "    letter-spacing: 10px;\n" +
//                "    font-size: 1.5em;\n" +
//                "    color: #F0F7FC;\n" +
//                "    background-color: #F79646;\n" +
//                "    width: 100%;\n" +
//                "}\n" +
//                "\n" +
//                ".Head>th{\n" +
//                "    height: 40px;\n" +
//                "    font-weight: bold;\n" +
//                "\n" +
//                "}\n" +
//                "\n" +
//                ".Head>th+th{\n" +
//                "    border-left: 2px solid #DCDCDF;\n" +
//                "    border-collapse: collapse;\n" +
//                "}\n" +
//                "\n" +
//                "tr[id=\"Total\"]{\n" +
//                "    color: #F0F7FC;\n" +
//                "    background-color: #687886;\n" +
//                "    text-align: center;\n" +
//                "    font-weight: bold;\n" +
//                "}\n" +
//                "\n" +
//                "tr[id=\"Total\"]{\n" +
//                "    border-bottom: none;\n" +
//                "    border-top: none;\n" +
//                "}" +
                        "</style>"
        );
    }
}
