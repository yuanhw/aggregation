package com.wyh.mvnt.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wyh.mvnt.constant.ConfigConstant;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author: WangYuanHang
 * @Description:
 * @date: 2018/9/30 13:34
 */
@Slf4j
public class OneServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(ConfigConstant.connectionTimeout);
        log.info("访问OneServlet开始：");
        PrintWriter out = resp.getWriter();
        out.write(" ");
        out.flush();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.write(" ");
        out.flush();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.write(" ");
        out.flush();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.write(" ");
        out.flush();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        out.write("1");
        out.close();
        log.info("访问OneServlet结束。");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }

    @Override
    public void init() throws ServletException {
        String value = getServletContext().getInitParameter("testScope");
        System.out.println("******************************* " + value);
    }

    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        System.out.println("开始时间：" + beginTime);

        String url = "http://localhost:8080/test1.action";
        //String bodyStr = HttpClientUtil.sendHttpGetRequest(url);
        long endTime = System.currentTimeMillis();
        System.out.println("结束时间：" + endTime + "，用时" + (endTime - beginTime) + "毫秒");

        //log.info(bodyStr);

        JSONObject obj = JSONObject.parseObject("     {\"id\": \"123\"}");
        System.out.println(obj.toJSONString());
    }
}
