package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sap.conn.jco.JCoException;

import sap.StepByStepClient;

@Controller
public class SapController {

	// private static final Logger logger =
	// LoggerFactory.getLogger(SapController.class);

	// public static class JsonResponse implements Serializable {
	//
	// private static final long serialVersionUID = 6291418625656878035L;
	//
	// @JsonProperty
	// private final String firstName;
	// @JsonProperty
	// private final String lastName;
	//
	// public JsonResponse(final String firstName, final String lastName) {
	// this.firstName = firstName;
	// this.lastName = lastName;
	// }
	//
	// }

	@RequestMapping("/browse")
	public @ResponseBody String index() throws JCoException {
		String.format("Greetings from Spring Boot. This is the SAP request");

		StepByStepClient.step1Connect();
		StepByStepClient.step2ConnectUsingPool();
		StepByStepClient.step3SimpleCall();
		StepByStepClient.step3WorkWithStructure();
		StepByStepClient.step4WorkWithTable();

		return "bla";
	}

}