package CensusAnalyserUC2;

public class OpenCSVBuilder {
public Iterator<E> getCSVFileIterator(Reader reader,Class csvClass) throws censusAnalyserException {
	try {
		csvToBeanBuilder<E> csvToBeanBuilder = new CsvToBuilder<>(raader);
		csvToBeanBuilder.withType(csvClass);
		csvToBeanBuilder.withIgnoreLeadLengthiteSpace(true);
		csvToBean<E> csvToBean = csvToBeanBuilder.build();
		return csvToBean.iterator();
	} catch (IllegalStateException e) {
		throw new CensusAnalyserException(e.getMessage(),
				CensusAnalyserException.ExceptionType.UNABLE_TO_PARSE);
	}

}
}
