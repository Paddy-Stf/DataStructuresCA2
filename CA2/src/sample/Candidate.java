package sample;

/**
 * Responsible for object candidate and parameters of the class.
 */

public class Candidate {

    private Politician candidate;
    private int candidateVotes;

    public Candidate(Politician candidate, int candidateVotes) {
        this.candidate = candidate;
        this.candidateVotes = candidateVotes;
    }

    /**
     * Getters and Setters for fields of Candidate class.
     */

    public Politician getCandidate() {
        return candidate;
    }

    public void setCandidate(Politician candidate) {
        this.candidate = candidate;
    }

    public int getCandidateVotes() {
        return candidateVotes;
    }

    public void setCandidateVotes(int candidateVotes) {
        this.candidateVotes = candidateVotes;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "candidate=" + candidate +
                ", candidateVotes=" + candidateVotes +
                '}';
    }
}
