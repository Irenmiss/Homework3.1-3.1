public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 3.1.1.");
        int age = 17;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }

        System.out.println("Задание 3.1.2.");
        int pupilAge = 9;
        if (pupilAge >= 7 && pupilAge < 18) {
            System.out.println("Ребенок ходит в школу.");
        }

        if (pupilAge >= 18 && pupilAge <= 24) {
            System.out.println("Человек закончил школу и ему пора отправляться в университет.");
        }

        if (pupilAge > 24) {
            System.out.println("Человек закончил университет и ему пора искать первую работу.");
        }
        System.out.println("Задание 3.1.3.");
        int wagonCapacity = 102;
        int seatPlaces = 60;
        int standingPlaces = wagonCapacity - seatPlaces;
        int takedPlacesCount = 102;
        if (takedPlacesCount >= wagonCapacity) {
            System.out.println("В вагоне нет мест.");
        }
        if (takedPlacesCount < seatPlaces) {
            System.out.println("В вагоне осталось " + (seatPlaces - takedPlacesCount) + " сидячих мест и " + standingPlaces + " стоячих мест.");
        }
        if (takedPlacesCount >= seatPlaces && takedPlacesCount < wagonCapacity) {
            System.out.println("В вагоне остались только стоячие места в количестве " + (wagonCapacity - takedPlacesCount) + " мест.");
        }
        System.out.println("Задание 3.2.1.");
        int ageOfSmb = 10;
        if (ageOfSmb >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать.");
        }
        System.out.println("Задание 3.2.2.");
        int pupilAge1 = 6;
        boolean pupil = pupilAge1 >= 7 && pupilAge1 < 18;
        boolean student = pupilAge1 >= 18 && pupilAge1 <= 24;
        boolean adult = pupilAge1 > 24;
        if (pupil) {
            System.out.println("Ребенок ходит в школу.");
        } else {
            if (student) {
                System.out.println("Человек закончил школу и ему пора отправляться в университет.");
            } else {
                if (adult) {
                    System.out.println("Человек закончил университет и ему пора искать первую работу.");
                } else {
                    System.out.println("Человек ходит в детский сад.");
                }
            }
        }
        System.out.println("Задание 3.2.3.");
        int wagonCapacity1 = 102;
        int seatPlaces1 = 60;
        int standingPlaces1 = wagonCapacity1 - seatPlaces1;
        int takedPlacesCount1 = 101;
        boolean seatPlacesAvailable = takedPlacesCount1 < seatPlaces1;
        boolean noPlaces = takedPlacesCount1 >= wagonCapacity1;
        boolean standingPlacesOnly = takedPlacesCount1 >= seatPlaces1 && takedPlacesCount1 < wagonCapacity1;
        if (seatPlacesAvailable) {
            System.out.println("В вагоне осталось " + (seatPlaces1 - takedPlacesCount1) + " сидячих мест и " + standingPlaces1 + " стоячих мест.");
        } else {
            if (noPlaces) {
                System.out.println("В вагоне нет мест.");
            } else {
                if (standingPlacesOnly) {
                    System.out.println("В вагоне остались только стоячие места в количестве " + (wagonCapacity1 - takedPlacesCount1) + " мест.");
                }
            }
        }
        System.out.println("Задание 3.3.1.");
        int ageOfMan = 30;
        boolean kindergarten = ageOfMan >= 2 && ageOfMan <= 6;
        boolean school = ageOfMan >= 7 && ageOfMan <= 18;
        boolean university = ageOfMan > 18 && ageOfMan <= 24;
        boolean job = ageOfMan > 24;
        if (kindergarten) {
            System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить в детский сад.");
        } else {
            if (school) {
                System.out.println("Если возраст человека равен " + ageOfMan + ", то ему нужно ходить в школу.");
            } else {
                if (university) {
                    System.out.println("Если возраст человека равен " + ageOfMan + ", то его место в университете.");
                } else {
                    if (job) {
                        System.out.println("Если возраст человека равен " + ageOfMan + ", то ему пора ходить на работу.");
                    }
                }
            }
        }
        System.out.println("Задание 3.3.2.");
        int ageOfChild = 11;
        boolean attractionFirbidden = ageOfChild < 5;
        boolean attractionWithAdults = ageOfChild >= 5 && ageOfChild < 14;
        boolean attractionAllowed = ageOfChild >= 14;
        if (attractionFirbidden) {
            System.out.println("Если возраст человека равен " + ageOfChild + ", то он не может кататься на аттракционе.");
        } else {
            if (attractionWithAdults) {
                System.out.println("Если возраст человека равен " + ageOfChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
            } else {
                if (attractionAllowed) {
                    System.out.println("Если возраст человека равен " + ageOfChild + ", то он может кататься без сопровождения взрослого.");
                }
            }
         }
        System.out.println("Задание 3.3.3.");
        int one = 993;
        int two = 765;
        int free = 8228;
        if (one > two && one > free) {
            System.out.println("Из трех чисел " + one + ", " + two + " и " + free + " наибольшим является " + one + " .");
        } else {
            if (two > one && two > free) {
                System.out.println("Из трех чисел " + one + ", " + two + " и " + free + " наибольшим является " + two+ " .");
            } else {
                if (free > one && free > two) {
                    System.out.println("Из трех чисел " + one + ", " + two + " и " + free + " наибольшим является " + free + " .");
                }
            }
        }
    }
}