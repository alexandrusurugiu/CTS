package directors.program;

import directors.clase.*;

public class Main {
    public static void main(String[] args) {
        BaseManagerHandler juniorManager = new JuniorManagerManagerHandler();
        BaseManagerHandler seniorManager = new SeniorManagerManagerHandler();
        BaseManagerHandler director = new DirectorManagerHandler();

        Bank bank = new Bank(juniorManager, seniorManager, director);

        Request request = new Request("Equipment acquisition", 800);
        Request request2 = new Request("Software acquisition", 3500);
        Request request3 = new Request("Bureau expansion", 12000);

        bank.processRequest(request);
        bank.processRequest(request2);
        bank.processRequest(request3);
    }
}
