package java_con_junit;


import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)

public class Check_Movi_Test extends Check_Movi_Base{
	
	
	@Test
	@FileParameters("./data/params2.csv")
	public void testSearchMovie(String name,String url,String title,String year) {
		setUp();
		navigateToPage(url);
	    searchMovie(name);
		validateMovieExists(name,year);
	}
	
	
	@Test
	@FileParameters("./data/params3.csv")
	public void testPlayTrailer(String name,String url,String title,String year) throws InterruptedException {
		setUp();
		navigateToPage(url);
		validatePage(title);
		searchMovie(name);
		validateMovieExists(name,year);
		selectMovie(name);
		validateCorrectMovie(name + " (" + year + ") - IMDb");
		playTrailer();
		 
		
	}
	

	@Test
	@FileParameters("./data/imdbTotal/movieStars.csv")
	public void testValidateMovieStars (String name,String url,String title,String year,String[] expectedActor) {
		setUp();
		navigateToPage(url);
		validatePage(title);
		searchMovie(name);
		validateMovieExists(name,year);
		selectMovie(name);
		validateCorrectMovie(name + " (" + year + ") - IMDb");
		validateMovieStars(expectedActor);
	}
	

	

}