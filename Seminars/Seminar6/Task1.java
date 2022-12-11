package Seminars.Seminar6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task1 {

    public static void main(String[] params) {
        Set<Notebooks> notebooks = initSet();
        Scanner scanner = new Scanner(System.in);

        List<String> criteriesInteger = Arrays.asList("1", "2", "3", "4");
        List<String> criteriesString = Arrays.asList("5");
        Map<String, String> filter = new HashMap<String, String>();

        printNotebooks(notebooks, filter);
        while (true) {
            System.out.println("Доступные фильтры:");
            System.out.println("1 - Размер экрана (дюймы)");
            System.out.println("2 - Минимальный объём ОЗУ (Гб)");
            System.out.println("3 - Минимальный объём Видеопамяти (Гб)");
            System.out.println("4 - Минимальный объём HHD или SSD (Гб)");
            System.out.println("5 - Операционная система");
            System.out.println("quit - Выход");
            System.out.print("Выберите фильтр, введя соответствующую цифру --> ");

            String key = scanner.nextLine();
            if (key != null)
                key = key.trim();
            else
                continue;
            if (key.equalsIgnoreCase("quit"))
                break;
            if (key.equalsIgnoreCase("0")) {
                filter.clear();
                printNotebooks(notebooks, filter);
            }
            if (criteriesInteger.contains(key) || criteriesString.contains(key)) {
                System.out.print("Укажите значение фильтра --> ");
                String value = scanner.nextLine();
                if (value != null)
                    value = value.trim();
                else
                    continue;

                if (value.equals("")) {
                    filter.put(key, value);
                } else {
                    if (criteriesString.contains(key)) {
                        filter.put(key, value);
                    } else {
                        try {
                            Integer i = Integer.parseInt(value);
                            filter.put(key, value);
                        } catch (NumberFormatException e) {
                            System.out.println();
                            System.out
                                    .println("------ Вы ввели нечисловое значение для (" + key + ") ------");
                            continue;
                        }
                    }
                }

                printNotebooks(notebooks, filter);
            } else {
                System.out.println();
                System.out.println(String.format("------ Указанный вами фильтр %s отсутствует ------", key));
            }
        }
    }

    private static void printNotebooks(Set<Notebooks> notebooks, Map<String, String> filter) {
        List<String> forPrint = new ArrayList<String>();
        for (Notebooks n : notebooks) {
            if (filter(n, filter)) {
                String s = String.format(
                        "Модель: %s, Экран: %d дюймов, ОЗУ: %d Гб, Видеопамять: %d Гб, Диск: %d Гб, ОС:%s, Цена: %d р.",
                        n.getModel(),
                        n.getScreenSize(),
                        n.getRamSize(),
                        n.getVramSize(),
                        n.getDiskSize(),
                        n.getOs(),
                        n.getPrice());
                forPrint.add(s);
            }
        }

        System.out.println();
        System.out
                .println(String.format("Отобранные ноутбуки (%d из %d)", forPrint.size(), notebooks.size()));
        for (String s : forPrint) {
            System.out.println(s);
        }
    }

    private static boolean filter(Notebooks n, Map<String, String> filter) {
        boolean result = true;

        for (String key : filter.keySet()) {
            String value = filter.get(key);
            if (value == null || value.trim().equals(""))
                continue;

            if (key.equals("1")) {
                try {
                    int i = Integer.parseInt(value);
                    if (n.getScreenSize() >= i) {
                    } else {
                        result = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    result = false;
                    break;
                }
            } else if (key.equals("2")) {
                try {
                    int i = Integer.parseInt(value);
                    if (n.getRamSize() >= i) {
                    } else {
                        result = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    result = false;
                    break;
                }
            } else if (key.equals("3")) {
                try {
                    int i = Integer.parseInt(value);
                    if (n.getVramSize() >= i) {
                    } else {
                        result = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    result = false;
                    break;
                }
            } else if (key.equals("4")) {
                try {
                    int i = Integer.parseInt(value);
                    if (n.getDiskSize() >= i) {
                    } else {
                        result = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    result = false;
                    break;
                }
            } else if (key.equals("5")) {
                if (n.getOs().toUpperCase().contains(value.toUpperCase())) {
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static Set<Notebooks> initSet() {
        String OS_WINDOWS_11 = "Windows 11";
        String OS_MACOS = "macOS";

        Set<Notebooks> set = new HashSet<Notebooks>();

        set.add(new Notebooks(
                "MSI Summit E16 Flip Evo A12MT-090RU",
                15,
                16,
                6,
                512,
                OS_WINDOWS_11,
                110000));
        set.add(new Notebooks(
                "Apple MacBook Pro",
                13,
                8,
                4,
                256,
                OS_MACOS,
                105000));
        set.add(new Notebooks(
                "HUAWEI MateBook 14S HKD-W76",
                14,
                16,
                6,
                256,
                OS_WINDOWS_11,
                110000));
        set.add(new Notebooks(
                "Lenovo V15 G2 ALC",
                15,
                8,
                4,
                1000,
                OS_WINDOWS_11,
                44000));

        return set;
    }
}
