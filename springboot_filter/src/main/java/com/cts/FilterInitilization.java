package com.cts;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;

@Component
public class FilterInitilization implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("filter operation....");

	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	System.out.println(filterConfig.getFilterName());
	System.out.println(filterConfig.getServletContext().getContextPath());
	System.out.println("initilization method in filter...");
		Filter.super.init(filterConfig);
	}

	@Override
	public void destroy() {
		System.out.println("destroy method in filter...");
		Filter.super.destroy();
	}

}