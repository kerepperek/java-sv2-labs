package algorithmsmax.trainer;

import java.util.List;

public class MaxAgeCalculator {

    public Trainer getTrainerWithMaxAge(List<Trainer> trainers) {
        Trainer maxAgeTrainer = null;
        for (Trainer trainer : trainers) {
            if (maxAgeTrainer == null || trainer.getAge() > maxAgeTrainer.getAge()) {
                maxAgeTrainer = trainer;
            }
        }
        return maxAgeTrainer;
    }
}
