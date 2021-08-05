package com.app.CoronaTracker;

import java.io.FileReader;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.opencsv.CSVReader;

@Controller
public class MainController {
	
	@GetMapping("/")
	public String root () {
		
		
		String csvFile = "/C:/Users/niyi/Downloads/corona1.csv";
		
		CSVReader reader = null;
		try {
	
			reader = new CSVReader(new FileReader(csvFile));
			String[] line;
			// declare i = 0 skip the first line because it got the variable names
			int i = 0;
			while((line = reader.readNext()) != null) {
				if (i == 0) {
					i++;
					continue;
				}
		}
		} catch(IOException e) {
			e.printStackTrace();
			
		} finally {// closing the reader in the finally block
			if (reader != null) {
				
				try {
					reader.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return "mainTemplate";
	}

}
