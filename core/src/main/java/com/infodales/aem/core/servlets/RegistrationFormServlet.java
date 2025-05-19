package com.infodales.aem.core.servlets;


import com.day.cq.commons.jcr.JcrConstants;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.servlets.HttpConstants;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.osgi.service.component.annotations.Component;

import javax.jcr.Node;
import javax.jcr.RepositoryException;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import java.io.IOException;

@Component(
        service = {Servlet.class},
        property = {
                "sling.servlet.paths=/bin/register",
                "sling.servlet.methods="+ HttpConstants.METHOD_POST
        }
)
public class RegistrationFormServlet extends SlingAllMethodsServlet {
    @Override
    protected void doPost(final SlingHttpServletRequest request, final SlingHttpServletResponse response) throws ServletException, IOException {
        response.getWriter().write("");

        String firstname = request.getParameter("firstname");
        String lastname= request.getParameter("lastname");
        String id= request.getParameter("id");
        String contact= request.getParameter("contact");
        String campaignId= request.getParameter("campaignId");


        ResourceResolver resolver = request.getResourceResolver();
        Resource resource = resolver.getResource("/etc/registeredUsers");
        Node registeredUsers = resource.adaptTo(Node.class);
        Node user = null;

        try {
            user = registeredUsers.addNode(firstname+lastname, JcrConstants.NT_UNSTRUCTURED);
            resolver.commit();
            user.setProperty("name",firstname + " " + lastname);
            user.setProperty("userId",id);
            user.setProperty("contact", contact);
            user.setProperty("campaignId",campaignId);
            resolver.commit();
            response.getWriter().write("Node added!");
        } catch (RepositoryException e) {
            response.getWriter().write("Node Already Exists");
        }
        resolver.close();
    }
}
