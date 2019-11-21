package com.biquan.helloworld.controller;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.view.RedirectView;

//@CrossOrigin(maxAge = 3600)
@RestController
//@RequestMapping("/api/public")
public class PublicController {
	private ResourceLoader resourceLoader;

	@GetMapping(value = "/get-image-with-media-type", produces = MediaType.IMAGE_JPEG_VALUE)
	public ResponseEntity<byte[]> getImageWithMediaType() throws IOException {
		InputStream resource = new ClassPathResource(
			      "send.jpg").getInputStream();
			  
		
//		InputStream in = new BufferedInputStream(
//		          new FileInputStream("C:\\Users\\BQ_Yen\\Desktop\\send.jpg"));
		HttpHeaders headers = new HttpHeaders();
        headers.setCacheControl(CacheControl.noCache().getHeaderValue());
        headers.setContentType(MediaType.IMAGE_JPEG);
        
		ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(IOUtils.toByteArray(resource),null,HttpStatus.OK);
		  return responseEntity;
	}
	
	@PostMapping(value = "post/getForm",produces = MediaType.IMAGE_JPEG_VALUE)
	@ResponseBody
	public ResponseEntity<byte[]> getFormData(HttpServletRequest request) throws IOException {
		MultipartHttpServletRequest params = ((MultipartHttpServletRequest) request);
	
		String name = params.getParameter("name");
		String id = params.getParameter("id");
		
		//logger.info("name:" + name);
	//	logger.info("id:" + id);
		List<MultipartFile> files = ((MultipartHttpServletRequest) request).getFiles("file");

		//logger.info("receive Image bytes: " + files.get(0).getInputStream().available());
	

		InputStream inFile = files.get(0).getInputStream();
		 

		
		return ResponseEntity.ok().body(IOUtils.toByteArray(inFile));
	}
}