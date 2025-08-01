package Exercise2;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class MyServiceTest {

	@Test
	public void testVerifyInteraction() {
		 ExternalApi mockApi = Mockito.mock(ExternalApi.class); 
	     MyService service = new MyService(mockApi); 
	     service.fetchData(); 
	     verify(mockApi).getData(); 
	}

}
