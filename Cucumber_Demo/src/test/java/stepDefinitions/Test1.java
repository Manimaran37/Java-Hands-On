package stepDefinitions;

import java.util.Arrays;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test1 {
	
	int[] array;
	
	@Given("set of numbers as a String arguments {string}{string}{string}{string}")
	public void set_of_numbers_as_a_string_arguments(String string, String string2, String string3, String string4) {
	    // Write code here that turns the phrase above into concrete actions
		int value1 = Integer.parseInt(string);
		int value2 = Integer.parseInt(string2);
		int value3 = Integer.parseInt(string3);
		int value4 = Integer.parseInt(string4);
		
		array = new int[] {value1, value2, value3, value4};
//	    throw new io.cucumber.java.PendingException();
	}
	@When("those numbers are sorted")
	public void those_numbers_are_sorted() {
	    // Write code here that turns the phrase above into concrete actions
		Arrays.sort(array);
//	    throw new io.cucumber.java.PendingException();
	}
	@Then("print the sorted Array")
	public void print_the_sorted_array() {
	    // Write code here that turns the phrase above into concrete actions
		for (int i : array) {
			System.out.println(i);
		}
//	    throw new io.cucumber.java.PendingException();
	}

}
