package com.techelevator;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;  

public class AnimalGroupNameTest {
	
	private AnimalGroupName animalGroupName;
	
	@Before
	public void setup() {
		animalGroupName = new AnimalGroupName();
	}

	
    @Test
    public void lowercase_dog_returns_Pack() {
    	String resultGroup = animalGroupName.getHerd("dog");
    	Assert.assertEquals("Pack", resultGroup);
    }
    
    @Test
    public void all_uppercase_CROW_returns_Murder() {
    	String resultGroup = animalGroupName.getHerd("CROW");
    	Assert.assertEquals("Murder", resultGroup);
    }
    
    @Test
    public void mixed_uppercase_deEr_returns_Herd() {
    	String resultGroup = animalGroupName.getHerd("deEr");
    	Assert.assertEquals("Herd", resultGroup);
    }
    
    @Test
    public void lowercase_animal_not_in_existing_map() {
    	String resultGroup = animalGroupName.getHerd("eel");
    	Assert.assertEquals("unknown", resultGroup);
    }
    
    @Test
    public void a_blank_string_returns_unknown() {
    	String resultGroup = animalGroupName.getHerd("");
    	Assert.assertEquals("unknown", resultGroup);
    }
    

	
}
