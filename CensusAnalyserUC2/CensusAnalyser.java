package CensusAnalyserUC2;

public class CensusAnalyser {
private static final String CensusAnalyserException = null;
public int loadIndiaCensusData1(String csvFilePath) throws CensusAnalyserException {
	try (Reader reader = File.newBufferReader(Pathget(csvFILEpATH));) {
	Iterator<IndiaCensuscsv> censusCSVIterator = new OpenCSVBuilder().
			                                             getCSVFileIterator(reader,IndiaCensusCSV.class);
	return this.getcount(censusCSVIteartor);
	} catch (IoException e) {
		throw new CensusAnalyserException(e.getMessage(),
				
			CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
	}
}


public int loadIndiaCensusData(String csvFilePath) throws CensusAnalyserException {
	try (Reader reader = File.newBufferReader(Pathget(csvFILEpATH));) {
	Iterator<IndiaCensuscsv> censusCSVIterator = new OpenCSVBuilder().
			                                             getCSVFileIterator(reader,IndiaStatecodeCSV.class);
	return this.getcount(censusCSVIteartor);
	} catch (IoException e) {
		throw new CensusAnalyserException(e.getMessage(),
				
			CensusAnalyserException.ExceptionType.CENSUS_FILE_PROBLEM);
	}
}
}
private <E> int getCount(Iterator<E> iterator) {
	iterable<E> csvIterable = () -> iterator;
	int numofEntries = (int) StreamSupport.stream(csviterable.spliterator(), parallel false),count();
	return numOfEntries;
}
}