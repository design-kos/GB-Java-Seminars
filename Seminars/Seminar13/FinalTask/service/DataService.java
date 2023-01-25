package Seminars.Seminar13.FinalTask.service;

import java.util.List;
import java.util.Map;

import Seminars.Seminar13.FinalTask.data.DataReader;
import Seminars.Seminar13.FinalTask.data.DataWriter;
import Seminars.Seminar13.FinalTask.model.Contractor;

public class DataService {

    public void addContractor(Contractor contractor) {
        DataWriter.dataWrite(contractor);
    }

    public void addCommunicationToContractor(String name, String comm) {

        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equals(name)) {
                contractor.setCommunications(comm);
                DataWriter.rewriteData(list);
                return;
            }
        }

    }

    public List<Contractor> getAllContractors() {
        return DataReader.read();
    }

    public void removeContractor(String name) {
        DataWriter.removeData(name);
    }

    public void removeCommunicationToContractor(String name, String comm) {

        List<Contractor> list = DataReader.read();
        for (Contractor contractor : list) {
            if (contractor.getName().equals(name)) {
                for (Map.Entry<String, List<String>> entry : contractor.getCommunications().entrySet()) {
                    if (entry.getKey().equals(comm)) {
                        entry.getValue().clear();
                        DataWriter.rewriteData(list);
                        return;
                    }
                }
            }
        }

    }

}
