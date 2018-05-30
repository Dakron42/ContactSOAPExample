import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import org.apache.axis.client.Stub;

import com.keysurvey.api.v81.WSFault;
import com.keysurvey.api.v81.contact.*;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String FC_Username="qv_test";
		String FC_Password="qv_test";
		long targetCMId = 1239987;
		try {
			
			ContactsManagementService cms;
			cms = new ContactsManagementLocator().getContactsManagementServicePort();
			
			Stub stub = (Stub) cms;
			
		    stub.setUsername(FC_Username);
		    stub.setPassword(FC_Password);
			try {
				
				WSContactManager targetCMObj = cms.getContactManagerById(targetCMId);
				String identityColName = targetCMObj.getKeyFieldName();
				
				
				WSContact[] existingContacts =cms.getContactByFilter(targetCMId, (long) -1); 

				WSContact newContact = new WSContact();
				WSModelObjectPropertiesEntry[] newContactProps= new WSModelObjectPropertiesEntry[4];
				newContactProps[0] = new WSModelObjectPropertiesEntry();
				newContactProps[0].setKey("ID");
				newContactProps[0].setValue("UniqueDistinctValueForTheContactManagerUniqueField1");
				
				newContactProps[1] = new WSModelObjectPropertiesEntry();
				newContactProps[1].setKey("Email");
				newContactProps[1].setValue("test@test.org");
				
				newContactProps[2] = new WSModelObjectPropertiesEntry();
				newContactProps[2].setKey("Login");
				newContactProps[2].setValue("TestUser1");
				
				newContactProps[3] = new WSModelObjectPropertiesEntry();
				newContactProps[3].setKey("Name");
				newContactProps[3].setValue("Mr / Mrs Test User 1");
				
				newContactProps[3] = new WSModelObjectPropertiesEntry();
				newContactProps[3].setKey("Password");
				newContactProps[3].setValue("NotARealPassword123");
				
				newContact.setKeyFieldName(identityColName);
				newContact.setProperties(newContactProps);
				WSContact createdContact = cms.addContact(targetCMId, newContact);
				System.out.println("ID " + createdContact.getId() + " created");
				
			} catch (WSFault e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
}
