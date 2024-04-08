package stepDefinations;

import java.io.IOException;

import io.cucumber.java.Before;

public class Hooks {

	@Before("@DeletePlace")
	public void beforeScenario() throws IOException
	{
		//execute this code only when placeid is null
		//write a code that will give you placeid
		
		StepDefination m=new StepDefination();
		if(StepDefination.place_id==null) //since place id is static call it directly by using class name
		{
		m.add_place_payload_with("shetty", "french", "asia");
		m.user_calls_with_http_request("AddPlaceAPI","POST");
		m.verify_place_Id_created_maps_to_using("Shetty","getPlaceAPI");
		}
	}
}
