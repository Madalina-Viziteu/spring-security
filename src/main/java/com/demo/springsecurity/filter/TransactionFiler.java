package com.demo.springsecurity.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.processing.Filer;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;

@Component
@Order(1)
public class TransactionFiler implements Filter {

    @Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        System.out.println("Starting a transaction for request : {}");
        System.out.println(req.getRequestURI());;

        chain.doFilter(request, response);
        System.out.println("Committing a transaction for request : {}");
        System.out.println(req.getRequestURI());
    }

    @Bean
    FilterRegistrationBean myFilter () {
        FilterRegistrationBean frb = new FilterRegistrationBean();
        frb.setFilter(new TransactionFiler());
        frb.setUrlPatterns(Arrays.asList("/addTransaction, /getTransaction"));
        return frb;
    }

}
