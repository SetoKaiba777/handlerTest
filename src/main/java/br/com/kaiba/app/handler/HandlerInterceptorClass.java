package br.com.kaiba.app.handler;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class HandlerInterceptorClass implements HandlerInterceptor {

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,  Exception ex) throws Exception {
        switch (response.getStatus()) {
            case 200:
                var bool = true;
                int i = 0;
                System.out.println(response.getStatus());
                while (bool) {
                    System.out.println("Testando aqui!");
                    i++;
                    if (i > 1000) bool = false;
                }
                break;
            default:
                System.out.println("Requsição inválida");
        }
    }
}
