package cofiguration;

import org.h2.jdbcx.JdbcDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSource {

    private static final String TEMP_DIRECTORY = System.getProperty("java.io.tmpdir");

    @Bean(name = "mainDataSource")
    public DataSource createMainDataSource() {


    }

}
