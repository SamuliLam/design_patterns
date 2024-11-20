package prototype;

import java.util.ArrayList;
import java.util.List;

public class Recommendation implements Prototype{
    private String targetAudience;
    private List<Book> recommendations;

    public Recommendation(String targetAudience) {
        this.targetAudience = targetAudience;
        recommendations = new ArrayList<>();
    }

    public void addRecommendation(Book recommendation) {
        recommendations.add(recommendation);
    }


    public void setTargetAudience(String targetAudience) {
        this.targetAudience = targetAudience;
    }


    @Override
    public Recommendation clone() {
        Recommendation clone = new Recommendation(this.targetAudience);
        for (Book recommendation : recommendations) {
            clone.addRecommendation(recommendation.clone());
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Recommendation for " + targetAudience + ":\n" + recommendations;
    }
}
