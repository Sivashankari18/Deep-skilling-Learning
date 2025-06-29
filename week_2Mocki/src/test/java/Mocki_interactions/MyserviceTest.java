package Mocki_interactions;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyserviceTest {
	

    @Test
    public void testVerifyInteraction() {
        ExterrnalApi mockApi = mock(ExterrnalApi.class);

       
        when(mockApi.getData("user123")).thenReturn("Mock Data");

        Myservice service = new Myservice(mockApi);
        service.fetchData("user123");

      
        verify(mockApi).getData("user123");
    }

}
