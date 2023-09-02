package cyou.wysiwyg;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MVCConfig implements WebMvcConfigurer {

        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/img/**")
                                .addResourceLocations("classpath:/static/img/");
                registry.addResourceHandler("/css/**")
                                .addResourceLocations("classpath:/static/css/");
                registry.addResourceHandler("/js/**")
                                .addResourceLocations("classpath:/static/js/");
                registry.addResourceHandler("/dist/**")
                                .addResourceLocations("classpath:/static/dist/");

        }

}