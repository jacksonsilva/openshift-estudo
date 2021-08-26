package payroll;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

 // private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

  @Bean
  CommandLineRunner initDatabase(EmployeeRepository repository) {

    return args -> {
    	System.out.println("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
    	System.out.println("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    	
      //log.info("Preloading " + repository.save(new Employee("Bilbo Baggins", "burglar")));
      //log.info("Preloading " + repository.save(new Employee("Frodo Baggins", "thief")));
    };
  }
}