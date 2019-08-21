package com.techelevator;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.VendingMachine.PurchaseStatus;
import com.techelevator.exception.InvalidAmountException;
import com.techelevator.file.log.TextLogWriter;
import com.techelevator.file.report.SalesReportWriter;
import com.techelevator.inventory.Slot;
import com.techelevator.inventory.reader.InventoryReader;

@Controller
@SessionAttributes("vendingMachine")
public class HomeController {

	@Autowired
	private InventoryReader reader;
	
	
	@RequestMapping("/")
	public String displayHomePage(ModelMap map) {
		
		if (!map.containsAttribute("vendingMachine")) {
			VendingMachine vm = new VendingMachine(new TextLogWriter(), reader, new SalesReportWriter());
			map.addAttribute("vendingMachine", vm);
		}
		VendingMachine vm = (VendingMachine) map.get("vendingMachine");
		
		map.addAttribute("balance", vm.getBalance());
		map.addAttribute("slots", vm.getInventorySlots());
		return "homePage";
	}
	
	@RequestMapping(path="/purchase", method=RequestMethod.POST)
	public String purchaseItem(ModelMap map, @RequestParam String slotKey) {
		
		VendingMachine vm = (VendingMachine) map.get("vendingMachine");
		PurchaseStatus status = vm.makePurchase(slotKey);
		

		
		return "redirect:/";
	}
	
	@RequestMapping(path="/addMoney", method=RequestMethod.POST)
	public String addMoney(ModelMap map, @RequestParam int amount) throws InvalidAmountException {
		
		VendingMachine vm = (VendingMachine) map.get("vendingMachine");
		vm.addToBalance(amount);
		
		return "redirect:/";
	}
	
}
