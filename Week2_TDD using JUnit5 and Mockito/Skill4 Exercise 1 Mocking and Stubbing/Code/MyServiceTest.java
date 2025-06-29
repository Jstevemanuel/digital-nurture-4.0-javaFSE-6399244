package Mocking_Stubbing;

import static org.Mockito.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class MyServiceTest {
  @Test
  void testFetchData() {
    ExternalApi mockApi = mock(ExternalApi.class);
    when(mockApi.getData()).thenReturn("Hello, Mockito!");

    MyService service = new MyService(mockApi);
    assertEquals("Hello, Mockito!", service.fetchData());
  }
}
