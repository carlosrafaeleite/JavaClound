package hr_payrool.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import hr_payrool.entity.Payment;
import hr_payrool.entity.Worker;
import hr_payrool.feignClients.WorkerFeignClients;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClients workerFeignClients;

	public Payment getPayment(Long workerId, Integer days) {
		
		try {
		    Worker worker = workerFeignClients.findById(workerId);
		    return new Payment(worker.getName(), worker.getDailyincome(), days);
		} catch (HttpClientErrorException.NotFound e) {
		    throw new RuntimeException("Worker não encontrado com id: " + workerId);
		}
	}
	
	
	/*
	 * chamada com restTemplate
	 * 
	@Value("${hr-worker.host}")
	private String host;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public Payment getPayment(Long workerId, Integer days) {
		
		Map<String, String> urivariable = new HashMap<>();
		urivariable.put("id", ""+workerId);
		
		try {
		    Worker worker = restTemplate.getForObject(host + "/workers/{id}", Worker.class, urivariable);
		    return new Payment(worker.getName(), worker.getDailyincome(), days);
		} catch (HttpClientErrorException.NotFound e) {
		    throw new RuntimeException("Worker não encontrado com id: " + workerId);
		}
	}
	*/
}
