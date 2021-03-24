package StateCensusAnalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class StateCensusAnalyserTest {

        private StateCensusAnalyser stateCensusAnalyser;
        private String  path="C:/Users/ADMIN/Downloads/IndiaStateCensusData.csv";
        private String wrong_path="C:/User/ADMIN/IndianStateCensusData.csv";

        @BeforeAll
        public void execute() {
            stateCensusAnalyser=new StateCensusAnalyser();
        }

        @Test
        void NoofRecordMatches() throws CustomException {
            int size=stateCensusAnalyser.loadData(path);
            System.out.println(size);
            Assertions.assertEquals(30,size);

        }
        @Test
        public void Wrong_path_Customexception() throws CustomException {
        try {
            stateCensusAnalyser.loadData(wrong_path);
        } catch (CustomException e) {
            throw new CustomException("wrong path");
        }
        }

    }
