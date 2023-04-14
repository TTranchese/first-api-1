package co.develhope.firstapi1.controllers;

import co.develhope.firstapi1.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class NameController {
	@Autowired
	private NameService nameService;

	@GetMapping(value = "/{name}")
	public String getRoute(@PathVariable(value = "name") String name ) {
		return nameService.echoSame(name);
	}

	@PostMapping(value = "/{name}")
	public String postRoute(@PathVariable(value = "name") String name ) {
		return nameService.echoReverse(name);
	}
}