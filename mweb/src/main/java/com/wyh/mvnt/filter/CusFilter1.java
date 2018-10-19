package com.wyh.mvnt.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/10/8 17:48
 */
@Slf4j
public class CusFilter1 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("filter1启动...");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter...");
        chain.doFilter(request, response);
        log.info("doFilter end...");
    }

    public void destroy() {
        log.info("filter1销毁...");
    }
}
