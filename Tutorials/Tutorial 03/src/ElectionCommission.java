import java.util.Scanner;

class Party{
    private String partyName;
    private List<Integer> votes;

    public Party(String partyName, List<Integer> votes) {
        this.partyName = partyName;
        this.votes = votes;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public List<Integer> getVotes() {
        return votes;
    }

    public void setVotes(List<Integer> votes) {
        this.votes = votes;
    }
}


public class ElectionCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter no of parties: ");
        int numParty = scanner.nextInt();

        for (int i = 0; i < numParty; i++) {
            System.out.print("Enter party name: ");
            String partyName = scanner.nextLine();

            System.out.print("Enter votes for each district: ");
            String votes = scanner.nextLine();

            List<Integer> partyVotes = new List<>(3);
            for (String vote : votes.split(" ")){
                partyVotes.insertLast(Integer.parseInt(vote));
            }

            Party party = new Party(partyName, partyVotes);

            List<Party> partyList = new List<>(numParty);
            partyList.insertLast(party);

        }


    }
}
