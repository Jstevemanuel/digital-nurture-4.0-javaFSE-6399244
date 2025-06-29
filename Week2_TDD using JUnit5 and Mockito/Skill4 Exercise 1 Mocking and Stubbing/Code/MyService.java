package Mocking_Stubbing;

//Service that uses the external API

class MyService {
  private ExternalApi api;
  public MyService(ExternalApi api) {
	  this.api = api; 
	 }
  public String fetchData() 
  {
	  return api.getData(); 
  }
}