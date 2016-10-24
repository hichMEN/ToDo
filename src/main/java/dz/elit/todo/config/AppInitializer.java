package dz.elit.todo.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by mh.chebihi on 09/10/2016.
 */
public class AppInitializer implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(AppConfig.class);
        ctx.setServletContext(servletContext);
        ServletRegistration.Dynamic dyn = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        dyn.addMapping("/");
        dyn.setLoadOnStartup(1);
    }
}
