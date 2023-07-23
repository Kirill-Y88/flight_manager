package y88.kirill.flight.manager;

import org.flywaydb.core.Flyway;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FlightManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlightManagerApplication.class, args);
    }

    @Bean
    public Flyway flyway() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5432/postgres",
                        "postgres",
                        "1917")
                .load();
        flyway.migrate();
        return flyway;
    }
}
