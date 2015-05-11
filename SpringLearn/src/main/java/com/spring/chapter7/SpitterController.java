package com.spring.chapter7;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;
import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.aspectj.util.FileUtil;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import com.spring.chapter5.Spitter;

@Controller
@RequestMapping("/spitter")
public class SpitterController {

	private final SpitterService spitterService;

	@Inject
	public SpitterController(SpitterService spitterService) {
		this.spitterService = spitterService;
	}

	@RequestMapping(value = "/spittles", method = GET)
	public String listSpittersForSpittle(
			@RequestParam("spitter") String userName, Model model) {
		Spitter spitter = spitterService.getSpitter(userName);
		model.addAttribute(spitter);
		model.addAttribute(spitterService.getSpittlesForSpitter(userName));
		return "/spitter/list";
	}

	@RequestMapping(method = RequestMethod.GET, params = "new")
	public String createSpitterProfile(Model model) {
		model.addAttribute(new Spitter());
		return "spitters/edit";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addSpitterFromForm(@Valid Spitter spitter, BindingResult bindingResult,
			@RequestParam(value="image", required=false) MultipartFile image) {
		if (bindingResult.hasErrors()) {
			return "spitters/edit";
		}
		spitterService.saveSpitter(spitter);
		try {
			if (!image.isEmpty()) {
				validateImage(image);
				saveImage(spitter.getId() + ".jpg", image);
			}
		} catch (ImageUploadException e) {
			bindingResult.reject(e.getMessage());
			return "spitters/edit";
		}
		return "redirect:/spitters/" + spitter.getUserName();
	}

	private void saveImage(String filename, MultipartFile image) throws ImageUploadException{
		try {
			File file = new File("src/main/resources/" + filename);
			FileUtils.writeByteArrayToFile(file, image.getBytes());
		} catch (IOException e) {
			throw new ImageUploadException("Unable to save image");
		}
		
	}

	private void validateImage(MultipartFile image) throws ImageUploadException {
		if (!image.getContentType().equals("image/jpeg")) {
			throw new ImageUploadException("Only JPG images accepted");
		}
	}
}
