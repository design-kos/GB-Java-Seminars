package Seminars.Seminar13.FinalTask.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Seminars.Seminar13.FinalTask.model.Contractor;

public class DataReader implements Data {

    public static List<Contractor> read() {

        List<Contractor> list = new ArrayList<>();

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            String str;
            while ((str = bf.readLine()) != null) {

                String[] array = str.split(",");

                Contractor contractor = new Contractor();
                contractor.setName(array[0]);
                if (array.length > 1) {
                    for (int i = 1; i < array.length; i++) {
                        contractor.getCommunications().get(contractor.checkCommunicationType(array[i])).add(array[i]);
                    }
                }
                list.add(contractor);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return list;

    }

}
