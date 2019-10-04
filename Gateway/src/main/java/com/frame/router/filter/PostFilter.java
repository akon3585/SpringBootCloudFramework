/**
 * @author: Chen
 * @date:   Sep 30, 2019
 */
package com.frame.router.filter;

import com.netflix.zuul.ZuulFilter;

/**
 * @author Chen
 * @date   Sep 30, 2019
 * @description PostFilter.java	
 */
public class PostFilter extends ZuulFilter {

	@Override
	public String filterType() {
		return "post";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public boolean shouldFilter() {
//		return true;
		return false;
	}

	@Override
	public Object run() {
		System.out.println("Using Post Filter");

		return null;
	}

}
