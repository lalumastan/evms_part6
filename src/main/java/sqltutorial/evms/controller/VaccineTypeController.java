package sqltutorial.evms.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import sqltutorial.evms.repository.VaccineTypeRepository;

@Controller
public class VaccineTypeController {

	@Autowired
	VaccineTypeRepository vaccineTypeRepository;
	
	@GetMapping("/")
	public String index(Model model) {
		
		model.addAttribute("vaccineTypeList", vaccineTypeRepository.findAll());
		
		return "index";
	}
}
