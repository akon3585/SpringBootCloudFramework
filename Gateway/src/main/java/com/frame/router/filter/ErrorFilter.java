/**
 * @author: Chen
 * @date:   Sep 30, 2019
 */
package com.frame.router.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Chen
 * @date   Sep 30, 2019
 * @description ErrorFilter.java	
 */
public class ErrorFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "error";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
		return false;
	}

	@Override
	public Object run() {
		System.out.println("Using Error Filter");

		return null;
	}

}