package soundsystem;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariConfigMXBean;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:datasource.properties")
public class DataSourceConfig {
    @Value( "${jdbcUrl}" )
    private String jdbcUrl;
    @Value( "${driverClassName}" )
    private String driverClassName;
    @Value( "${username}" )
    private String username;
    @Value( "${password}" )
    private String password;

    @Bean
    public HikariConfig hikariConfig(){
        HikariConfig hikariConfig = new HikariConfig();

        hikariConfig.setJdbcUrl(jdbcUrl);
        hikariConfig.setDriverClassName(driverClassName);
        hikariConfig.setUsername(username);
        hikariConfig.setPassword(password);

        return hikariConfig;
    }

    @Bean
    public DataSource dataSource(HikariConfig hikariConfig){
        return new HikariDataSource(hikariConfig);
    }

}

//<bean id="hikariConfig" class="com.zaxxer.hikari.HikariConfig">
//<property name="driverClassName" value="com.mysql.cj.jdbc.Driver"/>
//<property name="jdbcUrl" value="jdbc:mysql://localhost:3306/testdb?useUnicode=true&amp;characterSetEncoding=UTF-8&amp;serverTimezone=UTC"/>
//<property name="username" value="hyunseok"/>
//<property name="password" value="zxcasdqwe1"/>
//</bean>
//
//<bean id="dataSource" class="com.zaxxer.hikari.HikariDataSource">
//<constructor-arg ref="hikariConfig"/>
//</bean>