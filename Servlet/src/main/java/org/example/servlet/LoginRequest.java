package org.example.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginRequest extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        StringBuilder sb = new StringBuilder();
        sb.append("<html>")
                .append("<head>")
                .append("<title>Login Page</title>")
                .append("</head>")
                .append("<body>")
                .append("<h1>Login Page</h1>")
                .append("<form action=\"/checkUser\" method=\"post\">")
                .append("<label>유저 이름 : </label><input type=\"text\" name=\"username\">")
                .append("</br>")
                .append("<label>비밀번호 : </label><input type=\"number\" name=\"password\">")
                .append("</br>")
                .append("</body>")
                .append("<input type=\"submit\" value=\"POST 요청\">")
                .append("</form>")
                .append("</html>");


        resp.setContentType("text/html");


        /* 사용자 브라우저에 응답하기 위한 출력 스트림을 response 객체에서 반환 받는다. */
        PrintWriter writer = resp.getWriter();
        writer.println(sb);
        writer.flush();
        writer.close();

    }
}
