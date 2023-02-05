package com.example.vinoslonious1;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Select", value = "/Select")
public class ViSelectionAction extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse resp) throws IOException{
        String color = request.getParameter("color");
        ViExpert viExpert = new ViExpert();
        viExpert.addVins(new Vins("Blanc de Blancs", "blanc"));
        viExpert.addVins(new Vins("Vinya del Fadri", "rosat"));
        viExpert.addVins(new Vins("Gessami", "rosat"));
        viExpert.addVins(new Vins("Graham's Port", "negre"));
        viExpert.addVins(new Vins("Châteaux Margaux", "negre"));
        viExpert.addVins(new Vins("Michel Chapoutier", "negre"));
        viExpert.addVins(new Vins("Chardonnay", "blanc"));
        viExpert.addVins(new Vins("Cum", "blanc"));
        viExpert.addVins(new Vins("Me han pasado la lista", "rosat"));
        viExpert.addVins(new Vins("Marihuanero", "verd"));
        viExpert.addVins(new Vins("Krypto", "verd"));
        viExpert.addVins(new Vins("Learn", "verd"));

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println ("<HTML>");
        out.println ("<BODY>");
        out.println ("<H1>Marques de Vi suggerides</H1>");
        out.println ((viExpert.getMarques(color)).toString());
        out.println ("</BODY>");
        out.println ("</HTML>");

    }

    public void destroy() {
    }
}