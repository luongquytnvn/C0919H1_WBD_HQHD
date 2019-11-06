public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
        String score = "";
        int tempScore = 0;
        String fifteenDeuce = "Fifteen-All";
        String thirtyDeuce = "Thirty-All";
        String fortyDeuce = "Forty-All";
        String deuce = "Deuce";
        String zeroDeuce = "Love-All";
        if (m_score1 == m_score2) {
            switch (m_score1) {
                case 0:
                    score = zeroDeuce;
                    break;
                case 1:
                    score = fifteenDeuce;
                    break;
                case 2:
                    score = thirtyDeuce;
                    break;
                case 3:
                    score = fortyDeuce;
                    break;
                default:
                    score = deuce;
                    break;

            }
        } else if (m_score1 >= 4 || m_score2 >= 4) {
            int minusResult = m_score1 - m_score2;
            if (minusResult == 1) score = "Advantage player1";
            else if (minusResult == -1) score = "Advantage player2";
            else if (minusResult >= 2) score = "Win for player1";
            else score = "Win for player2";
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = m_score1;
                else {
                    score += "-";
                    tempScore = m_score2;
                }
                switch (tempScore) {
                    case 0:
                        score += "Love";
                        break;
                    case 1:
                        score += "Fifteen";
                        break;
                    case 2:
                        score += "Thirty";
                        break;
                    case 3:
                        score += "Forty";
                        break;
                }
            }
        }
        return score;
    }
}