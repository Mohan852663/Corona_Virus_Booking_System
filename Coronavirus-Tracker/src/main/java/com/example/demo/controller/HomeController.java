package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.ChartItem;
import com.example.demo.model.LocationStates;
import com.example.demo.services.CoronaVirusDataServices;

@Controller
public class HomeController 
{
	
	CoronaVirusDataServices crnService;
	
	@Autowired
	public void setCrnService(CoronaVirusDataServices crnService) {
		this.crnService = crnService;
	}


	@GetMapping("/")
	public String home(Model model)
	{
		List<LocationStates> allstates=crnService.getAllstates();
		int totalDeathsReported=allstates.stream().mapToInt(stat->stat.getLatestTotalDeaths()).sum();
		model.addAttribute("LocationStates",allstates);
		model.addAttribute("totalDeathsReported",totalDeathsReported);
		return "home";
	}
	
	
	@GetMapping("/chartData")
	@ResponseBody
	public List<ChartItem> getChartData() {
	    List<LocationStates> allStates = crnService.getAllstates();

	    List<ChartItem> chartData = new ArrayList<>();
	    for (LocationStates state : allStates) {
	        chartData.add(new ChartItem(state.getState(), state.getLatestTotalDeaths()));
	    }

	    return chartData;
	}


}
