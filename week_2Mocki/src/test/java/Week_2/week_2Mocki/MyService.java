package Week_2.week_2Mocki;

public class MyService {
	
	private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public String fetchData() {
        return api.getData();
    }

}
