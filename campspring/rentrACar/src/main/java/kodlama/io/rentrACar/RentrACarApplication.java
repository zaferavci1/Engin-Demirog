package kodlama.io.rentrACar;

import kodlama.io.rentrACar.core.utilities.mappers.ModelMapperService;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RentrACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentrACarApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper(){
		return  new ModelMapper();
	}

}
