package com.train.mbta.utility;

import java.time.LocalTime;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.train.mbta.entity.TrainDetails;

@Component
public class TrainDataLoader implements CommandLineRunner{
	private static final Logger log = LoggerFactory.getLogger(TrainDataLoader.class);
	private final List<TrainDetails> trainDetails;
	
    public TrainDataLoader(List<TrainDetails> trainDetails) {
        this.trainDetails = trainDetails;
    }

	public List<TrainDetails> getTrainDetails() {
		return trainDetails;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(2, 5)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(5, 25)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(6, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(8, 45)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(9, 5)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(9, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(10, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(12, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(11, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(11, 28)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(12, 35)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(13, 5)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(13, 07)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(14, 20)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(13, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(14, 46)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(15, 24)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(15, 56)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(15, 45)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(16, 4)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(16, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(16, 41)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(17, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(17, 44)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(17, 25)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(18, 12)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(18, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(18, 51)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(19, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(19, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(19, 54)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(20, 5)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(20, 32)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(20, 38)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(21, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(21, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(21, 25)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(21, 16)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(20, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(22, 0)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(22, 5)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(22, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(22, 34)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(22, 15)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(23, 21)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(23, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(23, 12)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(0, 5)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(0, 14)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(0, 45)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(0, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(1, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(1, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(1, 42)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(1, 48)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(2, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(3, 12)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(3, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(3, 30)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(12, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(4, 11)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(4, 45)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(4, 35)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(5, 55)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(5, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(6, 40)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(7, 40)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(7, 5)));
		
		trainDetails.add(new TrainDetails("yellow","BrainTree",LocalTime.of(7, 15)));
		trainDetails.add(new TrainDetails("red","Riverside",LocalTime.of(9, 14)));
		trainDetails.add(new TrainDetails("green","Cleveland Circle",LocalTime.of(8, 18)));
		trainDetails.add(new TrainDetails("blue","North Station",LocalTime.of(8, 5)));
		Collections.sort(trainDetails); 
		log.info("Train loaded data >>> "+trainDetails.size()+" "+trainDetails);
	}
    
}
