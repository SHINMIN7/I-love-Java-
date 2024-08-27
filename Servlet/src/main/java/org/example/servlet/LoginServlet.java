package org.example.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/checkUser")
public class LoginServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        if(name.equals("shin") && password.equals("1234")){
            StringBuilder sb = new StringBuilder();
            sb.append("<html>")
                    .append("<head>")
                    .append("<title>로그인 성공!</title>")
                    .append("</head>")
                    .append("<body>")
                    .append("<h1>반갑습니다 ")
                    .append(name)
                    .append("</h1>")
                    .append("</body>")
                    .append("</html>");

            resp.setContentType("text/html");


            /* 사용자 브라우저에 응답하기 위한 출력 스트림을 response 객체에서 반환 받는다. */
            PrintWriter writer = resp.getWriter();
            writer.println(sb);
            writer.flush();
            writer.close();
        } else{
            resp.sendError(404, "회원 정보를 잘못 입력하셨습니다. 다시 입력해 주세요");
        }



    }
}
