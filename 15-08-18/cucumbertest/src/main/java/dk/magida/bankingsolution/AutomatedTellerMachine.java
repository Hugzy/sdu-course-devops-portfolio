package dk.magida.bankingsolution;

public class AutomatedTellerMachine {

    private int content;
    private ResponseObject response;

    public AutomatedTellerMachine() {
    }

    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public ResponseObject makeDeposit(Account acc, int deposit) {
        acc.deposit(deposit);
        return response = new ResponseObject(0, "Deposit successful");
    }

    public ResponseObject makeWithdrawal(Account acc, int withdrawal) {
        acc.withdrawal(withdrawal);
        return response = new ResponseObject(0, "Deposit successful");
    }



}
