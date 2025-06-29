package Mocki_interactions;

public class Myservice {
	
	private ExterrnalApi api;

    public Myservice(ExterrnalApi api) {
        this.api = api;
    }

    public String fetchData(String userId) {
        return api.getData(userId); 
    }

}
