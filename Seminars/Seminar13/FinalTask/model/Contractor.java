package Seminars.Seminar13.FinalTask.model;

import java.util.*;

public class Contractor {

    private String name;
    private Map<String, List<String>> communications;

    public Contractor() {
        this.communications = new HashMap<>();
        this.communications.put("Phone", new ArrayList<>());
        this.communications.put("Email", new ArrayList<>());
        this.communications.put("Telegram", new ArrayList<>());
        this.communications.put("VK", new ArrayList<>());
        this.communications.put("Address", new ArrayList<>());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, List<String>> getCommunications() {
        return communications;
    }

    public void setCommunications(String comm) {

        String key = checkCommunicationType(comm);
        if (key == null) {
            try {
                throw new Exception("Указан некорректный способ связи");
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            communications.get(key).add(comm);
        }

    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Имя контрагента: %s\n", this.name));
        sb.append("Способы связи:\n");
        for (Map.Entry<String, List<String>> entry : communications.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                sb.append(String.format("%10s:", entry.getKey()));
                for (String com : entry.getValue()) {
                    sb.append(String.format("\t%s", com));
                }
                sb.append("\n");
            }
        }
        return sb.toString();

    }

    public String checkCommunicationType(String comm) {

        if (comm.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
            return "Phone";
        if (comm.matches("\\d{11}"))
            return "Email";
        if (comm.matches("^[@]\\w+"))
            return "Telegram";
        if (comm.matches("^https://vk.com/[a-z0-9]+"))
            return "VK";
        if (comm.matches("\\w+[-]\\d+")) {
            return "Address";
        }
        return null;

    }

}
