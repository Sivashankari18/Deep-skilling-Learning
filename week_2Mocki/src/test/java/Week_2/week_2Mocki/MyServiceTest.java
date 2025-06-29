package Week_2.week_2Mocki;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {
	
	 @Test
	    void testFetchData() {
	        ExternalApi mockApi = mock(ExternalApi.class);
	        when(mockApi.getData()).thenReturn("Mock Data");

	        MyService service = new MyService(mockApi);
	        String result = service.fetchData();

	        assertEquals("Mock Data", result);
	    }

}
