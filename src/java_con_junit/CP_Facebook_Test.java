package java_con_junit;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class CP_Facebook_Test extends CP_Facebook_Base{
	
	@Test  //metodo de prueba
    @FileParameters("./data/params.csv")
	public void testFacebookLogin(String browser, String url,
			String user, String password, String friendName) {
		
		setUp(browser, url);
		
		logIntoFacebook(user, password);
		
		searchFacebookFriend(friendName);
		
		viewfriend();
		
		gotoPhotos();
		
		viewPhoto();
		
		likeAllPhotos();
		
				
		
	}
	

	

	

}