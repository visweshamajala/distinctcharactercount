package distinctcharacterscount;

import java.util.function.Function;

public class Mapper {
	Function<String,CharactersCount>getDistinctCharactersCount(){
		
			return stringName->{
				
				int charecterCount= (int) stringName.chars().distinct().count();
				return new CharactersCount(stringName,charecterCount);
					
		
			
		};
		
		}
	}
	

