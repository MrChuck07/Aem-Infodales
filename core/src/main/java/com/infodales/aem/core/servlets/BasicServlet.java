package com.infodales.aem.core.servlets;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

@Component(
        service = {Servlet.class},
        property = {
                "sling.servlet.paths=/bin/basicservlet",
                "sling.servlet.methods="+ HttpConstants.METHOD_GET
        }
)
public class BasicServlet extends SlingSafeMethodsServlet {

    @Override
    protected void doGet(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        //String name = request.getParameter("name");

        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/content/infodalesproject/us/en/tabs-test/jcr:content/root/container/container/userdetails");
        Node testNode = resource.adaptTo(Node.class);
        Resource res = resolver.getResource("/content/infodalesproject/us/en/tabs-test/jcr:content/root/container/container/userdetails/mnumber/item0");
        Node testN = res.adaptTo(Node.class);
        try {
            String nameCheck = testNode.getProperty("fiName").getString();
            String lanameCheck = testNode.getProperty("laName").getString();
            String addressCheck = testNode.getProperty("address").getString();
            String mobnumCheck = testN.getProperty("mobNum").getString();
                response.getWriter().write(nameCheck);
                out.println(" ");
                response.getWriter().write(lanameCheck);
                out.println(" ");
                response.getWriter().write(addressCheck);
                out.println(" ");
                response.getWriter().write(mobnumCheck);

       } catch (RepositoryException e) {
            throw new RuntimeException(e);
        }

    }
}
