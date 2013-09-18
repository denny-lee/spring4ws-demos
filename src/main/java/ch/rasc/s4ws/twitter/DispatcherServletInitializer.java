package ch.rasc.s4ws.twitter;

import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/twitterdemo/*" };
	}

	@Override
	protected String getServletName() {
		return "twitterDispatcherServlet";
	}

	@Override
	protected void customizeRegistration(Dynamic registration) {
		registration.setInitParameter("dispatchOptionsRequest", "true");
	}
}
