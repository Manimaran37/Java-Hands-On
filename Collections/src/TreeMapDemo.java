import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	TreeMap<String, String> contactList = new TreeMap<>();
	
	public void addContact(String contactName, String contactString) {
		this.contactList.put(contactName, contactString);
	}

	public void getContactName(String phoneNumber) {
		for (Map.Entry<String, String> entry : this.contactList.entrySet()) {
			String val = entry.getValue();
			if(val.equals(phoneNumber)) {
				System.out.println("Contact Name for " + phoneNumber + " is " + entry.getKey());
				return;		
			}
		}
		System.out.println("Contact Name for " + phoneNumber + " is not available");
	}


	public void getContactNumber(String name) {
		for (Map.Entry<String, String> entry : this.contactList.entrySet()) {
			String key = entry.getKey();
			if(key.equals(name)) {
				System.out.println("Contact Number for " + name + " is " + entry.getValue());
				return;
			}
		}
		System.out.println("Contact Number for " + name + " is not available");
	}
	

	public void displayContactList() {
		for (Map.Entry<String, String> entry : this.contactList.entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			System.out.println("Name: " + key + " | Contact Number: " + val);
		}
	}

	public static void main(String[] args) {
		TreeMapDemo obj = new TreeMapDemo();
		obj.addContact("Maran", "7540090783");
		obj.addContact("siva", "1234567890");
		
		obj.displayContactList();
		obj.getContactName("7540090783");
		obj.getContactNumber("siva");
		obj.getContactName("2468013579");
		obj.getContactNumber("maha");

	}

}
