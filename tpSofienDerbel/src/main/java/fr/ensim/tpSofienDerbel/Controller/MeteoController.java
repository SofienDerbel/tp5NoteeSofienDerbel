package fr.ensim.tpSofienDerbel.Controller;

import java.net.InetSocketAddress;
import java.net.Proxy;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import fr.ensim.tpSofienDerbel.Model.DarkSky;
import fr.ensim.tpSofienDerbel.Model.Result;

@Controller
public class MeteoController {
	
	@PostMapping("/meteo")
	public String showFormular(@RequestBody String adress ,Model model) {
		SimpleClientHttpRequestFactory clientHttpReq = new SimpleClientHttpRequestFactory();
		Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("proxy.univ-lemans.fr", 3128));
		clientHttpReq.setProxy(proxy);
		RestTemplate restTemplate = new RestTemplate(clientHttpReq);
		Result result = restTemplate.getForObject("https://api-adresse.data.gouv.fr/search/?q="+adress, Result.class);
		//reponse sous format Json
		double lon = result.getFeatures().get(0).getGeometry().getCoordinates().get(0);
		double lat = result.getFeatures().get(0).getGeometry().getCoordinates().get(1);
		// api key ff626153f489f691318a007cc28539d8
		//exclude pour avoir une reponse plus legere, sans donnees inutiles.
		DarkSky darkSky = restTemplate.getForObject("https://api.darksky.net/forecast/ff626153f489f691318a007cc28539d8/"+lat+","+lon+"?lang=fr&exclude=hourly&exclude=daily&exclude=flags&units=si", DarkSky.class);
		model.addAttribute("meteo",darkSky);
		model.addAttribute("adresse",result.getFeatures().get(0).getProperties().getContext());
		model.addAttribute("ville",result.getFeatures().get(0).getProperties().getCity());
		return "Meteo";
	}
}
